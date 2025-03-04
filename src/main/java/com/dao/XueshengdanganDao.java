package com.dao;

import com.entity.XueshengdanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengdanganView;

/**
 * 学生档案 Dao 接口
 *
 * @author 
 */
public interface XueshengdanganDao extends BaseMapper<XueshengdanganEntity> {

   List<XueshengdanganView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
