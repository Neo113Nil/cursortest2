package com.squareup.cash.cdf.alertbannernotification;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AlertBannerNotificationInteractTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final Screen screen;
    public final State state;

    public AlertBannerNotificationInteractTap(Screen screen, State state) {
        this.screen = screen;
        this.state = state;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "AlertBannerNotification", "cdf_action", "Interact");
        Countries.putSafe(m, "screen", screen);
        Countries.putSafe(m, "state", state);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertBannerNotificationInteractTap)) {
            return false;
        }
        AlertBannerNotificationInteractTap alertBannerNotificationInteractTap = (AlertBannerNotificationInteractTap) obj;
        return this.screen == alertBannerNotificationInteractTap.screen && this.state == alertBannerNotificationInteractTap.state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AlertBannerNotification Interact Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return (this.state.hashCode() + (this.screen.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "AlertBannerNotificationInteractTap(screen=" + this.screen + ", state=" + this.state + ", adversity_type=null)";
    }
}
