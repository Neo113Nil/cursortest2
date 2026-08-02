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
public final class LocalClientFulfillmentFlowConfirmFulfillment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final FulfillmentType fulfillment_type;
    public final LinkedHashMap parameters;

    public LocalClientFulfillmentFlowConfirmFulfillment(String str, String str2, FulfillmentType fulfillmentType) {
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        this.brand_token = str;
        this.buyer_token = str2;
        this.fulfillment_type = fulfillmentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "LocalClient", "cdf_action", "FulfillmentFlow");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "fulfillment_type", fulfillmentType);
        Countries.putSafe(m, "flow_version", fulfillmentVersion);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientFulfillmentFlowConfirmFulfillment)) {
            return false;
        }
        LocalClientFulfillmentFlowConfirmFulfillment localClientFulfillmentFlowConfirmFulfillment = (LocalClientFulfillmentFlowConfirmFulfillment) obj;
        if (!Intrinsics.areEqual(this.brand_token, localClientFulfillmentFlowConfirmFulfillment.brand_token) || !Intrinsics.areEqual(this.buyer_token, localClientFulfillmentFlowConfirmFulfillment.buyer_token) || this.fulfillment_type != localClientFulfillmentFlowConfirmFulfillment.fulfillment_type) {
            return false;
        }
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient FulfillmentFlow ConfirmFulfillment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.buyer_token;
        return FulfillmentVersion.BX.hashCode() + ((this.fulfillment_type.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 29791)) * 31);
    }

    public final String toString() {
        FulfillmentVersion fulfillmentVersion = FulfillmentVersion.BX;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientFulfillmentFlowConfirmFulfillment(brand_token=", this.brand_token, ", location_token=null, buyer_token=", this.buyer_token, ", anonymous_buyer_token=null, checkout_flow_token=null, fulfillment_type=");
        m.append(this.fulfillment_type);
        m.append(", flow_version=");
        m.append(fulfillmentVersion);
        m.append(")");
        return m.toString();
    }
}
