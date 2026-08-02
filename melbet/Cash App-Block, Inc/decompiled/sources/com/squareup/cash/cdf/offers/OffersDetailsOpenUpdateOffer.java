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
public final class OffersDetailsOpenUpdateOffer implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String offer_name;
    public final String offer_token;
    public final LinkedHashMap parameters;
    public final String plasma_flow_token;
    public final OfferUpdateType update_type;

    public OffersDetailsOpenUpdateOffer(String str, String str2, String str3, String str4, String str5, OfferUpdateType offerUpdateType) {
        OfferType offerType = OfferType.BOOST_CLO;
        AppLocation appLocation = AppLocation.CardTab;
        this.business_token = str;
        this.business_name = str2;
        this.offer_token = str3;
        this.offer_name = str4;
        this.plasma_flow_token = str5;
        this.update_type = offerUpdateType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 32, "Offers", "cdf_action", "DetailsOpen");
        Countries.putSafe(m, "business_token", str);
        Countries.putSafe(m, "business_name", str2);
        Countries.putSafe(m, "offer_token", str3);
        Countries.putSafe(m, "offer_name", str4);
        Countries.putSafe(m, "offer_type", offerType);
        Countries.putSafe(m, "plasma_flow_token", str5);
        Countries.putSafe(m, "update_type", offerUpdateType);
        Countries.putSafe(m, "app_location", appLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersDetailsOpenUpdateOffer)) {
            return false;
        }
        OffersDetailsOpenUpdateOffer offersDetailsOpenUpdateOffer = (OffersDetailsOpenUpdateOffer) obj;
        if (!Intrinsics.areEqual(this.business_token, offersDetailsOpenUpdateOffer.business_token) || !Intrinsics.areEqual(this.business_name, offersDetailsOpenUpdateOffer.business_name) || !Intrinsics.areEqual(this.offer_token, offersDetailsOpenUpdateOffer.offer_token) || !Intrinsics.areEqual(this.offer_name, offersDetailsOpenUpdateOffer.offer_name)) {
            return false;
        }
        OfferType offerType = OfferType.BOOST_CLO;
        if (!Intrinsics.areEqual(this.plasma_flow_token, offersDetailsOpenUpdateOffer.plasma_flow_token) || this.update_type != offersDetailsOpenUpdateOffer.update_type) {
            return false;
        }
        AppLocation appLocation = AppLocation.Browser;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers DetailsOpen UpdateOffer";
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
        int hashCode4 = (OfferType.BOOST_CLO.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * (-1796951359);
        String str5 = this.plasma_flow_token;
        return (AppLocation.CardTab.hashCode() + ((this.update_type.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 28629151)) * 961;
    }

    public final String toString() {
        OfferType offerType = OfferType.BOOST_CLO;
        AppLocation appLocation = AppLocation.CardTab;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersDetailsOpenUpdateOffer(shop_flow_token=null, browse_flow_token=null, search_flow_token=null, query_token=null, screen=null, source_screen=null, source_section=null, business_token=", this.business_token, ", business_name=", this.business_name, ", offer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.offer_token, ", offer_name=", this.offer_name, ", offer_type=");
        m.append(offerType);
        m.append(", offer_payment_method=null, offer_channel=null, offer_category_token=null, offer_details=null, current_offer_token=null, current_business_token=null, current_business_name=null, search_text=null, filters=null, plasma_flow_token=");
        m.append(this.plasma_flow_token);
        m.append(", update_type=");
        m.append(this.update_type);
        m.append(", referrer_flow_token=null, origin=null, marketing_source=null, marketing_utm=null, app_location=");
        m.append(appLocation);
        m.append(", from_screen=null, from_section=null)");
        return m.toString();
    }
}
