package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.fidesmo.sec.core.BuildConfig;
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
public final class CashTagProvisioningProvisionFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String app_id;
    public final String error_message;
    public final String error_name;
    public final ErrorSource error_source;
    public final String error_type;
    public final FailurePhase failure_phase;
    public final String fidesmo_error_message;
    public final String fidesmo_message_id;
    public final String flow_token;
    public final Boolean is_retryable;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Integer progress_at_failure;
    public final String service_id;
    public final Integer step_at_failure;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Long total_duration_ms;
    public final Integer total_steps;
    public final Boolean use_external_encryption;

    public CashTagProvisioningProvisionFailed(String str, FailurePhase failurePhase, ErrorSource errorSource, String str2, String str3, Integer num, Integer num2, Integer num3, Long l, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, String str10, Boolean bool2, String str11) {
        Boolean bool3 = Boolean.TRUE;
        this.flow_token = str;
        this.failure_phase = failurePhase;
        this.error_source = errorSource;
        this.error_type = str2;
        this.fidesmo_error_message = str3;
        this.progress_at_failure = num;
        this.step_at_failure = num2;
        this.total_steps = num3;
        this.total_duration_ms = l;
        this.error_name = str4;
        this.error_message = str5;
        this.app_id = str6;
        this.service_id = str7;
        this.use_external_encryption = bool;
        this.journey_token = str8;
        this.tag_cin = str9;
        this.fidesmo_message_id = str10;
        this.is_retryable = bool2;
        this.tag_theme_token = str11;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 29, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "failure_phase", failurePhase);
        Countries.putSafe(m, "error_source", errorSource);
        Countries.putSafe(m, "error_type", str2);
        Countries.putSafe(m, "fidesmo_error_message", str3);
        Countries.putSafe(m, "progress_at_failure", num);
        Countries.putSafe(m, "step_at_failure", num2);
        Countries.putSafe(m, "total_steps", num3);
        Countries.putSafe(m, "total_duration_ms", l);
        Countries.putSafe(m, "error_name", str4);
        Countries.putSafe(m, "error_message", str5);
        Countries.putSafe(m, "app_id", str6);
        Countries.putSafe(m, "service_id", str7);
        Countries.putSafe(m, "split_nfc_sessions", bool3);
        Countries.putSafe(m, "use_external_encryption", bool);
        Countries.putSafe(m, "fidesmo_sdk_version", BuildConfig.VERSION_NAME);
        Countries.putSafe(m, "journey_token", str8);
        Countries.putSafe(m, "tag_cin", str9);
        Countries.putSafe(m, "fidesmo_message_id", str10);
        Countries.putSafe(m, "is_retryable", bool2);
        Countries.putSafe(m, "tag_theme_token", str11);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionFailed)) {
            return false;
        }
        CashTagProvisioningProvisionFailed cashTagProvisioningProvisionFailed = (CashTagProvisioningProvisionFailed) obj;
        if (!Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionFailed.flow_token) || this.failure_phase != cashTagProvisioningProvisionFailed.failure_phase || this.error_source != cashTagProvisioningProvisionFailed.error_source || !Intrinsics.areEqual(this.error_type, cashTagProvisioningProvisionFailed.error_type) || !Intrinsics.areEqual(this.fidesmo_error_message, cashTagProvisioningProvisionFailed.fidesmo_error_message) || !Intrinsics.areEqual(this.progress_at_failure, cashTagProvisioningProvisionFailed.progress_at_failure) || !Intrinsics.areEqual(this.step_at_failure, cashTagProvisioningProvisionFailed.step_at_failure) || !Intrinsics.areEqual(this.total_steps, cashTagProvisioningProvisionFailed.total_steps) || !this.total_duration_ms.equals(cashTagProvisioningProvisionFailed.total_duration_ms) || !Intrinsics.areEqual(this.error_name, cashTagProvisioningProvisionFailed.error_name) || !Intrinsics.areEqual(this.error_message, cashTagProvisioningProvisionFailed.error_message) || !Intrinsics.areEqual(this.app_id, cashTagProvisioningProvisionFailed.app_id) || !Intrinsics.areEqual(this.service_id, cashTagProvisioningProvisionFailed.service_id)) {
            return false;
        }
        Object obj2 = Boolean.TRUE;
        return obj2.equals(obj2) && Intrinsics.areEqual(this.use_external_encryption, cashTagProvisioningProvisionFailed.use_external_encryption) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionFailed.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionFailed.tag_cin) && Intrinsics.areEqual(this.fidesmo_message_id, cashTagProvisioningProvisionFailed.fidesmo_message_id) && Intrinsics.areEqual(this.is_retryable, cashTagProvisioningProvisionFailed.is_retryable) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionFailed.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision Failed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FailurePhase failurePhase = this.failure_phase;
        int hashCode2 = (this.error_source.hashCode() + ((hashCode + (failurePhase == null ? 0 : failurePhase.hashCode())) * 31)) * 31;
        String str2 = this.error_type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fidesmo_error_message;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.progress_at_failure;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.step_at_failure;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total_steps;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.total_duration_ms, (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        String str4 = this.error_name;
        int hashCode7 = (m + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error_message;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 28629151;
        String str6 = this.app_id;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.service_id;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(Boolean.TRUE, (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        Boolean bool = this.use_external_encryption;
        int hashCode10 = (((m2 + (bool == null ? 0 : bool.hashCode())) * 31) + 48517560) * 31;
        String str8 = this.journey_token;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 961;
        String str9 = this.tag_cin;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fidesmo_message_id;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool2 = this.is_retryable;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 961;
        String str11 = this.tag_theme_token;
        return hashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("CashTagProvisioningProvisionFailed(flow_token=");
        sb.append(this.flow_token);
        sb.append(", failure_phase=");
        sb.append(this.failure_phase);
        sb.append(", error_source=");
        sb.append(this.error_source);
        sb.append(", error_type=");
        sb.append(this.error_type);
        sb.append(", fidesmo_error_message=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.fidesmo_error_message, ", progress_at_failure=", this.progress_at_failure, ", step_at_failure=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.step_at_failure, ", total_steps=", this.total_steps, ", total_duration_ms=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.total_duration_ms, ", error_name=", this.error_name, ", error_message=", sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.error_message, ", fidesmo_ref_id=null, fidesmo_error_code=null, is_fatal=null, delivery_data_flow=null, app_id=", this.app_id, ", service_id=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.service_id, ", split_nfc_sessions=", bool, ", use_external_encryption=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.use_external_encryption, ", fidesmo_sdk_version=3.0.1, journey_token=", this.journey_token, ", thermal_state=null, tag_cin=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.tag_cin, ", fidesmo_message_id=", this.fidesmo_message_id, ", is_retryable=");
        sb.append(this.is_retryable);
        sb.append(", http_status_code=null, tag_theme_token=");
        sb.append(this.tag_theme_token);
        sb.append(")");
        return sb.toString();
    }
}
