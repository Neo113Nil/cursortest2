package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BlockerAction;
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
public final class BlockerFlowInteractTapBlockerAction implements Event {
    public static final zzd Companion = new zzd(17);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String action_id;
    public final String action_text;
    public final BlockerAction blocker_action;
    public final String blocker_id;
    public final String blocker_type;
    public final String client_scenario;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;

    public BlockerFlowInteractTapBlockerAction(String str, String str2, BlockerAction blockerAction, String str3, String str4, String str5, String str6, String str7, String str8, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.action_id = str;
        this.action_text = str2;
        this.blocker_action = blockerAction;
        this.blocker_id = str3;
        this.blocker_type = str4;
        this.client_scenario = str5;
        this.originating_flow_type = str6;
        this.flow_token = str7;
        this.referrer_flow_token = str8;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "action_id", str);
        Countries.putSafe(m, "action_text", str2);
        Countries.putSafe(m, "blocker_action", blockerAction);
        Countries.putSafe(m, "blocker_id", str3);
        Countries.putSafe(m, "blocker_type", str4);
        Countries.putSafe(m, "client_scenario", str5);
        Countries.putSafe(m, "originating_flow_type", str6);
        Countries.putSafe(m, "flow_token", str7);
        Countries.putSafe(m, "referrer_flow_token", str8);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractTapBlockerAction)) {
            return false;
        }
        BlockerFlowInteractTapBlockerAction blockerFlowInteractTapBlockerAction = (BlockerFlowInteractTapBlockerAction) obj;
        return Intrinsics.areEqual(this.action_id, blockerFlowInteractTapBlockerAction.action_id) && Intrinsics.areEqual(this.action_text, blockerFlowInteractTapBlockerAction.action_text) && this.blocker_action == blockerFlowInteractTapBlockerAction.blocker_action && Intrinsics.areEqual(this.blocker_id, blockerFlowInteractTapBlockerAction.blocker_id) && Intrinsics.areEqual(this.blocker_type, blockerFlowInteractTapBlockerAction.blocker_type) && this.client_scenario.equals(blockerFlowInteractTapBlockerAction.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractTapBlockerAction.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractTapBlockerAction.flow_token) && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractTapBlockerAction.referrer_flow_token) && this.referrer_type == blockerFlowInteractTapBlockerAction.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact TapBlockerAction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.action_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action_text;
        int hashCode2 = (this.blocker_action.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.blocker_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.blocker_type;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.client_scenario);
        String str5 = this.originating_flow_type;
        int hashCode4 = (m + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flow_token;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referrer_flow_token;
        int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return hashCode6 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractTapBlockerAction(action_id=", this.action_id, ", action_text=", this.action_text, ", blocker_action=");
        m.append(this.blocker_action);
        m.append(", blocker_id=");
        m.append(this.blocker_id);
        m.append(", blocker_type=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.blocker_type, ", client_scenario=", this.client_scenario, ", originating_flow_type=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.originating_flow_type, ", flow_token=", this.flow_token, ", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", referrer_type=");
        m.append(this.referrer_type);
        m.append(")");
        return m.toString();
    }
}
