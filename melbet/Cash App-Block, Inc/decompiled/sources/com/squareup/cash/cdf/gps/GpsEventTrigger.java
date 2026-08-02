package com.squareup.cash.cdf.gps;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class GpsEventTrigger {
    public static final /* synthetic */ GpsEventTrigger[] $VALUES;
    public static final GpsEventTrigger CARD_ACTIVATION;
    public static final GpsEventTrigger CARD_TRANSACTION_AUTH_PROMPT;
    public static final GpsEventTrigger SUSPENSION_CHECK;

    static {
        GpsEventTrigger gpsEventTrigger = new GpsEventTrigger("CARD_ACTIVATION", 0);
        CARD_ACTIVATION = gpsEventTrigger;
        GpsEventTrigger gpsEventTrigger2 = new GpsEventTrigger("CARD_TRANSACTION_AUTH_PROMPT", 1);
        CARD_TRANSACTION_AUTH_PROMPT = gpsEventTrigger2;
        GpsEventTrigger gpsEventTrigger3 = new GpsEventTrigger("APP_OPEN", 2);
        GpsEventTrigger gpsEventTrigger4 = new GpsEventTrigger("SUSPENSION_CHECK", 3);
        SUSPENSION_CHECK = gpsEventTrigger4;
        $VALUES = new GpsEventTrigger[]{gpsEventTrigger, gpsEventTrigger2, gpsEventTrigger3, gpsEventTrigger4, new GpsEventTrigger("CARD_PRESENT_TRANSACTION_ATTEMPT", 4), new GpsEventTrigger("CARD_TRANSACTION_AUTH_BACKGROUND", 5)};
    }

    public static GpsEventTrigger valueOf(String str) {
        return (GpsEventTrigger) Enum.valueOf(GpsEventTrigger.class, str);
    }

    public static GpsEventTrigger[] values() {
        return (GpsEventTrigger[]) $VALUES.clone();
    }
}
