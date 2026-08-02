package com.squareup.cash.cdf.earningstracker;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsTrackerOpenViewError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final EarningsTrackerEntrypoint entrypoint;
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;

    public EarningsTrackerOpenViewError(EarningsTrackerEntrypoint earningsTrackerEntrypoint, Timeframe timeframe, Integer num, Integer num2) {
        this.entrypoint = earningsTrackerEntrypoint;
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "EarningsTracker", "cdf_action", "Open");
        Countries.putSafe(m, "entrypoint", earningsTrackerEntrypoint);
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerOpenViewError)) {
            return false;
        }
        EarningsTrackerOpenViewError earningsTrackerOpenViewError = (EarningsTrackerOpenViewError) obj;
        return this.entrypoint == earningsTrackerOpenViewError.entrypoint && this.timeframe == earningsTrackerOpenViewError.timeframe && Intrinsics.areEqual(this.timeframe_month, earningsTrackerOpenViewError.timeframe_month) && Intrinsics.areEqual(this.timeframe_year, earningsTrackerOpenViewError.timeframe_year);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Open ViewError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        EarningsTrackerEntrypoint earningsTrackerEntrypoint = this.entrypoint;
        int hashCode = (earningsTrackerEntrypoint == null ? 0 : earningsTrackerEntrypoint.hashCode()) * 31;
        Timeframe timeframe = this.timeframe;
        int hashCode2 = (hashCode + (timeframe == null ? 0 : timeframe.hashCode())) * 31;
        Integer num = this.timeframe_month;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeframe_year;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EarningsTrackerOpenViewError(entrypoint=" + this.entrypoint + ", timeframe=" + this.timeframe + ", timeframe_month=" + this.timeframe_month + ", timeframe_year=" + this.timeframe_year + ")";
    }
}
