package com.squareup.cash.family.familyhub.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DependentBalanceName {
    public static final /* synthetic */ DependentBalanceName[] $VALUES;
    public static final DependentBalanceName Bitcoin;
    public static final DependentBalanceName Cash;
    public static final DependentBalanceName Savings;
    public static final DependentBalanceName Stocks;

    static {
        DependentBalanceName dependentBalanceName = new DependentBalanceName("Cash", 0);
        Cash = dependentBalanceName;
        DependentBalanceName dependentBalanceName2 = new DependentBalanceName("Savings", 1);
        Savings = dependentBalanceName2;
        DependentBalanceName dependentBalanceName3 = new DependentBalanceName("Stocks", 2);
        Stocks = dependentBalanceName3;
        DependentBalanceName dependentBalanceName4 = new DependentBalanceName("Bitcoin", 3);
        Bitcoin = dependentBalanceName4;
        $VALUES = new DependentBalanceName[]{dependentBalanceName, dependentBalanceName2, dependentBalanceName3, dependentBalanceName4};
    }

    public static DependentBalanceName valueOf(String str) {
        return (DependentBalanceName) Enum.valueOf(DependentBalanceName.class, str);
    }

    public static DependentBalanceName[] values() {
        return (DependentBalanceName[]) $VALUES.clone();
    }
}
