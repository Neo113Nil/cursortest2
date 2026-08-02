package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class LocalClientEducationalSheetInteraction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String buyer_token;
    public final String flow_token;
    public final Long page_number;
    public final LinkedHashMap parameters;
    public final String primary_button_title;
    public final String sheet_token;
    public final String shortlink_flow_state;
    public final String shortlink_key;
    public final UserAction user_action;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UserAction {
        public static final /* synthetic */ UserAction[] $VALUES;
        public static final UserAction ClientRoute;
        public static final UserAction Dismiss;
        public static final UserAction Exit;
        public static final UserAction NextPage;
        public static final UserAction ShortLink;
        public static final UserAction SwipeUp;

        static {
            UserAction userAction = new UserAction("NextPage", 0);
            NextPage = userAction;
            UserAction userAction2 = new UserAction("Finish", 1);
            UserAction userAction3 = new UserAction("ClientRoute", 2);
            ClientRoute = userAction3;
            UserAction userAction4 = new UserAction("ShortLink", 3);
            ShortLink = userAction4;
            UserAction userAction5 = new UserAction("Exit", 4);
            Exit = userAction5;
            UserAction userAction6 = new UserAction("SwipeUp", 5);
            SwipeUp = userAction6;
            UserAction userAction7 = new UserAction("SwipeDown", 6);
            UserAction userAction8 = new UserAction("Dismiss", 7);
            Dismiss = userAction8;
            $VALUES = new UserAction[]{userAction, userAction2, userAction3, userAction4, userAction5, userAction6, userAction7, userAction8};
        }

        public static UserAction valueOf(String str) {
            return (UserAction) Enum.valueOf(UserAction.class, str);
        }

        public static UserAction[] values() {
            return (UserAction[]) $VALUES.clone();
        }
    }

    public LocalClientEducationalSheetInteraction(String str, String str2, Long l, UserAction userAction, String str3, String str4, String str5, String str6) {
        this.sheet_token = str;
        this.buyer_token = str2;
        this.page_number = l;
        this.user_action = userAction;
        this.primary_button_title = str3;
        this.flow_token = str4;
        this.shortlink_key = str5;
        this.shortlink_flow_state = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 10, "LocalClient", "cdf_action", "EducationalSheet");
        Countries.putSafe(m, "sheet_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "page_number", l);
        Countries.putSafe(m, BreadcrumbHelper.Category.USER_ACTION, userAction);
        Countries.putSafe(m, "primary_button_title", str3);
        Countries.putSafe(m, "flow_token", str4);
        Countries.putSafe(m, "shortlink_key", str5);
        Countries.putSafe(m, "shortlink_flow_state", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientEducationalSheetInteraction)) {
            return false;
        }
        LocalClientEducationalSheetInteraction localClientEducationalSheetInteraction = (LocalClientEducationalSheetInteraction) obj;
        return Intrinsics.areEqual(this.sheet_token, localClientEducationalSheetInteraction.sheet_token) && Intrinsics.areEqual(this.buyer_token, localClientEducationalSheetInteraction.buyer_token) && this.page_number.equals(localClientEducationalSheetInteraction.page_number) && this.user_action == localClientEducationalSheetInteraction.user_action && Intrinsics.areEqual(this.primary_button_title, localClientEducationalSheetInteraction.primary_button_title) && Intrinsics.areEqual(this.flow_token, localClientEducationalSheetInteraction.flow_token) && Intrinsics.areEqual(this.shortlink_key, localClientEducationalSheetInteraction.shortlink_key) && Intrinsics.areEqual(this.shortlink_flow_state, localClientEducationalSheetInteraction.shortlink_flow_state);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient EducationalSheet Interaction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.sheet_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buyer_token;
        int hashCode2 = (this.user_action.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.page_number, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31;
        String str3 = this.primary_button_title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.shortlink_key;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shortlink_flow_state;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientEducationalSheetInteraction(sheet_token=", this.sheet_token, ", buyer_token=", this.buyer_token, ", page_number=");
        m.append(this.page_number);
        m.append(", user_action=");
        m.append(this.user_action);
        m.append(", primary_button_title=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.primary_button_title, ", flow_token=", this.flow_token, ", shortlink_key=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.shortlink_key, ", shortlink_flow_state=", this.shortlink_flow_state, ")");
    }
}
