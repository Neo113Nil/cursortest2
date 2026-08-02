package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;

/* loaded from: classes3.dex */
public final class Camera2DeviceSetup implements Camera2DeviceSetupWrapper {
    public final CameraDevice.CameraDeviceSetup cameraDeviceSetup;
    public final Camera2ErrorProcessor cameraErrorListener;
    public final String cameraId;

    public Camera2DeviceSetup(CameraDevice.CameraDeviceSetup cameraDeviceSetup, String str, Camera2ErrorProcessor camera2ErrorProcessor) {
        str.getClass();
        camera2ErrorProcessor.getClass();
        this.cameraDeviceSetup = cameraDeviceSetup;
        this.cameraId = str;
        this.cameraErrorListener = camera2ErrorProcessor;
    }

    public final CaptureRequest.Builder createCaptureRequest(int i) {
        try {
            return this.cameraDeviceSetup.createCaptureRequest(i);
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            String str = this.cameraId;
            Camera2ErrorProcessor camera2ErrorProcessor = this.cameraErrorListener;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                camera2ErrorProcessor.m69onCameraError3M5Xam4(str, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            camera2ErrorProcessor.m69onCameraError3M5Xam4(str, i2, true);
            return null;
        }
    }
}
