package com.xiao.pay.paywechat.enums.wxpay;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WxNotifyType {

	/**
	 * 支付通知
	 */
	NATIVE_NOTIFY("/api/wxpay/native/notify"),


	/**
	 * 退款结果通知
	 */
	REFUND_NOTIFY("/api/wxpay/refunds/notify");

	/**
	 * 类型
	 */
	private final String type;
}
