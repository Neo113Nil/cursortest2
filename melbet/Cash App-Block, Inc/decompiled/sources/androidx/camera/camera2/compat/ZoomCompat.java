package androidx.camera.camera2.compat;

import android.graphics.Rect;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import kotlinx.coroutines.Deferred;

/* loaded from: classes3.dex */
public interface ZoomCompat {
    Deferred applyAsync(float f, UseCaseCameraRequestControl useCaseCameraRequestControl);

    Rect getCropSensorRegion();

    float getMaxZoomRatio();

    float getMinZoomRatio();

    Deferred resetAsync(UseCaseCameraRequestControl useCaseCameraRequestControl);
}
