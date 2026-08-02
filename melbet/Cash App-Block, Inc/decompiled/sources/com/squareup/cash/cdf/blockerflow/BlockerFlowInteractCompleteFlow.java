package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
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
public final class BlockerFlowInteractCompleteFlow implements Event {
    public static final zza Companion = new zza(17);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String final_path;
    public final Integer flow_duration_ms;
    public final String flow_token;
    public final String last_blocker_id;
    public final String last_blocker_type;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;
    public final String unique_final_path;

    public BlockerFlowInteractCompleteFlow(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.client_scenario = str;
        this.originating_flow_type = str2;
        this.final_path = str3;
        this.flow_duration_ms = num;
        this.flow_token = str4;
        this.last_blocker_id = str5;
        this.last_blocker_type = str6;
        this.unique_final_path = str7;
        this.referrer_flow_token = str8;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "originating_flow_type", str2);
        Countries.putSafe(m, "final_path", str3);
        Countries.putSafe(m, "flow_duration_ms", num);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "last_blocker_id", str5);
        Countries.putSafe(m, "last_blocker_type", str6);
        Countries.putSafe(m, "unique_final_path", str7);
        Countries.putSafe(m, "referrer_flow_token", str8);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractCompleteFlow)) {
            return false;
        }
        BlockerFlowInteractCompleteFlow blockerFlowInteractCompleteFlow = (BlockerFlowInteractCompleteFlow) obj;
        return Intrinsics.areEqual(this.client_scenario, blockerFlowInteractCompleteFlow.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractCompleteFlow.originating_flow_type) && this.final_path.equals(blockerFlowInteractCompleteFlow.final_path) && Intrinsics.areEqual(this.flow_duration_ms, blockerFlowInteractCompleteFlow.flow_duration_ms) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractCompleteFlow.flow_token) && Intrinsics.areEqual(this.last_blocker_id, blockerFlowInteractCompleteFlow.last_blocker_id) && Intrinsics.areEqual(this.last_blocker_type, blockerFlowInteractCompleteFlow.last_blocker_type) && this.unique_final_path.equals(blockerFlowInteractCompleteFlow.unique_final_path) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractCompleteFlow.referrer_flow_token) && this.referrer_type == blockerFlowInteractCompleteFlow.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact CompleteFlow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originating_flow_type;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.final_path);
        Integer num = this.flow_duration_ms;
        int hashCode2 = (m + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last_blocker_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.last_blocker_type;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.unique_final_path);
        String str6 = this.referrer_flow_token;
        int hashCode5 = (m2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode5 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractCompleteFlow(client_scenario=", this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", final_path=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.final_path, ", flow_duration_ms=", this.flow_duration_ms, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", last_blocker_id=", this.last_blocker_id, ", last_blocker_type=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.last_blocker_type, ", unique_final_path=", this.unique_final_path, ", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
