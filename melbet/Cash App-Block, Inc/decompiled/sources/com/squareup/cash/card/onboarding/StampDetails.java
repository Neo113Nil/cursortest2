package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;

/* loaded from: classes6.dex */
public final class StampDetails {
    public final TouchData.StampCustomization customization;
    public final Stamp stamp;

    public StampDetails(Stamp stamp, TouchData.StampCustomization stampCustomization) {
        this.stamp = stamp;
        this.customization = stampCustomization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StampDetails)) {
            return false;
        }
        StampDetails stampDetails = (StampDetails) obj;
        return this.stamp.equals(stampDetails.stamp) && this.customization.equals(stampDetails.customization);
    }

    public final int hashCode() {
        return this.customization.hashCode() + (this.stamp.hashCode() * 31);
    }

    public final String toString() {
        return "StampDetails(stamp=" + this.stamp + ", customization=" + this.customization + ")";
    }
}
