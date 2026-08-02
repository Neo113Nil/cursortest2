package com.squareup.cash.cdf.paychecks;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class PaychecksManageDistributionConfirmEditAllocation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount_in_bps;
    public final Integer destination_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public PaychecksManageDistributionConfirmEditAllocation(String str, Integer num, Integer num2) {
        this.flow_token = str;
        this.destination_type = num;
        this.amount_in_bps = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Paychecks", "cdf_action", "ManageDistribution");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "destination_type", num);
        Countries.putSafe(m, "amount_in_bps", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksManageDistributionConfirmEditAllocation)) {
            return false;
        }
        PaychecksManageDistributionConfirmEditAllocation paychecksManageDistributionConfirmEditAllocation = (PaychecksManageDistributionConfirmEditAllocation) obj;
        return Intrinsics.areEqual(this.flow_token, paychecksManageDistributionConfirmEditAllocation.flow_token) && Intrinsics.areEqual(this.destination_type, paychecksManageDistributionConfirmEditAllocation.destination_type) && this.amount_in_bps.equals(paychecksManageDistributionConfirmEditAllocation.amount_in_bps);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks ManageDistribution ConfirmEditAllocation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.destination_type;
        return this.amount_in_bps.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.destination_type, "PaychecksManageDistributionConfirmEditAllocation(flow_token=", this.flow_token, ", destination_type=", ", amount_in_bps="), this.amount_in_bps, ")");
    }
}
