package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OpenCameraResult {
    public final AndroidCameraState cameraState;
    public final CameraError errorCode;

    public OpenCameraResult(AndroidCameraState androidCameraState, CameraError cameraError, int i) {
        androidCameraState = (i & 1) != 0 ? null : androidCameraState;
        cameraError = (i & 2) != 0 ? null : cameraError;
        this.cameraState = androidCameraState;
        this.errorCode = cameraError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenCameraResult)) {
            return false;
        }
        OpenCameraResult openCameraResult = (OpenCameraResult) obj;
        return Intrinsics.areEqual(this.cameraState, openCameraResult.cameraState) && Intrinsics.areEqual(this.errorCode, openCameraResult.errorCode);
    }

    public final int hashCode() {
        AndroidCameraState androidCameraState = this.cameraState;
        int hashCode = (androidCameraState == null ? 0 : androidCameraState.hashCode()) * 31;
        CameraError cameraError = this.errorCode;
        return hashCode + (cameraError != null ? Integer.hashCode(cameraError.value) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.cameraState + ", errorCode=" + this.errorCode + ')';
    }
}
