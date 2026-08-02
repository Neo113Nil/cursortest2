package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatReceivedSuggestedReplies implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer count;
    public final String flow_token;
    public final String message_token;
    public final LinkedHashMap parameters;
    public final ChatMessageSender sender;
    public final String suggested_reply_tokens;

    public CustomerSupportChatReceivedSuggestedReplies(Integer num, String str, String str2, String str3, ChatMessageSender chatMessageSender) {
        this.count = num;
        this.flow_token = str;
        this.message_token = str2;
        this.suggested_reply_tokens = str3;
        this.sender = chatMessageSender;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "count", num);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "suggested_reply_tokens", str3);
        Countries.putSafe(m, "sender", chatMessageSender);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatReceivedSuggestedReplies)) {
            return false;
        }
        CustomerSupportChatReceivedSuggestedReplies customerSupportChatReceivedSuggestedReplies = (CustomerSupportChatReceivedSuggestedReplies) obj;
        return this.count.equals(customerSupportChatReceivedSuggestedReplies.count) && Intrinsics.areEqual(this.flow_token, customerSupportChatReceivedSuggestedReplies.flow_token) && Intrinsics.areEqual(this.message_token, customerSupportChatReceivedSuggestedReplies.message_token) && this.suggested_reply_tokens.equals(customerSupportChatReceivedSuggestedReplies.suggested_reply_tokens) && this.sender == customerSupportChatReceivedSuggestedReplies.sender;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat ReceivedSuggestedReplies";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.count.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.suggested_reply_tokens);
        ChatMessageSender chatMessageSender = this.sender;
        return m + (chatMessageSender != null ? chatMessageSender.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportChatReceivedSuggestedReplies(count=");
        sb.append(this.count);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", message_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.message_token, ", suggested_reply_tokens=", this.suggested_reply_tokens, ", sender=");
        sb.append(this.sender);
        sb.append(")");
        return sb.toString();
    }
}
