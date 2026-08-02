package com.squareup.cash.offers.viewmodels;

import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfferFooterButton {
    public final OffersDetailsSheetViewEvent.OfferButtonEvent buttonEvent;
    public final String buttonText;

    public OfferFooterButton(String str, OffersDetailsSheetViewEvent.OfferButtonEvent offerButtonEvent) {
        str.getClass();
        this.buttonText = str;
        this.buttonEvent = offerButtonEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferFooterButton)) {
            return false;
        }
        OfferFooterButton offerFooterButton = (OfferFooterButton) obj;
        return Intrinsics.areEqual(this.buttonText, offerFooterButton.buttonText) && this.buttonEvent.equals(offerFooterButton.buttonEvent);
    }

    public final int hashCode() {
        return this.buttonEvent.hashCode() + (this.buttonText.hashCode() * 31);
    }

    public final String toString() {
        return "OfferFooterButton(buttonText=" + this.buttonText + ", buttonEvent=" + this.buttonEvent + ")";
    }
}
