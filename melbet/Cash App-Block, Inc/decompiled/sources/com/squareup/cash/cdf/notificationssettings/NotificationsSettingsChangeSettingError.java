package com.squareup.cash.cdf.notificationssettings;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NotificationsSettingsChangeSettingError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String reasonCode;

    public NotificationsSettingsChangeSettingError(String str) {
        this.reasonCode = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "NotificationsSettings", "cdf_action", "Change");
        Countries.putSafe(m, "reasonCode", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsSettingsChangeSettingError) && Intrinsics.areEqual(this.reasonCode, ((NotificationsSettingsChangeSettingError) obj).reasonCode);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings Change SettingError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.reasonCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationsSettingsChangeSettingError(reasonCode=", this.reasonCode, ")");
    }
}
