package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FulfillmentInstanceType {
    public static final /* synthetic */ FulfillmentInstanceType[] $VALUES;
    public static final FulfillmentInstanceType DELIVERY;
    public static final FulfillmentInstanceType PICKUP;

    /* JADX INFO: Fake field, exist only in values array */
    FulfillmentInstanceType EF0;

    static {
        FulfillmentInstanceType fulfillmentInstanceType = new FulfillmentInstanceType("OVERALL", 0);
        FulfillmentInstanceType fulfillmentInstanceType2 = new FulfillmentInstanceType("PICKUP", 1);
        PICKUP = fulfillmentInstanceType2;
        FulfillmentInstanceType fulfillmentInstanceType3 = new FulfillmentInstanceType("DELIVERY", 2);
        DELIVERY = fulfillmentInstanceType3;
        $VALUES = new FulfillmentInstanceType[]{fulfillmentInstanceType, fulfillmentInstanceType2, fulfillmentInstanceType3, new FulfillmentInstanceType("CONFIRM_ORDER", 3)};
    }

    public static FulfillmentInstanceType valueOf(String str) {
        return (FulfillmentInstanceType) Enum.valueOf(FulfillmentInstanceType.class, str);
    }

    public static FulfillmentInstanceType[] values() {
        return (FulfillmentInstanceType[]) $VALUES.clone();
    }
}
