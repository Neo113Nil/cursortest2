package com.squareup.cash.cdf.customersupport;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class CustomerSupportChatEnterBackground implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ChatBotStatus bot_status;
    public final String flow_token;
    public final Boolean has_unread_messages;
    public final Boolean is_typing_indicator_displayed;
    public final LinkedHashMap parameters;

    public CustomerSupportChatEnterBackground(String str, Boolean bool, Boolean bool2, ChatBotStatus chatBotStatus) {
        this.flow_token = str;
        this.has_unread_messages = bool;
        this.is_typing_indicator_displayed = bool2;
        this.bot_status = chatBotStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "has_unread_messages", bool);
        Countries.putSafe(m, "is_typing_indicator_displayed", bool2);
        Countries.putSafe(m, "bot_status", chatBotStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatEnterBackground)) {
            return false;
        }
        CustomerSupportChatEnterBackground customerSupportChatEnterBackground = (CustomerSupportChatEnterBackground) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportChatEnterBackground.flow_token) && this.has_unread_messages.equals(customerSupportChatEnterBackground.has_unread_messages) && this.is_typing_indicator_displayed.equals(customerSupportChatEnterBackground.is_typing_indicator_displayed) && this.bot_status == customerSupportChatEnterBackground.bot_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat EnterBackground";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_typing_indicator_displayed, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_unread_messages, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        ChatBotStatus chatBotStatus = this.bot_status;
        return m + (chatBotStatus != null ? chatBotStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.has_unread_messages, "CustomerSupportChatEnterBackground(flow_token=", this.flow_token, ", has_unread_messages=", ", is_typing_indicator_displayed=");
        m.append(this.is_typing_indicator_displayed);
        m.append(", bot_status=");
        m.append(this.bot_status);
        m.append(")");
        return m.toString();
    }
}
