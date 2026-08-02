package com.ionspin.kotlin.bignum.decimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RoundingMode {
    public static final /* synthetic */ RoundingMode[] $VALUES;
    public static final RoundingMode AWAY_FROM_ZERO;
    public static final RoundingMode CEILING;
    public static final RoundingMode FLOOR;
    public static final RoundingMode NONE;
    public static final RoundingMode ROUND_HALF_AWAY_FROM_ZERO;
    public static final RoundingMode ROUND_HALF_TO_EVEN;
    public static final RoundingMode TOWARDS_ZERO;

    static {
        RoundingMode roundingMode = new RoundingMode("FLOOR", 0);
        FLOOR = roundingMode;
        RoundingMode roundingMode2 = new RoundingMode("CEILING", 1);
        CEILING = roundingMode2;
        RoundingMode roundingMode3 = new RoundingMode("AWAY_FROM_ZERO", 2);
        AWAY_FROM_ZERO = roundingMode3;
        RoundingMode roundingMode4 = new RoundingMode("TOWARDS_ZERO", 3);
        TOWARDS_ZERO = roundingMode4;
        RoundingMode roundingMode5 = new RoundingMode("NONE", 4);
        NONE = roundingMode5;
        RoundingMode roundingMode6 = new RoundingMode("ROUND_HALF_AWAY_FROM_ZERO", 5);
        ROUND_HALF_AWAY_FROM_ZERO = roundingMode6;
        RoundingMode roundingMode7 = new RoundingMode("ROUND_HALF_TOWARDS_ZERO", 6);
        RoundingMode roundingMode8 = new RoundingMode("ROUND_HALF_CEILING", 7);
        RoundingMode roundingMode9 = new RoundingMode("ROUND_HALF_FLOOR", 8);
        RoundingMode roundingMode10 = new RoundingMode("ROUND_HALF_TO_EVEN", 9);
        ROUND_HALF_TO_EVEN = roundingMode10;
        $VALUES = new RoundingMode[]{roundingMode, roundingMode2, roundingMode3, roundingMode4, roundingMode5, roundingMode6, roundingMode7, roundingMode8, roundingMode9, roundingMode10, new RoundingMode("ROUND_HALF_TO_ODD", 10)};
    }

    public static RoundingMode valueOf(String str) {
        return (RoundingMode) Enum.valueOf(RoundingMode.class, str);
    }

    public static RoundingMode[] values() {
        return (RoundingMode[]) $VALUES.clone();
    }
}
