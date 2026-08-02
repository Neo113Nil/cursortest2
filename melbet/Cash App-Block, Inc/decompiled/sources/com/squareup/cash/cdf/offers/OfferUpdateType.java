package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OfferUpdateType {
    public static final /* synthetic */ OfferUpdateType[] $VALUES;
    public static final OfferUpdateType ADD;
    public static final OfferUpdateType REMOVE;
    public static final OfferUpdateType SWAP;

    static {
        OfferUpdateType offerUpdateType = new OfferUpdateType("ADD", 0);
        ADD = offerUpdateType;
        OfferUpdateType offerUpdateType2 = new OfferUpdateType("REMOVE", 1);
        REMOVE = offerUpdateType2;
        OfferUpdateType offerUpdateType3 = new OfferUpdateType("SWAP", 2);
        SWAP = offerUpdateType3;
        $VALUES = new OfferUpdateType[]{offerUpdateType, offerUpdateType2, offerUpdateType3};
    }

    public static OfferUpdateType valueOf(String str) {
        return (OfferUpdateType) Enum.valueOf(OfferUpdateType.class, str);
    }

    public static OfferUpdateType[] values() {
        return (OfferUpdateType[]) $VALUES.clone();
    }
}
