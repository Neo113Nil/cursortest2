package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.lifecycle.LiveData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class PhysicalCameraInfoAdapter implements CameraInfo, UnsafeWrapper {
    public final Lazy camera2CameraInfo$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 1));
    public final CameraPipeCameraProperties cameraProperties;

    public PhysicalCameraInfoAdapter(CameraPipeCameraProperties cameraPipeCameraProperties) {
        this.cameraProperties = cameraPipeCameraProperties;
    }

    @Override // androidx.camera.core.CameraInfo
    public final CameraSelector getCameraSelector() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "The specified lens facing integer ", " can not be recognized."));
        return 0;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i) {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        return GenieForEachViewKt.getRelativeImageRotation(GenieForEachViewKt.surfaceRotationToDegrees(i), ((Number) obj).intValue(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getTorchState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getZoomState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Camera2CameraInfo.class))) {
            Camera2CameraInfo camera2CameraInfo = (Camera2CameraInfo) this.camera2CameraInfo$delegate.getValue();
            camera2CameraInfo.getClass();
            return camera2CameraInfo;
        }
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(CameraPipeCameraProperties.class));
        CameraPipeCameraProperties cameraPipeCameraProperties = this.cameraProperties;
        if (equals) {
            return cameraPipeCameraProperties;
        }
        boolean equals2 = kClass.equals(reflectionFactory.getOrCreateKotlinClass(android.hardware.camera2.CameraMetadata.class));
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        if (!equals2) {
            return ((Camera2CameraMetadata) cameraMetadata).unwrapAs(kClass);
        }
        cameraMetadata.getClass();
        return cameraMetadata;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
