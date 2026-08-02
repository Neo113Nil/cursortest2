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
public final class OffersDetailsOpenViewOfferDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String offer_name;
    public final String offer_token;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;

    public OffersDetailsOpenViewOfferDetails(String str, String str2, String str3, String str4, String str5) {
        OfferType offerType = OfferType.BOOST_CLO;
        AppLocation appLocation = AppLocation.CardTab;
        this.business_token = str;
        this.business_name = str2;
        this.offer_token = str3;
        this.offer_name = str4;
        this.referrer_flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 33, "Offers", "cdf_action", "DetailsOpen");
        Countries.putSafe(m, "business_token", str);
        Countries.putSafe(m, "business_name", str2);
        Countries.putSafe(m, "offer_token", str3);
        Countries.putSafe(m, "offer_name", str4);
        Countries.putSafe(m, "offer_type", offerType);
        Countries.putSafe(m, "referrer_flow_token", str5);
        Countries.putSafe(m, "app_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersDetailsOpenViewOfferDetails)) {
            return false;
        }
        OffersDetailsOpenViewOfferDetails offersDetailsOpenViewOfferDetails = (OffersDetailsOpenViewOfferDetails) obj;
        if (!Intrinsics.areEqual(this.business_token, offersDetailsOpenViewOfferDetails.business_token) || !Intrinsics.areEqual(this.business_name, offersDetailsOpenViewOfferDetails.business_name) || !Intrinsics.areEqual(this.offer_token, offersDetailsOpenViewOfferDetails.offer_token) || !Intrinsics.areEqual(this.offer_name, offersDetailsOpenViewOfferDetails.offer_name)) {
            return false;
        }
        OfferType offerType = OfferType.BOOST_CLO;
        if (!Intrinsics.areEqual(this.referrer_flow_token, offersDetailsOpenViewOfferDetails.referrer_flow_token)) {
            return false;
        }
        AppLocation appLocation = AppLocation.Browser;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers DetailsOpen ViewOfferDetails";
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
        int hashCode4 = (OfferType.BOOST_CLO.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * (-196513505);
        String str5 = this.referrer_flow_token;
        return (AppLocation.CardTab.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 923521)) * 887503681;
    }

    public final String toString() {
        OfferType offerType = OfferType.BOOST_CLO;
        AppLocation appLocation = AppLocation.CardTab;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersDetailsOpenViewOfferDetails(shop_flow_token=null, browse_flow_token=null, search_flow_token=null, query_token=null, screen=null, source_screen=null, source_section=null, business_token=", this.business_token, ", business_name=", this.business_name, ", offer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.offer_token, ", offer_name=", this.offer_name, ", offer_type=");
        m.append(offerType);
        m.append(", offer_payment_method=null, offer_channel=null, offer_category_token=null, offer_details=null, url=null, affiliate_url=null, search_text=null, filters=null, referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", origin=null, marketing_source=null, marketing_utm=null, app_location=");
        m.append(appLocation);
        m.append(", browser_session_token=null, from_screen=null, from_section=null, afterpay_feature=null, afterpay_details=null, afterpay_sheet_type=null)");
        return m.toString();
    }
}
