package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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

/* loaded from: classes6.dex */
public final class BlockerFlowInteractSubmitBlocker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blocker_id;
    public final String blocker_type;
    public final String client_scenario;
    public final String flow_token;
    public final Integer input_duration_ms;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;

    public BlockerFlowInteractSubmitBlocker(String str, String str2, String str3, String str4, String str5, Integer num, String str6, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.blocker_id = str;
        this.blocker_type = str2;
        this.client_scenario = str3;
        this.originating_flow_type = str4;
        this.flow_token = str5;
        this.input_duration_ms = num;
        this.referrer_flow_token = str6;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "blocker_id", str);
        Countries.putSafe(m, "blocker_type", str2);
        Countries.putSafe(m, "client_scenario", str3);
        Countries.putSafe(m, "originating_flow_type", str4);
        Countries.putSafe(m, "flow_token", str5);
        Countries.putSafe(m, "input_duration_ms", num);
        Countries.putSafe(m, "referrer_flow_token", str6);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractSubmitBlocker)) {
            return false;
        }
        BlockerFlowInteractSubmitBlocker blockerFlowInteractSubmitBlocker = (BlockerFlowInteractSubmitBlocker) obj;
        return Intrinsics.areEqual(this.blocker_id, blockerFlowInteractSubmitBlocker.blocker_id) && Intrinsics.areEqual(this.blocker_type, blockerFlowInteractSubmitBlocker.blocker_type) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractSubmitBlocker.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractSubmitBlocker.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractSubmitBlocker.flow_token) && Intrinsics.areEqual(this.input_duration_ms, blockerFlowInteractSubmitBlocker.input_duration_ms) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractSubmitBlocker.referrer_flow_token) && this.referrer_type == blockerFlowInteractSubmitBlocker.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact SubmitBlocker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blocker_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blocker_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.client_scenario;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originating_flow_type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.flow_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.input_duration_ms;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.referrer_flow_token;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode7 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractSubmitBlocker(blocker_id=", this.blocker_id, ", blocker_type=", this.blocker_type, ", client_scenario=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", flow_token=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.flow_token, ", input_duration_ms=", this.input_duration_ms, ", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
