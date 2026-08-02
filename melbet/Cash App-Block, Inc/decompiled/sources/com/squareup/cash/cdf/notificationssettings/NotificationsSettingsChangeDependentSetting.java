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
public final class NotificationsSettingsChangeDependentSetting implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependentUserId;
    public final String endState;
    public final LinkedHashMap parameters;
    public final String settingName;
    public final String settingUserId;
    public final String startState;

    public NotificationsSettingsChangeDependentSetting(String str, String str2, String str3, String str4, String str5) {
        this.settingUserId = str;
        this.settingName = str2;
        this.startState = str3;
        this.endState = str4;
        this.dependentUserId = str5;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "NotificationsSettings", "cdf_action", "Change");
        Countries.putSafe(m, "settingUserId", str);
        Countries.putSafe(m, "settingName", str2);
        Countries.putSafe(m, "startState", str3);
        Countries.putSafe(m, "endState", str4);
        Countries.putSafe(m, "dependentUserId", str5);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsChangeDependentSetting)) {
            return false;
        }
        NotificationsSettingsChangeDependentSetting notificationsSettingsChangeDependentSetting = (NotificationsSettingsChangeDependentSetting) obj;
        return Intrinsics.areEqual(this.settingUserId, notificationsSettingsChangeDependentSetting.settingUserId) && Intrinsics.areEqual(this.settingName, notificationsSettingsChangeDependentSetting.settingName) && this.startState.equals(notificationsSettingsChangeDependentSetting.startState) && this.endState.equals(notificationsSettingsChangeDependentSetting.endState) && Intrinsics.areEqual(this.dependentUserId, notificationsSettingsChangeDependentSetting.dependentUserId);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings Change DependentSetting";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.settingUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.settingName;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.startState), 31, this.endState);
        String str3 = this.dependentUserId;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationsSettingsChangeDependentSetting(settingUserId=", this.settingUserId, ", settingName=", this.settingName, ", startState=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.startState, ", endState=", this.endState, ", dependentUserId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.dependentUserId, ")");
    }
}
