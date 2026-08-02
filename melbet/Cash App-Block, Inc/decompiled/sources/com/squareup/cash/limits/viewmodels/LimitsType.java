package com.squareup.cash.limits.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LimitsType {
    public static final /* synthetic */ LimitsType[] $VALUES;
    public static final LimitsType FLAT;
    public static final LimitsType GROUPED;

    static {
        LimitsType limitsType = new LimitsType("FLAT", 0);
        FLAT = limitsType;
        LimitsType limitsType2 = new LimitsType("GROUPED", 1);
        GROUPED = limitsType2;
        $VALUES = new LimitsType[]{limitsType, limitsType2};
    }

    public static LimitsType valueOf(String str) {
        return (LimitsType) Enum.valueOf(LimitsType.class, str);
    }

    public static LimitsType[] values() {
        return (LimitsType[]) $VALUES.clone();
    }
}
