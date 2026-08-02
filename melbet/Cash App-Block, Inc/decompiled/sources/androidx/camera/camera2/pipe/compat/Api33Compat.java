package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class Api33Compat {
    public static final Set getAvailableCaptureRequestKeys(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureRequest.Key> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i);
        availableCaptureRequestKeys.getClass();
        return availableCaptureRequestKeys;
    }

    public static final Set getAvailableCaptureResultKeys(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        Set<CaptureResult.Key> availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i);
        availableCaptureResultKeys.getClass();
        return availableCaptureResultKeys;
    }

    public static final void setDynamicRangeProfile(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setDynamicRangeProfile(j);
    }

    public static final void setMirrorMode(OutputConfiguration outputConfiguration, int i) {
        outputConfiguration.setMirrorMode(i);
    }

    public static final void setStreamUseCase(OutputConfiguration outputConfiguration, long j) {
        outputConfiguration.setStreamUseCase(j);
    }
}
