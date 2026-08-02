package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportAccessViewDisputes implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer active_disputes;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CustomerSupportAccessViewDisputes(Integer num, String str) {
        this.flow_token = str;
        this.active_disputes = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "active_disputes", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewDisputes)) {
            return false;
        }
        CustomerSupportAccessViewDisputes customerSupportAccessViewDisputes = (CustomerSupportAccessViewDisputes) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessViewDisputes.flow_token) && this.active_disputes.equals(customerSupportAccessViewDisputes.active_disputes);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewDisputes";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.active_disputes.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CustomerSupportAccessViewDisputes(flow_token=" + this.flow_token + ", active_disputes=" + this.active_disputes + ")";
    }
}
