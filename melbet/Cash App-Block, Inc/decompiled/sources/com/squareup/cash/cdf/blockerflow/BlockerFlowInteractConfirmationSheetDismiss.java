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
public final class BlockerFlowInteractConfirmationSheetDismiss implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String flow_token;
    public final LinkedHashMap parameters;

    public BlockerFlowInteractConfirmationSheetDismiss(String str) {
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "BlockerFlow", "cdf_action", "InteractConfirmationSheet");
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockerFlowInteractConfirmationSheetDismiss) && Intrinsics.areEqual(this.flow_token, ((BlockerFlowInteractConfirmationSheetDismiss) obj).flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow InteractConfirmationSheet Dismiss";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return (str == null ? 0 : str.hashCode()) * 961;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractConfirmationSheetDismiss(flow_token=", this.flow_token, ", referrer_flow_token=null, referrer_type=null)");
    }
}
