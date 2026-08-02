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
public final class NotificationsSettingsViewConfirmSheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType aliasType;
    public final ConfirmationSheetOrigin origin;
    public final LinkedHashMap parameters;
    public final String settingName;
    public final String settingUserId;

    public NotificationsSettingsViewConfirmSheet(String str, String str2, AliasType aliasType, ConfirmationSheetOrigin confirmationSheetOrigin) {
        this.settingUserId = str;
        this.settingName = str2;
        this.aliasType = aliasType;
        this.origin = confirmationSheetOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "NotificationsSettings", "cdf_action", "View");
        Countries.putSafe(m, "settingUserId", str);
        Countries.putSafe(m, "settingName", str2);
        Countries.putSafe(m, "aliasType", aliasType);
        Countries.putSafe(m, "origin", confirmationSheetOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsViewConfirmSheet)) {
            return false;
        }
        NotificationsSettingsViewConfirmSheet notificationsSettingsViewConfirmSheet = (NotificationsSettingsViewConfirmSheet) obj;
        return Intrinsics.areEqual(this.settingUserId, notificationsSettingsViewConfirmSheet.settingUserId) && Intrinsics.areEqual(this.settingName, notificationsSettingsViewConfirmSheet.settingName) && this.aliasType == notificationsSettingsViewConfirmSheet.aliasType && this.origin == notificationsSettingsViewConfirmSheet.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings View ConfirmSheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.settingUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AliasType aliasType = this.aliasType;
        int hashCode3 = (hashCode2 + (aliasType == null ? 0 : aliasType.hashCode())) * 31;
        ConfirmationSheetOrigin confirmationSheetOrigin = this.origin;
        return hashCode3 + (confirmationSheetOrigin != null ? confirmationSheetOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationsSettingsViewConfirmSheet(settingUserId=", this.settingUserId, ", settingName=", this.settingName, ", aliasType=");
        m.append(this.aliasType);
        m.append(", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
