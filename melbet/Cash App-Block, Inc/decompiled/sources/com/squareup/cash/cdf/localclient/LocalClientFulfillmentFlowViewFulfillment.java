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
public final class LocalClientFulfillmentFlowViewFulfillment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final FulfillmentInstanceType flow_instance;
    public final LinkedHashMap parameters;

    public LocalClientFulfillmentFlowViewFulfillment(String str, String str2, FulfillmentInstanceType fulfillmentInstanceType) {
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        this.brand_token = str;
        this.buyer_token = str2;
        this.flow_instance = fulfillmentInstanceType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "LocalClient", "cdf_action", "FulfillmentFlow");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "flow_version", fulfillmentVersion);
        Countries.putSafe(m, "flow_instance", fulfillmentInstanceType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientFulfillmentFlowViewFulfillment)) {
            return false;
        }
        LocalClientFulfillmentFlowViewFulfillment localClientFulfillmentFlowViewFulfillment = (LocalClientFulfillmentFlowViewFulfillment) obj;
        if (!Intrinsics.areEqual(this.brand_token, localClientFulfillmentFlowViewFulfillment.brand_token) || !Intrinsics.areEqual(this.buyer_token, localClientFulfillmentFlowViewFulfillment.buyer_token)) {
            return false;
        }
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        return this.flow_instance == localClientFulfillmentFlowViewFulfillment.flow_instance;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient FulfillmentFlow ViewFulfillment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.buyer_token;
        return this.flow_instance.hashCode() + ((FulfillmentVersion.BX.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 29791)) * 31);
    }

    public final String toString() {
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientFulfillmentFlowViewFulfillment(brand_token=", this.brand_token, ", location_token=null, buyer_token=", this.buyer_token, ", anonymous_buyer_token=null, checkout_flow_token=null, flow_version=");
        m.append(fulfillmentVersion);
        m.append(", flow_instance=");
        m.append(this.flow_instance);
        m.append(")");
        return m.toString();
    }
}
