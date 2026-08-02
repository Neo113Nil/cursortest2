package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.pipe.CameraMetadata;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Api35Compat {
    public static final List getAvailableSessionCharacteristicsKeys(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final int getDefaultTorchStrengthLevel(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
        key.getClass();
        Integer num = (Integer) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final int getMaxTorchStrengthLevel(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key;
        cameraMetadata.getClass();
        key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        key.getClass();
        Integer num = (Integer) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean isTorchStrengthSupported(CameraMetadata cameraMetadata) {
        CameraCharacteristics.Key key;
        cameraMetadata.getClass();
        key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        key.getClass();
        Integer num = (Integer) ((Camera2CameraMetadata) cameraMetadata).get(key);
        return num != null && num.intValue() > 1;
    }
}
