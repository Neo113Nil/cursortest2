package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class Api30Compat {
    public static final Set getConcurrentCameraIds(CameraManager cameraManager) {
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        concurrentCameraIds.getClass();
        return concurrentCameraIds;
    }

    public static final void setCameraAudioRestriction(CameraDevice cameraDevice, int i) {
        cameraDevice.setCameraAudioRestriction(i);
    }
}
