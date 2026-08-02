package com.squareup.cash.cdf.offers;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class OffersDismissDetailSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
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

    public OffersDismissDetailSheet(Origin origin, String str, String str2, String str3, String str4, String str5, String str6, String str7, SheetDismissOrigin sheetDismissOrigin) {
        this.origin = origin;
        this.referrer_flow_token = str;
        this.shop_flow_token = str2;
        this.search_flow_token = str3;
        this.from_section = str4;
        this.business_token = str5;
        this.business_name = str6;
        this.offer_token = str7;
        this.dismiss_origin = sheetDismissOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "Offers", "cdf_action", "Dismiss");
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "shop_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "from_section", str4);
        Countries.putSafe(m, "business_token", str5);
        Countries.putSafe(m, "business_name", str6);
        Countries.putSafe(m, "offer_token", str7);
        Countries.putSafe(m, "dismiss_origin", sheetDismissOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersDismissDetailSheet)) {
            return false;
        }
        OffersDismissDetailSheet offersDismissDetailSheet = (OffersDismissDetailSheet) obj;
        return this.origin == offersDismissDetailSheet.origin && Intrinsics.areEqual(this.referrer_flow_token, offersDismissDetailSheet.referrer_flow_token) && Intrinsics.areEqual(this.shop_flow_token, offersDismissDetailSheet.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, offersDismissDetailSheet.search_flow_token) && Intrinsics.areEqual(this.from_section, offersDismissDetailSheet.from_section) && Intrinsics.areEqual(this.business_token, offersDismissDetailSheet.business_token) && Intrinsics.areEqual(this.business_name, offersDismissDetailSheet.business_name) && Intrinsics.areEqual(this.offer_token, offersDismissDetailSheet.offer_token) && this.dismiss_origin == offersDismissDetailSheet.dismiss_origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Dismiss DetailSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Origin origin = this.origin;
        int hashCode = (origin == null ? 0 : origin.hashCode()) * 31;
        String str = this.referrer_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shop_flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 29791;
        String str4 = this.from_section;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.business_token;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.business_name;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 961;
        String str7 = this.offer_token;
        return this.dismiss_origin.hashCode() + ((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersDismissDetailSheet(origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", shop_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.shop_flow_token, ", search_flow_token=", this.search_flow_token, ", browser_session_token=null, from_screen=null, from_section=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.from_section, ", business_token=", this.business_token, ", business_name=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.business_name, ", afterpay_feature=null, offer_token=", this.offer_token, ", offer_name=null, dismiss_origin=");
        sb.append(this.dismiss_origin);
        sb.append(")");
        return sb.toString();
    }
}
