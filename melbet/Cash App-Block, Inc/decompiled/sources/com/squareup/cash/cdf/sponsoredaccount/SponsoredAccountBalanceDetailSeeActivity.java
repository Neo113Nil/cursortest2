package com.squareup.cash.cdf.sponsoredaccount;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SponsoredAccountBalanceDetailSeeActivity implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;

    public SponsoredAccountBalanceDetailSeeActivity(String str) {
        DependentBalanceType dependentBalanceType = DependentBalanceType.Bitcoin;
        this.dependent_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "SponsoredAccount", "cdf_action", "BalanceDetail");
        Countries.putSafe(m, "balance_type", dependentBalanceType);
        Countries.putSafe(m, "dependent_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountBalanceDetailSeeActivity)) {
            return false;
        }
        DependentBalanceType dependentBalanceType = DependentBalanceType.Bitcoin;
        return this.dependent_customer_token.equals(((SponsoredAccountBalanceDetailSeeActivity) obj).dependent_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount BalanceDetail SeeActivity";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(DependentBalanceType.Bitcoin.hashCode() * 31, 31, this.dependent_customer_token);
    }

    public final String toString() {
        return "SponsoredAccountBalanceDetailSeeActivity(balance_type=" + DependentBalanceType.Bitcoin + ", dependent_customer_token=" + this.dependent_customer_token + ", activity_item_token=null)";
    }
}
