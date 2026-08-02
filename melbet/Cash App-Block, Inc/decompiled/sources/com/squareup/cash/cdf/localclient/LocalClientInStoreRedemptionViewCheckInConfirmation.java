package com.squareup.cash.cdf.localclient;

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
public final class LocalClientInStoreRedemptionViewCheckInConfirmation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Long applied_local_cash_amount;
    public final LinkedHashMap parameters;

    public LocalClientInStoreRedemptionViewCheckInConfirmation(Long l) {
        this.applied_local_cash_amount = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "LocalClient", "cdf_action", "InStoreRedemption");
        Countries.putSafe(m, "applied_local_cash_amount", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalClientInStoreRedemptionViewCheckInConfirmation) && Intrinsics.areEqual(this.applied_local_cash_amount, ((LocalClientInStoreRedemptionViewCheckInConfirmation) obj).applied_local_cash_amount);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient InStoreRedemption ViewCheckInConfirmation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.applied_local_cash_amount;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return "LocalClientInStoreRedemptionViewCheckInConfirmation(applied_local_cash_amount=" + this.applied_local_cash_amount + ")";
    }
}
