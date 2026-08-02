package com.squareup.cash.cdf.activityhistory;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ActivityHistoryViewLoad implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean first_view_after_login;
    public final Boolean is_treehouse;
    public final Long load_time_ms;
    public final LinkedHashMap parameters;

    public ActivityHistoryViewLoad(Long l, Boolean bool, Boolean bool2, int i) {
        bool = (i & 2) != 0 ? null : bool;
        this.load_time_ms = l;
        this.first_view_after_login = bool;
        this.is_treehouse = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "ActivityHistory", "cdf_action", "View");
        Countries.putSafe(m, "load_time_ms", l);
        Countries.putSafe(m, "first_view_after_login", bool);
        Countries.putSafe(m, "is_treehouse", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHistoryViewLoad)) {
            return false;
        }
        ActivityHistoryViewLoad activityHistoryViewLoad = (ActivityHistoryViewLoad) obj;
        return Intrinsics.areEqual(this.load_time_ms, activityHistoryViewLoad.load_time_ms) && Intrinsics.areEqual(this.first_view_after_login, activityHistoryViewLoad.first_view_after_login) && this.is_treehouse.equals(activityHistoryViewLoad.is_treehouse);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityHistory View Load";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.load_time_ms;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.first_view_after_login;
        return ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_treehouse, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 29791);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityHistoryViewLoad(load_time_ms=");
        sb.append(this.load_time_ms);
        sb.append(", first_view_after_login=");
        sb.append(this.first_view_after_login);
        sb.append(", is_treehouse=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_treehouse, ", fetching_time_ms=null, processing_time_ms=null, rendering_time_ms=null)");
    }
}
