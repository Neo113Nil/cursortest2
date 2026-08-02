package androidx.camera.camera2.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes3.dex */
public final class EvCompImpl {
    public final ComboRequestListener comboRequestListener;
    public final Range range;
    public final Rational step;
    public final boolean supported;
    public final UseCaseThreads threads;
    public EvCompImpl$applyAsync$3 updateListener;
    public CompletableDeferredImpl updateSignal;

    public EvCompImpl(CameraPipeCameraProperties cameraPipeCameraProperties, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        Integer num;
        Rational rational;
        cameraPipeCameraProperties.getClass();
        useCaseThreads.getClass();
        comboRequestListener.getClass();
        this.threads = useCaseThreads;
        this.comboRequestListener = comboRequestListener;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Object obj = EvCompCompatKt.EMPTY_RANGE;
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        camera2CameraMetadata.getClass();
        Object obj2 = camera2CameraMetadata.get(key);
        obj = obj2 != null ? obj2 : obj;
        obj.getClass();
        Range range = (Range) obj;
        this.range = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.supported = z;
        if (z) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object obj3 = ((Camera2CameraMetadata) cameraMetadata).get(key2);
            obj3.getClass();
            rational = (Rational) obj3;
        } else {
            rational = Rational.ZERO;
            rational.getClass();
        }
        this.step = rational;
    }
}
