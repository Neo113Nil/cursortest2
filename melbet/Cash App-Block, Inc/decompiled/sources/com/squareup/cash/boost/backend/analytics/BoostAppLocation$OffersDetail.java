package com.squareup.cash.boost.backend.analytics;

import androidx.compose.ui.platform.DerivedSize;
import com.squareup.cash.cdf.offers.AppLocation;

/* loaded from: classes7.dex */
public final class BoostAppLocation$OffersDetail extends DerivedSize.Companion {
    public final AppLocation origin;

    public BoostAppLocation$OffersDetail(AppLocation appLocation) {
        this.origin = appLocation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BoostAppLocation$OffersDetail) && this.origin == ((BoostAppLocation$OffersDetail) obj).origin;
    }

    public final AppLocation getOrigin() {
        return this.origin;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "OffersDetail(origin=" + this.origin + ")";
    }
}
