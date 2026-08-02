package com.squareup.cash.cdf.atm;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AtmWithdrawalViewLocation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String location_token;
    public final LinkedHashMap parameters;

    public AtmWithdrawalViewLocation(String str) {
        this.location_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Atm", "cdf_action", "Withdrawal");
        Countries.putSafe(m, "location_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtmWithdrawalViewLocation) && Intrinsics.areEqual(this.location_token, ((AtmWithdrawalViewLocation) obj).location_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Atm Withdrawal ViewLocation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.location_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AtmWithdrawalViewLocation(location_token=", this.location_token, ")");
    }
}
