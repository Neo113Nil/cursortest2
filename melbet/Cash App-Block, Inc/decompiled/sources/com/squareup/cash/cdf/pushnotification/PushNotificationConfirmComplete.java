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
public final class PushNotificationConfirmComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String entity_id;
    public final NotificationType notification_type;
    public final LinkedHashMap parameters;

    public PushNotificationConfirmComplete(NotificationType notificationType, String str, int i) {
        notificationType = (i & 1) != 0 ? null : notificationType;
        str = (i & 2) != 0 ? null : str;
        this.notification_type = notificationType;
        this.entity_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PushNotification", "cdf_action", "Confirm");
        Countries.putSafe(m, "notification_type", notificationType);
        Countries.putSafe(m, "entity_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationConfirmComplete)) {
            return false;
        }
        PushNotificationConfirmComplete pushNotificationConfirmComplete = (PushNotificationConfirmComplete) obj;
        return this.notification_type == pushNotificationConfirmComplete.notification_type && Intrinsics.areEqual(this.entity_id, pushNotificationConfirmComplete.entity_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PushNotification Confirm Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        NotificationType notificationType = this.notification_type;
        int hashCode = (notificationType == null ? 0 : notificationType.hashCode()) * 31;
        String str = this.entity_id;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PushNotificationConfirmComplete(notification_type=" + this.notification_type + ", entity_id=" + this.entity_id + ")";
    }
}
