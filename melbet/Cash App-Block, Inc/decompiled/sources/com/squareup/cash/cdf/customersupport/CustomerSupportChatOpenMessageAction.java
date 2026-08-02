package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatOpenMessageAction implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_details;
    public final ActionType action_type;
    public final String flow_token;
    public final String message_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActionType {
        public static final /* synthetic */ ActionType[] $VALUES;
        public static final ActionType LINK;
        public static final ActionType SELECT_TRANSACTION;

        static {
            ActionType actionType = new ActionType("LINK", 0);
            LINK = actionType;
            ActionType actionType2 = new ActionType("SELECT_TRANSACTION", 1);
            SELECT_TRANSACTION = actionType2;
            $VALUES = new ActionType[]{actionType, actionType2};
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public CustomerSupportChatOpenMessageAction(String str, ActionType actionType, String str2, String str3) {
        this.action_details = str;
        this.action_type = actionType;
        this.message_token = str2;
        this.flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "action_details", str);
        Countries.putSafe(m, "action_type", actionType);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatOpenMessageAction)) {
            return false;
        }
        CustomerSupportChatOpenMessageAction customerSupportChatOpenMessageAction = (CustomerSupportChatOpenMessageAction) obj;
        return Intrinsics.areEqual(this.action_details, customerSupportChatOpenMessageAction.action_details) && this.action_type == customerSupportChatOpenMessageAction.action_type && this.message_token.equals(customerSupportChatOpenMessageAction.message_token) && Intrinsics.areEqual(this.flow_token, customerSupportChatOpenMessageAction.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat OpenMessageAction";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.action_details;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.action_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.message_token);
        String str2 = this.flow_token;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportChatOpenMessageAction(action_details=");
        sb.append(this.action_details);
        sb.append(", action_type=");
        sb.append(this.action_type);
        sb.append(", message_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.message_token, ", flow_token=", this.flow_token, ")");
    }
}
