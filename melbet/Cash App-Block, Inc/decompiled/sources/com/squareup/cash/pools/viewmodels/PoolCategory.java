package com.squareup.cash.pools.viewmodels;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PoolCategory {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ PoolCategory[] $VALUES;
    public static final PoolCategory ACTIVE;

    static {
        PoolCategory poolCategory = new PoolCategory("ACTIVE", 0);
        ACTIVE = poolCategory;
        PoolCategory[] poolCategoryArr = {poolCategory, new PoolCategory("CLOSED", 1)};
        $VALUES = poolCategoryArr;
        $ENTRIES = new EnumEntriesList(poolCategoryArr);
    }

    public static PoolCategory valueOf(String str) {
        return (PoolCategory) Enum.valueOf(PoolCategory.class, str);
    }

    public static PoolCategory[] values() {
        return (PoolCategory[]) $VALUES.clone();
    }
}
