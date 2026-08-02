package androidx.camera.camera2.compat;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.core.view.WindowCompat$Api35Impl;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class NoOpZoomCompat implements ZoomCompat {
    public static final List requiredCharacteristics = CollectionsKt__CollectionsJVMKt.listOf(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    public final CameraPipeCameraProperties cameraProperties;

    public NoOpZoomCompat(CameraPipeCameraProperties cameraPipeCameraProperties) {
        this.cameraProperties = cameraPipeCameraProperties;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final Deferred applyAsync(float f, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        useCaseCameraRequestControl.getClass();
        return JobKt.CompletableDeferred(Unit.INSTANCE);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final Rect getCropSensorRegion() {
        return WindowCompat$Api35Impl.getActiveArraySizeSafely(this.cameraProperties.metadata);
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMaxZoomRatio() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final float getMinZoomRatio() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.compat.ZoomCompat
    public final Deferred resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        useCaseCameraRequestControl.getClass();
        return JobKt.CompletableDeferred(Unit.INSTANCE);
    }
}
