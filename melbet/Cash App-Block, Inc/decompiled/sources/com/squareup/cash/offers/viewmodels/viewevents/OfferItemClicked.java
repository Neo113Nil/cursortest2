package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfferItemClicked implements OffersSearchViewEvent, OffersFullscreenCollectionViewEvent, OffersAnalyticsViewEvent {
    public final String actionUrl;
    public final List analyticsActionEventSpecs;
    public final OffersItemToken itemToken;

    public OfferItemClicked(String str, OffersItemToken offersItemToken, List list) {
        str.getClass();
        list.getClass();
        this.actionUrl = str;
        this.itemToken = offersItemToken;
        this.analyticsActionEventSpecs = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferItemClicked)) {
            return false;
        }
        OfferItemClicked offerItemClicked = (OfferItemClicked) obj;
        return Intrinsics.areEqual(this.actionUrl, offerItemClicked.actionUrl) && Intrinsics.areEqual(this.itemToken, offerItemClicked.itemToken) && Intrinsics.areEqual(this.analyticsActionEventSpecs, offerItemClicked.analyticsActionEventSpecs);
    }

    @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
    public final List getAnalyticsActionEventSpecs() {
        return this.analyticsActionEventSpecs;
    }

    public final int hashCode() {
        int hashCode = this.actionUrl.hashCode() * 31;
        OffersItemToken offersItemToken = this.itemToken;
        return this.analyticsActionEventSpecs.hashCode() + ((hashCode + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferItemClicked(actionUrl=");
        sb.append(this.actionUrl);
        sb.append(", itemToken=");
        sb.append(this.itemToken);
        sb.append(", analyticsActionEventSpecs=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.analyticsActionEventSpecs, ")");
    }
}
