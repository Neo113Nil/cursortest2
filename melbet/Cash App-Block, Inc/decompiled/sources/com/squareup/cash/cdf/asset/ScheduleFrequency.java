package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScheduleFrequency {
    public static final /* synthetic */ ScheduleFrequency[] $VALUES;
    public static final ScheduleFrequency BIWEEKLY;
    public static final ScheduleFrequency MONTHLY;
    public static final ScheduleFrequency WEEKLY;

    static {
        ScheduleFrequency scheduleFrequency = new ScheduleFrequency("WEEKLY", 0);
        WEEKLY = scheduleFrequency;
        ScheduleFrequency scheduleFrequency2 = new ScheduleFrequency("BIWEEKLY", 1);
        BIWEEKLY = scheduleFrequency2;
        ScheduleFrequency scheduleFrequency3 = new ScheduleFrequency("MONTHLY", 2);
        MONTHLY = scheduleFrequency3;
        $VALUES = new ScheduleFrequency[]{scheduleFrequency, scheduleFrequency2, scheduleFrequency3};
    }

    public static ScheduleFrequency valueOf(String str) {
        return (ScheduleFrequency) Enum.valueOf(ScheduleFrequency.class, str);
    }

    public static ScheduleFrequency[] values() {
        return (ScheduleFrequency[]) $VALUES.clone();
    }
}
