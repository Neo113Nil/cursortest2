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
public final class CustomerSupportChatOpenMessageTransaction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CustomerSupportChatOpenMessageTransaction(String str, String str2) {
        this.flow_token = str;
        this.entity_id = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "entity_id", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatOpenMessageTransaction)) {
            return false;
        }
        CustomerSupportChatOpenMessageTransaction customerSupportChatOpenMessageTransaction = (CustomerSupportChatOpenMessageTransaction) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportChatOpenMessageTransaction.flow_token) && this.entity_id.equals(customerSupportChatOpenMessageTransaction.entity_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat OpenMessageTransaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.entity_id.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CustomerSupportChatOpenMessageTransaction(flow_token=", this.flow_token, ", entity_id=", this.entity_id, ")");
    }
}
