package com.google.maps.android.compose;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;

/* loaded from: classes4.dex */
public final class MapUpdaterState {
    public final ParcelableSnapshotMutableState cameraPositionState$delegate;
    public final ParcelableSnapshotMutableState contentDescription$delegate;
    public final ParcelableSnapshotMutableState contentPadding$delegate;
    public final ParcelableSnapshotMutableState locationSource$delegate;
    public final ParcelableSnapshotMutableState mapColorScheme$delegate;
    public final ParcelableSnapshotMutableState mapProperties$delegate;
    public final ParcelableSnapshotMutableState mapUiSettings$delegate;
    public final ParcelableSnapshotMutableState mergeDescendants$delegate;

    public MapUpdaterState(CameraPositionState cameraPositionState, PaddingValues paddingValues, MapProperties mapProperties, MapUiSettings mapUiSettings, Integer num) {
        cameraPositionState.getClass();
        paddingValues.getClass();
        mapProperties.getClass();
        mapUiSettings.getClass();
        this.mergeDescendants$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.contentDescription$delegate = Updater.mutableStateOf$default(null);
        this.cameraPositionState$delegate = Updater.mutableStateOf$default(cameraPositionState);
        this.contentPadding$delegate = Updater.mutableStateOf$default(paddingValues);
        this.locationSource$delegate = Updater.mutableStateOf$default(null);
        this.mapProperties$delegate = Updater.mutableStateOf$default(mapProperties);
        this.mapUiSettings$delegate = Updater.mutableStateOf$default(mapUiSettings);
        this.mapColorScheme$delegate = Updater.mutableStateOf$default(num);
    }

    public final MapProperties getMapProperties() {
        return (MapProperties) this.mapProperties$delegate.getValue();
    }

    public final MapUiSettings getMapUiSettings() {
        return (MapUiSettings) this.mapUiSettings$delegate.getValue();
    }
}
