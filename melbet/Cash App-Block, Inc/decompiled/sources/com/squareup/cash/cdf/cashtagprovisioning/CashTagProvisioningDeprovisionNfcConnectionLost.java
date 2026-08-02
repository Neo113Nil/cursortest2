package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CashTagProvisioningDeprovisionNfcConnectionLost implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String journey_token;
    public final LinkedHashMap parameters;
    public final Integer reconnection_attempt_number;
    public final Integer step_at_disconnect;
    public final String tag_cin;
    public final String tag_theme_token;
    public final Integer total_steps;

    public CashTagProvisioningDeprovisionNfcConnectionLost(String str, Integer num, Integer num2, Integer num3, String str2, String str3, String str4) {
        this.flow_token = str;
        this.step_at_disconnect = num;
        this.total_steps = num2;
        this.reconnection_attempt_number = num3;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 22, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "step_at_disconnect", num);
        Countries.putSafe(m, "total_steps", num2);
        Countries.putSafe(m, "reconnection_attempt_number", num3);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionNfcConnectionLost)) {
            return false;
        }
        CashTagProvisioningDeprovisionNfcConnectionLost cashTagProvisioningDeprovisionNfcConnectionLost = (CashTagProvisioningDeprovisionNfcConnectionLost) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionNfcConnectionLost.flow_token) && Intrinsics.areEqual(this.step_at_disconnect, cashTagProvisioningDeprovisionNfcConnectionLost.step_at_disconnect) && Intrinsics.areEqual(this.total_steps, cashTagProvisioningDeprovisionNfcConnectionLost.total_steps) && this.reconnection_attempt_number.equals(cashTagProvisioningDeprovisionNfcConnectionLost.reconnection_attempt_number) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionNfcConnectionLost.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionNfcConnectionLost.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionNfcConnectionLost.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision NfcConnectionLost";
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
        int m = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, -505558625, this.reconnection_attempt_number);
        String str2 = this.journey_token;
        int hashCode3 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag_cin;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_theme_token;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.step_at_disconnect, "CashTagProvisioningDeprovisionNfcConnectionLost(flow_token=", this.flow_token, ", step_at_disconnect=", ", total_steps=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.total_steps, ", reconnection_attempt_number=", this.reconnection_attempt_number, ", error_name=null, error_message=null, fidesmo_ref_id=null, fidesmo_error_code=null, is_fatal=null, delivery_data_flow=null, app_id=null, service_id=null, split_nfc_sessions=null, use_external_encryption=null, fidesmo_sdk_version=null, thermal_state=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", tag_cin=", this.tag_cin, ", nfc_session_duration_ms=null, tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
