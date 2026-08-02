package com.squareup.cash.offers.viewmodels.viewevents;

import com.squareup.cash.cdf.browser.SheetDismissMechanism;

/* loaded from: classes6.dex */
public final class OffersRedemptionViewEvents$Close {
    public final SheetDismissMechanism dismissMechanism;

    public OffersRedemptionViewEvents$Close(SheetDismissMechanism sheetDismissMechanism) {
        this.dismissMechanism = sheetDismissMechanism;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffersRedemptionViewEvents$Close) && this.dismissMechanism == ((OffersRedemptionViewEvents$Close) obj).dismissMechanism;
    }

    public final int hashCode() {
        return this.dismissMechanism.hashCode();
    }

    public final String toString() {
        return "Close(dismissMechanism=" + this.dismissMechanism + ")";
    }
}
