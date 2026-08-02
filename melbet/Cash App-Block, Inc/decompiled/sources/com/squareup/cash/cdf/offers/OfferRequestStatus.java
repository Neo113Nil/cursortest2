package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OfferRequestStatus {
    public static final /* synthetic */ OfferRequestStatus[] $VALUES;
    public static final OfferRequestStatus CANCELLED;
    public static final OfferRequestStatus LOGICAL_ERROR;
    public static final OfferRequestStatus NETWORK_ERROR;
    public static final OfferRequestStatus SUCCESS;

    static {
        OfferRequestStatus offerRequestStatus = new OfferRequestStatus("NETWORK_ERROR", 0);
        NETWORK_ERROR = offerRequestStatus;
        OfferRequestStatus offerRequestStatus2 = new OfferRequestStatus("LOGICAL_ERROR", 1);
        LOGICAL_ERROR = offerRequestStatus2;
        OfferRequestStatus offerRequestStatus3 = new OfferRequestStatus("CANCELLED", 2);
        CANCELLED = offerRequestStatus3;
        OfferRequestStatus offerRequestStatus4 = new OfferRequestStatus("SUCCESS", 3);
        SUCCESS = offerRequestStatus4;
        $VALUES = new OfferRequestStatus[]{offerRequestStatus, offerRequestStatus2, offerRequestStatus3, offerRequestStatus4};
    }

    public static OfferRequestStatus valueOf(String str) {
        return (OfferRequestStatus) Enum.valueOf(OfferRequestStatus.class, str);
    }

    public static OfferRequestStatus[] values() {
        return (OfferRequestStatus[]) $VALUES.clone();
    }
}
