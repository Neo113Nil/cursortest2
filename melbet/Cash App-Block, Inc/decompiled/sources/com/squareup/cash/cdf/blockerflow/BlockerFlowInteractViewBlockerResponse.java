package com.squareup.cash.cdf.blockerflow;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
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
public final class BlockerFlowInteractViewBlockerResponse implements Event {
    public static final zza Companion = new zza(18);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final String blocker_id;
    public final String blocker_type;
    public final String client_scenario;
    public final String error_code;
    public final String error_message;
    public final String flow_token;
    public final String originating_flow_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final BlockerFlowReferrerType referrer_type;
    public final Integer request_duration_ms;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status LOGICAL_ERROR;
        public static final Status NETWORK_ERROR;
        public static final Status SUCCESS;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            Status status2 = new Status("NETWORK_ERROR", 1);
            NETWORK_ERROR = status2;
            Status status3 = new Status("LOGICAL_ERROR", 2);
            LOGICAL_ERROR = status3;
            $VALUES = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public BlockerFlowInteractViewBlockerResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Status status, String str8, BlockerFlowReferrerType blockerFlowReferrerType) {
        this.blocker_id = str;
        this.blocker_type = str2;
        this.client_scenario = str3;
        this.originating_flow_type = str4;
        this.error_code = str5;
        this.error_message = str6;
        this.flow_token = str7;
        this.request_duration_ms = num;
        this.status = status;
        this.referrer_flow_token = str8;
        this.referrer_type = blockerFlowReferrerType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 15, "BlockerFlow", "cdf_action", "Interact");
        Countries.putSafe(m, "blocker_id", str);
        Countries.putSafe(m, "blocker_type", str2);
        Countries.putSafe(m, "client_scenario", str3);
        Countries.putSafe(m, "originating_flow_type", str4);
        Countries.putSafe(m, "error_code", str5);
        Countries.putSafe(m, "error_message", str6);
        Countries.putSafe(m, "flow_token", str7);
        Countries.putSafe(m, "request_duration_ms", num);
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "referrer_flow_token", str8);
        Countries.putSafe(m, "referrer_type", blockerFlowReferrerType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockerFlowInteractViewBlockerResponse)) {
            return false;
        }
        BlockerFlowInteractViewBlockerResponse blockerFlowInteractViewBlockerResponse = (BlockerFlowInteractViewBlockerResponse) obj;
        return Intrinsics.areEqual(this.blocker_id, blockerFlowInteractViewBlockerResponse.blocker_id) && Intrinsics.areEqual(this.blocker_type, blockerFlowInteractViewBlockerResponse.blocker_type) && Intrinsics.areEqual(this.client_scenario, blockerFlowInteractViewBlockerResponse.client_scenario) && Intrinsics.areEqual(this.originating_flow_type, blockerFlowInteractViewBlockerResponse.originating_flow_type) && Intrinsics.areEqual(this.error_code, blockerFlowInteractViewBlockerResponse.error_code) && Intrinsics.areEqual(this.error_message, blockerFlowInteractViewBlockerResponse.error_message) && Intrinsics.areEqual(this.flow_token, blockerFlowInteractViewBlockerResponse.flow_token) && Intrinsics.areEqual(this.request_duration_ms, blockerFlowInteractViewBlockerResponse.request_duration_ms) && this.status == blockerFlowInteractViewBlockerResponse.status && Intrinsics.areEqual(this.referrer_flow_token, blockerFlowInteractViewBlockerResponse.referrer_flow_token) && this.referrer_type == blockerFlowInteractViewBlockerResponse.referrer_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BlockerFlow Interact ViewBlockerResponse";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blocker_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blocker_type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.client_scenario;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originating_flow_type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error_code;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.error_message;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.flow_token;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.request_duration_ms;
        int hashCode8 = (this.status.hashCode() + ((hashCode7 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str8 = this.referrer_flow_token;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BlockerFlowReferrerType blockerFlowReferrerType = this.referrer_type;
        return (hashCode9 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockerFlowInteractViewBlockerResponse(blocker_id=", this.blocker_id, ", blocker_type=", this.blocker_type, ", client_scenario=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.client_scenario, ", originating_flow_type=", this.originating_flow_type, ", error_code=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.error_code, ", error_message=", this.error_message, ", flow_token=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.flow_token, ", request_duration_ms=", this.request_duration_ms, ", status=");
        m.append(this.status);
        m.append(", referrer_flow_token=");
        m.append(this.referrer_flow_token);
        m.append(", referrer_type=");
        m.append(this.referrer_type);
        m.append(", journey_friction_signals=null, journey_frustration_signals=null)");
        return m.toString();
    }
}
