package com.squareup.cash.offers.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class OfferDetailsFooterStateV2 {
    public static final /* synthetic */ OfferDetailsFooterStateV2[] $VALUES;
    public static final OfferDetailsFooterStateV2 BUTTONS;
    public static final OfferDetailsFooterStateV2 OFFER_ADD_CONFIRMATION_ANIMATION;
    public static final OfferDetailsFooterStateV2 OFFER_REMOVE_CONFIRMATION_ANIMATION;
    public static final OfferDetailsFooterStateV2 OFFER_UPDATE_IN_FLIGHT;

    static {
        OfferDetailsFooterStateV2 offerDetailsFooterStateV2 = new OfferDetailsFooterStateV2("BUTTONS", 0);
        BUTTONS = offerDetailsFooterStateV2;
        OfferDetailsFooterStateV2 offerDetailsFooterStateV22 = new OfferDetailsFooterStateV2("OFFER_UPDATE_IN_FLIGHT", 1);
        OFFER_UPDATE_IN_FLIGHT = offerDetailsFooterStateV22;
        OfferDetailsFooterStateV2 offerDetailsFooterStateV23 = new OfferDetailsFooterStateV2("OFFER_ADD_CONFIRMATION_ANIMATION", 2);
        OFFER_ADD_CONFIRMATION_ANIMATION = offerDetailsFooterStateV23;
        OfferDetailsFooterStateV2 offerDetailsFooterStateV24 = new OfferDetailsFooterStateV2("OFFER_REMOVE_CONFIRMATION_ANIMATION", 3);
        OFFER_REMOVE_CONFIRMATION_ANIMATION = offerDetailsFooterStateV24;
        $VALUES = new OfferDetailsFooterStateV2[]{offerDetailsFooterStateV2, offerDetailsFooterStateV22, offerDetailsFooterStateV23, offerDetailsFooterStateV24};
    }

    public static OfferDetailsFooterStateV2 valueOf(String str) {
        return (OfferDetailsFooterStateV2) Enum.valueOf(OfferDetailsFooterStateV2.class, str);
    }

    public static OfferDetailsFooterStateV2[] values() {
        return (OfferDetailsFooterStateV2[]) $VALUES.clone();
    }
}
