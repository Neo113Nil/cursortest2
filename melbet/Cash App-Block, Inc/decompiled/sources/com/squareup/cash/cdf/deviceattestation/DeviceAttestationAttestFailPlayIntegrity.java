package com.squareup.cash.cdf.deviceattestation;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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

/* loaded from: classes.dex */
public final class DeviceAttestationAttestFailPlayIntegrity implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final PlayIntegrityAttestationType attestation_type;
    public final String device_id;
    public final String error_type;
    public final Integer integrity_check_status_code;
    public final String nonce;
    public final LinkedHashMap parameters;
    public final Integer play_integrity_error_code;
    public final String request_hash;
    public final Long time_elapsed_ms;
    public final Integer total_retries;

    public DeviceAttestationAttestFailPlayIntegrity(String str, String str2, String str3, String str4, Integer num, Integer num2, Long l, Integer num3, PlayIntegrityAttestationType playIntegrityAttestationType) {
        API api = API.PLAY_INTEGRITY;
        this.nonce = str;
        this.request_hash = str2;
        this.device_id = str3;
        this.error_type = str4;
        this.integrity_check_status_code = num;
        this.play_integrity_error_code = num2;
        this.time_elapsed_ms = l;
        this.total_retries = num3;
        this.attestation_type = playIntegrityAttestationType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "DeviceAttestation", "cdf_action", "Attest");
        Countries.putSafe(m, "nonce", str);
        Countries.putSafe(m, "request_hash", str2);
        Countries.putSafe(m, "device_id", str3);
        Countries.putSafe(m, "api", api);
        Countries.putSafe(m, "error_type", str4);
        Countries.putSafe(m, "integrity_check_status_code", num);
        Countries.putSafe(m, "play_integrity_error_code", num2);
        Countries.putSafe(m, "time_elapsed_ms", l);
        Countries.putSafe(m, "total_retries", num3);
        Countries.putSafe(m, "attestation_type", playIntegrityAttestationType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceAttestationAttestFailPlayIntegrity)) {
            return false;
        }
        DeviceAttestationAttestFailPlayIntegrity deviceAttestationAttestFailPlayIntegrity = (DeviceAttestationAttestFailPlayIntegrity) obj;
        if (!Intrinsics.areEqual(this.nonce, deviceAttestationAttestFailPlayIntegrity.nonce) || !Intrinsics.areEqual(this.request_hash, deviceAttestationAttestFailPlayIntegrity.request_hash) || !Intrinsics.areEqual(this.device_id, deviceAttestationAttestFailPlayIntegrity.device_id)) {
            return false;
        }
        API api = API.PLAY_INTEGRITY;
        return this.error_type.equals(deviceAttestationAttestFailPlayIntegrity.error_type) && Intrinsics.areEqual(this.integrity_check_status_code, deviceAttestationAttestFailPlayIntegrity.integrity_check_status_code) && Intrinsics.areEqual(this.play_integrity_error_code, deviceAttestationAttestFailPlayIntegrity.play_integrity_error_code) && this.time_elapsed_ms.equals(deviceAttestationAttestFailPlayIntegrity.time_elapsed_ms) && this.total_retries.equals(deviceAttestationAttestFailPlayIntegrity.total_retries) && this.attestation_type == deviceAttestationAttestFailPlayIntegrity.attestation_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DeviceAttestation Attest FailPlayIntegrity";
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
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((API.PLAY_INTEGRITY.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 961, this.error_type);
        Integer num = this.integrity_check_status_code;
        int hashCode3 = (m + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.play_integrity_error_code;
        return this.attestation_type.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.time_elapsed_ms, (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31, this.total_retries);
    }

    public final String toString() {
        API api = API.PLAY_INTEGRITY;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceAttestationAttestFailPlayIntegrity(nonce=", this.nonce, ", request_hash=", this.request_hash, ", device_id=");
        m.append(this.device_id);
        m.append(", api=");
        m.append(api);
        m.append(", error_type=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.error_type, ", play_services_status_code=null, integrity_check_status_code=", this.integrity_check_status_code, ", play_integrity_error_code=");
        m.append(this.play_integrity_error_code);
        m.append(", time_elapsed_ms=");
        m.append(this.time_elapsed_ms);
        m.append(", total_retries=");
        m.append(this.total_retries);
        m.append(", attestation_type=");
        m.append(this.attestation_type);
        m.append(")");
        return m.toString();
    }
}
