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
public final class CustomerSupportAccessViewContactOptions implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Option chat_option;
    public final Option email_option;
    public final String flow_token;
    public final String node_token;
    public final LinkedHashMap parameters;
    public final Option phone_option;
    public final Trigger trigger;
    public final String view_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class Option {
        public static final /* synthetic */ Option[] $VALUES;
        public static final Option NOT_SHOWN;
        public static final Option SHOWN;
        public static final Option SHOWN_DISABLED;

        static {
            Option option = new Option("SHOWN", 0);
            SHOWN = option;
            Option option2 = new Option("SHOWN_DISABLED", 1);
            SHOWN_DISABLED = option2;
            Option option3 = new Option("NOT_SHOWN", 2);
            NOT_SHOWN = option3;
            $VALUES = new Option[]{option, option2, option3};
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME;
        public static final Trigger NODE;
        public static final Trigger SEARCH;

        static {
            Trigger trigger = new Trigger("NODE", 0);
            NODE = trigger;
            Trigger trigger2 = new Trigger("HOME", 1);
            HOME = trigger2;
            Trigger trigger3 = new Trigger("SEARCH", 2);
            SEARCH = trigger3;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessViewContactOptions(String str, String str2, String str3, Trigger trigger, Option option, Option option2, Option option3) {
        this.flow_token = str;
        this.node_token = str2;
        this.view_token = str3;
        this.trigger = trigger;
        this.chat_option = option;
        this.phone_option = option2;
        this.email_option = option3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "node_token", str2);
        Countries.putSafe(m, "view_token", str3);
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "chat_option", option);
        Countries.putSafe(m, "phone_option", option2);
        Countries.putSafe(m, "email_option", option3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessViewContactOptions)) {
            return false;
        }
        CustomerSupportAccessViewContactOptions customerSupportAccessViewContactOptions = (CustomerSupportAccessViewContactOptions) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessViewContactOptions.flow_token) && Intrinsics.areEqual(this.node_token, customerSupportAccessViewContactOptions.node_token) && Intrinsics.areEqual(this.view_token, customerSupportAccessViewContactOptions.view_token) && this.trigger == customerSupportAccessViewContactOptions.trigger && this.chat_option == customerSupportAccessViewContactOptions.chat_option && this.phone_option == customerSupportAccessViewContactOptions.phone_option && this.email_option == customerSupportAccessViewContactOptions.email_option;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ViewContactOptions";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.node_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.view_token;
        int hashCode3 = (this.trigger.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Option option = this.chat_option;
        int hashCode4 = (hashCode3 + (option == null ? 0 : option.hashCode())) * 31;
        Option option2 = this.phone_option;
        int hashCode5 = (hashCode4 + (option2 == null ? 0 : option2.hashCode())) * 31;
        Option option3 = this.email_option;
        return hashCode5 + (option3 != null ? option3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessViewContactOptions(flow_token=", this.flow_token, ", node_token=", this.node_token, ", view_token=");
        m.append(this.view_token);
        m.append(", trigger=");
        m.append(this.trigger);
        m.append(", chat_option=");
        m.append(this.chat_option);
        m.append(", phone_option=");
        m.append(this.phone_option);
        m.append(", email_option=");
        m.append(this.email_option);
        m.append(")");
        return m.toString();
    }
}
