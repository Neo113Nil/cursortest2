package androidx.camera.camera2.interop;

import androidx.camera.camera2.compat.Camera2CameraControlCompatImpl;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseCameraControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.CameraControl$OperationCanceledException;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes3.dex */
public final class Camera2CameraControl implements UseCaseCameraControl {
    public UseCaseCameraRequestControl _useCaseCameraRequestControl;
    public final Camera2CameraControlCompatImpl compat;
    public final ComboRequestListener requestListener;
    public final UseCaseThreads threads;

    public Camera2CameraControl(Camera2CameraControlCompatImpl camera2CameraControlCompatImpl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        this.compat = camera2CameraControlCompatImpl;
        this.threads = useCaseThreads;
        this.requestListener = comboRequestListener;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = this.compat;
        synchronized (camera2CameraControlCompatImpl.updateSignalLock) {
            try {
                CompletableDeferredImpl completableDeferredImpl = camera2CameraControlCompatImpl.updateSignal;
                if (completableDeferredImpl != null) {
                    camera2CameraControlCompatImpl.updateSignal = null;
                    completableDeferredImpl.completeExceptionally(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
                CompletableDeferredImpl completableDeferredImpl2 = camera2CameraControlCompatImpl.pendingSignal;
                if (completableDeferredImpl2 != null) {
                    camera2CameraControlCompatImpl.pendingSignal = null;
                    completableDeferredImpl2.completeExceptionally(new CameraControl$OperationCanceledException("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.requestListener.removeListener(this.compat);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._useCaseCameraRequestControl = useCaseCameraRequestControl;
        if (useCaseCameraRequestControl != null) {
            ComboRequestListener comboRequestListener = this.requestListener;
            Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = this.compat;
            comboRequestListener.removeListener(camera2CameraControlCompatImpl);
            comboRequestListener.addListener(camera2CameraControlCompatImpl, this.threads.sequentialExecutor);
            camera2CameraControlCompatImpl.applyAsync(useCaseCameraRequestControl, false);
        }
    }
}
