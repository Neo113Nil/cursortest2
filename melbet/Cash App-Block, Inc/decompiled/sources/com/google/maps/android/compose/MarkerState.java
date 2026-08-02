package com.google.maps.android.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* loaded from: classes4.dex */
public final class MarkerState {
    public final ParcelableSnapshotMutableState position$delegate;
    public final ParcelableSnapshotMutableState isDragging$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableState dragState$delegate = Updater.mutableStateOf$default(DragState.END);
    public final ParcelableSnapshotMutableState markerState = Updater.mutableStateOf$default(null);

    public MarkerState(LatLng latLng) {
        this.position$delegate = Updater.mutableStateOf$default(latLng);
    }

    public final void setDragging$maps_compose_release(boolean z) {
        this.isDragging$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setMarker$maps_compose_release(Marker marker) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.markerState;
        if (parcelableSnapshotMutableState.getValue() == null && marker == null) {
            return;
        }
        if (parcelableSnapshotMutableState.getValue() == null || marker == null) {
            parcelableSnapshotMutableState.setValue(marker);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("MarkerState may only be associated with one Marker at a time.");
        }
    }
}
