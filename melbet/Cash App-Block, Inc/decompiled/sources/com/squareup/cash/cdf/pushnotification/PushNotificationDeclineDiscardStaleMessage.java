package com.squareup.cash.cdf.pushnotification;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PushNotificationDeclineDiscardStaleMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m$1("cdf_entity", 2, "PushNotification", "cdf_action", "Decline");
    public final String name = "PushNotification Decline DiscardStaleMessage";

    public final boolean equals(Object obj) {
        return obj instanceof PushNotificationDeclineDiscardStaleMessage;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }
}
