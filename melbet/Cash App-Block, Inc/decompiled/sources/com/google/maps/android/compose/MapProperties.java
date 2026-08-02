package com.google.maps.android.compose;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class MapProperties {
    public final boolean isMyLocationEnabled;
    public final LatLngBounds latLngBoundsForCameraTarget;
    public final MapStyleOptions mapStyleOptions;
    public final MapType mapType;
    public final float maxZoomPreference;
    public final float minZoomPreference;

    public MapProperties(boolean z, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, int i) {
        z = (i & 4) != 0 ? false : z;
        latLngBounds = (i & 16) != 0 ? null : latLngBounds;
        mapStyleOptions = (i & 32) != 0 ? null : mapStyleOptions;
        MapType mapType = MapType.NORMAL;
        float f = (i & 128) != 0 ? 21.0f : 20.0f;
        float f2 = (i & 256) != 0 ? 3.0f : 5.0f;
        this.isMyLocationEnabled = z;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = mapStyleOptions;
        this.mapType = mapType;
        this.maxZoomPreference = f;
        this.minZoomPreference = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapProperties)) {
            return false;
        }
        MapProperties mapProperties = (MapProperties) obj;
        return this.isMyLocationEnabled == mapProperties.isMyLocationEnabled && Intrinsics.areEqual(this.latLngBoundsForCameraTarget, mapProperties.latLngBoundsForCameraTarget) && Intrinsics.areEqual(this.mapStyleOptions, mapProperties.mapStyleOptions) && this.mapType == mapProperties.mapType && this.maxZoomPreference == mapProperties.maxZoomPreference && this.minZoomPreference == mapProperties.minZoomPreference;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool, Boolean.valueOf(this.isMyLocationEnabled), bool, this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapProperties(isBuildingEnabled=false, isIndoorEnabled=false, isMyLocationEnabled=");
        sb.append(this.isMyLocationEnabled);
        sb.append(", isTrafficEnabled=false, latLngBoundsForCameraTarget=");
        sb.append(this.latLngBoundsForCameraTarget);
        sb.append(", mapStyleOptions=");
        sb.append(this.mapStyleOptions);
        sb.append(", mapType=");
        sb.append(this.mapType);
        sb.append(", maxZoomPreference=");
        sb.append(this.maxZoomPreference);
        sb.append(", minZoomPreference=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.minZoomPreference, ')');
    }
}
