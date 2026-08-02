package com.squareup.cash.cdf.offers;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersTapOpenOfferView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final AppLocation app_location;
    public final String card_flow_token;
    public final OfferState offer_state;
    public final LinkedHashMap parameters;

    public OffersTapOpenOfferView(String str, AppLocation appLocation, OfferState offerState) {
        this.card_flow_token = str;
        this.app_location = appLocation;
        this.offer_state = offerState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Offers", "cdf_action", "Tap");
        Countries.putSafe(m, "card_flow_token", str);
        Countries.putSafe(m, "app_location", appLocation);
        Countries.putSafe(m, "offer_state", offerState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersTapOpenOfferView)) {
            return false;
        }
        OffersTapOpenOfferView offersTapOpenOfferView = (OffersTapOpenOfferView) obj;
        return Intrinsics.areEqual(this.card_flow_token, offersTapOpenOfferView.card_flow_token) && this.app_location == offersTapOpenOfferView.app_location && this.offer_state == offersTapOpenOfferView.offer_state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Tap OpenOfferView";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.card_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AppLocation appLocation = this.app_location;
        int hashCode2 = (hashCode + (appLocation == null ? 0 : appLocation.hashCode())) * 961;
        OfferState offerState = this.offer_state;
        return hashCode2 + (offerState != null ? offerState.hashCode() : 0);
    }

    public final String toString() {
        return "OffersTapOpenOfferView(card_flow_token=" + this.card_flow_token + ", app_location=" + this.app_location + ", discover_flow_token=null, offer_state=" + this.offer_state + ")";
    }
}
