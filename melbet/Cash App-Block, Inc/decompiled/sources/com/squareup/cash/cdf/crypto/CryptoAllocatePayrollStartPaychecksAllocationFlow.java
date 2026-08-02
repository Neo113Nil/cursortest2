package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoAllocatePayrollStartPaychecksAllocationFlow implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean already_enrolled;
    public final LinkedHashMap parameters;

    public CryptoAllocatePayrollStartPaychecksAllocationFlow(Boolean bool) {
        this.already_enrolled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "AllocatePayroll");
        Countries.putSafe(m, "already_enrolled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoAllocatePayrollStartPaychecksAllocationFlow) && this.already_enrolled.equals(((CryptoAllocatePayrollStartPaychecksAllocationFlow) obj).already_enrolled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto AllocatePayroll StartPaychecksAllocationFlow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.already_enrolled.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.already_enrolled, "CryptoAllocatePayrollStartPaychecksAllocationFlow(already_enrolled=", ")");
    }
}
