package com.squareup.cash.gps.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Location {
    public final float accuracy;
    public final Double altitude;
    public final Float altitudeAccuracy;
    public final Float bearing;
    public final Float bearingAccuracy;
    public final Long gpsTime;
    public final Long gpsTimeSinceBoot;
    public final Boolean isMock;
    public final double latitude;
    public final double longitude;
    public final Float speed;
    public final Float speedAccuracy;

    public Location(double d, double d2, float f, Double d3, Float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, Long l, Long l2) {
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
        this.altitude = d3;
        this.altitudeAccuracy = f2;
        this.speed = f3;
        this.speedAccuracy = f4;
        this.bearing = f5;
        this.bearingAccuracy = f6;
        this.isMock = bool;
        this.gpsTime = l;
        this.gpsTimeSinceBoot = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Double.compare(this.latitude, location.latitude) == 0 && Double.compare(this.longitude, location.longitude) == 0 && Float.compare(this.accuracy, location.accuracy) == 0 && this.altitude.equals(location.altitude) && Intrinsics.areEqual((Object) this.altitudeAccuracy, (Object) location.altitudeAccuracy) && this.speed.equals(location.speed) && this.speedAccuracy.equals(location.speedAccuracy) && this.bearing.equals(location.bearing) && this.bearingAccuracy.equals(location.bearingAccuracy) && this.isMock.equals(location.isMock) && this.gpsTime.equals(location.gpsTime) && Intrinsics.areEqual(this.gpsTimeSinceBoot, location.gpsTimeSinceBoot);
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    public final Double getAltitude() {
        return this.altitude;
    }

    public final Float getAltitudeAccuracy() {
        return this.altitudeAccuracy;
    }

    public final Float getBearing() {
        return this.bearing;
    }

    public final Float getBearingAccuracy() {
        return this.bearingAccuracy;
    }

    public final Long getGpsTime() {
        return this.gpsTime;
    }

    public final Long getGpsTimeSinceBoot() {
        return this.gpsTimeSinceBoot;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final Float getSpeedAccuracy() {
        return this.speedAccuracy;
    }

    public final int hashCode() {
        int hashCode = (this.altitude.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.accuracy, Fragment$5$$ExternalSyntheticOutline0.m(this.longitude, Double.hashCode(this.latitude) * 31, 31), 31)) * 31;
        Float f = this.altitudeAccuracy;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.gpsTime, ViewEvent$State$EnumUnboxingLocalUtility.m(this.isMock, (this.bearingAccuracy.hashCode() + ((this.bearing.hashCode() + ((this.speedAccuracy.hashCode() + ((this.speed.hashCode() + ((hashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        Long l = this.gpsTimeSinceBoot;
        return m + (l != null ? l.hashCode() : 0);
    }

    public final Boolean isMock() {
        return this.isMock;
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Location(latitude=", ", longitude=", this.latitude);
        m.append(this.longitude);
        m.append(", accuracy=");
        m.append(this.accuracy);
        m.append(", altitude=");
        m.append(this.altitude);
        m.append(", altitudeAccuracy=");
        m.append(this.altitudeAccuracy);
        m.append(", speed=");
        m.append(this.speed);
        m.append(", speedAccuracy=");
        m.append(this.speedAccuracy);
        m.append(", bearing=");
        m.append(this.bearing);
        m.append(", bearingAccuracy=");
        m.append(this.bearingAccuracy);
        m.append(", isMock=");
        m.append(this.isMock);
        m.append(", gpsTime=");
        m.append(this.gpsTime);
        m.append(", gpsTimeSinceBoot=");
        m.append(this.gpsTimeSinceBoot);
        m.append(")");
        return m.toString();
    }
}
