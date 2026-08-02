package com.squareup.cash.qrcodes.viewmodels;

/* loaded from: classes7.dex */
public final class CashtagQrScanViewModel {
    public final CameraState cameraState;
    public final boolean canUseCamera;

    public CashtagQrScanViewModel(boolean z, CameraState cameraState) {
        this.canUseCamera = z;
        this.cameraState = cameraState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashtagQrScanViewModel)) {
            return false;
        }
        CashtagQrScanViewModel cashtagQrScanViewModel = (CashtagQrScanViewModel) obj;
        return this.canUseCamera == cashtagQrScanViewModel.canUseCamera && this.cameraState == cashtagQrScanViewModel.cameraState;
    }

    public final int hashCode() {
        return this.cameraState.hashCode() + (Boolean.hashCode(this.canUseCamera) * 31);
    }

    public final String toString() {
        return "CashtagQrScanViewModel(canUseCamera=" + this.canUseCamera + ", cameraState=" + this.cameraState + ")";
    }
}
