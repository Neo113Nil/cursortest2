package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.common.internal.zzb;
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

/* loaded from: classes.dex */
public final class BlockerFlowInteractReceiveJourneyOutcome implements Event {
    public static final zzb Companion = new zzb(17);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String flow_token;
    public final String last_blocker_id;
    public final String last_blocker_type;
    public final String originating_flow_type;
    public final String outcome;
    public final LinkedHashMap parameters;
    public final String status_result_icon;
    public final Boolean uses_status_result_fallback;

    public BlockerFlowInteractReceiveJourneyOutcome(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7) {
        this.client_scenario = str;
        this.originating_flow_type = str2;
        this.flow_token = str3;
        this.last_blocker_id = str4;
        this.last_blocker_type = str5;
        this.outcome = str6;
        this.status_result_icon = str7;
        this.uses_status_result_fallback = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "originating_flow_type", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "last_blocker_id", str4);
        Countries.putSafe(m, "last_blocker_type", str5);
        Countries.putSafe(m, "outcome", str6);
        Countries.putSafe(m, "status_result_icon", str7);
        Countries.putSafe(m, "uses_status_result_fallback", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractReceiveJourneyOutcome)) {
            return false;
        }
        BlockerFlowInteractReceiveJourneyOutcome blockerFlowInteractReceiveJourneyOutcome = (BlockerFlowInteractReceiveJourneyOutcome) obj;
        return Intrinsics.areEqual(this.client_scenario, blockerFlowInteractReceiveJourneyOutcome.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractReceiveJourneyOutcome.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractReceiveJourneyOutcome.flow_token) && Intrinsics.areEqual(this.last_blocker_id, blockerFlowInteractReceiveJourneyOutcome.last_blocker_id) && Intrinsics.areEqual(this.last_blocker_type, blockerFlowInteractReceiveJourneyOutcome.last_blocker_type) && Intrinsics.areEqual(this.outcome, blockerFlowInteractReceiveJourneyOutcome.outcome) && Intrinsics.areEqual(this.status_result_icon, blockerFlowInteractReceiveJourneyOutcome.status_result_icon) && this.uses_status_result_fallback.equals(blockerFlowInteractReceiveJourneyOutcome.uses_status_result_fallback);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact ReceiveJourneyOutcome";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originating_flow_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last_blocker_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.last_blocker_type;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outcome;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status_result_icon;
        return this.uses_status_result_fallback.hashCode() + ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractReceiveJourneyOutcome(client_scenario=", this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", last_blocker_id=", this.last_blocker_id, ", last_blocker_type=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.last_blocker_type, ", outcome=", this.outcome, ", status_result_icon=");
        m.append(this.status_result_icon);
        m.append(", uses_status_result_fallback=");
        m.append(this.uses_status_result_fallback);
        m.append(")");
        return m.toString();
    }
}
