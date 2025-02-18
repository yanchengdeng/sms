package com.dyc.smscontrol

/**
 * use  : yanc
 * data : 2020/7/9
 * time : 0:23
 * desc :常量
 */

 class Constants{
    companion object{
        const val   IS_DEBUG = false
        //接口api http://test1.yalalat.com/jttest/  retrofit api 后要以 / 结尾
        //保存登录状态
        const val LOGINED_STATUS = "login_status"
        //保存登录名称
        const val LOGINED_NICKNAME = "login_nick_name"
        //UID
        const val LOGINED_TOKEN = "login_token"
        //超时
        const val DEFAULT_TIMEOUT = 10
        //返回正确结果
        const val API_OK = 0
        //提示信息错误
        const val API_TIPS = 1
        //异常 跳到登录页
        const val API_USER_ERROR = 100
        //短信库
        const val SMS = "content://sms"
        //每页数量
        const val PAGE_SIZE = 15
        //已验证card id
        const val  CARDS_ID = "cards_id"
        //已验证card name
        const val  CARDS_NAME = "cards_name"
        //api接口地址
        const val SAVE_BASE_URL = "base_api"
        // 来自登录页 转场
        const val IS_FROM_LOGIN = "is_from_login"
        //保存短信上传记录
        const val SAVE_SMS_UPLOAD_MSG = "save_sms_upload_msg"

    }
}