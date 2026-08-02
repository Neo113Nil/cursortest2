package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BlockerFlowInteractViewBlocker implements Event {
    public static final zze Companion = new zze(17);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blocker_id;
    public final String blocker_type;
    public final String client_scenario;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;

    public BlockerFlowInteractViewBlocker(String str, String str2, String str3, String str4, String str5, String str6, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.blocker_id = str;
        this.blocker_type = str2;
        this.client_scenario = str3;
        this.originating_flow_type = str4;
        this.flow_token = str5;
        this.referrer_flow_token = str6;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "blocker_id", str);
        Countries.putSafe(m, "blocker_type", str2);
        Countries.putSafe(m, "client_scenario", str3);
        Countries.putSafe(m, "originating_flow_type", str4);
        Countries.putSafe(m, "flow_token", str5);
        Countries.putSafe(m, "referrer_flow_token", str6);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractViewBlocker)) {
            return false;
        }
        BlockerFlowInteractViewBlocker blockerFlowInteractViewBlocker = (BlockerFlowInteractViewBlocker) obj;
        return this.blocker_id.equals(blockerFlowInteractViewBlocker.blocker_id) && this.blocker_type.equals(blockerFlowInteractViewBlocker.blocker_type) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractViewBlocker.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractViewBlocker.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractViewBlocker.flow_token) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractViewBlocker.referrer_flow_token) && this.referrer_type == blockerFlowInteractViewBlocker.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact ViewBlocker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.blocker_id.hashCode() * 31, 31, this.blocker_type);
        String str = this.client_scenario;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originating_flow_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode4 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractViewBlocker(blocker_id=", this.blocker_id, ", blocker_type=", this.blocker_type, ", client_scenario=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", referrer_flow_token=", this.referrer_flow_token, ", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
