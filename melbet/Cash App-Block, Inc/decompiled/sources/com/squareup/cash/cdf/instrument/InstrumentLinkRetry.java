package com.squareup.cash.cdf.instrument;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class InstrumentLinkRetry implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final InstrumentLinkFlowEntryPoint entry_point;
    public final LinkedHashMap parameters;

    public InstrumentLinkRetry(InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint) {
        this.entry_point = instrumentLinkFlowEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "entry_point", instrumentLinkFlowEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentLinkRetry) && this.entry_point == ((InstrumentLinkRetry) obj).entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Retry";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = this.entry_point;
        return (instrumentLinkFlowEntryPoint == null ? 0 : instrumentLinkFlowEntryPoint.hashCode()) * 961;
    }

    public final String toString() {
        return "InstrumentLinkRetry(entry_point=" + this.entry_point + ", treatment=null, variant=null)";
    }
}
