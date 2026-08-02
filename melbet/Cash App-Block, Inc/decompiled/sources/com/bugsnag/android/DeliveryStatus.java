package com.bugsnag.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeliveryStatus {
    public static final /* synthetic */ DeliveryStatus[] $VALUES;
    public static final NoopLogger Companion;
    public static final DeliveryStatus DELIVERED;
    public static final DeliveryStatus FAILURE;
    public static final DeliveryStatus UNDELIVERED;

    static {
        DeliveryStatus deliveryStatus = new DeliveryStatus("DELIVERED", 0);
        DELIVERED = deliveryStatus;
        DeliveryStatus deliveryStatus2 = new DeliveryStatus("UNDELIVERED", 1);
        UNDELIVERED = deliveryStatus2;
        DeliveryStatus deliveryStatus3 = new DeliveryStatus("FAILURE", 2);
        FAILURE = deliveryStatus3;
        $VALUES = new DeliveryStatus[]{deliveryStatus, deliveryStatus2, deliveryStatus3};
        Companion = new NoopLogger(2);
    }

    public static DeliveryStatus valueOf(String str) {
        return (DeliveryStatus) Enum.valueOf(DeliveryStatus.class, str);
    }

    public static DeliveryStatus[] values() {
        return (DeliveryStatus[]) $VALUES.clone();
    }
}
