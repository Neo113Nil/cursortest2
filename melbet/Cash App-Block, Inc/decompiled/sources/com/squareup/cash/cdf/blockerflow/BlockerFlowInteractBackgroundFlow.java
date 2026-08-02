package com.squareup.cash.cdf.blockerflow;

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
public final class BlockerFlowInteractBackgroundFlow implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String blocker_id;
    public final String client_scenario;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;

    public BlockerFlowInteractBackgroundFlow(String str, String str2, String str3, String str4) {
        this.blocker_id = str;
        this.client_scenario = str2;
        this.originating_flow_type = str3;
        this.flow_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "blocker_id", str);
        Countries.putSafe(m, "client_scenario", str2);
        Countries.putSafe(m, "originating_flow_type", str3);
        Countries.putSafe(m, "flow_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractBackgroundFlow)) {
            return false;
        }
        BlockerFlowInteractBackgroundFlow blockerFlowInteractBackgroundFlow = (BlockerFlowInteractBackgroundFlow) obj;
        return Intrinsics.areEqual(this.blocker_id, blockerFlowInteractBackgroundFlow.blocker_id) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractBackgroundFlow.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractBackgroundFlow.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractBackgroundFlow.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact BackgroundFlow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blocker_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.client_scenario;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originating_flow_type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        return (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractBackgroundFlow(blocker_id=", this.blocker_id, ", client_scenario=", this.client_scenario, ", originating_flow_type="), this.originating_flow_type, ", flow_token=", this.flow_token, ", referrer_flow_token=null, referrer_type=null)");
    }
}
