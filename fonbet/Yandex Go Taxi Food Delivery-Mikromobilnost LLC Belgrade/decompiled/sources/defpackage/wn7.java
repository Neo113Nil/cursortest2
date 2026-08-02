package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* loaded from: classes10.dex */
public final class wn7 extends b48 {
    public static final x34 b = new x34("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final x34 c = new x34("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final x34 w = new x34("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final x34 x = new x34("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final x34 y = new x34("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final x34 z = new x34("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static x34 a(CaptureRequest.Key key) {
        return new x34("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
