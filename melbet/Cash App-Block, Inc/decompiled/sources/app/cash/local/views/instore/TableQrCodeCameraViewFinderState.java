package app.cash.local.views.instore;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.local.viewmodels.instore.CameraState;

/* loaded from: classes3.dex */
public final class TableQrCodeCameraViewFinderState {
    public final ParcelableSnapshotMutableState cameraAvailable$delegate;
    public final ParcelableSnapshotMutableState cameraState$delegate;
    public final ParcelableSnapshotMutableState canStartCamera$delegate;
    public final ParcelableSnapshotMutableState flashAvailable$delegate;
    public final ParcelableSnapshotMutableState flashEnabled$delegate;
    public final ParcelableSnapshotMutableState processImages$delegate;

    public TableQrCodeCameraViewFinderState() {
        Boolean bool = Boolean.TRUE;
        this.canStartCamera$delegate = Updater.mutableStateOf$default(bool);
        this.processImages$delegate = Updater.mutableStateOf$default(bool);
        Boolean bool2 = Boolean.FALSE;
        this.flashAvailable$delegate = Updater.mutableStateOf$default(bool2);
        this.flashEnabled$delegate = Updater.mutableStateOf$default(bool2);
        this.cameraState$delegate = Updater.mutableStateOf$default(CameraState.RESUMED);
        this.cameraAvailable$delegate = Updater.mutableStateOf$default(bool);
    }
}
