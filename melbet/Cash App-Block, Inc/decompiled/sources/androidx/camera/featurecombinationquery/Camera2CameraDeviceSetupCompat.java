package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import com.google.android.gms.dynamite.zzo;

/* loaded from: classes3.dex */
public final class Camera2CameraDeviceSetupCompat implements CameraDeviceSetupCompat {
    public final CameraDevice.CameraDeviceSetup mCameraDeviceSetup;

    public Camera2CameraDeviceSetupCompat(CameraManager cameraManager, String str) {
        this.mCameraDeviceSetup = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // androidx.camera.featurecombinationquery.CameraDeviceSetupCompat
    public final zzo isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) {
        int i = this.mCameraDeviceSetup.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new zzo((byte) 0, i);
    }
}
