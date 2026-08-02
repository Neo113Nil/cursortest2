package com.squareup.cash.gps.db;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.compass.api.GpsConsentStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GpsConfig {
    public final GpsConsentStatus consent_status;
    public final long location_updated_at;
    public final Boolean precise_enabled;

    public GpsConfig(GpsConsentStatus gpsConsentStatus, Boolean bool, long j) {
        this.consent_status = gpsConsentStatus;
        this.precise_enabled = bool;
        this.location_updated_at = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsConfig)) {
            return false;
        }
        GpsConfig gpsConfig = (GpsConfig) obj;
        return this.consent_status == gpsConfig.consent_status && Intrinsics.areEqual(this.precise_enabled, gpsConfig.precise_enabled) && this.location_updated_at == gpsConfig.location_updated_at;
    }

    public final GpsConsentStatus getConsent_status() {
        return this.consent_status;
    }

    public final long getLocation_updated_at() {
        return this.location_updated_at;
    }

    public final Boolean getPrecise_enabled() {
        return this.precise_enabled;
    }

    public final int hashCode() {
        GpsConsentStatus gpsConsentStatus = this.consent_status;
        int hashCode = (gpsConsentStatus == null ? 0 : gpsConsentStatus.hashCode()) * 31;
        Boolean bool = this.precise_enabled;
        return Long.hashCode(this.location_updated_at) + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GpsConfig(consent_status=");
        sb.append(this.consent_status);
        sb.append(", precise_enabled=");
        sb.append(this.precise_enabled);
        sb.append(", location_updated_at=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.location_updated_at, ")", sb);
    }
}
