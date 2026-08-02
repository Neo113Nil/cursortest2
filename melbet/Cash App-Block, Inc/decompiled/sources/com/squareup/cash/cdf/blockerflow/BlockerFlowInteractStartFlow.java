package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.common.internal.zzc;
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
public final class BlockerFlowInteractStartFlow implements Event {
    public static final zzc Companion = new zzc(17);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String cached_start_path;
    public final String client_scenario;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;
    public final String source_screen;

    public BlockerFlowInteractStartFlow(String str, String str2, String str3, String str4, String str5, String str6, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.cached_start_path = str;
        this.client_scenario = str2;
        this.originating_flow_type = str3;
        this.flow_token = str4;
        this.source_screen = str5;
        this.referrer_flow_token = str6;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "cached_start_path", str);
        Countries.putSafe(m, "client_scenario", str2);
        Countries.putSafe(m, "originating_flow_type", str3);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "source_screen", str5);
        Countries.putSafe(m, "referrer_flow_token", str6);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractStartFlow)) {
            return false;
        }
        BlockerFlowInteractStartFlow blockerFlowInteractStartFlow = (BlockerFlowInteractStartFlow) obj;
        return Intrinsics.areEqual(this.cached_start_path, blockerFlowInteractStartFlow.cached_start_path) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractStartFlow.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractStartFlow.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractStartFlow.flow_token) && Intrinsics.areEqual(this.source_screen, blockerFlowInteractStartFlow.source_screen) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractStartFlow.referrer_flow_token) && this.referrer_type == blockerFlowInteractStartFlow.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact StartFlow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.cached_start_path;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.client_scenario;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originating_flow_type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.source_screen;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.referrer_flow_token;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode6 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractStartFlow(cached_start_path=", this.cached_start_path, ", client_scenario=", this.client_scenario, ", originating_flow_type=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.originating_flow_type, ", flow_token=", this.flow_token, ", source_screen=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.source_screen, ", referrer_flow_token=", this.referrer_flow_token, ", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
