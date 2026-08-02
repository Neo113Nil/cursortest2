package androidx.camera.camera2.pipe.compat;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Camera2CameraController$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Camera2CameraController f$0;

    public /* synthetic */ Camera2CameraController$$ExternalSyntheticLambda1(Camera2CameraController camera2CameraController, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2CameraController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.$r8$classId;
        Camera2CameraController camera2CameraController = this.f$0;
        switch (i) {
            case 0:
                synchronized (camera2CameraController.lock) {
                    camera2CameraController.controllerState = CameraController$ControllerState$ERROR.INSTANCE$1;
                    Log.d("CXCP", camera2CameraController + " is closed");
                }
                Camera2Backend camera2Backend = camera2CameraController.shutdownListener;
                Log.d("CXCP", camera2CameraController + " finalized");
                synchronized (camera2Backend.lock) {
                    camera2Backend.activeCameraControllers.remove(camera2CameraController);
                }
                CompletableDeferredImpl completableDeferredImpl = camera2CameraController.closedDeferred;
                Unit unit = Unit.INSTANCE;
                completableDeferredImpl.makeCompleting$kotlinx_coroutines_core(unit);
                JobKt.cancel(camera2CameraController.scope, (CancellationException) null);
                return unit;
            default:
                ((Unit) obj).getClass();
                synchronized (camera2CameraController.lock) {
                    z = camera2CameraController._isForeground;
                }
                return Boolean.valueOf(z);
        }
    }
}
