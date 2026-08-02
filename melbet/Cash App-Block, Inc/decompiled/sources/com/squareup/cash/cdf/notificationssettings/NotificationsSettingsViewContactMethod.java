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
public final class NotificationsSettingsViewContactMethod implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ContactMethodType contactMethod;
    public final LinkedHashMap parameters;

    public NotificationsSettingsViewContactMethod(ContactMethodType contactMethodType) {
        this.contactMethod = contactMethodType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "NotificationsSettings", "cdf_action", "View");
        Countries.putSafe(m, "contactMethod", contactMethodType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsSettingsViewContactMethod) && this.contactMethod == ((NotificationsSettingsViewContactMethod) obj).contactMethod;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings View ContactMethod";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ContactMethodType contactMethodType = this.contactMethod;
        if (contactMethodType == null) {
            return 0;
        }
        return contactMethodType.hashCode();
    }

    public final String toString() {
        return "NotificationsSettingsViewContactMethod(contactMethod=" + this.contactMethod + ")";
    }
}
