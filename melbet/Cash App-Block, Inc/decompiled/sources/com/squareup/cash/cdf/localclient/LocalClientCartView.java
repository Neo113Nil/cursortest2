package com.squareup.cash.cdf.localclient;

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
public final class LocalClientCartView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientCartView(String str, String str2, String str3, String str4) {
        this.brand_token = str;
        this.buyer_token = str2;
        this.location_token = str3;
        this.checkout_flow_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "LocalClient", "cdf_action", "Cart");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "location_token", str3);
        Countries.putSafe(m, "checkout_flow_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCartView)) {
            return false;
        }
        LocalClientCartView localClientCartView = (LocalClientCartView) obj;
        return Intrinsics.areEqual(this.brand_token, localClientCartView.brand_token) && Intrinsics.areEqual(this.buyer_token, localClientCartView.buyer_token) && Intrinsics.areEqual(this.location_token, localClientCartView.location_token) && Intrinsics.areEqual(this.checkout_flow_token, localClientCartView.checkout_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Cart View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buyer_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.location_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.checkout_flow_token;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCartView(anonymous_buyer_token=null, brand_token=", this.brand_token, ", buyer_token=", this.buyer_token, ", location_token="), this.location_token, ", checkout_flow_token=", this.checkout_flow_token, ")");
    }
}
