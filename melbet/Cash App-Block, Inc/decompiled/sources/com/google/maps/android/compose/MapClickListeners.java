package com.google.maps.android.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes6.dex */
public final class MapClickListeners {
    public final ParcelableSnapshotMutableState indoorStateChangeListener$delegate = Updater.mutableStateOf$default(DefaultIndoorStateChangeListener.INSTANCE);
    public final ParcelableSnapshotMutableState onMapClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onMapLongClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onMapLoaded$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onMyLocationButtonClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onMyLocationClick$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState onPOIClick$delegate = Updater.mutableStateOf$default(null);
}
