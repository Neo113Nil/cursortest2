package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientTabViewLocalCash implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Boolean non_zero_balance;
    public final LinkedHashMap parameters;

    public LocalClientTabViewLocalCash(Boolean bool) {
        this.non_zero_balance = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "LocalClient", "cdf_action", "Tab");
        Countries.putSafe(m, "non_zero_balance", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalClientTabViewLocalCash) && this.non_zero_balance.equals(((LocalClientTabViewLocalCash) obj).non_zero_balance);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Tab ViewLocalCash";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.non_zero_balance.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.non_zero_balance, "LocalClientTabViewLocalCash(non_zero_balance=", ")");
    }
}
