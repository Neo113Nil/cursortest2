package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FulfillmentVersion {
    public static final /* synthetic */ FulfillmentVersion[] $VALUES;
    public static final FulfillmentVersion BX;

    /* JADX INFO: Fake field, exist only in values array */
    FulfillmentVersion EF0;

    static {
        FulfillmentVersion fulfillmentVersion = new FulfillmentVersion("FTUX", 0);
        FulfillmentVersion fulfillmentVersion2 = new FulfillmentVersion("BX", 1);
        BX = fulfillmentVersion2;
        $VALUES = new FulfillmentVersion[]{fulfillmentVersion, fulfillmentVersion2};
    }

    public static FulfillmentVersion valueOf(String str) {
        return (FulfillmentVersion) Enum.valueOf(FulfillmentVersion.class, str);
    }

    public static FulfillmentVersion[] values() {
        return (FulfillmentVersion[]) $VALUES.clone();
    }
}
