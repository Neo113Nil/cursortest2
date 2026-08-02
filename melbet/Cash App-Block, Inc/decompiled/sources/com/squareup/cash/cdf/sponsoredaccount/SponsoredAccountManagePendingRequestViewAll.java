package com.squareup.cash.cdf.sponsoredaccount;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SponsoredAccountManagePendingRequestViewAll implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer num_of_pending_requests;
    public final LinkedHashMap parameters;

    public SponsoredAccountManagePendingRequestViewAll(Integer num) {
        this.num_of_pending_requests = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SponsoredAccount", "cdf_action", "ManagePendingRequest");
        Countries.putSafe(m, "num_of_pending_requests", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsoredAccountManagePendingRequestViewAll) && this.num_of_pending_requests.equals(((SponsoredAccountManagePendingRequestViewAll) obj).num_of_pending_requests);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount ManagePendingRequest ViewAll";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.num_of_pending_requests.hashCode();
    }

    public final String toString() {
        return "SponsoredAccountManagePendingRequestViewAll(num_of_pending_requests=" + this.num_of_pending_requests + ")";
    }
}
