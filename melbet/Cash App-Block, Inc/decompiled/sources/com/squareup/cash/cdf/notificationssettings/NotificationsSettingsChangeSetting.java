package com.squareup.cash.cdf.notificationssettings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class NotificationsSettingsChangeSetting implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType aliasType;
    public final String endState;
    public final LinkedHashMap parameters;
    public final String settingName;
    public final String settingUserId;
    public final String startState;

    public NotificationsSettingsChangeSetting(String str, String str2, String str3, String str4, AliasType aliasType) {
        this.settingUserId = str;
        this.settingName = str2;
        this.startState = str3;
        this.endState = str4;
        this.aliasType = aliasType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "NotificationsSettings", "cdf_action", "Change");
        Countries.putSafe(m, "settingUserId", str);
        Countries.putSafe(m, "settingName", str2);
        Countries.putSafe(m, "startState", str3);
        Countries.putSafe(m, "endState", str4);
        Countries.putSafe(m, "aliasType", aliasType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsChangeSetting)) {
            return false;
        }
        NotificationsSettingsChangeSetting notificationsSettingsChangeSetting = (NotificationsSettingsChangeSetting) obj;
        return Intrinsics.areEqual(this.settingUserId, notificationsSettingsChangeSetting.settingUserId) && Intrinsics.areEqual(this.settingName, notificationsSettingsChangeSetting.settingName) && Intrinsics.areEqual(this.startState, notificationsSettingsChangeSetting.startState) && Intrinsics.areEqual(this.endState, notificationsSettingsChangeSetting.endState) && this.aliasType == notificationsSettingsChangeSetting.aliasType;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings Change Setting";
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
        String str3 = this.startState;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endState;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AliasType aliasType = this.aliasType;
        return hashCode4 + (aliasType != null ? aliasType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationsSettingsChangeSetting(settingUserId=", this.settingUserId, ", settingName=", this.settingName, ", startState=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.startState, ", endState=", this.endState, ", aliasType=");
        m.append(this.aliasType);
        m.append(")");
        return m.toString();
    }
}
