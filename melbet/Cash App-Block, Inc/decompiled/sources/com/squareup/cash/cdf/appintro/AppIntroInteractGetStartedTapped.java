package com.squareup.cash.cdf.appintro;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AppIntroInteractGetStartedTapped implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Long tap_time_ms;

    public AppIntroInteractGetStartedTapped(Long l) {
        this.tap_time_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AppIntro", "cdf_action", "Interact");
        Countries.putSafe(m, "tap_time_ms", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppIntroInteractGetStartedTapped) && this.tap_time_ms.equals(((AppIntroInteractGetStartedTapped) obj).tap_time_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppIntro Interact GetStartedTapped";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.tap_time_ms.hashCode();
    }

    public final String toString() {
        return "AppIntroInteractGetStartedTapped(tap_time_ms=" + this.tap_time_ms + ")";
    }
}
