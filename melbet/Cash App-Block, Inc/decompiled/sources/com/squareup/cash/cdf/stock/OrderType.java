package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OrderType {
    public static final /* synthetic */ OrderType[] $VALUES;
    public static final OrderType AUTO_INVEST;
    public static final OrderType CUSTOM;
    public static final OrderType ONE_OFF;

    static {
        OrderType orderType = new OrderType("ONE_OFF", 0);
        ONE_OFF = orderType;
        OrderType orderType2 = new OrderType("AUTO_INVEST", 1);
        AUTO_INVEST = orderType2;
        OrderType orderType3 = new OrderType("CUSTOM", 2);
        CUSTOM = orderType3;
        $VALUES = new OrderType[]{orderType, orderType2, orderType3};
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
