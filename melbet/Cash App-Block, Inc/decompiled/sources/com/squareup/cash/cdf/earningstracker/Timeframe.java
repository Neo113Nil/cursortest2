package com.squareup.cash.cdf.earningstracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Timeframe {
    public static final /* synthetic */ Timeframe[] $VALUES;
    public static final Timeframe ALL_TIME;
    public static final Timeframe MONTH;
    public static final Timeframe YEAR;

    static {
        Timeframe timeframe = new Timeframe("MONTH", 0);
        MONTH = timeframe;
        Timeframe timeframe2 = new Timeframe("YEAR", 1);
        YEAR = timeframe2;
        Timeframe timeframe3 = new Timeframe("ALL_TIME", 2);
        ALL_TIME = timeframe3;
        $VALUES = new Timeframe[]{timeframe, timeframe2, timeframe3};
    }

    public static Timeframe valueOf(String str) {
        return (Timeframe) Enum.valueOf(Timeframe.class, str);
    }

    public static Timeframe[] values() {
        return (Timeframe[]) $VALUES.clone();
    }
}
