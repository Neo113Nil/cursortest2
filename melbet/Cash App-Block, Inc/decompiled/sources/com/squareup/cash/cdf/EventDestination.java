package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EventDestination {
    public static final /* synthetic */ EventDestination[] $VALUES;
    public static final EventDestination AMPLITUDE;
    public static final EventDestination BRAZE;
    public static final EventDestination BULLETIN;
    public static final EventDestination KAFKA;
    public static final EventDestination LAUNCH_DARKLY;
    public static final EventDestination ML_PLATFORM;
    public static final EventDestination SEGMENT;
    public static final EventDestination SNOWFLAKE;

    static {
        EventDestination eventDestination = new EventDestination("SEGMENT", 0);
        SEGMENT = eventDestination;
        EventDestination eventDestination2 = new EventDestination("AMPLITUDE", 1);
        AMPLITUDE = eventDestination2;
        EventDestination eventDestination3 = new EventDestination("SNOWFLAKE", 2);
        SNOWFLAKE = eventDestination3;
        EventDestination eventDestination4 = new EventDestination("KAFKA", 3);
        KAFKA = eventDestination4;
        EventDestination eventDestination5 = new EventDestination("BULLETIN", 4);
        BULLETIN = eventDestination5;
        EventDestination eventDestination6 = new EventDestination("ML_PLATFORM", 5);
        ML_PLATFORM = eventDestination6;
        EventDestination eventDestination7 = new EventDestination("BRAZE", 6);
        BRAZE = eventDestination7;
        EventDestination eventDestination8 = new EventDestination("LAUNCH_DARKLY", 7);
        LAUNCH_DARKLY = eventDestination8;
        $VALUES = new EventDestination[]{eventDestination, eventDestination2, eventDestination3, eventDestination4, eventDestination5, eventDestination6, eventDestination7, eventDestination8};
    }

    public static EventDestination valueOf(String str) {
        return (EventDestination) Enum.valueOf(EventDestination.class, str);
    }

    public static EventDestination[] values() {
        return (EventDestination[]) $VALUES.clone();
    }
}
