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

/* loaded from: classes6.dex */
public final class InstrumentViewViewLinkingOptions implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String options;
    public final LinkedHashMap parameters;

    public InstrumentViewViewLinkingOptions(String str) {
        this.options = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Instrument", "cdf_action", "View");
        Countries.putSafe(m, "options", str);
        Countries.putSafe(m, "source", "SYNC_VALUE");
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstrumentViewViewLinkingOptions) && this.options.equals(((InstrumentViewViewLinkingOptions) obj).options);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument View ViewLinkingOptions";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return (this.options.hashCode() * 31) - 445747539;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentViewViewLinkingOptions(options=", this.options, ", source=SYNC_VALUE)");
    }
}
