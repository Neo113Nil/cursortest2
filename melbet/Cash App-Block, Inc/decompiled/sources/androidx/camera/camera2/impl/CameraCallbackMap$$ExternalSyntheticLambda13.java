package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.CameraCaptureCallback;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraCallbackMap$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraCaptureCallback f$0;
    public final /* synthetic */ RequestMetadata f$2;

    public /* synthetic */ CameraCallbackMap$$ExternalSyntheticLambda13(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraCaptureCallback;
        this.f$2 = requestMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onCaptureStarted(CameraCallbackMap.getCaptureConfigId(this.f$2));
                break;
            default:
                this.f$0.onCaptureCancelled(CameraCallbackMap.getCaptureConfigId(this.f$2));
                break;
        }
    }
}
