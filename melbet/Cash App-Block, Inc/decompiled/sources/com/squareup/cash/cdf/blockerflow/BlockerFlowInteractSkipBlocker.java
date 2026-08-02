package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class BlockerFlowInteractSkipBlocker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String blocker_id;
    public final String blocker_type;
    public final String client_scenario;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;

    public BlockerFlowInteractSkipBlocker(String str, String str2, String str3, String str4, String str5) {
        this.blocker_id = str;
        this.blocker_type = str2;
        this.client_scenario = str3;
        this.originating_flow_type = str4;
        this.flow_token = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "blocker_id", str);
        Countries.putSafe(m, "blocker_type", str2);
        Countries.putSafe(m, "client_scenario", str3);
        Countries.putSafe(m, "originating_flow_type", str4);
        Countries.putSafe(m, "flow_token", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractSkipBlocker)) {
            return false;
        }
        BlockerFlowInteractSkipBlocker blockerFlowInteractSkipBlocker = (BlockerFlowInteractSkipBlocker) obj;
        return Intrinsics.areEqual(this.blocker_id, blockerFlowInteractSkipBlocker.blocker_id) && Intrinsics.areEqual(this.blocker_type, blockerFlowInteractSkipBlocker.blocker_type) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractSkipBlocker.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractSkipBlocker.originating_flow_type) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractSkipBlocker.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact SkipBlocker";
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
        return (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractSkipBlocker(blocker_id=", this.blocker_id, ", blocker_type=", this.blocker_type, ", client_scenario=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.flow_token, ", referrer_flow_token=null, referrer_type=null)");
    }
}
