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
public final class CustomerSupportAccessOpenIncidentAlert implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String incident_id;
    public final LinkedHashMap parameters;
    public final Status status;
    public final Trigger trigger;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status IDENTIFIED;
        public static final Status INVESTIGATING;
        public static final Status RESOLVED;
        public static final Status UNKNOWN;

        static {
            Status status = new Status("INVESTIGATING", 0);
            INVESTIGATING = status;
            Status status2 = new Status("IDENTIFIED", 1);
            IDENTIFIED = status2;
            Status status3 = new Status("RESOLVED", 2);
            RESOLVED = status3;
            Status status4 = new Status("UNKNOWN", 3);
            UNKNOWN = status4;
            $VALUES = new Status[]{status, status2, status3, status4};
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
    /* loaded from: classes7.dex */
    public final class Trigger {
        public static final /* synthetic */ Trigger[] $VALUES;
        public static final Trigger HOME;
        public static final Trigger NODE;
        public static final Trigger NOTIFICATION;

        static {
            Trigger trigger = new Trigger("HOME", 0);
            HOME = trigger;
            Trigger trigger2 = new Trigger("NODE", 1);
            NODE = trigger2;
            Trigger trigger3 = new Trigger("NOTIFICATION", 2);
            NOTIFICATION = trigger3;
            $VALUES = new Trigger[]{trigger, trigger2, trigger3};
        }

        public static Trigger valueOf(String str) {
            return (Trigger) Enum.valueOf(Trigger.class, str);
        }

        public static Trigger[] values() {
            return (Trigger[]) $VALUES.clone();
        }
    }

    public CustomerSupportAccessOpenIncidentAlert(String str, String str2, Status status, Trigger trigger) {
        this.flow_token = str;
        this.incident_id = str2;
        this.status = status;
        this.trigger = trigger;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "incident_id", str2);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "trigger", trigger);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessOpenIncidentAlert)) {
            return false;
        }
        CustomerSupportAccessOpenIncidentAlert customerSupportAccessOpenIncidentAlert = (CustomerSupportAccessOpenIncidentAlert) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportAccessOpenIncidentAlert.flow_token) && Intrinsics.areEqual(this.incident_id, customerSupportAccessOpenIncidentAlert.incident_id) && this.status == customerSupportAccessOpenIncidentAlert.status && this.trigger == customerSupportAccessOpenIncidentAlert.trigger;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access OpenIncidentAlert";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.incident_id;
        int hashCode2 = (this.status.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 29791)) * 31;
        Trigger trigger = this.trigger;
        return hashCode2 + (trigger != null ? trigger.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportAccessOpenIncidentAlert(action=null, flow_token=", this.flow_token, ", incident_id=", this.incident_id, ", number_of_incidents=null, position=null, status=");
        m.append(this.status);
        m.append(", trigger=");
        m.append(this.trigger);
        m.append(")");
        return m.toString();
    }
}
