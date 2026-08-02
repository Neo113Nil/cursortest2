package com.squareup.cash.cdf.earningstracker;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class EarningsTrackerOpenLaunchApplet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final EarningsTrackerEntrypoint entrypoint;
    public final LinkedHashMap parameters;

    public EarningsTrackerOpenLaunchApplet(EarningsTrackerEntrypoint earningsTrackerEntrypoint) {
        this.entrypoint = earningsTrackerEntrypoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "EarningsTracker", "cdf_action", "Open");
        Countries.putSafe(m, "entrypoint", earningsTrackerEntrypoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EarningsTrackerOpenLaunchApplet) && this.entrypoint == ((EarningsTrackerOpenLaunchApplet) obj).entrypoint;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Open LaunchApplet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.entrypoint.hashCode();
    }

    public final String toString() {
        return "EarningsTrackerOpenLaunchApplet(entrypoint=" + this.entrypoint + ")";
    }
}
