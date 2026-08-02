package com.squareup.cash.cdf.pushnotification;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PushNotificationViewOpen implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final NotificationType notification_type;
    public final LinkedHashMap parameters;

    public PushNotificationViewOpen(NotificationType notificationType, String str) {
        this.notification_type = notificationType;
        this.entity_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PushNotification", "cdf_action", "View");
        Countries.putSafe(m, "notification_type", notificationType);
        Countries.putSafe(m, "entity_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationViewOpen)) {
            return false;
        }
        PushNotificationViewOpen pushNotificationViewOpen = (PushNotificationViewOpen) obj;
        return this.notification_type == pushNotificationViewOpen.notification_type && Intrinsics.areEqual(this.entity_id, pushNotificationViewOpen.entity_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PushNotification View Open";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.notification_type.hashCode() * 31;
        String str = this.entity_id;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PushNotificationViewOpen(notification_type=" + this.notification_type + ", entity_id=" + this.entity_id + ")";
    }
}
