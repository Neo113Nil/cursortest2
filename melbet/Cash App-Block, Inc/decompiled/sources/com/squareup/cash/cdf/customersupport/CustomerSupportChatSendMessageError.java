package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatSendMessageError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ErrorType error_type;
    public final String flow_token;
    public final MessageType message_type;
    public final LinkedHashMap parameters;
    public final Integer status_code;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType CLIENT;
        public static final ErrorType NETWORK;
        public static final ErrorType SERVER;

        static {
            ErrorType errorType = new ErrorType("CLIENT", 0);
            CLIENT = errorType;
            ErrorType errorType2 = new ErrorType("NETWORK", 1);
            NETWORK = errorType2;
            ErrorType errorType3 = new ErrorType("SERVER", 2);
            SERVER = errorType3;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
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

    public CustomerSupportChatSendMessageError(MessageType messageType, ErrorType errorType, Integer num, String str) {
        this.message_type = messageType;
        this.error_type = errorType;
        this.status_code = num;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "message_type", messageType);
        Countries.putSafe(m, "error_type", errorType);
        Countries.putSafe(m, "status_code", num);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatSendMessageError)) {
            return false;
        }
        CustomerSupportChatSendMessageError customerSupportChatSendMessageError = (CustomerSupportChatSendMessageError) obj;
        return this.message_type == customerSupportChatSendMessageError.message_type && this.error_type == customerSupportChatSendMessageError.error_type && Intrinsics.areEqual(this.status_code, customerSupportChatSendMessageError.status_code) && Intrinsics.areEqual(this.flow_token, customerSupportChatSendMessageError.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat SendMessageError";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.error_type.hashCode() + (this.message_type.hashCode() * 31)) * 31;
        Integer num = this.status_code;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.flow_token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CustomerSupportChatSendMessageError(message_type=" + this.message_type + ", error_type=" + this.error_type + ", status_code=" + this.status_code + ", flow_token=" + this.flow_token + ")";
    }
}
