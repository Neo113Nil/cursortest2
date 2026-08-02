package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportAccessSelectTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CustomerSupportAccessSelectTransaction(String str, String str2) {
        this.flow_token = str;
        this.entity_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "entity_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessSelectTransaction)) {
            return false;
        }
        CustomerSupportAccessSelectTransaction customerSupportAccessSelectTransaction = (CustomerSupportAccessSelectTransaction) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessSelectTransaction.flow_token) && Intrinsics.areEqual(this.entity_id, customerSupportAccessSelectTransaction.entity_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access SelectTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entity_id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CustomerSupportAccessSelectTransaction(flow_token=", this.flow_token, ", entity_id=", this.entity_id, ")");
    }
}
