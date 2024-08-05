package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

/**
 * @Author zhangHengWei
 * @Date 2024/8/5 16:30
 * @PackageName:com.bjsxt.mapper
 * @ClassName: UserMapper
 * @Description: TODO
 * @Version 1.0
 */
public interface UserMapper {

    User getUser(Long id);

    public void setUser();

}
