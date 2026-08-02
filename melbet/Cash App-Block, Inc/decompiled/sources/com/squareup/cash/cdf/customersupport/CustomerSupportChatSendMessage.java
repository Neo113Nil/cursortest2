package com.squareup.cash.cdf.customersupport;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class CustomerSupportChatSendMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BotStatus bot_status;
    public final String flow_token;
    public final Boolean has_suggested_replies;
    public final Boolean is_retry;
    public final Boolean is_typing_indicator_displayed;
    public final MessageType message_type;
    public final LinkedHashMap parameters;
    public final String selected_reply_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BotStatus {
        public static final /* synthetic */ BotStatus[] $VALUES;
        public static final BotStatus ACTIVE;
        public static final BotStatus HANDED_OVER;
        public static final BotStatus READY;

        static {
            BotStatus botStatus = new BotStatus("READY", 0);
            READY = botStatus;
            BotStatus botStatus2 = new BotStatus("ACTIVE", 1);
            ACTIVE = botStatus2;
            BotStatus botStatus3 = new BotStatus("HANDED_OVER", 2);
            HANDED_OVER = botStatus3;
            $VALUES = new BotStatus[]{botStatus, botStatus2, botStatus3};
        }

        public static BotStatus valueOf(String str) {
            return (BotStatus) Enum.valueOf(BotStatus.class, str);
        }

        public static BotStatus[] values() {
            return (BotStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MessageType {
        public static final /* synthetic */ MessageType[] $VALUES;
        public static final MessageType FILE;
        public static final MessageType IMAGE;
        public static final MessageType SUGGESTED_REPLY;
        public static final MessageType TEXT;
        public static final MessageType TRANSACTION;

        static {
            MessageType messageType = new MessageType("TEXT", 0);
            TEXT = messageType;
            MessageType messageType2 = new MessageType("SUGGESTED_REPLY", 1);
            SUGGESTED_REPLY = messageType2;
            MessageType messageType3 = new MessageType("IMAGE", 2);
            IMAGE = messageType3;
            MessageType messageType4 = new MessageType("TRANSACTION", 3);
            TRANSACTION = messageType4;
            MessageType messageType5 = new MessageType("FILE", 4);
            FILE = messageType5;
            $VALUES = new MessageType[]{messageType, messageType2, messageType3, messageType4, messageType5};
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }
    }

    public CustomerSupportChatSendMessage(String str, Boolean bool, Boolean bool2, MessageType messageType, BotStatus botStatus, Boolean bool3, String str2) {
        this.flow_token = str;
        this.has_suggested_replies = bool;
        this.is_retry = bool2;
        this.message_type = messageType;
        this.bot_status = botStatus;
        this.is_typing_indicator_displayed = bool3;
        this.selected_reply_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "has_suggested_replies", bool);
        Countries.putSafe(m, "is_retry", bool2);
        Countries.putSafe(m, "message_type", messageType);
        Countries.putSafe(m, "bot_status", botStatus);
        Countries.putSafe(m, "is_typing_indicator_displayed", bool3);
        Countries.putSafe(m, "selected_reply_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatSendMessage)) {
            return false;
        }
        CustomerSupportChatSendMessage customerSupportChatSendMessage = (CustomerSupportChatSendMessage) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportChatSendMessage.flow_token) && this.has_suggested_replies.equals(customerSupportChatSendMessage.has_suggested_replies) && this.is_retry.equals(customerSupportChatSendMessage.is_retry) && this.message_type == customerSupportChatSendMessage.message_type && this.bot_status == customerSupportChatSendMessage.bot_status && this.is_typing_indicator_displayed.equals(customerSupportChatSendMessage.is_typing_indicator_displayed) && Intrinsics.areEqual(this.selected_reply_token, customerSupportChatSendMessage.selected_reply_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat SendMessage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (this.message_type.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_retry, ViewEvent$State$EnumUnboxingLocalUtility.m(this.has_suggested_replies, (str == null ? 0 : str.hashCode()) * 31, 31), 31)) * 31;
        BotStatus botStatus = this.bot_status;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_typing_indicator_displayed, (hashCode + (botStatus == null ? 0 : botStatus.hashCode())) * 31, 31);
        String str2 = this.selected_reply_token;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.has_suggested_replies, "CustomerSupportChatSendMessage(flow_token=", this.flow_token, ", has_suggested_replies=", ", is_retry=");
        m.append(this.is_retry);
        m.append(", message_type=");
        m.append(this.message_type);
        m.append(", bot_status=");
        m.append(this.bot_status);
        m.append(", is_typing_indicator_displayed=");
        m.append(this.is_typing_indicator_displayed);
        m.append(", selected_reply_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.selected_reply_token, ")");
    }
}
