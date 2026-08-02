package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class CashTagProvisioningProvisionNfcConnectionLost implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Integer progress_percentage;
    public final Integer reconnection_attempt_number;
    public final Integer step_at_disconnect;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Integer total_steps;

    public CashTagProvisioningProvisionNfcConnectionLost(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, String str4) {
        this.flow_token = str;
        this.step_at_disconnect = num;
        this.total_steps = num2;
        this.progress_percentage = num3;
        this.reconnection_attempt_number = num4;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 23, "CashTagProvisioning", "cdf_action", "Provision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "step_at_disconnect", num);
        Countries.putSafe(m, "total_steps", num2);
        Countries.putSafe(m, "progress_percentage", num3);
        Countries.putSafe(m, "reconnection_attempt_number", num4);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningProvisionNfcConnectionLost)) {
            return false;
        }
        CashTagProvisioningProvisionNfcConnectionLost cashTagProvisioningProvisionNfcConnectionLost = (CashTagProvisioningProvisionNfcConnectionLost) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningProvisionNfcConnectionLost.flow_token) && Intrinsics.areEqual(this.step_at_disconnect, cashTagProvisioningProvisionNfcConnectionLost.step_at_disconnect) && Intrinsics.areEqual(this.total_steps, cashTagProvisioningProvisionNfcConnectionLost.total_steps) && Intrinsics.areEqual(this.progress_percentage, cashTagProvisioningProvisionNfcConnectionLost.progress_percentage) && this.reconnection_attempt_number.equals(cashTagProvisioningProvisionNfcConnectionLost.reconnection_attempt_number) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningProvisionNfcConnectionLost.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningProvisionNfcConnectionLost.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningProvisionNfcConnectionLost.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Provision NfcConnectionLost";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.step_at_disconnect;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.total_steps;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.progress_percentage;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31, -505558625, this.reconnection_attempt_number);
        String str2 = this.journey_token;
        int hashCode4 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_theme_token;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.step_at_disconnect, "CashTagProvisioningProvisionNfcConnectionLost(flow_token=", this.flow_token, ", step_at_disconnect=", ", total_steps=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.total_steps, ", progress_percentage=", this.progress_percentage, ", reconnection_attempt_number=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.reconnection_attempt_number, ", error_name=null, error_message=null, fidesmo_ref_id=null, fidesmo_error_code=null, is_fatal=null, delivery_data_flow=null, app_id=null, service_id=null, split_nfc_sessions=null, use_external_encryption=null, fidesmo_sdk_version=null, thermal_state=null, journey_token=", this.journey_token, ", tag_cin=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_cin, ", nfc_session_duration_ms=null, tag_theme_token=", this.tag_theme_token, ")");
    }
}
