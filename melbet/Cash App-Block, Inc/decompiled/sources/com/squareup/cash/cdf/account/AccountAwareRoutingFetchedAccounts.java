package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountAwareRoutingFetchedAccounts implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final FetchedAccounts fetch_result;
    public final LinkedHashMap parameters;

    public AccountAwareRoutingFetchedAccounts(FetchedAccounts fetchedAccounts) {
        this.fetch_result = fetchedAccounts;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Account", "cdf_action", "AwareRouting");
        Countries.putSafe(m, "fetch_result", fetchedAccounts);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountAwareRoutingFetchedAccounts) && this.fetch_result == ((AccountAwareRoutingFetchedAccounts) obj).fetch_result;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account AwareRouting FetchedAccounts";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.fetch_result.hashCode();
    }

    public final String toString() {
        return "AccountAwareRoutingFetchedAccounts(fetch_result=" + this.fetch_result + ")";
    }
}
