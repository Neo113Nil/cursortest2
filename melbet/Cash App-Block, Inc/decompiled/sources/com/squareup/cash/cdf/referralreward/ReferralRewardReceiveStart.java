package com.squareup.cash.cdf.referralreward;

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
public final class ReferralRewardReceiveStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final String source;

    public ReferralRewardReceiveStart(String str, String str2, String str3, String str4) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.rate_plan = str3;
        this.source = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "ReferralReward", "cdf_action", "Receive");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "rate_plan", str3);
        Countries.putSafe(m, "source", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralRewardReceiveStart)) {
            return false;
        }
        ReferralRewardReceiveStart referralRewardReceiveStart = (ReferralRewardReceiveStart) obj;
        return Intrinsics.areEqual(this.client_scenario, referralRewardReceiveStart.client_scenario) && Intrinsics.areEqual(this.flow_token, referralRewardReceiveStart.flow_token) && Intrinsics.areEqual(this.rate_plan, referralRewardReceiveStart.rate_plan) && Intrinsics.areEqual(this.source, referralRewardReceiveStart.source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ReferralReward Receive Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rate_plan;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReferralRewardReceiveStart(client_scenario=", this.client_scenario, ", duration=null, flow_token=", this.flow_token, ", rate_plan="), this.rate_plan, ", source=", this.source, ")");
    }
}
