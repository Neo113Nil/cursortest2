package com.squareup.cash.cdf.app;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AppLifecycleRestore implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer elapsed_time_millis;
    public final Boolean is_same_process;
    public final LinkedHashMap parameters;

    public AppLifecycleRestore(Integer num, Boolean bool) {
        this.elapsed_time_millis = num;
        this.is_same_process = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "App", "cdf_action", "Lifecycle");
        Countries.putSafe(m, "elapsed_time_millis", num);
        Countries.putSafe(m, "is_same_process", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLifecycleRestore)) {
            return false;
        }
        AppLifecycleRestore appLifecycleRestore = (AppLifecycleRestore) obj;
        return this.elapsed_time_millis.equals(appLifecycleRestore.elapsed_time_millis) && this.is_same_process.equals(appLifecycleRestore.is_same_process);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "App Lifecycle Restore";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_same_process.hashCode() + (this.elapsed_time_millis.hashCode() * 31);
    }

    public final String toString() {
        return "AppLifecycleRestore(elapsed_time_millis=" + this.elapsed_time_millis + ", is_same_process=" + this.is_same_process + ")";
    }
}
