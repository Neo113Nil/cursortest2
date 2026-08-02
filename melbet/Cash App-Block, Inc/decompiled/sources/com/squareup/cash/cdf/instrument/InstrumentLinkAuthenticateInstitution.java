package com.squareup.cash.cdf.instrument;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zza;
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
public final class InstrumentLinkAuthenticateInstitution implements Event {
    public static final zza Companion = new zza(22);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final String failure_reason;
    public final String flow_token;
    public final FlowType flow_type;
    public final String institution_id;
    public final String institution_name;
    public final String link_event_name;
    public final Boolean network_error;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final Integer response_code;
    public final String source;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class FlowType {
        public static final /* synthetic */ FlowType[] $VALUES;
        public static final FlowType PLAID_AUTH;
        public static final FlowType PLAID_RELINK;
        public static final FlowType STRIPE_AUTH;

        static {
            FlowType flowType = new FlowType("PLAID_AUTH", 0);
            PLAID_AUTH = flowType;
            FlowType flowType2 = new FlowType("PLAID_RELINK", 1);
            PLAID_RELINK = flowType2;
            FlowType flowType3 = new FlowType("STRIPE_AUTH", 2);
            STRIPE_AUTH = flowType3;
            $VALUES = new FlowType[]{flowType, flowType2, flowType3, new FlowType("STRIPE_RELINK", 3)};
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status APPLY;
        public static final Status CANCEL;
        public static final Status CONCURRENT_MODIFICATION;
        public static final Status ERROR;
        public static final Status FAILURE;
        public static final Status MANUAL_LINK;
        public static final Status RECEIVE_LINK_RESULT;
        public static final Status RESOLVED;
        public static final Status SEARCH;
        public static final Status SKIP;
        public static final Status START;
        public static final Status TOO_MANY_ATTEMPTS;

        static {
            Status status = new Status("APPLY", 0);
            APPLY = status;
            Status status2 = new Status("CANCEL", 1);
            CANCEL = status2;
            Status status3 = new Status("CONCURRENT_MODIFICATION", 2);
            CONCURRENT_MODIFICATION = status3;
            Status status4 = new Status("ERROR", 3);
            ERROR = status4;
            Status status5 = new Status("FAILURE", 4);
            FAILURE = status5;
            Status status6 = new Status("RESOLVED", 5);
            RESOLVED = status6;
            Status status7 = new Status("SEARCH", 6);
            SEARCH = status7;
            Status status8 = new Status("SKIP", 7);
            SKIP = status8;
            Status status9 = new Status("START", 8);
            START = status9;
            Status status10 = new Status("TOO_MANY_ATTEMPTS", 9);
            TOO_MANY_ATTEMPTS = status10;
            Status status11 = new Status("MANUAL_LINK", 10);
            MANUAL_LINK = status11;
            Status status12 = new Status("RECEIVE_LINK_RESULT", 11);
            RECEIVE_LINK_RESULT = status12;
            $VALUES = new Status[]{status, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public InstrumentLinkAuthenticateInstitution(String str, String str2, String str3, FlowType flowType, String str4, String str5, String str6, Boolean bool, String str7, Integer num, String str8, Status status) {
        this.client_scenario = str;
        this.failure_reason = str2;
        this.flow_token = str3;
        this.flow_type = flowType;
        this.institution_id = str4;
        this.institution_name = str5;
        this.link_event_name = str6;
        this.network_error = bool;
        this.rate_plan = str7;
        this.response_code = num;
        this.source = str8;
        this.status = status;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 14, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "failure_reason", str2);
        Countries.putSafe(m, "flow_token", str3);
        Countries.putSafe(m, "flow_type", flowType);
        Countries.putSafe(m, "institution_id", str4);
        Countries.putSafe(m, "institution_name", str5);
        Countries.putSafe(m, "link_event_name", str6);
        Countries.putSafe(m, "network_error", bool);
        Countries.putSafe(m, "rate_plan", str7);
        Countries.putSafe(m, "response_code", num);
        Countries.putSafe(m, "source", str8);
        Countries.putSafe(m, "status", status);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkAuthenticateInstitution)) {
            return false;
        }
        InstrumentLinkAuthenticateInstitution instrumentLinkAuthenticateInstitution = (InstrumentLinkAuthenticateInstitution) obj;
        return Intrinsics.areEqual(this.client_scenario, instrumentLinkAuthenticateInstitution.client_scenario) && Intrinsics.areEqual(this.failure_reason, instrumentLinkAuthenticateInstitution.failure_reason) && Intrinsics.areEqual(this.flow_token, instrumentLinkAuthenticateInstitution.flow_token) && this.flow_type == instrumentLinkAuthenticateInstitution.flow_type && Intrinsics.areEqual(this.institution_id, instrumentLinkAuthenticateInstitution.institution_id) && Intrinsics.areEqual(this.institution_name, instrumentLinkAuthenticateInstitution.institution_name) && Intrinsics.areEqual(this.link_event_name, instrumentLinkAuthenticateInstitution.link_event_name) && Intrinsics.areEqual(this.network_error, instrumentLinkAuthenticateInstitution.network_error) && Intrinsics.areEqual(this.rate_plan, instrumentLinkAuthenticateInstitution.rate_plan) && Intrinsics.areEqual(this.response_code, instrumentLinkAuthenticateInstitution.response_code) && Intrinsics.areEqual(this.source, instrumentLinkAuthenticateInstitution.source) && this.status == instrumentLinkAuthenticateInstitution.status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link AuthenticateInstitution";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.failure_reason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flow_token;
        int hashCode3 = (this.flow_type.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.institution_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.institution_name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.link_event_name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.network_error;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.rate_plan;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.response_code;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.source;
        return this.status.hashCode() + ((hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentLinkAuthenticateInstitution(client_scenario=", this.client_scenario, ", failure_reason=", this.failure_reason, ", flow_token=");
        m.append(this.flow_token);
        m.append(", flow_type=");
        m.append(this.flow_type);
        m.append(", institution_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.institution_id, ", institution_name=", this.institution_name, ", link_event_name=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.link_event_name, ", network_error=", this.network_error, ", rate_plan=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.rate_plan, ", response_code=", this.response_code, ", source=");
        m.append(this.source);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }
}
