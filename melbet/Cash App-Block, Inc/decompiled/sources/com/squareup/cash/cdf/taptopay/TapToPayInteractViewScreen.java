package com.squareup.cash.cdf.taptopay;

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
public final class TapToPayInteractViewScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String client_flow_token;
    public final String customer_token;
    public final FlowType flow_type;
    public final String idempotency_key;
    public final LinkedHashMap parameters;
    public final ScreenID screen_id;
    public final String server_flow_token;

    public TapToPayInteractViewScreen(String str, String str2, String str3, String str4, FlowType flowType, ScreenID screenID) {
        this.customer_token = str;
        this.server_flow_token = str2;
        this.client_flow_token = str3;
        this.idempotency_key = str4;
        this.flow_type = flowType;
        this.screen_id = screenID;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "TapToPay", "cdf_action", "Interact");
        Countries.putSafe(m, "customer_token", str);
        Countries.putSafe(m, "server_flow_token", str2);
        Countries.putSafe(m, "client_flow_token", str3);
        Countries.putSafe(m, "idempotency_key", str4);
        Countries.putSafe(m, "flow_type", flowType);
        Countries.putSafe(m, "screen_id", screenID);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapToPayInteractViewScreen)) {
            return false;
        }
        TapToPayInteractViewScreen tapToPayInteractViewScreen = (TapToPayInteractViewScreen) obj;
        return Intrinsics.areEqual(this.customer_token, tapToPayInteractViewScreen.customer_token) && Intrinsics.areEqual(this.server_flow_token, tapToPayInteractViewScreen.server_flow_token) && Intrinsics.areEqual(this.client_flow_token, tapToPayInteractViewScreen.client_flow_token) && Intrinsics.areEqual(this.idempotency_key, tapToPayInteractViewScreen.idempotency_key) && this.flow_type == tapToPayInteractViewScreen.flow_type && this.screen_id == tapToPayInteractViewScreen.screen_id;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TapToPay Interact ViewScreen";
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
        String str4 = this.idempotency_key;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FlowType flowType = this.flow_type;
        int hashCode5 = (hashCode4 + (flowType == null ? 0 : flowType.hashCode())) * 31;
        ScreenID screenID = this.screen_id;
        return hashCode5 + (screenID != null ? screenID.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapToPayInteractViewScreen(customer_token=", this.customer_token, ", server_flow_token=", this.server_flow_token, ", client_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.client_flow_token, ", idempotency_key=", this.idempotency_key, ", flow_type=");
        m.append(this.flow_type);
        m.append(", screen_id=");
        m.append(this.screen_id);
        m.append(")");
        return m.toString();
    }
}
