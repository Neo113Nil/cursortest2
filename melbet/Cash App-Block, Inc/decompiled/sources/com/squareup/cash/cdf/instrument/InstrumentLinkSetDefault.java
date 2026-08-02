package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentLinkSetDefault implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final InstrumentLinkFlowEntryPoint entry_point;
    public final String flow_token;
    public final String instrument_token;
    public final LinkedHashMap parameters;

    public InstrumentLinkSetDefault(String str, String str2, InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint) {
        this.flow_token = str;
        this.instrument_token = str2;
        this.entry_point = instrumentLinkFlowEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "instrument_token", str2);
        Countries.putSafe(m, "entry_point", instrumentLinkFlowEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkSetDefault)) {
            return false;
        }
        InstrumentLinkSetDefault instrumentLinkSetDefault = (InstrumentLinkSetDefault) obj;
        return Intrinsics.areEqual(this.flow_token, instrumentLinkSetDefault.flow_token) && Intrinsics.areEqual(this.instrument_token, instrumentLinkSetDefault.instrument_token) && this.entry_point == instrumentLinkSetDefault.entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link SetDefault";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.instrument_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = this.entry_point;
        return hashCode2 + (instrumentLinkFlowEntryPoint != null ? instrumentLinkFlowEntryPoint.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentLinkSetDefault(flow_token=", this.flow_token, ", instrument_token=", this.instrument_token, ", entry_point=");
        m.append(this.entry_point);
        m.append(")");
        return m.toString();
    }
}
