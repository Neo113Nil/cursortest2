package com.squareup.cash.investing.viewmodels.metrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Range {
    public static final /* synthetic */ Range[] $VALUES;
    public static final Range ANNUALLY;
    public static final Range QUARTERLY;

    static {
        Range range = new Range("ANNUALLY", 0);
        ANNUALLY = range;
        Range range2 = new Range("QUARTERLY", 1);
        QUARTERLY = range2;
        $VALUES = new Range[]{range, range2};
    }

    public static Range valueOf(String str) {
        return (Range) Enum.valueOf(Range.class, str);
    }

    public static Range[] values() {
        return (Range[]) $VALUES.clone();
    }
}
