package com.squareup.cash.cdf.paychecks;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class PaychecksManageDistributionSetAllocationAmountWithKeypad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount_in_bps;
    public final Integer destination_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public PaychecksManageDistributionSetAllocationAmountWithKeypad(String str, Integer num, Integer num2) {
        this.flow_token = str;
        this.amount_in_bps = num;
        this.destination_type = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Paychecks", "cdf_action", "ManageDistribution");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "amount_in_bps", num);
        Countries.putSafe(m, "destination_type", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksManageDistributionSetAllocationAmountWithKeypad)) {
            return false;
        }
        PaychecksManageDistributionSetAllocationAmountWithKeypad paychecksManageDistributionSetAllocationAmountWithKeypad = (PaychecksManageDistributionSetAllocationAmountWithKeypad) obj;
        return Intrinsics.areEqual(this.flow_token, paychecksManageDistributionSetAllocationAmountWithKeypad.flow_token) && this.amount_in_bps.equals(paychecksManageDistributionSetAllocationAmountWithKeypad.amount_in_bps) && Intrinsics.areEqual(this.destination_type, paychecksManageDistributionSetAllocationAmountWithKeypad.destination_type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks ManageDistribution SetAllocationAmountWithKeypad";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.amount_in_bps);
        Integer num = this.destination_type;
        return m + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.amount_in_bps, "PaychecksManageDistributionSetAllocationAmountWithKeypad(flow_token=", this.flow_token, ", amount_in_bps=", ", destination_type="), this.destination_type, ")");
    }
}
