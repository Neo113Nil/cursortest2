package com.squareup.cash.charting.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BarChart$Direction {
    public static final /* synthetic */ BarChart$Direction[] $VALUES;
    public static final BarChart$Direction HORIZONTAL;
    public static final BarChart$Direction VERTICAL;

    static {
        BarChart$Direction barChart$Direction = new BarChart$Direction("HORIZONTAL", 0);
        HORIZONTAL = barChart$Direction;
        BarChart$Direction barChart$Direction2 = new BarChart$Direction("VERTICAL", 1);
        VERTICAL = barChart$Direction2;
        $VALUES = new BarChart$Direction[]{barChart$Direction, barChart$Direction2};
    }

    public static BarChart$Direction valueOf(String str) {
        return (BarChart$Direction) Enum.valueOf(BarChart$Direction.class, str);
    }

    public static BarChart$Direction[] values() {
        return (BarChart$Direction[]) $VALUES.clone();
    }
}
