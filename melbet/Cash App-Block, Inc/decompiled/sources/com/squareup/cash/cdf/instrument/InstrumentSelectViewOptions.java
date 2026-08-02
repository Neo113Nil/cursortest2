package com.squareup.cash.cdf.instrument;

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
public final class InstrumentSelectViewOptions implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String actions;
    public final String client_scenario;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public InstrumentSelectViewOptions(String str, String str2, String str3) {
        this.client_scenario = str;
        this.flow_token = str2;
        this.actions = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Instrument", "cdf_action", "Select");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "actions", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectViewOptions)) {
            return false;
        }
        InstrumentSelectViewOptions instrumentSelectViewOptions = (InstrumentSelectViewOptions) obj;
        return Intrinsics.areEqual(this.client_scenario, instrumentSelectViewOptions.client_scenario) && Intrinsics.areEqual(this.flow_token, instrumentSelectViewOptions.flow_token) && this.actions.equals(instrumentSelectViewOptions.actions);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Select ViewOptions";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.flow_token;
        return this.actions.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentSelectViewOptions(client_scenario=", this.client_scenario, ", flow_token=", this.flow_token, ", actions="), this.actions, ")");
    }
}
