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
public final class OffersSearchQueryComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Origin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String requested_filters;
    public final Screen screen;
    public final String search_flow_token;
    public final String search_text;
    public final String shop_flow_token;
    public final String source_filter;
    public final OfferRequestStatus status;

    public OffersSearchQueryComplete(String str, String str2, String str3, String str4, String str5, String str6, OfferRequestStatus offerRequestStatus, int i) {
        Screen screen = Screen.AP_APPLET_SEARCH;
        Origin origin = Origin.AFTERPAY_APPLET;
        screen = (i & 1) != 0 ? null : screen;
        origin = (i & 4) != 0 ? null : origin;
        str2 = (i & 8) != 0 ? null : str2;
        str5 = (i & 64) != 0 ? null : str5;
        str6 = (i & 128) != 0 ? null : str6;
        this.screen = screen;
        this.shop_flow_token = str;
        this.origin = origin;
        this.referrer_flow_token = str2;
        this.search_flow_token = str3;
        this.search_text = str4;
        this.requested_filters = str5;
        this.source_filter = str6;
        this.status = offerRequestStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "Offers", "cdf_action", "Search");
        Countries.putSafe(m, "screen", screen);
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "search_text", str4);
        Countries.putSafe(m, "requested_filters", str5);
        Countries.putSafe(m, "source_filter", str6);
        Countries.putSafe(m, "status", offerRequestStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSearchQueryComplete)) {
            return false;
        }
        OffersSearchQueryComplete offersSearchQueryComplete = (OffersSearchQueryComplete) obj;
        return this.screen == offersSearchQueryComplete.screen && Intrinsics.areEqual(this.shop_flow_token, offersSearchQueryComplete.shop_flow_token) && this.origin == offersSearchQueryComplete.origin && Intrinsics.areEqual(this.referrer_flow_token, offersSearchQueryComplete.referrer_flow_token) && Intrinsics.areEqual(this.search_flow_token, offersSearchQueryComplete.search_flow_token) && Intrinsics.areEqual(this.search_text, offersSearchQueryComplete.search_text) && Intrinsics.areEqual(this.requested_filters, offersSearchQueryComplete.requested_filters) && Intrinsics.areEqual(this.source_filter, offersSearchQueryComplete.source_filter) && this.status == offersSearchQueryComplete.status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Search QueryComplete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Screen screen = this.screen;
        int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
        String str = this.shop_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Origin origin = this.origin;
        int hashCode3 = (hashCode2 + (origin == null ? 0 : origin.hashCode())) * 31;
        String str2 = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.search_flow_token;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.search_text;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.requested_filters;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.source_filter;
        return this.status.hashCode() + ((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersSearchQueryComplete(screen=");
        sb.append(this.screen);
        sb.append(", shop_flow_token=");
        sb.append(this.shop_flow_token);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", search_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.search_flow_token, ", search_text=", this.search_text, ", requested_filters=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.requested_filters, ", source_filter=", this.source_filter, ", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }
}
