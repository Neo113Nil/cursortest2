package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.qrcodes.viewmodels.CameraState;

/* loaded from: classes7.dex */
public final class CashtagQrScanPresenter$State {
    public final CameraState cameraState;
    public final boolean hasCameraPermission;

    public CashtagQrScanPresenter$State(boolean z, CameraState cameraState) {
        this.hasCameraPermission = z;
        this.cameraState = cameraState;
    }

    public static CashtagQrScanPresenter$State copy$default(CashtagQrScanPresenter$State cashtagQrScanPresenter$State, boolean z, CameraState cameraState, int i) {
        if ((i & 1) != 0) {
            z = cashtagQrScanPresenter$State.hasCameraPermission;
        }
        if ((i & 2) != 0) {
            cameraState = cashtagQrScanPresenter$State.cameraState;
        }
        cashtagQrScanPresenter$State.getClass();
        return new CashtagQrScanPresenter$State(z, cameraState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashtagQrScanPresenter$State)) {
            return false;
        }
        CashtagQrScanPresenter$State cashtagQrScanPresenter$State = (CashtagQrScanPresenter$State) obj;
        return this.hasCameraPermission == cashtagQrScanPresenter$State.hasCameraPermission && this.cameraState == cashtagQrScanPresenter$State.cameraState;
    }

    public final int hashCode() {
        return this.cameraState.hashCode() + (Boolean.hashCode(this.hasCameraPermission) * 31);
    }

    public final String toString() {
        return "State(hasCameraPermission=" + this.hasCameraPermission + ", cameraState=" + this.cameraState + ")";
    }
}
