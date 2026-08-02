package com.squareup.cash.cdf.paychecks;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class PaychecksManageDistributionSubmitMultiAllocation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.KAFKA});
    public final String allocations_display_names;
    public final String allocations_in_bps;
    public final Integer estimated_monthly_amount;
    public final String estimated_monthly_amount_currency;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Integer total_allocation_in_bps;

    public PaychecksManageDistributionSubmitMultiAllocation(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.flow_token = str;
        this.total_allocation_in_bps = num;
        this.estimated_monthly_amount = num2;
        this.estimated_monthly_amount_currency = str2;
        this.allocations_in_bps = str3;
        this.allocations_display_names = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Paychecks", "cdf_action", "ManageDistribution");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "total_allocation_in_bps", num);
        Countries.putSafe(m, "estimated_monthly_amount", num2);
        Countries.putSafe(m, "estimated_monthly_amount_currency", str2);
        Countries.putSafe(m, "allocations_in_bps", str3);
        Countries.putSafe(m, "allocations_display_names", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksManageDistributionSubmitMultiAllocation)) {
            return false;
        }
        PaychecksManageDistributionSubmitMultiAllocation paychecksManageDistributionSubmitMultiAllocation = (PaychecksManageDistributionSubmitMultiAllocation) obj;
        return Intrinsics.areEqual(this.flow_token, paychecksManageDistributionSubmitMultiAllocation.flow_token) && this.total_allocation_in_bps.equals(paychecksManageDistributionSubmitMultiAllocation.total_allocation_in_bps) && this.estimated_monthly_amount.equals(paychecksManageDistributionSubmitMultiAllocation.estimated_monthly_amount) && Intrinsics.areEqual(this.estimated_monthly_amount_currency, paychecksManageDistributionSubmitMultiAllocation.estimated_monthly_amount_currency) && this.allocations_in_bps.equals(paychecksManageDistributionSubmitMultiAllocation.allocations_in_bps) && this.allocations_display_names.equals(paychecksManageDistributionSubmitMultiAllocation.allocations_display_names);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks ManageDistribution SubmitMultiAllocation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.total_allocation_in_bps), 31, this.estimated_monthly_amount);
        String str2 = this.estimated_monthly_amount_currency;
        return this.allocations_display_names.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.allocations_in_bps);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.total_allocation_in_bps, "PaychecksManageDistributionSubmitMultiAllocation(flow_token=", this.flow_token, ", total_allocation_in_bps=", ", estimated_monthly_amount=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.estimated_monthly_amount, ", estimated_monthly_amount_currency=", this.estimated_monthly_amount_currency, ", allocations_in_bps=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.allocations_in_bps, ", allocations_display_names=", this.allocations_display_names, ")");
    }
}
