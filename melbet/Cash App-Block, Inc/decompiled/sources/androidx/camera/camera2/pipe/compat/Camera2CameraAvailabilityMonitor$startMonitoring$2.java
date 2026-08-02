package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.impl.FocusMeteringControl$triggerFocusTimeout$1;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.compose.material.SliderDraggableState$drag$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.featuretoggle.UnleashContext;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2 implements AutoCloseable {
    public final CopyOnWriteArrayList listeners;
    public final ContextScope scope;

    public Camera2CameraAvailabilityMonitor$startMonitoring$2(UnleashContext unleashContext, String str) {
        ContextScope CoroutineScope = JobKt.CoroutineScope(((Threads) unleashContext.sessionId).backgroundDispatcher.plus(new SupervisorJobImpl((Job) unleashContext.remoteAddress)));
        this.scope = CoroutineScope;
        this.listeners = new CopyOnWriteArrayList();
        JobKt.launch$default(CoroutineScope, null, null, new SliderDraggableState$drag$2(unleashContext, str, this, null, 6), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAvailableCamera(long j, ContinuationImpl continuationImpl) {
        Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1;
        int i;
        CompletableDeferredImpl completableDeferredImpl;
        if (continuationImpl instanceof Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) {
            camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 = (Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) continuationImpl;
            int i2 = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.label;
                CopyOnWriteArrayList copyOnWriteArrayList = this.listeners;
                Continuation continuation = null;
                char c = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
                    copyOnWriteArrayList.add(completableDeferredImpl2);
                    FocusMeteringControl$triggerFocusTimeout$1 focusMeteringControl$triggerFocusTimeout$1 = new FocusMeteringControl$triggerFocusTimeout$1(completableDeferredImpl2, continuation, c == true ? 1 : 0);
                    camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.L$0 = completableDeferredImpl2;
                    camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.label = 1;
                    Object withTimeoutOrNull = JobKt.withTimeoutOrNull(j, focusMeteringControl$triggerFocusTimeout$1, camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1);
                    if (withTimeoutOrNull == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = withTimeoutOrNull;
                    completableDeferredImpl = completableDeferredImpl2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    completableDeferredImpl = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                boolean z = obj != null;
                copyOnWriteArrayList.remove(completableDeferredImpl);
                return Boolean.valueOf(z);
            }
        }
        camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 = new Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1(this, continuationImpl);
        Object obj2 = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.label;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.listeners;
        Continuation continuation2 = null;
        char c2 = 1;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        copyOnWriteArrayList2.remove(completableDeferredImpl);
        return Boolean.valueOf(z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt.cancel(this.scope, (CancellationException) null);
    }
}
