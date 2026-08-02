package com.squareup.cash.cdf.earningstracker;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class EarningsTrackerInteractViewChartDetails implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final Timeframe timeframe;
    public final Integer timeframe_month;
    public final Integer timeframe_year;

    public EarningsTrackerInteractViewChartDetails(Timeframe timeframe, Integer num, Integer num2) {
        this.timeframe = timeframe;
        this.timeframe_month = num;
        this.timeframe_year = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "EarningsTracker", "cdf_action", "Interact");
        Countries.putSafe(m, "timeframe", timeframe);
        Countries.putSafe(m, "timeframe_month", num);
        Countries.putSafe(m, "timeframe_year", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsTrackerInteractViewChartDetails)) {
            return false;
        }
        EarningsTrackerInteractViewChartDetails earningsTrackerInteractViewChartDetails = (EarningsTrackerInteractViewChartDetails) obj;
        return this.timeframe == earningsTrackerInteractViewChartDetails.timeframe && Intrinsics.areEqual(this.timeframe_month, earningsTrackerInteractViewChartDetails.timeframe_month) && Intrinsics.areEqual(this.timeframe_year, earningsTrackerInteractViewChartDetails.timeframe_year);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EarningsTracker Interact ViewChartDetails";
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
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EarningsTrackerInteractViewChartDetails(timeframe=");
        sb.append(this.timeframe);
        sb.append(", timeframe_month=");
        sb.append(this.timeframe_month);
        sb.append(", timeframe_year=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.timeframe_year, ")");
    }
}
