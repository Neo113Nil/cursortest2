package com.squareup.cash.qrcodes.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class QrAddressScannerViewModel {
    public final CameraState cameraState;
    public final boolean canStartCamera;
    public final String hint;
    public final boolean isLoading;
    public final String pasteButtonTitle;
    public final String qrScannerTitle;

    public QrAddressScannerViewModel(boolean z, boolean z2, String str, String str2, String str3, CameraState cameraState) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.isLoading = z;
        this.canStartCamera = z2;
        this.qrScannerTitle = str;
        this.pasteButtonTitle = str2;
        this.hint = str3;
        this.cameraState = cameraState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrAddressScannerViewModel)) {
            return false;
        }
        QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj;
        return this.isLoading == qrAddressScannerViewModel.isLoading && this.canStartCamera == qrAddressScannerViewModel.canStartCamera && Intrinsics.areEqual(this.qrScannerTitle, qrAddressScannerViewModel.qrScannerTitle) && Intrinsics.areEqual(this.pasteButtonTitle, qrAddressScannerViewModel.pasteButtonTitle) && Intrinsics.areEqual(this.hint, qrAddressScannerViewModel.hint) && this.cameraState == qrAddressScannerViewModel.cameraState;
    }

    public final int hashCode() {
        return this.cameraState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isLoading) * 31, 31, this.canStartCamera), 31, this.qrScannerTitle), 31, this.pasteButtonTitle), 31, this.hint);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("QrAddressScannerViewModel(isLoading=", ", canStartCamera=", ", qrScannerTitle=", this.isLoading, this.canStartCamera);
        Boxes$$ExternalSyntheticOutline1.m(m, this.qrScannerTitle, ", pasteButtonTitle=", this.pasteButtonTitle, ", hint=");
        m.append(this.hint);
        m.append(", cameraState=");
        m.append(this.cameraState);
        m.append(")");
        return m.toString();
    }
}
