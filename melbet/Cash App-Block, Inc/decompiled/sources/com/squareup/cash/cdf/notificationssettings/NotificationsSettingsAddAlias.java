package com.squareup.cash.cdf.notificationssettings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class NotificationsSettingsAddAlias implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType aliasType;
    public final LinkedHashMap parameters;

    public NotificationsSettingsAddAlias(AliasType aliasType) {
        this.aliasType = aliasType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "NotificationsSettings", "cdf_action", "Add");
        Countries.putSafe(m, "aliasType", aliasType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsSettingsAddAlias) && this.aliasType == ((NotificationsSettingsAddAlias) obj).aliasType;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings Add Alias";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.aliasType.hashCode();
    }

    public final String toString() {
        return "NotificationsSettingsAddAlias(aliasType=" + this.aliasType + ")";
    }
}
