package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OrderSide {
    public static final /* synthetic */ OrderSide[] $VALUES;
    public static final OrderSide BUY;
    public static final OrderSide SELL;

    static {
        OrderSide orderSide = new OrderSide("BUY", 0);
        BUY = orderSide;
        OrderSide orderSide2 = new OrderSide("SELL", 1);
        SELL = orderSide2;
        $VALUES = new OrderSide[]{orderSide, orderSide2};
    }

    public static OrderSide valueOf(String str) {
        return (OrderSide) Enum.valueOf(OrderSide.class, str);
    }

    public static OrderSide[] values() {
        return (OrderSide[]) $VALUES.clone();
    }
}
