package com.squareup.cash.qrcodes.views;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.qrcodes.viewmodels.CameraState;

/* loaded from: classes7.dex */
public final class CameraXPreviewState {
    public final ParcelableSnapshotMutableState cameraAvailable$delegate;
    public final ParcelableSnapshotMutableState cameraState$delegate;
    public final ParcelableSnapshotMutableState flashAvailable$delegate;
    public final ParcelableSnapshotMutableState flashEnabled$delegate;
    public final ParcelableSnapshotMutableState processImages$delegate;

    public CameraXPreviewState() {
        Boolean bool = Boolean.TRUE;
        this.processImages$delegate = Updater.mutableStateOf$default(bool);
        Boolean bool2 = Boolean.FALSE;
        this.flashAvailable$delegate = Updater.mutableStateOf$default(bool2);
        this.flashEnabled$delegate = Updater.mutableStateOf$default(bool2);
        this.cameraState$delegate = Updater.mutableStateOf$default(CameraState.RESUMED);
        this.cameraAvailable$delegate = Updater.mutableStateOf$default(bool);
    }

    public final boolean getFlashAvailable() {
        return ((Boolean) this.flashAvailable$delegate.getValue()).booleanValue();
    }

    public final boolean getFlashEnabled() {
        return ((Boolean) this.flashEnabled$delegate.getValue()).booleanValue();
    }
}
