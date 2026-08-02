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
public final class ActivityHistoryRefreshForce implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final LinkedHashMap parameters;

    public ActivityHistoryRefreshForce(String str) {
        Boolean bool = Boolean.FALSE;
        this.activity_flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ActivityHistory", "cdf_action", "Refresh");
        Countries.putSafe(m, "is_treehouse", bool);
        Countries.putSafe(m, "activity_flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistoryRefreshForce)) {
            return false;
        }
        ActivityHistoryRefreshForce activityHistoryRefreshForce = (ActivityHistoryRefreshForce) obj;
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.activity_flow_token, activityHistoryRefreshForce.activity_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory Refresh Force";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Boolean.FALSE.hashCode() * 31;
        String str = this.activity_flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActivityHistoryRefreshForce(is_treehouse=" + Boolean.FALSE + ", activity_flow_token=" + this.activity_flow_token + ")";
    }
}
