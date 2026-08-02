package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.camera2.pipe.graph.Controller3A;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;
import okhttp3.Cache;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $aeMode;
    public int I$0;
    public int label;
    public final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$aeMode = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(this.this$0, this.$aeMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        Object acquireSession;
        CompletableDeferredImpl completableDeferredImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                SafeTrace.throwOnFailure(obj);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
                i = this.$aeMode;
                CameraGraphImpl graph = useCaseCameraRequestControlImpl.useCaseGraphContext.getGraph();
                this.I$0 = i;
                this.label = 1;
                acquireSession = graph.acquireSession(this);
                if (acquireSession == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i3 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i = i3;
                acquireSession = obj;
            }
            AutoCloseable autoCloseable = (AutoCloseable) acquireSession;
            try {
                CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                AeMode aeMode = new AeMode(i);
                if (cameraGraphSessionImpl.token.getReleased()) {
                    Handlers$$ExternalSyntheticBUOutline0.m("Cannot call setTorchOff on ", cameraGraphSessionImpl, " after close.");
                    completableDeferredImpl = null;
                } else {
                    Controller3A controller3A = cameraGraphSessionImpl.controller3A;
                    controller3A.getClass();
                    completableDeferredImpl = Controller3A.m85update3A169HPGg$default(controller3A, aeMode, null, null, new FlashMode(0), null, null, null, 118);
                }
                Cache.Companion.closeFinally(autoCloseable, null);
                return completableDeferredImpl;
            } finally {
            }
        } catch (CancellationException e) {
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }
}
