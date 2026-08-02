package com.squareup.cash.cdf.pushnotification;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PushNotificationConfirmViewBlocker implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String entity_id;
    public final LinkedHashMap parameters;

    public PushNotificationConfirmViewBlocker(String str) {
        this.entity_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PushNotification", "cdf_action", "Confirm");
        Countries.putSafe(m, "entity_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushNotificationConfirmViewBlocker) && this.entity_id.equals(((PushNotificationConfirmViewBlocker) obj).entity_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PushNotification Confirm ViewBlocker";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.entity_id.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PushNotificationConfirmViewBlocker(notification_type=null, entity_id=", this.entity_id, ")");
    }
}
