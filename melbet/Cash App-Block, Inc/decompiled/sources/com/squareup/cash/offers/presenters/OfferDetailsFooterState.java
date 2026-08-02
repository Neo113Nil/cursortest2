package com.squareup.cash.offers.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class OfferDetailsFooterState {
    public static final /* synthetic */ OfferDetailsFooterState[] $VALUES;
    public static final OfferDetailsFooterState BUTTONS;
    public static final OfferDetailsFooterState OFFER_UPDATE_CONFIRMATION_ANIMATION;
    public static final OfferDetailsFooterState OFFER_UPDATE_IN_FLIGHT;

    static {
        OfferDetailsFooterState offerDetailsFooterState = new OfferDetailsFooterState("BUTTONS", 0);
        BUTTONS = offerDetailsFooterState;
        OfferDetailsFooterState offerDetailsFooterState2 = new OfferDetailsFooterState("OFFER_UPDATE_IN_FLIGHT", 1);
        OFFER_UPDATE_IN_FLIGHT = offerDetailsFooterState2;
        OfferDetailsFooterState offerDetailsFooterState3 = new OfferDetailsFooterState("OFFER_UPDATE_CONFIRMATION_ANIMATION", 2);
        OFFER_UPDATE_CONFIRMATION_ANIMATION = offerDetailsFooterState3;
        $VALUES = new OfferDetailsFooterState[]{offerDetailsFooterState, offerDetailsFooterState2, offerDetailsFooterState3};
    }

    public static OfferDetailsFooterState valueOf(String str) {
        return (OfferDetailsFooterState) Enum.valueOf(OfferDetailsFooterState.class, str);
    }

    public static OfferDetailsFooterState[] values() {
        return (OfferDetailsFooterState[]) $VALUES.clone();
    }
}
