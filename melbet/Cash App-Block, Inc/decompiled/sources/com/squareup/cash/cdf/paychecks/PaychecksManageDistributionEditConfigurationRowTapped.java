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
public final class PaychecksManageDistributionEditConfigurationRowTapped implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer destination_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public PaychecksManageDistributionEditConfigurationRowTapped(Integer num, String str) {
        this.flow_token = str;
        this.destination_type = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Paychecks", "cdf_action", "ManageDistribution");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "destination_type", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaychecksManageDistributionEditConfigurationRowTapped)) {
            return false;
        }
        PaychecksManageDistributionEditConfigurationRowTapped paychecksManageDistributionEditConfigurationRowTapped = (PaychecksManageDistributionEditConfigurationRowTapped) obj;
        return Intrinsics.areEqual(this.flow_token, paychecksManageDistributionEditConfigurationRowTapped.flow_token) && Intrinsics.areEqual(this.destination_type, paychecksManageDistributionEditConfigurationRowTapped.destination_type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Paychecks ManageDistribution EditConfigurationRowTapped";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.destination_type;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PaychecksManageDistributionEditConfigurationRowTapped(flow_token=" + this.flow_token + ", destination_type=" + this.destination_type + ")";
    }
}
