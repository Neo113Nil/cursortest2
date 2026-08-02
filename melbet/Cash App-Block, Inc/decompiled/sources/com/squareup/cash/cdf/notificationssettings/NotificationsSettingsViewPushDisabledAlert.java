package com.squareup.cash.cdf.notificationssettings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NotificationsSettingsViewPushDisabledAlert implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String settingName;
    public final String settingUserId;

    public NotificationsSettingsViewPushDisabledAlert(String str, String str2) {
        this.settingUserId = str;
        this.settingName = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NotificationsSettings", "cdf_action", "View");
        Countries.putSafe(m, "settingUserId", str);
        Countries.putSafe(m, "settingName", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsViewPushDisabledAlert)) {
            return false;
        }
        NotificationsSettingsViewPushDisabledAlert notificationsSettingsViewPushDisabledAlert = (NotificationsSettingsViewPushDisabledAlert) obj;
        return Intrinsics.areEqual(this.settingUserId, notificationsSettingsViewPushDisabledAlert.settingUserId) && Intrinsics.areEqual(this.settingName, notificationsSettingsViewPushDisabledAlert.settingName);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings View PushDisabledAlert";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.settingUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("NotificationsSettingsViewPushDisabledAlert(settingUserId=", this.settingUserId, ", settingName=", this.settingName, ")");
    }
}
