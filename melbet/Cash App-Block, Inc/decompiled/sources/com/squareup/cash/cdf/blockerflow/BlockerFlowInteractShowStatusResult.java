package com.squareup.cash.cdf.blockerflow;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BlockerFlowInteractShowStatusResult implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final String client_scenario;
    public final String flow_token;
    public final Boolean in_app_promo;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final Boolean promo_text;
    public final Boolean show_confetti;
    public final Boolean upsell;

    public BlockerFlowInteractShowStatusResult(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.flow_token = str;
        this.client_scenario = str2;
        this.originating_flow_type = str3;
        this.show_confetti = bool;
        this.promo_text = bool2;
        this.in_app_promo = bool3;
        this.upsell = bool4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "client_scenario", str2);
        Countries.putSafe(m, "originating_flow_type", str3);
        Countries.putSafe(m, "show_confetti", bool);
        Countries.putSafe(m, "promo_text", bool2);
        Countries.putSafe(m, "in_app_promo", bool3);
        Countries.putSafe(m, "upsell", bool4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractShowStatusResult)) {
            return false;
        }
        BlockerFlowInteractShowStatusResult blockerFlowInteractShowStatusResult = (BlockerFlowInteractShowStatusResult) obj;
        return Intrinsics.areEqual(this.flow_token, blockerFlowInteractShowStatusResult.flow_token) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractShowStatusResult.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractShowStatusResult.originating_flow_type) && this.show_confetti.equals(blockerFlowInteractShowStatusResult.show_confetti) && this.promo_text.equals(blockerFlowInteractShowStatusResult.promo_text) && this.in_app_promo.equals(blockerFlowInteractShowStatusResult.in_app_promo) && this.upsell.equals(blockerFlowInteractShowStatusResult.upsell);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact ShowStatusResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.client_scenario;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originating_flow_type;
        return ViewEvent$State$EnumUnboxingLocalUtility.m(this.upsell, ViewEvent$State$EnumUnboxingLocalUtility.m(this.in_app_promo, ViewEvent$State$EnumUnboxingLocalUtility.m(this.promo_text, ViewEvent$State$EnumUnboxingLocalUtility.m(this.show_confetti, (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 961), 961);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractShowStatusResult(flow_token=", this.flow_token, ", client_scenario=", this.client_scenario, ", originating_flow_type=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.originating_flow_type, ", show_confetti=", this.show_confetti, ", promo_text=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.promo_text, ", in_app_promo=", this.in_app_promo, ", reward_status=null, upsell=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.upsell, ", referrer_flow_token=null, referrer_type=null)");
    }
}
