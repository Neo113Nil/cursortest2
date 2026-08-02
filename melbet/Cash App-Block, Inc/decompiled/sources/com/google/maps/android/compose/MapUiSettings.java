package com.google.maps.android.compose;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class MapUiSettings {
    public final boolean compassEnabled;
    public final boolean indoorLevelPickerEnabled;
    public final boolean mapToolbarEnabled;
    public final boolean myLocationButtonEnabled;
    public final boolean rotationGesturesEnabled;
    public final boolean scrollGesturesEnabled;
    public final boolean scrollGesturesEnabledDuringRotateOrZoom;
    public final boolean tiltGesturesEnabled;
    public final boolean zoomControlsEnabled;
    public final boolean zoomGesturesEnabled;

    public MapUiSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.compassEnabled = z;
        this.indoorLevelPickerEnabled = z2;
        this.mapToolbarEnabled = z3;
        this.myLocationButtonEnabled = z4;
        this.rotationGesturesEnabled = z5;
        this.scrollGesturesEnabled = z6;
        this.scrollGesturesEnabledDuringRotateOrZoom = z7;
        this.tiltGesturesEnabled = z8;
        this.zoomControlsEnabled = z9;
        this.zoomGesturesEnabled = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapUiSettings)) {
            return false;
        }
        MapUiSettings mapUiSettings = (MapUiSettings) obj;
        return this.compassEnabled == mapUiSettings.compassEnabled && this.indoorLevelPickerEnabled == mapUiSettings.indoorLevelPickerEnabled && this.mapToolbarEnabled == mapUiSettings.mapToolbarEnabled && this.myLocationButtonEnabled == mapUiSettings.myLocationButtonEnabled && this.rotationGesturesEnabled == mapUiSettings.rotationGesturesEnabled && this.scrollGesturesEnabled == mapUiSettings.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == mapUiSettings.tiltGesturesEnabled && this.zoomControlsEnabled == mapUiSettings.zoomControlsEnabled && this.zoomGesturesEnabled == mapUiSettings.zoomGesturesEnabled;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.compassEnabled), Boolean.valueOf(this.indoorLevelPickerEnabled), Boolean.valueOf(this.mapToolbarEnabled), Boolean.valueOf(this.myLocationButtonEnabled), Boolean.valueOf(this.rotationGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), Boolean.valueOf(this.tiltGesturesEnabled), Boolean.valueOf(this.zoomControlsEnabled), Boolean.valueOf(this.zoomGesturesEnabled));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapUiSettings(compassEnabled=");
        sb.append(this.compassEnabled);
        sb.append(", indoorLevelPickerEnabled=");
        sb.append(this.indoorLevelPickerEnabled);
        sb.append(", mapToolbarEnabled=");
        sb.append(this.mapToolbarEnabled);
        sb.append(", myLocationButtonEnabled=");
        sb.append(this.myLocationButtonEnabled);
        sb.append(", rotationGesturesEnabled=");
        sb.append(this.rotationGesturesEnabled);
        sb.append(", scrollGesturesEnabled=");
        sb.append(this.scrollGesturesEnabled);
        sb.append(", scrollGesturesEnabledDuringRotateOrZoom=");
        sb.append(this.scrollGesturesEnabledDuringRotateOrZoom);
        sb.append(", tiltGesturesEnabled=");
        sb.append(this.tiltGesturesEnabled);
        sb.append(", zoomControlsEnabled=");
        sb.append(this.zoomControlsEnabled);
        sb.append(", zoomGesturesEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.zoomGesturesEnabled, ')');
    }
}
