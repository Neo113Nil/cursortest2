package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RoundingMode {
    public static final /* synthetic */ RoundingMode[] $VALUES;
    public static final RoundingMode DOWN;
    public static final RoundingMode HALF_UP;

    /* JADX INFO: Fake field, exist only in values array */
    RoundingMode EF0;

    static {
        RoundingMode roundingMode = new RoundingMode("UP", 0);
        RoundingMode roundingMode2 = new RoundingMode("DOWN", 1);
        DOWN = roundingMode2;
        RoundingMode roundingMode3 = new RoundingMode("CEILING", 2);
        RoundingMode roundingMode4 = new RoundingMode("FLOOR", 3);
        RoundingMode roundingMode5 = new RoundingMode("HALF_UP", 4);
        HALF_UP = roundingMode5;
        $VALUES = new RoundingMode[]{roundingMode, roundingMode2, roundingMode3, roundingMode4, roundingMode5, new RoundingMode("HALF_DOWN", 5), new RoundingMode("HALF_EVEN", 6)};
    }

    public static RoundingMode valueOf(String str) {
        return (RoundingMode) Enum.valueOf(RoundingMode.class, str);
    }

    public static RoundingMode[] values() {
        return (RoundingMode[]) $VALUES.clone();
    }
}
