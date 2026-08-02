package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class OrderState {
    public static final /* synthetic */ OrderState[] $VALUES;
    public static final OrderState CANCELLED;
    public static final OrderState COMPLETED;
    public static final OrderState DUE;
    public static final OrderState OVERDUE;
    public static final OrderState REFUNDED;
    public static final OrderState UNKNOWN;

    static {
        OrderState orderState = new OrderState("DUE", 0);
        DUE = orderState;
        OrderState orderState2 = new OrderState("OVERDUE", 1);
        OVERDUE = orderState2;
        OrderState orderState3 = new OrderState("COMPLETED", 2);
        COMPLETED = orderState3;
        OrderState orderState4 = new OrderState("REFUNDED", 3);
        REFUNDED = orderState4;
        OrderState orderState5 = new OrderState("CANCELLED", 4);
        CANCELLED = orderState5;
        OrderState orderState6 = new OrderState("UNKNOWN", 5);
        UNKNOWN = orderState6;
        $VALUES = new OrderState[]{orderState, orderState2, orderState3, orderState4, orderState5, orderState6};
    }

    public static OrderState valueOf(String str) {
        return (OrderState) Enum.valueOf(OrderState.class, str);
    }

    public static OrderState[] values() {
        return (OrderState[]) $VALUES.clone();
    }
}
