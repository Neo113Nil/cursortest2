package com.squareup.cash.cdf.earningstracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EarningsTrackerEntrypoint {
    public static final /* synthetic */ EarningsTrackerEntrypoint[] $VALUES;
    public static final EarningsTrackerEntrypoint INTRO_EMAIL;
    public static final EarningsTrackerEntrypoint INTRO_PUSH;
    public static final EarningsTrackerEntrypoint MONEY_TAB;
    public static final EarningsTrackerEntrypoint MONTHLY_PUSH;

    static {
        EarningsTrackerEntrypoint earningsTrackerEntrypoint = new EarningsTrackerEntrypoint("MONEY_TAB", 0);
        MONEY_TAB = earningsTrackerEntrypoint;
        EarningsTrackerEntrypoint earningsTrackerEntrypoint2 = new EarningsTrackerEntrypoint("MONTHLY_PUSH", 1);
        MONTHLY_PUSH = earningsTrackerEntrypoint2;
        EarningsTrackerEntrypoint earningsTrackerEntrypoint3 = new EarningsTrackerEntrypoint("INTRO_PUSH", 2);
        INTRO_PUSH = earningsTrackerEntrypoint3;
        EarningsTrackerEntrypoint earningsTrackerEntrypoint4 = new EarningsTrackerEntrypoint("INTRO_EMAIL", 3);
        INTRO_EMAIL = earningsTrackerEntrypoint4;
        $VALUES = new EarningsTrackerEntrypoint[]{earningsTrackerEntrypoint, earningsTrackerEntrypoint2, earningsTrackerEntrypoint3, earningsTrackerEntrypoint4};
    }

    public static EarningsTrackerEntrypoint valueOf(String str) {
        return (EarningsTrackerEntrypoint) Enum.valueOf(EarningsTrackerEntrypoint.class, str);
    }

    public static EarningsTrackerEntrypoint[] values() {
        return (EarningsTrackerEntrypoint[]) $VALUES.clone();
    }
}
