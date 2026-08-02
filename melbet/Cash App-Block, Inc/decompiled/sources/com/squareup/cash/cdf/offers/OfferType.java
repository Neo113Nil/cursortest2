package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OfferType {
    public static final /* synthetic */ OfferType[] $VALUES;
    public static final OfferType BOOST_CLO;

    static {
        OfferType offerType = new OfferType("BOOST_CLO", 0);
        BOOST_CLO = offerType;
        $VALUES = new OfferType[]{offerType, new OfferType("BOOST_AFFILIATE", 1), new OfferType("BNPL", 2), new OfferType("CASH_PAY", 3), new OfferType("SUP", 4)};
    }

    public static OfferType valueOf(String str) {
        return (OfferType) Enum.valueOf(OfferType.class, str);
    }

    public static OfferType[] values() {
        return (OfferType[]) $VALUES.clone();
    }
}
