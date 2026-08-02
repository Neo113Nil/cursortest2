package com.squareup.cash.cdf.deviceattestation;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class DeviceAttestationAttestFailCashAPI implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final PlayIntegrityAttestationType attestation_type;
    public final CashAPI cash_api;
    public final String cash_error_type;
    public final String device_id;
    public final String nonce;
    public final LinkedHashMap parameters;
    public final String request_hash;
    public final Long time_elapsed_ms;
    public final Integer total_retries;

    public DeviceAttestationAttestFailCashAPI(String str, String str2, String str3, CashAPI cashAPI, String str4, Long l, Integer num, PlayIntegrityAttestationType playIntegrityAttestationType) {
        API api = API.PLAY_INTEGRITY;
        this.nonce = str;
        this.request_hash = str2;
        this.device_id = str3;
        this.cash_api = cashAPI;
        this.cash_error_type = str4;
        this.time_elapsed_ms = l;
        this.total_retries = num;
        this.attestation_type = playIntegrityAttestationType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "DeviceAttestation", "cdf_action", "Attest");
        Countries.putSafe(m, "nonce", str);
        Countries.putSafe(m, "request_hash", str2);
        Countries.putSafe(m, "device_id", str3);
        Countries.putSafe(m, "api", api);
        Countries.putSafe(m, "cash_api", cashAPI);
        Countries.putSafe(m, "cash_error_type", str4);
        Countries.putSafe(m, "time_elapsed_ms", l);
        Countries.putSafe(m, "total_retries", num);
        Countries.putSafe(m, "attestation_type", playIntegrityAttestationType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceAttestationAttestFailCashAPI)) {
            return false;
        }
        DeviceAttestationAttestFailCashAPI deviceAttestationAttestFailCashAPI = (DeviceAttestationAttestFailCashAPI) obj;
        if (!Intrinsics.areEqual(this.nonce, deviceAttestationAttestFailCashAPI.nonce) || !Intrinsics.areEqual(this.request_hash, deviceAttestationAttestFailCashAPI.request_hash) || !Intrinsics.areEqual(this.device_id, deviceAttestationAttestFailCashAPI.device_id)) {
            return false;
        }
        API api = API.PLAY_INTEGRITY;
        return this.cash_api == deviceAttestationAttestFailCashAPI.cash_api && this.cash_error_type.equals(deviceAttestationAttestFailCashAPI.cash_error_type) && this.time_elapsed_ms.equals(deviceAttestationAttestFailCashAPI.time_elapsed_ms) && this.total_retries.equals(deviceAttestationAttestFailCashAPI.total_retries) && this.attestation_type == deviceAttestationAttestFailCashAPI.attestation_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DeviceAttestation Attest FailCashAPI";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.nonce;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.request_hash;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device_id;
        int hashCode3 = (API.PLAY_INTEGRITY.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        CashAPI cashAPI = this.cash_api;
        return this.attestation_type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.time_elapsed_ms, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (cashAPI != null ? cashAPI.hashCode() : 0)) * 31, 29791, this.cash_error_type), 31), 31, this.total_retries);
    }

    public final String toString() {
        API api = API.PLAY_INTEGRITY;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceAttestationAttestFailCashAPI(nonce=", this.nonce, ", request_hash=", this.request_hash, ", device_id=");
        m.append(this.device_id);
        m.append(", api=");
        m.append(api);
        m.append(", cash_api=");
        m.append(this.cash_api);
        m.append(", cash_error_type=");
        m.append(this.cash_error_type);
        m.append(", attestation_api_rtt=null, cash_endpoint_rtt=null, time_elapsed_ms=");
        m.append(this.time_elapsed_ms);
        m.append(", total_retries=");
        m.append(this.total_retries);
        m.append(", attestation_type=");
        m.append(this.attestation_type);
        m.append(")");
        return m.toString();
    }
}
