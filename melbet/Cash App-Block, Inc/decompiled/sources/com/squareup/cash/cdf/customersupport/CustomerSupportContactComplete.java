package com.squareup.cash.cdf.customersupport;

import com.appsflyer.AppsFlyerProperties;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class CustomerSupportContactComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final ChatBotStatus bot_status;
    public final Channel channel;
    public final String flow_token;
    public final Boolean has_unread_messages;
    public final Boolean is_typing_indicator_displayed;
    public final LinkedHashMap parameters;
    public final Boolean success;

    public CustomerSupportContactComplete(Channel channel, String str, Boolean bool, Boolean bool2, Boolean bool3, ChatBotStatus chatBotStatus) {
        this.channel = channel;
        this.flow_token = str;
        this.success = bool;
        this.has_unread_messages = bool2;
        this.is_typing_indicator_displayed = bool3;
        this.bot_status = chatBotStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "CustomerSupport", "cdf_action", "Contact");
        Countries.putSafe(m, AppsFlyerProperties.CHANNEL, channel);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "success", bool);
        Countries.putSafe(m, "has_unread_messages", bool2);
        Countries.putSafe(m, "is_typing_indicator_displayed", bool3);
        Countries.putSafe(m, "bot_status", chatBotStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportContactComplete)) {
            return false;
        }
        CustomerSupportContactComplete customerSupportContactComplete = (CustomerSupportContactComplete) obj;
        return this.channel == customerSupportContactComplete.channel && Intrinsics.areEqual(this.flow_token, customerSupportContactComplete.flow_token) && Intrinsics.areEqual(this.success, customerSupportContactComplete.success) && Intrinsics.areEqual(this.has_unread_messages, customerSupportContactComplete.has_unread_messages) && Intrinsics.areEqual(this.is_typing_indicator_displayed, customerSupportContactComplete.is_typing_indicator_displayed) && this.bot_status == customerSupportContactComplete.bot_status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Contact Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.success;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.has_unread_messages;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.is_typing_indicator_displayed;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ChatBotStatus chatBotStatus = this.bot_status;
        return hashCode5 + (chatBotStatus != null ? chatBotStatus.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportContactComplete(channel=");
        sb.append(this.channel);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", success=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.success, ", has_unread_messages=", this.has_unread_messages, ", is_typing_indicator_displayed=");
        sb.append(this.is_typing_indicator_displayed);
        sb.append(", bot_status=");
        sb.append(this.bot_status);
        sb.append(")");
        return sb.toString();
    }
}
