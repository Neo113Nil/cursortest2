package com.squareup.cash.cdf.offers;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersLockedOfferUpsellOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String offer_name;
    public final String offer_token;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public OffersLockedOfferUpsellOpen(String str, String str2, String str3, String str4, String str5) {
        AppLocation appLocation = AppLocation.CardTab;
        this.business_token = str;
        this.business_name = str2;
        this.offer_token = str3;
        this.offer_name = str4;
        this.referrer_flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Offers", "cdf_action", "LockedOfferUpsell");
        Countries.putSafe(m, "business_token", str);
        Countries.putSafe(m, "business_name", str2);
        Countries.putSafe(m, "offer_token", str3);
        Countries.putSafe(m, "offer_name", str4);
        Countries.putSafe(m, "referrer_flow_token", str5);
        Countries.putSafe(m, "app_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersLockedOfferUpsellOpen)) {
            return false;
        }
        OffersLockedOfferUpsellOpen offersLockedOfferUpsellOpen = (OffersLockedOfferUpsellOpen) obj;
        if (!Intrinsics.areEqual(this.business_token, offersLockedOfferUpsellOpen.business_token) || !Intrinsics.areEqual(this.business_name, offersLockedOfferUpsellOpen.business_name) || !Intrinsics.areEqual(this.offer_token, offersLockedOfferUpsellOpen.offer_token) || !Intrinsics.areEqual(this.offer_name, offersLockedOfferUpsellOpen.offer_name) || !Intrinsics.areEqual(this.referrer_flow_token, offersLockedOfferUpsellOpen.referrer_flow_token)) {
            return false;
        }
        AppLocation appLocation = AppLocation.Browser;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers LockedOfferUpsell Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.business_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.business_name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offer_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offer_name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.referrer_flow_token;
        return AppLocation.CardTab.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        AppLocation appLocation = AppLocation.CardTab;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersLockedOfferUpsellOpen(business_token=", this.business_token, ", business_name=", this.business_name, ", offer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.offer_token, ", offer_name=", this.offer_name, ", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", app_location=");
        m.append(appLocation);
        m.append(")");
        return m.toString();
    }
}
