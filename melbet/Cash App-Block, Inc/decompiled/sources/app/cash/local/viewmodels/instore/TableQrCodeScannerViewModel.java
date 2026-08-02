package app.cash.local.viewmodels.instore;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class TableQrCodeScannerViewModel {
    public final CameraState cameraState;
    public final boolean canStartCamera;
    public final int scanSessionId;

    public TableQrCodeScannerViewModel(boolean z, CameraState cameraState, int i) {
        this.canStartCamera = z;
        this.cameraState = cameraState;
        this.scanSessionId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableQrCodeScannerViewModel)) {
            return false;
        }
        TableQrCodeScannerViewModel tableQrCodeScannerViewModel = (TableQrCodeScannerViewModel) obj;
        return this.canStartCamera == tableQrCodeScannerViewModel.canStartCamera && this.cameraState == tableQrCodeScannerViewModel.cameraState && this.scanSessionId == tableQrCodeScannerViewModel.scanSessionId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.scanSessionId) + ((this.cameraState.hashCode() + (Boolean.hashCode(this.canStartCamera) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TableQrCodeScannerViewModel(canStartCamera=");
        sb.append(this.canStartCamera);
        sb.append(", cameraState=");
        sb.append(this.cameraState);
        sb.append(", scanSessionId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.scanSessionId, ")", sb);
    }
}
