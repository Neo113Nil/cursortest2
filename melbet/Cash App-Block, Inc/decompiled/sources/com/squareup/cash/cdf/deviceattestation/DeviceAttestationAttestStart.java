package com.squareup.cash.cdf.deviceattestation;

import com.knotapi.knot.utilities.BreadcrumbHelper;
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
public final class DeviceAttestationAttestStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final PlayIntegrityAttestationType attestation_type;
    public final String device_id;
    public final EntryPoint entry_point;
    public final String nonce;
    public final LinkedHashMap parameters;
    public final String request_hash;
    public final String user_action;

    public DeviceAttestationAttestStart(String str, String str2, String str3, EntryPoint entryPoint, String str4, PlayIntegrityAttestationType playIntegrityAttestationType) {
        API api = API.PLAY_INTEGRITY;
        this.nonce = str;
        this.request_hash = str2;
        this.device_id = str3;
        this.entry_point = entryPoint;
        this.user_action = str4;
        this.attestation_type = playIntegrityAttestationType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "DeviceAttestation", "cdf_action", "Attest");
        Countries.putSafe(m, "nonce", str);
        Countries.putSafe(m, "request_hash", str2);
        Countries.putSafe(m, "device_id", str3);
        Countries.putSafe(m, "api", api);
        Countries.putSafe(m, "entry_point", entryPoint);
        Countries.putSafe(m, BreadcrumbHelper.Category.USER_ACTION, str4);
        Countries.putSafe(m, "attestation_type", playIntegrityAttestationType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceAttestationAttestStart)) {
            return false;
        }
        DeviceAttestationAttestStart deviceAttestationAttestStart = (DeviceAttestationAttestStart) obj;
        if (!Intrinsics.areEqual(this.nonce, deviceAttestationAttestStart.nonce) || !Intrinsics.areEqual(this.request_hash, deviceAttestationAttestStart.request_hash) || !Intrinsics.areEqual(this.device_id, deviceAttestationAttestStart.device_id)) {
            return false;
        }
        API api = API.PLAY_INTEGRITY;
        return this.entry_point == deviceAttestationAttestStart.entry_point && Intrinsics.areEqual(this.user_action, deviceAttestationAttestStart.user_action) && this.attestation_type == deviceAttestationAttestStart.attestation_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DeviceAttestation Attest Start";
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
        EntryPoint entryPoint = this.entry_point;
        int hashCode4 = (hashCode3 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        String str4 = this.user_action;
        return this.attestation_type.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        API api = API.PLAY_INTEGRITY;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceAttestationAttestStart(nonce=", this.nonce, ", request_hash=", this.request_hash, ", device_id=");
        m.append(this.device_id);
        m.append(", api=");
        m.append(api);
        m.append(", entry_point=");
        m.append(this.entry_point);
        m.append(", user_action=");
        m.append(this.user_action);
        m.append(", attestation_type=");
        m.append(this.attestation_type);
        m.append(")");
        return m.toString();
    }
}
