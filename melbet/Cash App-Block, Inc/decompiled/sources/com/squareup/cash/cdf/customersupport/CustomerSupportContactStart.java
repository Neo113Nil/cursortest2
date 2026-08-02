package com.squareup.cash.cdf.customersupport;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CustomerSupportContactStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Channel channel;
    public final ChannelAvailability channel_availability;
    public final ChannelStatus channel_status;
    public final String flow_token;
    public final Boolean has_unread_messages;
    public final LinkedHashMap parameters;
    public final Trigger trigger;
    public final String trigger_entity_id;
    public final String trigger_node_token;
    public final String view_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ChannelAvailability {
        public static final /* synthetic */ ChannelAvailability[] $VALUES;
        public static final ChannelAvailability OFFLINE;
        public static final ChannelAvailability ONLINE;

        static {
            ChannelAvailability channelAvailability = new ChannelAvailability("ONLINE", 0);
            ONLINE = channelAvailability;
            ChannelAvailability channelAvailability2 = new ChannelAvailability("OFFLINE", 1);
            OFFLINE = channelAvailability2;
            $VALUES = new ChannelAvailability[]{channelAvailability, channelAvailability2};
        }

        public static ChannelAvailability valueOf(String str) {
            return (ChannelAvailability) Enum.valueOf(ChannelAvailability.class, str);
        }

        public static ChannelAvailability[] values() {
            return (ChannelAvailability[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ChannelStatus {
        public static final /* synthetic */ ChannelStatus[] $VALUES;
        public static final ChannelStatus CANCELED;
        public static final ChannelStatus COMPLETED;
        public static final ChannelStatus FAILED_TO_QUEUE;
        public static final ChannelStatus IDLE;
        public static final ChannelStatus IN_QUEUE;
        public static final ChannelStatus MISSED;

        static {
            ChannelStatus channelStatus = new ChannelStatus("IDLE", 0);
            IDLE = channelStatus;
            ChannelStatus channelStatus2 = new ChannelStatus("IN_QUEUE", 1);
            IN_QUEUE = channelStatus2;
            ChannelStatus channelStatus3 = new ChannelStatus("COMPLETED", 2);
            COMPLETED = channelStatus3;
            ChannelStatus channelStatus4 = new ChannelStatus("CANCELED", 3);
            CANCELED = channelStatus4;
            ChannelStatus channelStatus5 = new ChannelStatus("MISSED", 4);
            MISSED = channelStatus5;
            ChannelStatus channelStatus6 = new ChannelStatus("FAILED_TO_QUEUE", 5);
            FAILED_TO_QUEUE = channelStatus6;
            $VALUES = new ChannelStatus[]{channelStatus, channelStatus2, channelStatus3, channelStatus4, channelStatus5, channelStatus6};
        }

        public static ChannelStatus valueOf(String str) {
            return (ChannelStatus) Enum.valueOf(ChannelStatus.class, str);
        }

        public static ChannelStatus[] values() {
            return (ChannelStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME;
        public static final Trigger NODE;
        public static final Trigger SEARCH;

        static {
            Trigger trigger = new Trigger("HOME", 0);
            HOME = trigger;
            Trigger trigger2 = new Trigger("HOME_ASSISTANT", 1);
            Trigger trigger3 = new Trigger("NODE", 2);
            NODE = trigger3;
            Trigger trigger4 = new Trigger("NOTIFICATION", 3);
            Trigger trigger5 = new Trigger("SEARCH", 4);
            SEARCH = trigger5;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4, trigger5};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportContactStart(Channel channel, String str, Trigger trigger, String str2, String str3, String str4, ChannelAvailability channelAvailability, ChannelStatus channelStatus, Boolean bool, int i) {
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        channelAvailability = (i & 64) != 0 ? null : channelAvailability;
        channelStatus = (i & 128) != 0 ? null : channelStatus;
        bool = (i & 256) != 0 ? null : bool;
        this.channel = channel;
        this.flow_token = str;
        this.trigger = trigger;
        this.trigger_entity_id = str2;
        this.trigger_node_token = str3;
        this.view_token = str4;
        this.channel_availability = channelAvailability;
        this.channel_status = channelStatus;
        this.has_unread_messages = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "CustomerSupport", "cdf_action", "Contact");
        Countries.putSafe(m, AppsFlyerProperties.CHANNEL, channel);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "trigger_entity_id", str2);
        Countries.putSafe(m, "trigger_node_token", str3);
        Countries.putSafe(m, "view_token", str4);
        Countries.putSafe(m, "channel_availability", channelAvailability);
        Countries.putSafe(m, "channel_status", channelStatus);
        Countries.putSafe(m, "has_unread_messages", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportContactStart)) {
            return false;
        }
        CustomerSupportContactStart customerSupportContactStart = (CustomerSupportContactStart) obj;
        return this.channel == customerSupportContactStart.channel && Intrinsics.areEqual(this.flow_token, customerSupportContactStart.flow_token) && this.trigger == customerSupportContactStart.trigger && Intrinsics.areEqual(this.trigger_entity_id, customerSupportContactStart.trigger_entity_id) && Intrinsics.areEqual(this.trigger_node_token, customerSupportContactStart.trigger_node_token) && Intrinsics.areEqual(this.view_token, customerSupportContactStart.view_token) && this.channel_availability == customerSupportContactStart.channel_availability && this.channel_status == customerSupportContactStart.channel_status && Intrinsics.areEqual(this.has_unread_messages, customerSupportContactStart.has_unread_messages);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Contact Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (this.trigger.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.trigger_entity_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trigger_node_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.view_token;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ChannelAvailability channelAvailability = this.channel_availability;
        int hashCode6 = (hashCode5 + (channelAvailability == null ? 0 : channelAvailability.hashCode())) * 31;
        ChannelStatus channelStatus = this.channel_status;
        int hashCode7 = (hashCode6 + (channelStatus == null ? 0 : channelStatus.hashCode())) * 31;
        Boolean bool = this.has_unread_messages;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportContactStart(channel=");
        sb.append(this.channel);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", trigger=");
        sb.append(this.trigger);
        sb.append(", trigger_entity_id=");
        sb.append(this.trigger_entity_id);
        sb.append(", trigger_node_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.trigger_node_token, ", view_token=", this.view_token, ", channel_availability=");
        sb.append(this.channel_availability);
        sb.append(", channel_status=");
        sb.append(this.channel_status);
        sb.append(", has_unread_messages=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_unread_messages, ")");
    }
}
