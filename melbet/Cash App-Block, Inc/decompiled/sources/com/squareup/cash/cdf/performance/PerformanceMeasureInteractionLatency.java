package com.squareup.cash.cdf.performance;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
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

/* loaded from: classes.dex */
public final class PerformanceMeasureInteractionLatency implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String active_user_journey_names;
    public final String destination;
    public final Long latency_total_ms;
    public final LinkedHashMap parameters;

    public PerformanceMeasureInteractionLatency(Long l, String str, String str2) {
        this.destination = str;
        this.latency_total_ms = l;
        this.active_user_journey_names = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Performance", "cdf_action", "Measure");
        Countries.putSafe(m, "destination", str);
        Countries.putSafe(m, "latency_total_ms", l);
        Countries.putSafe(m, "active_user_journey_names", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceMeasureInteractionLatency)) {
            return false;
        }
        PerformanceMeasureInteractionLatency performanceMeasureInteractionLatency = (PerformanceMeasureInteractionLatency) obj;
        return this.destination.equals(performanceMeasureInteractionLatency.destination) && this.latency_total_ms.equals(performanceMeasureInteractionLatency.latency_total_ms) && this.active_user_journey_names.equals(performanceMeasureInteractionLatency.active_user_journey_names);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Performance Measure InteractionLatency";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.active_user_journey_names.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.latency_total_ms, this.destination.hashCode() * 31, 961);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(RumErrorSource$EnumUnboxingLocalUtility.m(this.latency_total_ms, "PerformanceMeasureInteractionLatency(destination=", this.destination, ", latency_total_ms=", ", latest_active_user_journey_name=null, active_user_journey_names="), this.active_user_journey_names, ")");
    }
}
