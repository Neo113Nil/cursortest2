package com.squareup.cash.cdf.localclient;

import com.knotapi.knot.utilities.BreadcrumbHelper;
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
public final class LocalClientPOSOnboardingSheetInteraction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final String primary_button_title;
    public final String shortlink_flow_state;
    public final String shortlink_key;
    public final UserAction user_action;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UserAction {
        public static final /* synthetic */ UserAction[] $VALUES;
        public static final UserAction CompleteOnboardingShortlink;
        public static final UserAction Dismiss;
        public static final UserAction SwipeDown;
        public static final UserAction SwipeUp;

        static {
            UserAction userAction = new UserAction("CompleteOnboardingShortlink", 0);
            CompleteOnboardingShortlink = userAction;
            UserAction userAction2 = new UserAction("Dismiss", 1);
            Dismiss = userAction2;
            UserAction userAction3 = new UserAction("SwipeUp", 2);
            SwipeUp = userAction3;
            UserAction userAction4 = new UserAction("SwipeDown", 3);
            SwipeDown = userAction4;
            $VALUES = new UserAction[]{userAction, userAction2, userAction3, userAction4};
        }

        public static UserAction valueOf(String str) {
            return (UserAction) Enum.valueOf(UserAction.class, str);
        }

        public static UserAction[] values() {
            return (UserAction[]) $VALUES.clone();
        }
    }

    public LocalClientPOSOnboardingSheetInteraction(UserAction userAction, String str, String str2, String str3) {
        this.user_action = userAction;
        this.primary_button_title = str;
        this.shortlink_key = str2;
        this.shortlink_flow_state = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalClient", "cdf_action", "POSOnboardingSheet");
        Countries.putSafe(m, BreadcrumbHelper.Category.USER_ACTION, userAction);
        Countries.putSafe(m, "primary_button_title", str);
        Countries.putSafe(m, "shortlink_key", str2);
        Countries.putSafe(m, "shortlink_flow_state", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientPOSOnboardingSheetInteraction)) {
            return false;
        }
        LocalClientPOSOnboardingSheetInteraction localClientPOSOnboardingSheetInteraction = (LocalClientPOSOnboardingSheetInteraction) obj;
        return this.user_action == localClientPOSOnboardingSheetInteraction.user_action && Intrinsics.areEqual(this.primary_button_title, localClientPOSOnboardingSheetInteraction.primary_button_title) && Intrinsics.areEqual(this.shortlink_key, localClientPOSOnboardingSheetInteraction.shortlink_key) && Intrinsics.areEqual(this.shortlink_flow_state, localClientPOSOnboardingSheetInteraction.shortlink_flow_state);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient POSOnboardingSheet Interaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        UserAction userAction = this.user_action;
        int hashCode = (userAction == null ? 0 : userAction.hashCode()) * 31;
        String str = this.primary_button_title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shortlink_key;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shortlink_flow_state;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalClientPOSOnboardingSheetInteraction(user_action=");
        sb.append(this.user_action);
        sb.append(", primary_button_title=");
        sb.append(this.primary_button_title);
        sb.append(", shortlink_key=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.shortlink_key, ", shortlink_flow_state=", this.shortlink_flow_state, ")");
    }
}
