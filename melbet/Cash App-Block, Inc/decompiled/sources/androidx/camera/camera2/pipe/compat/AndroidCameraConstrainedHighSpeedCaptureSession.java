package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidCameraConstrainedHighSpeedCaptureSession extends AndroidCameraCaptureSession {
    public final CameraConstrainedHighSpeedCaptureSession session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCameraConstrainedHighSpeedCaptureSession(AndroidCameraDevice androidCameraDevice, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, Camera2ErrorProcessor camera2ErrorProcessor, Handler handler) {
        super(androidCameraDevice, cameraConstrainedHighSpeedCaptureSession, camera2ErrorProcessor, handler);
        androidCameraDevice.getClass();
        cameraConstrainedHighSpeedCaptureSession.getClass();
        camera2ErrorProcessor.getClass();
        handler.getClass();
        this.session = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession, androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        return kClass.equals(Reflection.factory.getOrCreateKotlinClass(CameraConstrainedHighSpeedCaptureSession.class)) ? this.session : super.unwrapAs(kClass);
    }
}
