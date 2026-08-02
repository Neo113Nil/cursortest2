package com.squareup.cash.cdf.localclient;

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
public final class LocalClientBrandProfileView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String attribution_key;
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final String context_menus;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientBrandProfileView(String str, String str2, String str3, String str4, String str5, String str6) {
        this.brand_token = str;
        this.location_token = str2;
        this.attribution_key = str3;
        this.buyer_token = str4;
        this.checkout_flow_token = str5;
        this.context_menus = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "LocalClient", "cdf_action", "BrandProfile");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        Countries.putSafe(m, "attribution_key", str3);
        Countries.putSafe(m, "buyer_token", str4);
        Countries.putSafe(m, "checkout_flow_token", str5);
        Countries.putSafe(m, "context_menus", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientBrandProfileView)) {
            return false;
        }
        LocalClientBrandProfileView localClientBrandProfileView = (LocalClientBrandProfileView) obj;
        return this.brand_token.equals(localClientBrandProfileView.brand_token) && Intrinsics.areEqual(this.location_token, localClientBrandProfileView.location_token) && Intrinsics.areEqual(this.attribution_key, localClientBrandProfileView.attribution_key) && Intrinsics.areEqual(this.buyer_token, localClientBrandProfileView.buyer_token) && Intrinsics.areEqual(this.checkout_flow_token, localClientBrandProfileView.checkout_flow_token) && this.context_menus.equals(localClientBrandProfileView.context_menus);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient BrandProfile View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.brand_token.hashCode() * 31;
        String str = this.location_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.attribution_key;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.buyer_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.checkout_flow_token;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.context_menus);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientBrandProfileView(brand_token=", this.brand_token, ", location_token=", this.location_token, ", attribution_key=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.attribution_key, ", anonymous_buyer_token=null, buyer_token=", this.buyer_token, ", checkout_flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.checkout_flow_token, ", context_menus=", this.context_menus, ", fulfillment_type=null)");
    }
}
