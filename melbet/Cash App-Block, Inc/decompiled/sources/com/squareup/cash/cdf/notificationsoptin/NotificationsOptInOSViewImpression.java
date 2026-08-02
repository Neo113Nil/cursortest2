package com.squareup.cash.cdf.notificationsoptin;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class NotificationsOptInOSViewImpression implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final NotificationPromptEntryPoint entry_point;
    public final LinkedHashMap parameters;

    public NotificationsOptInOSViewImpression(NotificationPromptEntryPoint notificationPromptEntryPoint) {
        this.entry_point = notificationPromptEntryPoint;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "NotificationsOptIn", "cdf_action", "OSView");
        Countries.putSafe(m, "entry_point", notificationPromptEntryPoint);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsOptInOSViewImpression) && this.entry_point == ((NotificationsOptInOSViewImpression) obj).entry_point;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsOptIn OSView Impression";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        NotificationPromptEntryPoint notificationPromptEntryPoint = this.entry_point;
        if (notificationPromptEntryPoint == null) {
            return 0;
        }
        return notificationPromptEntryPoint.hashCode();
    }

    public final String toString() {
        return "NotificationsOptInOSViewImpression(entry_point=" + this.entry_point + ")";
    }
}
