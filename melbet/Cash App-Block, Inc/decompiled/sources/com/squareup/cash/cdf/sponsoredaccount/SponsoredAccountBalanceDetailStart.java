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
public final class SponsoredAccountBalanceDetailStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DependentBalanceType balance_type;
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;

    public SponsoredAccountBalanceDetailStart(DependentBalanceType dependentBalanceType, String str) {
        this.balance_type = dependentBalanceType;
        this.dependent_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "BalanceDetail");
        Countries.putSafe(m, "balance_type", dependentBalanceType);
        Countries.putSafe(m, "dependent_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountBalanceDetailStart)) {
            return false;
        }
        SponsoredAccountBalanceDetailStart sponsoredAccountBalanceDetailStart = (SponsoredAccountBalanceDetailStart) obj;
        return this.balance_type == sponsoredAccountBalanceDetailStart.balance_type && this.dependent_customer_token.equals(sponsoredAccountBalanceDetailStart.dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount BalanceDetail Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.dependent_customer_token.hashCode() + (this.balance_type.hashCode() * 31);
    }

    public final String toString() {
        return "SponsoredAccountBalanceDetailStart(balance_type=" + this.balance_type + ", dependent_customer_token=" + this.dependent_customer_token + ")";
    }
}
