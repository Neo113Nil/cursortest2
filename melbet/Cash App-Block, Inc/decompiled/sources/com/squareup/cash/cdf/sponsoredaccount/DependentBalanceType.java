package com.squareup.cash.cdf.sponsoredaccount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DependentBalanceType {
    public static final /* synthetic */ DependentBalanceType[] $VALUES;
    public static final DependentBalanceType Bitcoin;
    public static final DependentBalanceType Stock;

    /* JADX INFO: Fake field, exist only in values array */
    DependentBalanceType EF0;

    static {
        DependentBalanceType dependentBalanceType = new DependentBalanceType("Savings", 0);
        DependentBalanceType dependentBalanceType2 = new DependentBalanceType("Bitcoin", 1);
        Bitcoin = dependentBalanceType2;
        DependentBalanceType dependentBalanceType3 = new DependentBalanceType("Stock", 2);
        Stock = dependentBalanceType3;
        $VALUES = new DependentBalanceType[]{dependentBalanceType, dependentBalanceType2, dependentBalanceType3};
    }

    public static DependentBalanceType valueOf(String str) {
        return (DependentBalanceType) Enum.valueOf(DependentBalanceType.class, str);
    }

    public static DependentBalanceType[] values() {
        return (DependentBalanceType[]) $VALUES.clone();
    }
}
