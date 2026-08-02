package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.biometric.BiometricPrompt;
import androidx.camera.core.impl.AutoValue_Config_Option;

/* loaded from: classes3.dex */
public final class Camera2ImplConfig extends BiometricPrompt {
    public static final AutoValue_Config_Option DEVICE_STATE_CALLBACK_OPTION;
    public static final AutoValue_Config_Option SESSION_CAPTURE_CALLBACK_OPTION;
    public static final AutoValue_Config_Option SESSION_PHYSICAL_CAMERA_ID_OPTION;
    public static final AutoValue_Config_Option SESSION_STATE_CALLBACK_OPTION;
    public static final AutoValue_Config_Option STREAM_USE_CASE_OPTION;
    public static final AutoValue_Config_Option STREAM_USE_HINT_OPTION;
    public static final AutoValue_Config_Option TEMPLATE_TYPE_OPTION;

    static {
        Class cls = Integer.TYPE;
        cls.getClass();
        TEMPLATE_TYPE_OPTION = new AutoValue_Config_Option("camera2.captureRequest.templateType", cls, null);
        DEVICE_STATE_CALLBACK_OPTION = new AutoValue_Config_Option("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
        SESSION_STATE_CALLBACK_OPTION = new AutoValue_Config_Option("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
        SESSION_CAPTURE_CALLBACK_OPTION = new AutoValue_Config_Option("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
        Class cls2 = Long.TYPE;
        cls2.getClass();
        STREAM_USE_CASE_OPTION = new AutoValue_Config_Option("camera2.cameraCaptureSession.streamUseCase", cls2, null);
        STREAM_USE_HINT_OPTION = new AutoValue_Config_Option("camera2.cameraCaptureSession.streamUseHint", cls2, null);
        SESSION_PHYSICAL_CAMERA_ID_OPTION = new AutoValue_Config_Option("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
