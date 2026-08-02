package com.squareup.cash.cdf.taptopay;

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
public final class TapToPayInteractTapCard implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String client_flow_token;
    public final String customer_token;
    public final FlowType flow_type;
    public final LinkedHashMap parameters;
    public final ScreenID screen_id;
    public final String server_flow_token;

    public TapToPayInteractTapCard(String str, String str2, String str3, FlowType flowType, ScreenID screenID) {
        this.customer_token = str;
        this.server_flow_token = str2;
        this.client_flow_token = str3;
        this.flow_type = flowType;
        this.screen_id = screenID;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "TapToPay", "cdf_action", "Interact");
        Countries.putSafe(m, "customer_token", str);
        Countries.putSafe(m, "server_flow_token", str2);
        Countries.putSafe(m, "client_flow_token", str3);
        Countries.putSafe(m, "flow_type", flowType);
        Countries.putSafe(m, "screen_id", screenID);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayInteractTapCard)) {
            return false;
        }
        TapToPayInteractTapCard tapToPayInteractTapCard = (TapToPayInteractTapCard) obj;
        return Intrinsics.areEqual(this.customer_token, tapToPayInteractTapCard.customer_token) && Intrinsics.areEqual(this.server_flow_token, tapToPayInteractTapCard.server_flow_token) && Intrinsics.areEqual(this.client_flow_token, tapToPayInteractTapCard.client_flow_token) && this.flow_type == tapToPayInteractTapCard.flow_type && this.screen_id == tapToPayInteractTapCard.screen_id;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TapToPay Interact TapCard";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.server_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.client_flow_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FlowType flowType = this.flow_type;
        int hashCode4 = (hashCode3 + (flowType == null ? 0 : flowType.hashCode())) * 31;
        ScreenID screenID = this.screen_id;
        return hashCode4 + (screenID != null ? screenID.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapToPayInteractTapCard(customer_token=", this.customer_token, ", server_flow_token=", this.server_flow_token, ", client_flow_token=");
        m.append(this.client_flow_token);
        m.append(", flow_type=");
        m.append(this.flow_type);
        m.append(", screen_id=");
        m.append(this.screen_id);
        m.append(")");
        return m.toString();
    }
}
