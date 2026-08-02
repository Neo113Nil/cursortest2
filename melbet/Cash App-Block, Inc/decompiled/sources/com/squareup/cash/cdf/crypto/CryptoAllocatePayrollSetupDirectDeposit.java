package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoAllocatePayrollSetupDirectDeposit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer current_allocation_bps;
    public final LinkedHashMap parameters;

    public CryptoAllocatePayrollSetupDirectDeposit(Integer num) {
        this.current_allocation_bps = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "AllocatePayroll");
        Countries.putSafe(m, "current_allocation_bps", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoAllocatePayrollSetupDirectDeposit) && this.current_allocation_bps.equals(((CryptoAllocatePayrollSetupDirectDeposit) obj).current_allocation_bps);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto AllocatePayroll SetupDirectDeposit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.current_allocation_bps.hashCode();
    }

    public final String toString() {
        return "CryptoAllocatePayrollSetupDirectDeposit(current_allocation_bps=" + this.current_allocation_bps + ")";
    }
}
