package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraCallbackMap$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraUseCaseAdapter.CaptureCallbackContainer f$0;
    public final /* synthetic */ CameraCaptureSession f$1;
    public final /* synthetic */ CaptureRequest f$2;
    public final /* synthetic */ CaptureResult f$3;

    public /* synthetic */ CameraCallbackMap$$ExternalSyntheticLambda4(CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.$r8$classId = i;
        this.f$0 = captureCallbackContainer;
        this.f$1 = cameraCaptureSession;
        this.f$2 = captureRequest;
        this.f$3 = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        CaptureResult captureResult = this.f$3;
        CaptureRequest captureRequest = this.f$2;
        CameraCaptureSession cameraCaptureSession = this.f$1;
        CameraUseCaseAdapter.CaptureCallbackContainer captureCallbackContainer = this.f$0;
        switch (i) {
            case 0:
                captureCallbackContainer.captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                captureCallbackContainer.captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
