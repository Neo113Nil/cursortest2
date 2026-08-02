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
public final class SponsoredAccountViewAllStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer num_of_sponsored_accounts;
    public final LinkedHashMap parameters;
    public final String sponsor_customer_token;

    public SponsoredAccountViewAllStart(Integer num, String str) {
        this.sponsor_customer_token = str;
        this.num_of_sponsored_accounts = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "ViewAll");
        Countries.putSafe(m, "sponsor_customer_token", str);
        Countries.putSafe(m, "num_of_sponsored_accounts", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountViewAllStart)) {
            return false;
        }
        SponsoredAccountViewAllStart sponsoredAccountViewAllStart = (SponsoredAccountViewAllStart) obj;
        return this.sponsor_customer_token.equals(sponsoredAccountViewAllStart.sponsor_customer_token) && this.num_of_sponsored_accounts.equals(sponsoredAccountViewAllStart.num_of_sponsored_accounts);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount ViewAll Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.num_of_sponsored_accounts.hashCode() + (this.sponsor_customer_token.hashCode() * 31);
    }

    public final String toString() {
        return "SponsoredAccountViewAllStart(sponsor_customer_token=" + this.sponsor_customer_token + ", num_of_sponsored_accounts=" + this.num_of_sponsored_accounts + ")";
    }
}
