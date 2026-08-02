package androidx.camera.camera2.impl;

import android.util.Log;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VideoUsageControl implements UseCaseCameraControl {
    public final AtomicInt videoUsage = AtomicFU.atomic(0);

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.videoUsage.value = 0;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "reset: videoUsage = 0");
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
    }
}
