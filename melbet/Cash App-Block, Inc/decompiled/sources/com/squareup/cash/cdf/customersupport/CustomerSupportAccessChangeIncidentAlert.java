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
public final class CustomerSupportAccessChangeIncidentAlert implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Action action;
    public final String flow_token;
    public final String incident_id;
    public final LinkedHashMap parameters;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Action {
        public static final /* synthetic */ Action[] $VALUES;
        public static final Action SUBSCRIBE;
        public static final Action UNSUBSCRIBE;

        static {
            Action action = new Action("SUBSCRIBE", 0);
            SUBSCRIBE = action;
            Action action2 = new Action("UNSUBSCRIBE", 1);
            UNSUBSCRIBE = action2;
            $VALUES = new Action[]{action, action2};
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

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

    public CustomerSupportAccessChangeIncidentAlert(Action action, String str, String str2, Status status) {
        this.action = action;
        this.flow_token = str;
        this.incident_id = str2;
        this.status = status;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerSupport", "cdf_action", "Access");
        Countries.putSafe(m, "action", action);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "incident_id", str2);
        Countries.putSafe(m, "status", status);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportAccessChangeIncidentAlert)) {
            return false;
        }
        CustomerSupportAccessChangeIncidentAlert customerSupportAccessChangeIncidentAlert = (CustomerSupportAccessChangeIncidentAlert) obj;
        return this.action == customerSupportAccessChangeIncidentAlert.action && Intrinsics.areEqual(this.flow_token, customerSupportAccessChangeIncidentAlert.flow_token) && Intrinsics.areEqual(this.incident_id, customerSupportAccessChangeIncidentAlert.incident_id) && this.status == customerSupportAccessChangeIncidentAlert.status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Access ChangeIncidentAlert";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.incident_id;
        return this.status.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CustomerSupportAccessChangeIncidentAlert(action=" + this.action + ", flow_token=" + this.flow_token + ", incident_id=" + this.incident_id + ", status=" + this.status + ")";
    }
}
