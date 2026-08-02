package app.cash.local.presenters.instore;

import app.cash.local.viewmodels.instore.CameraState;

/* loaded from: classes3.dex */
public final class TableQrCodeScannerCameraState {
    public final CameraState cameraState;
    public final boolean hasCameraPermission;

    public TableQrCodeScannerCameraState(boolean z, CameraState cameraState) {
        this.hasCameraPermission = z;
        this.cameraState = cameraState;
    }

    public static TableQrCodeScannerCameraState copy$default(TableQrCodeScannerCameraState tableQrCodeScannerCameraState, boolean z, CameraState cameraState, int i) {
        if ((i & 1) != 0) {
            z = tableQrCodeScannerCameraState.hasCameraPermission;
        }
        if ((i & 2) != 0) {
            cameraState = tableQrCodeScannerCameraState.cameraState;
        }
        tableQrCodeScannerCameraState.getClass();
        return new TableQrCodeScannerCameraState(z, cameraState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableQrCodeScannerCameraState)) {
            return false;
        }
        TableQrCodeScannerCameraState tableQrCodeScannerCameraState = (TableQrCodeScannerCameraState) obj;
        return this.hasCameraPermission == tableQrCodeScannerCameraState.hasCameraPermission && this.cameraState == tableQrCodeScannerCameraState.cameraState;
    }

    public final int hashCode() {
        return this.cameraState.hashCode() + (Boolean.hashCode(this.hasCameraPermission) * 31);
    }

    public final String toString() {
        return "TableQrCodeScannerCameraState(hasCameraPermission=" + this.hasCameraPermission + ", cameraState=" + this.cameraState + ")";
    }
}
