package com.squareup.cash.cdf.customersupport;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzc;
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

/* loaded from: classes.dex */
public final class CustomerSupportAccessStart implements Event {
    public static final zzc Companion = new zzc(21);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean customer_is_denylisted;
    public final Destination destination;
    public final String exit_screen;
    public final String flow_token;
    public final String moneybot_route_id;
    public final String moneybot_session_id;
    public final LinkedHashMap parameters;
    public final Trigger trigger;
    public final String trigger_entity_id;
    public final String trigger_node_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Destination {
        public static final /* synthetic */ Destination[] $VALUES;
        public static final Destination CHAT;
        public static final Destination HOME;
        public static final Destination INCIDENT;
        public static final Destination NODE;
        public static final Destination PHONE_STATUS;
        public static final Destination PHONE_VERIFICATION;
        public static final Destination SURVEY;

        static {
            Destination destination = new Destination("CHAT", 0);
            CHAT = destination;
            Destination destination2 = new Destination("HOME", 1);
            HOME = destination2;
            Destination destination3 = new Destination("NODE", 2);
            NODE = destination3;
            Destination destination4 = new Destination("SURVEY", 3);
            SURVEY = destination4;
            Destination destination5 = new Destination("PHONE_STATUS", 4);
            PHONE_STATUS = destination5;
            Destination destination6 = new Destination("INCIDENT", 5);
            INCIDENT = destination6;
            Destination destination7 = new Destination("PHONE_VERIFICATION", 6);
            PHONE_VERIFICATION = destination7;
            $VALUES = new Destination[]{destination, destination2, destination3, destination4, destination5, destination6, destination7};
        }

        public static Destination valueOf(String str) {
            return (Destination) Enum.valueOf(Destination.class, str);
        }

        public static Destination[] values() {
            return (Destination[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger BLOCKER_FLOW;
        public static final Trigger CARD;
        public static final Trigger DEEP_LINK;
        public static final Trigger MONEY;
        public static final Trigger MONEYBOT;
        public static final Trigger NOTIFICATION;
        public static final Trigger OTHER;
        public static final Trigger PROFILE;
        public static final Trigger RECEIPT;

        static {
            Trigger trigger = new Trigger("CARD", 0);
            CARD = trigger;
            Trigger trigger2 = new Trigger("PROFILE", 1);
            PROFILE = trigger2;
            Trigger trigger3 = new Trigger("RECEIPT", 2);
            RECEIPT = trigger3;
            Trigger trigger4 = new Trigger("NOTIFICATION", 3);
            NOTIFICATION = trigger4;
            Trigger trigger5 = new Trigger("DEEP_LINK", 4);
            DEEP_LINK = trigger5;
            Trigger trigger6 = new Trigger("MONEYBOT", 5);
            MONEYBOT = trigger6;
            Trigger trigger7 = new Trigger("BLOCKER_FLOW", 6);
            BLOCKER_FLOW = trigger7;
            Trigger trigger8 = new Trigger("MONEY", 7);
            MONEY = trigger8;
            Trigger trigger9 = new Trigger("OTHER", 8);
            OTHER = trigger9;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4, trigger5, trigger6, trigger7, trigger8, trigger9};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessStart(Destination destination, String str, Trigger trigger, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this.destination = destination;
        this.flow_token = str;
        this.trigger = trigger;
        this.trigger_entity_id = str2;
        this.trigger_node_token = str3;
        this.exit_screen = str4;
        this.customer_is_denylisted = bool;
        this.moneybot_route_id = str5;
        this.moneybot_session_id = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "destination", destination);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "trigger_entity_id", str2);
        Countries.putSafe(m, "trigger_node_token", str3);
        Countries.putSafe(m, "exit_screen", str4);
        Countries.putSafe(m, "customer_is_denylisted", bool);
        Countries.putSafe(m, "moneybot_route_id", str5);
        Countries.putSafe(m, "moneybot_session_id", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessStart)) {
            return false;
        }
        CustomerSupportAccessStart customerSupportAccessStart = (CustomerSupportAccessStart) obj;
        return this.destination == customerSupportAccessStart.destination && Intrinsics.areEqual(this.flow_token, customerSupportAccessStart.flow_token) && this.trigger == customerSupportAccessStart.trigger && Intrinsics.areEqual(this.trigger_entity_id, customerSupportAccessStart.trigger_entity_id) && Intrinsics.areEqual(this.trigger_node_token, customerSupportAccessStart.trigger_node_token) && Intrinsics.areEqual(this.exit_screen, customerSupportAccessStart.exit_screen) && Intrinsics.areEqual(this.customer_is_denylisted, customerSupportAccessStart.customer_is_denylisted) && Intrinsics.areEqual(this.moneybot_route_id, customerSupportAccessStart.moneybot_route_id) && Intrinsics.areEqual(this.moneybot_session_id, customerSupportAccessStart.moneybot_session_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.destination.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (this.trigger.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.trigger_entity_id;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trigger_node_token;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.exit_screen;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.customer_is_denylisted;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.moneybot_route_id;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.moneybot_session_id;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportAccessStart(destination=");
        sb.append(this.destination);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", trigger=");
        sb.append(this.trigger);
        sb.append(", trigger_entity_id=");
        sb.append(this.trigger_entity_id);
        sb.append(", trigger_node_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.trigger_node_token, ", exit_screen=", this.exit_screen, ", customer_is_denylisted=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.customer_is_denylisted, ", moneybot_route_id=", this.moneybot_route_id, ", moneybot_session_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.moneybot_session_id, ")");
    }
}
