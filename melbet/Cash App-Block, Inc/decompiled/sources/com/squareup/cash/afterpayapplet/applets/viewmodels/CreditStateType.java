package com.squareup.cash.afterpayapplet.applets.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CreditStateType {
    public static final /* synthetic */ CreditStateType[] $VALUES;
    public static final CreditStateType SHOW_FULL_CREDIT_AVAILABLE;
    public static final CreditStateType SHOW_OVER_DUE;
    public static final CreditStateType SHOW_TOTAL_BALANCE;

    static {
        CreditStateType creditStateType = new CreditStateType("SHOW_FULL_CREDIT_AVAILABLE", 0);
        SHOW_FULL_CREDIT_AVAILABLE = creditStateType;
        CreditStateType creditStateType2 = new CreditStateType("SHOW_TOTAL_BALANCE", 1);
        SHOW_TOTAL_BALANCE = creditStateType2;
        CreditStateType creditStateType3 = new CreditStateType("SHOW_OVER_DUE", 2);
        SHOW_OVER_DUE = creditStateType3;
        $VALUES = new CreditStateType[]{creditStateType, creditStateType2, creditStateType3};
    }

    public static CreditStateType valueOf(String str) {
        return (CreditStateType) Enum.valueOf(CreditStateType.class, str);
    }

    public static CreditStateType[] values() {
        return (CreditStateType[]) $VALUES.clone();
    }
}
