package com.squareup.cash.afterpayapplet.applets.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CreditRowType {
    public static final /* synthetic */ CreditRowType[] $VALUES;
    public static final CreditRowType AVAILABLE_ROW;
    public static final CreditRowType OWED_ROW;

    static {
        CreditRowType creditRowType = new CreditRowType("AVAILABLE_ROW", 0);
        AVAILABLE_ROW = creditRowType;
        CreditRowType creditRowType2 = new CreditRowType("OWED_ROW", 1);
        OWED_ROW = creditRowType2;
        $VALUES = new CreditRowType[]{creditRowType, creditRowType2};
    }

    public static CreditRowType valueOf(String str) {
        return (CreditRowType) Enum.valueOf(CreditRowType.class, str);
    }

    public static CreditRowType[] values() {
        return (CreditRowType[]) $VALUES.clone();
    }
}
