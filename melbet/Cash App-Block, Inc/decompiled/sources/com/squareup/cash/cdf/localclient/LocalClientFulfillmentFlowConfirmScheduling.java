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
public final class LocalClientFulfillmentFlowConfirmScheduling implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final FulfillmentType fulfillment_type;
    public final String location_token;
    public final LinkedHashMap parameters;

    public LocalClientFulfillmentFlowConfirmScheduling(String str, String str2, String str3, String str4, FulfillmentType fulfillmentType) {
        this.brand_token = str;
        this.location_token = str2;
        this.buyer_token = str3;
        this.checkout_flow_token = str4;
        this.fulfillment_type = fulfillmentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "LocalClient", "cdf_action", "FulfillmentFlow");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        Countries.putSafe(m, "buyer_token", str3);
        Countries.putSafe(m, "checkout_flow_token", str4);
        Countries.putSafe(m, "fulfillment_type", fulfillmentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientFulfillmentFlowConfirmScheduling)) {
            return false;
        }
        LocalClientFulfillmentFlowConfirmScheduling localClientFulfillmentFlowConfirmScheduling = (LocalClientFulfillmentFlowConfirmScheduling) obj;
        return Intrinsics.areEqual(this.brand_token, localClientFulfillmentFlowConfirmScheduling.brand_token) && Intrinsics.areEqual(this.location_token, localClientFulfillmentFlowConfirmScheduling.location_token) && Intrinsics.areEqual(this.buyer_token, localClientFulfillmentFlowConfirmScheduling.buyer_token) && Intrinsics.areEqual(this.checkout_flow_token, localClientFulfillmentFlowConfirmScheduling.checkout_flow_token) && this.fulfillment_type == localClientFulfillmentFlowConfirmScheduling.fulfillment_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient FulfillmentFlow ConfirmScheduling";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyer_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.checkout_flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FulfillmentType fulfillmentType = this.fulfillment_type;
        return hashCode4 + (fulfillmentType != null ? fulfillmentType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientFulfillmentFlowConfirmScheduling(brand_token=", this.brand_token, ", location_token=", this.location_token, ", buyer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.buyer_token, ", anonymous_buyer_token=null, checkout_flow_token=", this.checkout_flow_token, ", fulfillment_type=");
        m.append(this.fulfillment_type);
        m.append(")");
        return m.toString();
    }
}
