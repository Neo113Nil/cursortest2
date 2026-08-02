package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import androidx.camera.camera2.pipe.CameraMetadata;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public abstract class Api34Compat {
    public static final boolean isCaptureProcessProgressAvailable(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i);
    }

    public static final boolean isPostviewAvailable(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i);
    }

    public static final boolean isZoomOverrideSupported(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        return iArr != null && ArraysKt___ArraysKt.contains(iArr, 1);
    }

    public static final void setPostviewOutputConfiguration(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }
}
