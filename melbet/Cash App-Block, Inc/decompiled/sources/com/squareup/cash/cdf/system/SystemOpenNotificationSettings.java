package com.squareup.cash.cdf.system;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SystemOpenNotificationSettings implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final SystemNotificationSettingsOrigin origin;
    public final LinkedHashMap parameters;

    public SystemOpenNotificationSettings(SystemNotificationSettingsOrigin systemNotificationSettingsOrigin) {
        this.origin = systemNotificationSettingsOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "System", "cdf_action", "Open");
        Countries.putSafe(m, "origin", systemNotificationSettingsOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SystemOpenNotificationSettings) && this.origin == ((SystemOpenNotificationSettings) obj).origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "System Open NotificationSettings";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    public final String toString() {
        return "SystemOpenNotificationSettings(origin=" + this.origin + ")";
    }
}
