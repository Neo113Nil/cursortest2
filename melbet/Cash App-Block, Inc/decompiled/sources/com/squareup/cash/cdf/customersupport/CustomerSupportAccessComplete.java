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
public final class CustomerSupportAccessComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean has_unread_messages;
    public final LinkedHashMap parameters;

    public CustomerSupportAccessComplete(String str, Boolean bool) {
        this.flow_token = str;
        this.has_unread_messages = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "has_unread_messages", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessComplete)) {
            return false;
        }
        CustomerSupportAccessComplete customerSupportAccessComplete = (CustomerSupportAccessComplete) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessComplete.flow_token) && Intrinsics.areEqual(this.has_unread_messages, customerSupportAccessComplete.has_unread_messages);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.has_unread_messages;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerSupportAccessComplete(flow_token=" + this.flow_token + ", has_unread_messages=" + this.has_unread_messages + ")";
    }
}
