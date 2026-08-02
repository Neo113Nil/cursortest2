package com.squareup.cash.cdf.activityhistory;

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
public final class ActivityHistoryBrowseViewScreen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final LinkedHashMap parameters;
    public final Long view_load_time_ms;

    public ActivityHistoryBrowseViewScreen(String str, Long l) {
        this.activity_flow_token = str;
        this.view_load_time_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ActivityHistory", "cdf_action", "Browse");
        Countries.putSafe(m, "activity_flow_token", str);
        Countries.putSafe(m, "view_load_time_ms", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistoryBrowseViewScreen)) {
            return false;
        }
        ActivityHistoryBrowseViewScreen activityHistoryBrowseViewScreen = (ActivityHistoryBrowseViewScreen) obj;
        return Intrinsics.areEqual(this.activity_flow_token, activityHistoryBrowseViewScreen.activity_flow_token) && this.view_load_time_ms.equals(activityHistoryBrowseViewScreen.view_load_time_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory Browse ViewScreen";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.activity_flow_token;
        return this.view_load_time_ms.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ActivityHistoryBrowseViewScreen(activity_flow_token=" + this.activity_flow_token + ", view_load_time_ms=" + this.view_load_time_ms + ")";
    }
}
