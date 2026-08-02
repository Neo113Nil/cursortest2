package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Frequency {
    public static final /* synthetic */ Frequency[] $VALUES;
    public static final Frequency DAILY;
    public static final Frequency EVERY_TWO_WEEKS;
    public static final Frequency MONTHLY;
    public static final Frequency ONE_TIME;
    public static final Frequency WEEKLY;

    static {
        Frequency frequency = new Frequency("ONE_TIME", 0);
        ONE_TIME = frequency;
        Frequency frequency2 = new Frequency("DAILY", 1);
        DAILY = frequency2;
        Frequency frequency3 = new Frequency("WEEKLY", 2);
        WEEKLY = frequency3;
        Frequency frequency4 = new Frequency("EVERY_TWO_WEEKS", 3);
        EVERY_TWO_WEEKS = frequency4;
        Frequency frequency5 = new Frequency("MONTHLY", 4);
        MONTHLY = frequency5;
        $VALUES = new Frequency[]{frequency, frequency2, frequency3, frequency4, frequency5};
    }

    public static Frequency valueOf(String str) {
        return (Frequency) Enum.valueOf(Frequency.class, str);
    }

    public static Frequency[] values() {
        return (Frequency[]) $VALUES.clone();
    }
}
