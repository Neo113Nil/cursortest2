package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FulfillmentType {
    public static final /* synthetic */ FulfillmentType[] $VALUES;
    public static final FulfillmentType DELIVERY;
    public static final FulfillmentType PICKUP;

    static {
        FulfillmentType fulfillmentType = new FulfillmentType("PICKUP", 0);
        PICKUP = fulfillmentType;
        FulfillmentType fulfillmentType2 = new FulfillmentType("DELIVERY", 1);
        DELIVERY = fulfillmentType2;
        $VALUES = new FulfillmentType[]{fulfillmentType, fulfillmentType2};
    }

    public static FulfillmentType valueOf(String str) {
        return (FulfillmentType) Enum.valueOf(FulfillmentType.class, str);
    }

    public static FulfillmentType[] values() {
        return (FulfillmentType[]) $VALUES.clone();
    }
}
