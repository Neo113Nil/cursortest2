package com.squareup.cash.family.familyhub.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ControlType {
    public static final /* synthetic */ ControlType[] $VALUES;
    public static final ControlType BITCOIN;
    public static final ControlType CASH_CARD;
    public static final ControlType NOTIFICATIONS;
    public static final ControlType P2P;
    public static final ControlType PROMOTIONS;
    public static final ControlType STOCKS;

    static {
        ControlType controlType = new ControlType("NOTIFICATIONS", 0);
        NOTIFICATIONS = controlType;
        ControlType controlType2 = new ControlType("P2P", 1);
        P2P = controlType2;
        ControlType controlType3 = new ControlType("CASH_CARD", 2);
        CASH_CARD = controlType3;
        ControlType controlType4 = new ControlType("STOCKS", 3);
        STOCKS = controlType4;
        ControlType controlType5 = new ControlType("BITCOIN", 4);
        BITCOIN = controlType5;
        ControlType controlType6 = new ControlType("PROMOTIONS", 5);
        PROMOTIONS = controlType6;
        $VALUES = new ControlType[]{controlType, controlType2, controlType3, controlType4, controlType5, controlType6};
    }

    public static ControlType valueOf(String str) {
        return (ControlType) Enum.valueOf(ControlType.class, str);
    }

    public static ControlType[] values() {
        return (ControlType[]) $VALUES.clone();
    }
}
