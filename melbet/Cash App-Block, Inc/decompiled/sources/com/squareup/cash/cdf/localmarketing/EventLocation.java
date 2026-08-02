package com.squareup.cash.cdf.localmarketing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EventLocation {
    public static final /* synthetic */ EventLocation[] $VALUES;
    public static final EventLocation MESSAGES;

    /* JADX INFO: Fake field, exist only in values array */
    EventLocation EF0;

    static {
        EventLocation eventLocation = new EventLocation("HOME", 0);
        EventLocation eventLocation2 = new EventLocation("MESSAGES", 1);
        MESSAGES = eventLocation2;
        $VALUES = new EventLocation[]{eventLocation, eventLocation2, new EventLocation("PROFILE", 2), new EventLocation("DEEPLINK", 3)};
    }

    public static EventLocation valueOf(String str) {
        return (EventLocation) Enum.valueOf(EventLocation.class, str);
    }

    public static EventLocation[] values() {
        return (EventLocation[]) $VALUES.clone();
    }
}
