package com.squareup.cash.limits.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LimitsSectionType {
    public static final /* synthetic */ LimitsSectionType[] $VALUES;
    public static final LimitsSectionType BITCOIN;
    public static final LimitsSectionType CASH_CARD;
    public static final LimitsSectionType DEPOSIT_AND_WITHDRAW;
    public static final LimitsSectionType SEND_AND_RECEIVE;
    public static final LimitsSectionType STOCKS;
    public static final LimitsSectionType UNKNOWN;

    static {
        LimitsSectionType limitsSectionType = new LimitsSectionType("UNKNOWN", 0);
        UNKNOWN = limitsSectionType;
        LimitsSectionType limitsSectionType2 = new LimitsSectionType("SEND_AND_RECEIVE", 1);
        SEND_AND_RECEIVE = limitsSectionType2;
        LimitsSectionType limitsSectionType3 = new LimitsSectionType("DEPOSIT_AND_WITHDRAW", 2);
        DEPOSIT_AND_WITHDRAW = limitsSectionType3;
        LimitsSectionType limitsSectionType4 = new LimitsSectionType("CASH_CARD", 3);
        CASH_CARD = limitsSectionType4;
        LimitsSectionType limitsSectionType5 = new LimitsSectionType("BITCOIN", 4);
        BITCOIN = limitsSectionType5;
        LimitsSectionType limitsSectionType6 = new LimitsSectionType("STOCKS", 5);
        STOCKS = limitsSectionType6;
        $VALUES = new LimitsSectionType[]{limitsSectionType, limitsSectionType2, limitsSectionType3, limitsSectionType4, limitsSectionType5, limitsSectionType6};
    }

    public static LimitsSectionType valueOf(String str) {
        return (LimitsSectionType) Enum.valueOf(LimitsSectionType.class, str);
    }

    public static LimitsSectionType[] values() {
        return (LimitsSectionType[]) $VALUES.clone();
    }
}
