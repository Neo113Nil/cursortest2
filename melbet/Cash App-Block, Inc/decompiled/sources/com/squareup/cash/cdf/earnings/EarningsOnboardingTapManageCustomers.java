package com.squareup.cash.cdf.earnings;

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
public final class EarningsOnboardingTapManageCustomers implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String flow_token;
    public final LinkedHashMap parameters;

    public EarningsOnboardingTapManageCustomers(String str) {
        str.getClass();
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Earnings", "cdf_action", "Onboarding");
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsOnboardingTapManageCustomers) && Intrinsics.areEqual(this.flow_token, ((EarningsOnboardingTapManageCustomers) obj).flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Earnings Onboarding TapManageCustomers";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarningsOnboardingTapManageCustomers(flow_token=", this.flow_token, ")");
    }
}
