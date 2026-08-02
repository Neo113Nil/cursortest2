package com.squareup.cash.cdf.activityhistory;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ActivityHistorySearchStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String activity_flow_token;
    public final LinkedHashMap parameters;
    public final String search_flow_token;

    public ActivityHistorySearchStart(String str, String str2) {
        Boolean bool = Boolean.FALSE;
        this.activity_flow_token = str;
        this.search_flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "ActivityHistory", "cdf_action", "Search");
        Countries.putSafe(m, "is_treehouse", bool);
        Countries.putSafe(m, "activity_flow_token", str);
        Countries.putSafe(m, "search_flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistorySearchStart)) {
            return false;
        }
        ActivityHistorySearchStart activityHistorySearchStart = (ActivityHistorySearchStart) obj;
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.activity_flow_token, activityHistorySearchStart.activity_flow_token) && Intrinsics.areEqual(this.search_flow_token, activityHistorySearchStart.search_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory Search Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Boolean.FALSE.hashCode() * 31;
        String str = this.activity_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.search_flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sb = new StringBuilder("ActivityHistorySearchStart(is_treehouse=");
        sb.append(bool);
        sb.append(", activity_flow_token=");
        sb.append(this.activity_flow_token);
        sb.append(", search_flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.search_flow_token, ")");
    }
}
