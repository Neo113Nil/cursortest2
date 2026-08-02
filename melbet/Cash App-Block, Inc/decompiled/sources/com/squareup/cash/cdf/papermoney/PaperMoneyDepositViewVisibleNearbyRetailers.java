package com.squareup.cash.cdf.papermoney;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositViewVisibleNearbyRetailers implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer visible_retailers;

    public PaperMoneyDepositViewVisibleNearbyRetailers(Integer num) {
        this.visible_retailers = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PaperMoney", "cdf_action", "Deposit");
        Countries.putSafe(m, "visible_retailers", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaperMoneyDepositViewVisibleNearbyRetailers) && this.visible_retailers.equals(((PaperMoneyDepositViewVisibleNearbyRetailers) obj).visible_retailers);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney Deposit ViewVisibleNearbyRetailers";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.visible_retailers.hashCode();
    }

    public final String toString() {
        return "PaperMoneyDepositViewVisibleNearbyRetailers(visible_retailers=" + this.visible_retailers + ")";
    }
}
