package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportAccessOpenTransactionDetail implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final String flow_token;
    public final String node_token;
    public final LinkedHashMap parameters;
    public final String view_token;

    public CustomerSupportAccessOpenTransactionDetail(String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.node_token = str2;
        this.entity_id = str3;
        this.view_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "node_token", str2);
        Countries.putSafe(m, "entity_id", str3);
        Countries.putSafe(m, "view_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessOpenTransactionDetail)) {
            return false;
        }
        CustomerSupportAccessOpenTransactionDetail customerSupportAccessOpenTransactionDetail = (CustomerSupportAccessOpenTransactionDetail) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessOpenTransactionDetail.flow_token) && Intrinsics.areEqual(this.node_token, customerSupportAccessOpenTransactionDetail.node_token) && this.entity_id.equals(customerSupportAccessOpenTransactionDetail.entity_id) && Intrinsics.areEqual(this.view_token, customerSupportAccessOpenTransactionDetail.view_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access OpenTransactionDetail";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.node_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.entity_id);
        String str3 = this.view_token;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessOpenTransactionDetail(flow_token=", this.flow_token, ", node_token=", this.node_token, ", entity_id="), this.entity_id, ", view_token=", this.view_token, ")");
    }
}
