package com.squareup.cash.directdeposit.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PaycheckDepositAllocationType {
    public static final /* synthetic */ PaycheckDepositAllocationType[] $VALUES;
    public static final PaycheckDepositAllocationType ALL;
    public static final PaycheckDepositAllocationType CURRENCY_AMOUNT;
    public static final PaycheckDepositAllocationType PERCENTAGE;

    static {
        PaycheckDepositAllocationType paycheckDepositAllocationType = new PaycheckDepositAllocationType("CURRENCY_AMOUNT", 0);
        CURRENCY_AMOUNT = paycheckDepositAllocationType;
        PaycheckDepositAllocationType paycheckDepositAllocationType2 = new PaycheckDepositAllocationType("PERCENTAGE", 1);
        PERCENTAGE = paycheckDepositAllocationType2;
        PaycheckDepositAllocationType paycheckDepositAllocationType3 = new PaycheckDepositAllocationType("ALL", 2);
        ALL = paycheckDepositAllocationType3;
        $VALUES = new PaycheckDepositAllocationType[]{paycheckDepositAllocationType, paycheckDepositAllocationType2, paycheckDepositAllocationType3};
    }

    public static PaycheckDepositAllocationType valueOf(String str) {
        return (PaycheckDepositAllocationType) Enum.valueOf(PaycheckDepositAllocationType.class, str);
    }

    public static PaycheckDepositAllocationType[] values() {
        return (PaycheckDepositAllocationType[]) $VALUES.clone();
    }
}
