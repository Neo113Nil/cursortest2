package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraStateClosing extends CameraState {
    public final CameraError cameraErrorCode;

    public CameraStateClosing(CameraError cameraError) {
        this.cameraErrorCode = cameraError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraStateClosing) && Intrinsics.areEqual(this.cameraErrorCode, ((CameraStateClosing) obj).cameraErrorCode);
    }

    public final int hashCode() {
        CameraError cameraError = this.cameraErrorCode;
        if (cameraError == null) {
            return 0;
        }
        return Integer.hashCode(cameraError.value);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.cameraErrorCode + ')';
    }
}
