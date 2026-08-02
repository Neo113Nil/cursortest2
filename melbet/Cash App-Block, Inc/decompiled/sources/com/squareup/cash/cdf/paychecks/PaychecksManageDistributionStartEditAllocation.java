package com.squareup.cash.cdf.paychecks;

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
public final class PaychecksManageDistributionStartEditAllocation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer destination_type;
    public final LinkedHashMap parameters;
    public final Boolean updating_existing_allocation;

    public PaychecksManageDistributionStartEditAllocation(Integer num, Boolean bool) {
        this.destination_type = num;
        this.updating_existing_allocation = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Paychecks", "cdf_action", "ManageDistribution");
        Countries.putSafe(m, "destination_type", num);
        Countries.putSafe(m, "updating_existing_allocation", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksManageDistributionStartEditAllocation)) {
            return false;
        }
        PaychecksManageDistributionStartEditAllocation paychecksManageDistributionStartEditAllocation = (PaychecksManageDistributionStartEditAllocation) obj;
        return Intrinsics.areEqual(this.destination_type, paychecksManageDistributionStartEditAllocation.destination_type) && this.updating_existing_allocation.equals(paychecksManageDistributionStartEditAllocation.updating_existing_allocation);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks ManageDistribution StartEditAllocation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.destination_type;
        return this.updating_existing_allocation.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "PaychecksManageDistributionStartEditAllocation(destination_type=" + this.destination_type + ", updating_existing_allocation=" + this.updating_existing_allocation + ")";
    }
}
