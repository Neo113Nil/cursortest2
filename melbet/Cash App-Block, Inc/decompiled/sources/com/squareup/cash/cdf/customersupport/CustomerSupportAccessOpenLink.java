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
public final class CustomerSupportAccessOpenLink implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String node_token;
    public final LinkedHashMap parameters;
    public final String url;
    public final String view_token;

    public CustomerSupportAccessOpenLink(String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.node_token = str2;
        this.view_token = str3;
        this.url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "node_token", str2);
        Countries.putSafe(m, "view_token", str3);
        Countries.putSafe(m, "url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessOpenLink)) {
            return false;
        }
        CustomerSupportAccessOpenLink customerSupportAccessOpenLink = (CustomerSupportAccessOpenLink) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessOpenLink.flow_token) && Intrinsics.areEqual(this.node_token, customerSupportAccessOpenLink.node_token) && Intrinsics.areEqual(this.view_token, customerSupportAccessOpenLink.view_token) && Intrinsics.areEqual(this.url, customerSupportAccessOpenLink.url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access OpenLink";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.node_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.view_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessOpenLink(flow_token=", this.flow_token, ", node_token=", this.node_token, ", view_token="), this.view_token, ", url=", this.url, ")");
    }
}
