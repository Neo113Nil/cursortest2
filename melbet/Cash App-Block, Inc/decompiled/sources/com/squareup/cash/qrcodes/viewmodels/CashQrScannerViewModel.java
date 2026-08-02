package com.squareup.cash.qrcodes.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class CashQrScannerViewModel {
    public final CameraState cameraState;
    public final boolean canUseCamera;
    public final boolean hideSegmentedControl;
    public final boolean showShareScanToggle;
    public final boolean showUpdatedSharingUi;

    public CashQrScannerViewModel(boolean z, CameraState cameraState, boolean z2, boolean z3, boolean z4) {
        this.canUseCamera = z;
        this.cameraState = cameraState;
        this.showUpdatedSharingUi = z2;
        this.showShareScanToggle = z3;
        this.hideSegmentedControl = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashQrScannerViewModel)) {
            return false;
        }
        CashQrScannerViewModel cashQrScannerViewModel = (CashQrScannerViewModel) obj;
        return this.canUseCamera == cashQrScannerViewModel.canUseCamera && this.cameraState == cashQrScannerViewModel.cameraState && this.showUpdatedSharingUi == cashQrScannerViewModel.showUpdatedSharingUi && this.showShareScanToggle == cashQrScannerViewModel.showShareScanToggle && this.hideSegmentedControl == cashQrScannerViewModel.hideSegmentedControl;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hideSegmentedControl) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cameraState.hashCode() + (Boolean.hashCode(this.canUseCamera) * 31)) * 31, 31, this.showUpdatedSharingUi), 31, this.showShareScanToggle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashQrScannerViewModel(canUseCamera=");
        sb.append(this.canUseCamera);
        sb.append(", cameraState=");
        sb.append(this.cameraState);
        sb.append(", showUpdatedSharingUi=");
        re$$ExternalSyntheticOutline0.m(sb, this.showUpdatedSharingUi, ", showShareScanToggle=", this.showShareScanToggle, ", hideSegmentedControl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hideSegmentedControl, ")");
    }
}
