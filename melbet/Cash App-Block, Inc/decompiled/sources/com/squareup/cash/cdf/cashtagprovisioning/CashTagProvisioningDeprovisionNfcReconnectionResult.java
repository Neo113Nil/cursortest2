package com.squareup.cash.cdf.cashtagprovisioning;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class CashTagProvisioningDeprovisionNfcReconnectionResult implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long duration_ms;
    public final String flow_token;
    public final String journey_token;
    public final NfcReconnectionOutcome outcome;
    public final LinkedHashMap parameters;
    public final Integer reconnection_attempt_number;
    public final String tag_cin;
    public final String tag_theme_token;

    public CashTagProvisioningDeprovisionNfcReconnectionResult(String str, Integer num, NfcReconnectionOutcome nfcReconnectionOutcome, Long l, String str2, String str3, String str4) {
        this.flow_token = str;
        this.reconnection_attempt_number = num;
        this.outcome = nfcReconnectionOutcome;
        this.duration_ms = l;
        this.journey_token = str2;
        this.tag_cin = str3;
        this.tag_theme_token = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 23, "CashTagProvisioning", "cdf_action", "Deprovision");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "reconnection_attempt_number", num);
        Countries.putSafe(m, "outcome", nfcReconnectionOutcome);
        Countries.putSafe(m, "duration_ms", l);
        Countries.putSafe(m, "journey_token", str2);
        Countries.putSafe(m, "tag_cin", str3);
        Countries.putSafe(m, "tag_theme_token", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTagProvisioningDeprovisionNfcReconnectionResult)) {
            return false;
        }
        CashTagProvisioningDeprovisionNfcReconnectionResult cashTagProvisioningDeprovisionNfcReconnectionResult = (CashTagProvisioningDeprovisionNfcReconnectionResult) obj;
        return Intrinsics.areEqual(this.flow_token, cashTagProvisioningDeprovisionNfcReconnectionResult.flow_token) && this.reconnection_attempt_number.equals(cashTagProvisioningDeprovisionNfcReconnectionResult.reconnection_attempt_number) && this.outcome == cashTagProvisioningDeprovisionNfcReconnectionResult.outcome && this.duration_ms.equals(cashTagProvisioningDeprovisionNfcReconnectionResult.duration_ms) && Intrinsics.areEqual(this.journey_token, cashTagProvisioningDeprovisionNfcReconnectionResult.journey_token) && Intrinsics.areEqual(this.tag_cin, cashTagProvisioningDeprovisionNfcReconnectionResult.tag_cin) && Intrinsics.areEqual(this.tag_theme_token, cashTagProvisioningDeprovisionNfcReconnectionResult.tag_theme_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashTagProvisioning Deprovision NfcReconnectionResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.duration_ms, (this.outcome.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((str == null ? 0 : str.hashCode()) * 31, 31, this.reconnection_attempt_number)) * 31, -505558625);
        String str2 = this.journey_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.tag_cin;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.tag_theme_token;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.reconnection_attempt_number, "CashTagProvisioningDeprovisionNfcReconnectionResult(flow_token=", this.flow_token, ", reconnection_attempt_number=", ", outcome=");
        m.append(this.outcome);
        m.append(", duration_ms=");
        m.append(this.duration_ms);
        m.append(", error_name=null, error_message=null, fidesmo_ref_id=null, fidesmo_error_code=null, is_fatal=null, delivery_data_flow=null, app_id=null, service_id=null, split_nfc_sessions=null, use_external_encryption=null, fidesmo_sdk_version=null, thermal_state=null, journey_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.journey_token, ", reconnection_mechanism=null, tag_cin=", this.tag_cin, ", reconnection_cooldown_ms=null, tag_theme_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.tag_theme_token, ")");
    }
}
