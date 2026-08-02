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
public final class OffersUpdateComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final AppLocation app_location;
    public final String boost_token;
    public final String browse_flow_token;
    public final String offer_token;
    public final LinkedHashMap parameters;
    public final String search_flow_token;
    public final String shop_flow_token;
    public final OfferRequestStatus status;
    public final OfferUpdateType update_type;

    public OffersUpdateComplete(String str, String str2, String str3, String str4, String str5, AppLocation appLocation, OfferUpdateType offerUpdateType, OfferRequestStatus offerRequestStatus) {
        this.shop_flow_token = str;
        this.browse_flow_token = str2;
        this.search_flow_token = str3;
        this.offer_token = str4;
        this.boost_token = str5;
        this.app_location = appLocation;
        this.update_type = offerUpdateType;
        this.status = offerRequestStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "Offers", "cdf_action", "Update");
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "browse_flow_token", str2);
        Countries.putSafe(m, "search_flow_token", str3);
        Countries.putSafe(m, "offer_token", str4);
        Countries.putSafe(m, "boost_token", str5);
        Countries.putSafe(m, "app_location", appLocation);
        Countries.putSafe(m, "update_type", offerUpdateType);
        Countries.putSafe(m, "status", offerRequestStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersUpdateComplete)) {
            return false;
        }
        OffersUpdateComplete offersUpdateComplete = (OffersUpdateComplete) obj;
        return Intrinsics.areEqual(this.shop_flow_token, offersUpdateComplete.shop_flow_token) && Intrinsics.areEqual(this.browse_flow_token, offersUpdateComplete.browse_flow_token) && Intrinsics.areEqual(this.search_flow_token, offersUpdateComplete.search_flow_token) && Intrinsics.areEqual(this.offer_token, offersUpdateComplete.offer_token) && Intrinsics.areEqual(this.boost_token, offersUpdateComplete.boost_token) && this.app_location == offersUpdateComplete.app_location && this.update_type == offersUpdateComplete.update_type && this.status == offersUpdateComplete.status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Update Complete";
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
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offer_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.boost_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AppLocation appLocation = this.app_location;
        int hashCode6 = (hashCode5 + (appLocation == null ? 0 : appLocation.hashCode())) * 31;
        OfferUpdateType offerUpdateType = this.update_type;
        int hashCode7 = (hashCode6 + (offerUpdateType == null ? 0 : offerUpdateType.hashCode())) * 31;
        OfferRequestStatus offerRequestStatus = this.status;
        return hashCode7 + (offerRequestStatus != null ? offerRequestStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersUpdateComplete(shop_flow_token=", this.shop_flow_token, ", browse_flow_token=", this.browse_flow_token, ", search_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.search_flow_token, ", offer_token=", this.offer_token, ", boost_token=");
        m.append(this.boost_token);
        m.append(", app_location=");
        m.append(this.app_location);
        m.append(", update_type=");
        m.append(this.update_type);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ OffersUpdateComplete(String str, String str2, OfferUpdateType offerUpdateType, OfferRequestStatus offerRequestStatus) {
        this(null, null, null, str, str2, AppLocation.CardTab, offerUpdateType, offerRequestStatus);
    }
}
