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

/* loaded from: classes6.dex */
public final class NotificationsSettingsToggleAlias implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType aliasType;
    public final String endState;
    public final LinkedHashMap parameters;
    public final String startState;

    public NotificationsSettingsToggleAlias(String str, String str2, AliasType aliasType) {
        this.startState = str;
        this.endState = str2;
        this.aliasType = aliasType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "NotificationsSettings", "cdf_action", "Toggle");
        Countries.putSafe(m, "startState", str);
        Countries.putSafe(m, "endState", str2);
        Countries.putSafe(m, "aliasType", aliasType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSettingsToggleAlias)) {
            return false;
        }
        NotificationsSettingsToggleAlias notificationsSettingsToggleAlias = (NotificationsSettingsToggleAlias) obj;
        return this.startState.equals(notificationsSettingsToggleAlias.startState) && this.endState.equals(notificationsSettingsToggleAlias.endState) && this.aliasType == notificationsSettingsToggleAlias.aliasType;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NotificationsSettings Toggle Alias";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.startState.hashCode() * 31, 31, this.endState);
        AliasType aliasType = this.aliasType;
        return m + (aliasType == null ? 0 : aliasType.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationsSettingsToggleAlias(startState=", this.startState, ", endState=", this.endState, ", aliasType=");
        m.append(this.aliasType);
        m.append(")");
        return m.toString();
    }
}
