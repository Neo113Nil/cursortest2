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
public final class SponsoredAccountBalanceDetailGraphTimeUnitChange implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final DependentBalanceType balance_type;
    public final String dependent_customer_token;
    public final LinkedHashMap parameters;
    public final GraphTimeUnit time_unit;

    public SponsoredAccountBalanceDetailGraphTimeUnitChange(DependentBalanceType dependentBalanceType, String str, GraphTimeUnit graphTimeUnit) {
        this.balance_type = dependentBalanceType;
        this.dependent_customer_token = str;
        this.time_unit = graphTimeUnit;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "SponsoredAccount", "cdf_action", "BalanceDetail");
        Countries.putSafe(m, "balance_type", dependentBalanceType);
        Countries.putSafe(m, "dependent_customer_token", str);
        Countries.putSafe(m, "time_unit", graphTimeUnit);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountBalanceDetailGraphTimeUnitChange)) {
            return false;
        }
        SponsoredAccountBalanceDetailGraphTimeUnitChange sponsoredAccountBalanceDetailGraphTimeUnitChange = (SponsoredAccountBalanceDetailGraphTimeUnitChange) obj;
        return this.balance_type == sponsoredAccountBalanceDetailGraphTimeUnitChange.balance_type && this.dependent_customer_token.equals(sponsoredAccountBalanceDetailGraphTimeUnitChange.dependent_customer_token) && this.time_unit == sponsoredAccountBalanceDetailGraphTimeUnitChange.time_unit;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount BalanceDetail GraphTimeUnitChange";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.time_unit.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance_type.hashCode() * 31, 31, this.dependent_customer_token);
    }

    public final String toString() {
        return "SponsoredAccountBalanceDetailGraphTimeUnitChange(balance_type=" + this.balance_type + ", dependent_customer_token=" + this.dependent_customer_token + ", time_unit=" + this.time_unit + ")";
    }
}
