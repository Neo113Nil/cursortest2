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
public final class CustomerSupportPhoneViewStatus implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Status status;
    public final Trigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status CANCELED;
        public static final Status COMPLETED;
        public static final Status ERROR;
        public static final Status FAILED_TO_QUEUE;
        public static final Status IN_QUEUE;
        public static final Status MISSED;

        static {
            Status status = new Status("IN_QUEUE", 0);
            IN_QUEUE = status;
            Status status2 = new Status("MISSED", 1);
            MISSED = status2;
            Status status3 = new Status("CANCELED", 2);
            CANCELED = status3;
            Status status4 = new Status("COMPLETED", 3);
            COMPLETED = status4;
            Status status5 = new Status("ERROR", 4);
            ERROR = status5;
            Status status6 = new Status("FAILED_TO_QUEUE", 5);
            FAILED_TO_QUEUE = status6;
            $VALUES = new Status[]{status, status2, status3, status4, status5, status6};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME_CONTACT_BUTTON;
        public static final Trigger HOME_NOTIFICATION_CARD;
        public static final Trigger NODE_CONTACT_BUTTON;
        public static final Trigger NOTIFICATION;
        public static final Trigger REQUEST_CALL_FLOW;
        public static final Trigger SEARCH_CONTACT_BUTTON;

        static {
            Trigger trigger = new Trigger("HOME_CONTACT_BUTTON", 0);
            HOME_CONTACT_BUTTON = trigger;
            Trigger trigger2 = new Trigger("HOME_NOTIFICATION_CARD", 1);
            HOME_NOTIFICATION_CARD = trigger2;
            Trigger trigger3 = new Trigger("NODE_CONTACT_BUTTON", 2);
            NODE_CONTACT_BUTTON = trigger3;
            Trigger trigger4 = new Trigger("NOTIFICATION", 3);
            NOTIFICATION = trigger4;
            Trigger trigger5 = new Trigger("REQUEST_CALL_FLOW", 4);
            REQUEST_CALL_FLOW = trigger5;
            Trigger trigger6 = new Trigger("SEARCH_CONTACT_BUTTON", 5);
            SEARCH_CONTACT_BUTTON = trigger6;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3, trigger4, trigger5, trigger6};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportPhoneViewStatus(Trigger trigger, Status status, String str) {
        this.trigger = trigger;
        this.status = status;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Phone");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportPhoneViewStatus)) {
            return false;
        }
        CustomerSupportPhoneViewStatus customerSupportPhoneViewStatus = (CustomerSupportPhoneViewStatus) obj;
        return this.trigger == customerSupportPhoneViewStatus.trigger && this.status == customerSupportPhoneViewStatus.status && Intrinsics.areEqual(this.flow_token, customerSupportPhoneViewStatus.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Phone ViewStatus";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Trigger trigger = this.trigger;
        int hashCode = (trigger == null ? 0 : trigger.hashCode()) * 31;
        Status status = this.status;
        int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
        String str = this.flow_token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerSupportPhoneViewStatus(trigger=");
        sb.append(this.trigger);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
