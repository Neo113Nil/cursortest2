package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OfferState {
    public static final /* synthetic */ OfferState[] $VALUES;
    public static final OfferState ACTIVE;
    public static final OfferState INACTIVE;

    static {
        OfferState offerState = new OfferState("ACTIVE", 0);
        ACTIVE = offerState;
        OfferState offerState2 = new OfferState("INACTIVE", 1);
        INACTIVE = offerState2;
        $VALUES = new OfferState[]{offerState, offerState2};
    }

    public static OfferState valueOf(String str) {
        return (OfferState) Enum.valueOf(OfferState.class, str);
    }

    public static OfferState[] values() {
        return (OfferState[]) $VALUES.clone();
    }
}
