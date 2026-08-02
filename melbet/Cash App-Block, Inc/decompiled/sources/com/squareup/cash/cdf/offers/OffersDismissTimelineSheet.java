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
public final class OffersDismissTimelineSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AppLocation app_location;
    public final String browse_flow_token;
    public final String business_name;
    public final String business_token;
    public final SheetDismissOrigin dismiss_origin;
    public final String from_section;
    public final String offer_token;
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String search_flow_token;
    public final String shop_flow_token;

    public OffersDismissTimelineSheet(String str, String str2, String str3, String str4, AppLocation appLocation, SheetDismissOrigin sheetDismissOrigin, String str5, String str6, String str7, Origin origin, String str8) {
        this.shop_flow_token = str;
        this.browse_flow_token = str2;
        this.search_flow_token = str3;
        this.referrer_flow_token = str4;
        this.app_location = appLocation;
        this.dismiss_origin = sheetDismissOrigin;
        this.business_token = str5;
        this.business_name = str6;
        this.offer_token = str7;
        this.origin = origin;
        this.from_section = str8;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 24, "Offers", "cdf_action", "Dismiss");
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "browse_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "referrer_flow_token", str4);
        Countries.putSafe(m, "app_location", appLocation);
        Countries.putSafe(m, "dismiss_origin", sheetDismissOrigin);
        Countries.putSafe(m, "business_token", str5);
        Countries.putSafe(m, "business_name", str6);
        Countries.putSafe(m, "offer_token", str7);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "from_section", str8);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersDismissTimelineSheet)) {
            return false;
        }
        OffersDismissTimelineSheet offersDismissTimelineSheet = (OffersDismissTimelineSheet) obj;
        return Intrinsics.areEqual(this.shop_flow_token, offersDismissTimelineSheet.shop_flow_token) && Intrinsics.areEqual(this.browse_flow_token, offersDismissTimelineSheet.browse_flow_token) && Intrinsics.areEqual(this.search_flow_token, offersDismissTimelineSheet.search_flow_token) && Intrinsics.areEqual(this.referrer_flow_token, offersDismissTimelineSheet.referrer_flow_token) && this.app_location == offersDismissTimelineSheet.app_location && this.dismiss_origin == offersDismissTimelineSheet.dismiss_origin && Intrinsics.areEqual(this.business_token, offersDismissTimelineSheet.business_token) && Intrinsics.areEqual(this.business_name, offersDismissTimelineSheet.business_name) && Intrinsics.areEqual(this.offer_token, offersDismissTimelineSheet.offer_token) && this.origin == offersDismissTimelineSheet.origin && Intrinsics.areEqual(this.from_section, offersDismissTimelineSheet.from_section);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Dismiss TimelineSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.shop_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.browse_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AppLocation appLocation = this.app_location;
        int hashCode5 = (this.dismiss_origin.hashCode() + ((hashCode4 + (appLocation == null ? 0 : appLocation.hashCode())) * 29791)) * 31;
        String str5 = this.business_token;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.business_name;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offer_token;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 1742810335;
        Origin origin = this.origin;
        int hashCode9 = (hashCode8 + (origin == null ? 0 : origin.hashCode())) * 961;
        String str8 = this.from_section;
        return (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersDismissTimelineSheet(shop_flow_token=", this.shop_flow_token, ", browse_flow_token=", this.browse_flow_token, ", search_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.search_flow_token, ", browser_session_token=null, referrer_flow_token=", this.referrer_flow_token, ", app_location=");
        m.append(this.app_location);
        m.append(", source_screen=null, source_section=null, dismiss_origin=");
        m.append(this.dismiss_origin);
        m.append(", business_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_token, ", business_name=", this.business_name, ", offer_token=");
        m.append(this.offer_token);
        m.append(", offer_name=null, offer_type=null, offer_payment_method=null, offer_channel=null, offer_category_token=null, offer_details=null, origin=");
        m.append(this.origin);
        m.append(", from_screen=null, from_section=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.from_section, ", afterpay_feature=null)");
    }
}
