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
public final class AppIntroViewWelcomeVideoLoaded implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long load_time_ms;
    public final LinkedHashMap parameters;

    public AppIntroViewWelcomeVideoLoaded(Long l) {
        this.load_time_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AppIntro", "cdf_action", "View");
        Countries.putSafe(m, "load_time_ms", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppIntroViewWelcomeVideoLoaded) && this.load_time_ms.equals(((AppIntroViewWelcomeVideoLoaded) obj).load_time_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppIntro View WelcomeVideoLoaded";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.load_time_ms.hashCode();
    }

    public final String toString() {
        return "AppIntroViewWelcomeVideoLoaded(load_time_ms=" + this.load_time_ms + ")";
    }
}
