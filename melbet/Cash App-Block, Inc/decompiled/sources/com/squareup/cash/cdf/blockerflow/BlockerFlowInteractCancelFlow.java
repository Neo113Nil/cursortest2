package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zze;
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
public final class BlockerFlowInteractCancelFlow implements Event {
    public static final zze Companion = new zze(16);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String client_scenario;
    public final Integer flow_duration_ms;
    public final String flow_token;
    public final String last_blocker_id;
    public final String last_blocker_type;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;
    public final String unique_final_path;

    public BlockerFlowInteractCancelFlow(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.client_scenario = str;
        this.originating_flow_type = str2;
        this.flow_duration_ms = num;
        this.flow_token = str3;
        this.last_blocker_id = str4;
        this.last_blocker_type = str5;
        this.unique_final_path = str6;
        this.referrer_flow_token = str7;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "originating_flow_type", str2);
        Countries.putSafe(m, "flow_duration_ms", num);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "last_blocker_id", str4);
        Countries.putSafe(m, "last_blocker_type", str5);
        Countries.putSafe(m, "unique_final_path", str6);
        Countries.putSafe(m, "referrer_flow_token", str7);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractCancelFlow)) {
            return false;
        }
        BlockerFlowInteractCancelFlow blockerFlowInteractCancelFlow = (BlockerFlowInteractCancelFlow) obj;
        return Intrinsics.areEqual(this.client_scenario, blockerFlowInteractCancelFlow.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractCancelFlow.originating_flow_type) && Intrinsics.areEqual(this.flow_duration_ms, blockerFlowInteractCancelFlow.flow_duration_ms) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractCancelFlow.flow_token) && Intrinsics.areEqual(this.last_blocker_id, blockerFlowInteractCancelFlow.last_blocker_id) && Intrinsics.areEqual(this.last_blocker_type, blockerFlowInteractCancelFlow.last_blocker_type) && this.unique_final_path.equals(blockerFlowInteractCancelFlow.unique_final_path) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractCancelFlow.referrer_flow_token) && this.referrer_type == blockerFlowInteractCancelFlow.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact CancelFlow";
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
        Integer num = this.flow_duration_ms;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.last_blocker_id;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.last_blocker_type;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.unique_final_path);
        String str6 = this.referrer_flow_token;
        int hashCode6 = (m + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode6 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractCancelFlow(client_scenario=", this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", flow_duration_ms=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.flow_duration_ms, ", flow_token=", this.flow_token, ", last_blocker_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.last_blocker_id, ", last_blocker_type=", this.last_blocker_type, ", unique_final_path=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.unique_final_path, ", referrer_flow_token=", this.referrer_flow_token, ", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
