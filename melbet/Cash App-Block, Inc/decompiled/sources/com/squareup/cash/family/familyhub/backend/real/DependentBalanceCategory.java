package com.squareup.cash.family.familyhub.backend.real;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DependentBalanceCategory {
    public static final /* synthetic */ DependentBalanceCategory[] $VALUES;
    public static final DependentBalanceCategory ALL;
    public static final DependentBalanceCategory CASH_BALANCE_ONLY;

    static {
        DependentBalanceCategory dependentBalanceCategory = new DependentBalanceCategory("ALL", 0);
        ALL = dependentBalanceCategory;
        DependentBalanceCategory dependentBalanceCategory2 = new DependentBalanceCategory("CASH_BALANCE_ONLY", 1);
        CASH_BALANCE_ONLY = dependentBalanceCategory2;
        $VALUES = new DependentBalanceCategory[]{dependentBalanceCategory, dependentBalanceCategory2};
    }

    public static DependentBalanceCategory valueOf(String str) {
        return (DependentBalanceCategory) Enum.valueOf(DependentBalanceCategory.class, str);
    }

    public static DependentBalanceCategory[] values() {
        return (DependentBalanceCategory[]) $VALUES.clone();
    }
}
