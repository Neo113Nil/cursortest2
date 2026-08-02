package com.squareup.cash.boost.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BoostCategory {
    public static final /* synthetic */ BoostCategory[] $VALUES;
    public static final BoostCategory CAP;
    public static final BoostCategory CUSTOM;
    public static final BoostCategory REGULAR;

    static {
        BoostCategory boostCategory = new BoostCategory("CUSTOM", 0);
        CUSTOM = boostCategory;
        BoostCategory boostCategory2 = new BoostCategory("CAP", 1);
        CAP = boostCategory2;
        BoostCategory boostCategory3 = new BoostCategory("REGULAR", 2);
        REGULAR = boostCategory3;
        $VALUES = new BoostCategory[]{boostCategory, boostCategory2, boostCategory3};
    }

    public static BoostCategory valueOf(String str) {
        return (BoostCategory) Enum.valueOf(BoostCategory.class, str);
    }

    public static BoostCategory[] values() {
        return (BoostCategory[]) $VALUES.clone();
    }
}
