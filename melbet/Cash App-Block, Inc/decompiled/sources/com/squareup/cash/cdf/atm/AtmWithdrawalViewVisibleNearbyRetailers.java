package com.squareup.cash.cdf.atm;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AtmWithdrawalViewVisibleNearbyRetailers implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer visible_retailers;

    public AtmWithdrawalViewVisibleNearbyRetailers(Integer num) {
        this.visible_retailers = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Atm", "cdf_action", "Withdrawal");
        Countries.putSafe(m, "visible_retailers", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtmWithdrawalViewVisibleNearbyRetailers) && this.visible_retailers.equals(((AtmWithdrawalViewVisibleNearbyRetailers) obj).visible_retailers);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Atm Withdrawal ViewVisibleNearbyRetailers";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.visible_retailers.hashCode();
    }

    public final String toString() {
        return "AtmWithdrawalViewVisibleNearbyRetailers(visible_retailers=" + this.visible_retailers + ")";
    }
}
