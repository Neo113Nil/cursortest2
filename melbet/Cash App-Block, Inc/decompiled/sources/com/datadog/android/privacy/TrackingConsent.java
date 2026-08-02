package com.datadog.android.privacy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TrackingConsent {
    public static final /* synthetic */ TrackingConsent[] $VALUES;
    public static final TrackingConsent GRANTED;
    public static final TrackingConsent NOT_GRANTED;
    public static final TrackingConsent PENDING;

    static {
        TrackingConsent trackingConsent = new TrackingConsent("GRANTED", 0);
        GRANTED = trackingConsent;
        TrackingConsent trackingConsent2 = new TrackingConsent("NOT_GRANTED", 1);
        NOT_GRANTED = trackingConsent2;
        TrackingConsent trackingConsent3 = new TrackingConsent("PENDING", 2);
        PENDING = trackingConsent3;
        $VALUES = new TrackingConsent[]{trackingConsent, trackingConsent2, trackingConsent3};
    }

    public static TrackingConsent valueOf(String str) {
        return (TrackingConsent) Enum.valueOf(TrackingConsent.class, str);
    }

    public static TrackingConsent[] values() {
        return (TrackingConsent[]) $VALUES.clone();
    }
}
