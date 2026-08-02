package com.bugsnag.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeliveryStrategy {
    public static final /* synthetic */ DeliveryStrategy[] $VALUES;
    public static final DeliveryStrategy SEND_IMMEDIATELY;
    public static final DeliveryStrategy STORE_AND_FLUSH;
    public static final DeliveryStrategy STORE_ONLY;

    static {
        DeliveryStrategy deliveryStrategy = new DeliveryStrategy("STORE_ONLY", 0);
        STORE_ONLY = deliveryStrategy;
        DeliveryStrategy deliveryStrategy2 = new DeliveryStrategy("STORE_AND_FLUSH", 1);
        STORE_AND_FLUSH = deliveryStrategy2;
        DeliveryStrategy deliveryStrategy3 = new DeliveryStrategy("STORE_AND_SEND", 2);
        DeliveryStrategy deliveryStrategy4 = new DeliveryStrategy("SEND_IMMEDIATELY", 3);
        SEND_IMMEDIATELY = deliveryStrategy4;
        $VALUES = new DeliveryStrategy[]{deliveryStrategy, deliveryStrategy2, deliveryStrategy3, deliveryStrategy4};
    }

    public static DeliveryStrategy valueOf(String str) {
        return (DeliveryStrategy) Enum.valueOf(DeliveryStrategy.class, str);
    }

    public static DeliveryStrategy[] values() {
        return (DeliveryStrategy[]) $VALUES.clone();
    }
}
