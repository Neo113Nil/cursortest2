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
public final class EarningsTrackerFetchSuccess implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Integer fetch_duration;
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;

    public EarningsTrackerFetchSuccess(Timeframe timeframe, Integer num, Integer num2, Integer num3) {
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        this.fetch_duration = num3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "EarningsTracker", "cdf_action", "Fetch");
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        Countries.putSafe(m, "fetch_duration", num3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerFetchSuccess)) {
            return false;
        }
        EarningsTrackerFetchSuccess earningsTrackerFetchSuccess = (EarningsTrackerFetchSuccess) obj;
        return this.timeframe == earningsTrackerFetchSuccess.timeframe && Intrinsics.areEqual(this.timeframe_month, earningsTrackerFetchSuccess.timeframe_month) && Intrinsics.areEqual(this.timeframe_year, earningsTrackerFetchSuccess.timeframe_year) && this.fetch_duration.equals(earningsTrackerFetchSuccess.fetch_duration);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Fetch Success";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Timeframe timeframe = this.timeframe;
        int hashCode = (timeframe == null ? 0 : timeframe.hashCode()) * 31;
        Integer num = this.timeframe_month;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeframe_year;
        return this.fetch_duration.hashCode() + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EarningsTrackerFetchSuccess(timeframe=" + this.timeframe + ", timeframe_month=" + this.timeframe_month + ", timeframe_year=" + this.timeframe_year + ", fetch_duration=" + this.fetch_duration + ")";
    }
}
