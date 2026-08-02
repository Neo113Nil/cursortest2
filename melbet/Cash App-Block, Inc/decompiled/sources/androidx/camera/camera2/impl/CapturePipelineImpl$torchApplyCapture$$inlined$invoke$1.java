package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Cache;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $captureMode$inlined;
    public final /* synthetic */ List $captureSignal;
    public final /* synthetic */ boolean $lock3ARequired$inlined;
    public final /* synthetic */ boolean $torchOnRequired$inlined;
    public final /* synthetic */ boolean $triggerAePreCapture$inlined;
    public AutoCloseable L$0;
    public int label;
    public final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(List list, Continuation continuation, boolean z, CapturePipelineImpl capturePipelineImpl, boolean z2, boolean z3, int i) {
        super(2, continuation);
        this.$captureSignal = list;
        this.$torchOnRequired$inlined = z;
        this.this$0 = capturePipelineImpl;
        this.$triggerAePreCapture$inlined = z2;
        this.$lock3ARequired$inlined = z3;
        this.$captureMode$inlined = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(this.$captureSignal, continuation, this.$torchOnRequired$inlined, this.this$0, this.$triggerAePreCapture$inlined, this.$lock3ARequired$inlined, this.$captureMode$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0099, code lost:
    
        if (r13 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
    
        if (androidx.camera.camera2.impl.CapturePipelineImpl.access$unlockAf(r1, 1000000000, r12) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x004d, code lost:
    
        if (kotlinx.coroutines.AwaitKt.joinAll(r13, r12) == r0) goto L66;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        AutoCloseable autoCloseable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = this.$captureMode$inlined;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal");
            }
            List list = this.$captureSignal;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    AutoCloseable autoCloseable2 = (AutoCloseable) obj;
                    try {
                        CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable2;
                        boolean z = i2 == 0;
                        this.L$0 = autoCloseable2;
                        this.label = 3;
                        if (cameraGraphSessionImpl.unlock3APostCapture(z) != coroutineSingletons) {
                            autoCloseable = autoCloseable2;
                            Cache.Companion.closeFinally(autoCloseable, null);
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseable = autoCloseable2;
                        throw th;
                    }
                }
                if (i != 3) {
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Unlocking 3A done");
                    }
                    return Unit.INSTANCE;
                }
                autoCloseable = this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                    Cache.Companion.closeFinally(autoCloseable, null);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        Cache.Companion.closeFinally(autoCloseable, th);
                        throw th4;
                    }
                }
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done");
        }
        boolean z2 = this.$torchOnRequired$inlined;
        CapturePipelineImpl capturePipelineImpl = this.this$0;
        if (z2) {
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Unsetting torch");
            }
            capturePipelineImpl.torchControl.m36setTorchAsyncOup_wC0$camera_camera2(0, true, (r3 & 4) == 0);
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Unsetting torch done");
            }
        }
        if (!this.$triggerAePreCapture$inlined) {
            if (this.$lock3ARequired$inlined && i2 == 0) {
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Unlocking 3A");
                }
                this.label = 4;
            }
            return Unit.INSTANCE;
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Unlocking 3A for capture");
        }
        CameraGraphImpl graph = capturePipelineImpl.useCaseGraphContext.getGraph();
        this.label = 2;
        obj = graph.acquireSession(this);
        return coroutineSingletons;
    }
}
