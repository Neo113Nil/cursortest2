package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SchedulingType {
    public static final /* synthetic */ SchedulingType[] $VALUES;
    public static final SchedulingType ASAP;
    public static final SchedulingType LATER;

    static {
        SchedulingType schedulingType = new SchedulingType("ASAP", 0);
        ASAP = schedulingType;
        SchedulingType schedulingType2 = new SchedulingType("LATER", 1);
        LATER = schedulingType2;
        $VALUES = new SchedulingType[]{schedulingType, schedulingType2};
    }

    public static SchedulingType valueOf(String str) {
        return (SchedulingType) Enum.valueOf(SchedulingType.class, str);
    }

    public static SchedulingType[] values() {
        return (SchedulingType[]) $VALUES.clone();
    }
}
