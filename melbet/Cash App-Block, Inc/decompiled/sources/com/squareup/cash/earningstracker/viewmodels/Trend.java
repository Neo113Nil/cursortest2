package com.squareup.cash.earningstracker.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Trend {
    public static final /* synthetic */ Trend[] $VALUES;
    public static final Trend DOWN;
    public static final Trend UP;

    static {
        Trend trend = new Trend("UP", 0);
        UP = trend;
        Trend trend2 = new Trend("DOWN", 1);
        DOWN = trend2;
        $VALUES = new Trend[]{trend, trend2};
    }

    public static Trend valueOf(String str) {
        return (Trend) Enum.valueOf(Trend.class, str);
    }

    public static Trend[] values() {
        return (Trend[]) $VALUES.clone();
    }
}
