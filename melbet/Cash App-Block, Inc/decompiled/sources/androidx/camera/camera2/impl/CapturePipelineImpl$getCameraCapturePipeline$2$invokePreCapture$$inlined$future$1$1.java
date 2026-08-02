package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $captureMode$inlined;
    public final /* synthetic */ CallbackToFutureAdapter$Completer $completer;
    public final /* synthetic */ int $flashMode$inlined;
    public final /* synthetic */ int $r8$classId;
    public CallbackToFutureAdapter$Completer L$0;
    public int label;
    public final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i, int i2, int i3) {
        super(2, continuation);
        this.$r8$classId = i3;
        this.$completer = callbackToFutureAdapter$Completer;
        this.this$0 = capturePipelineImpl;
        this.$captureMode$inlined = i;
        this.$flashMode$inlined = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1(this.$completer, continuation, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, 0);
            default:
                return new CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1(this.$completer, continuation, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r14 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r14 == r13) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer;
        CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1 capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2;
        int i = this.$r8$classId;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = this.$completer;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(CapturePipelineImpl.PipelineTask.PRE_CAPTURE);
                    this.L$0 = callbackToFutureAdapter$Completer3;
                    this.label = 1;
                    obj = this.this$0.invokeCaptureTasks(listOf, this.$captureMode$inlined, this.$flashMode$inlined, 1, null, this);
                    break;
                } else if (i2 == 1) {
                    callbackToFutureAdapter$Completer3 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    callbackToFutureAdapter$Completer = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    callbackToFutureAdapter$Completer.set(null);
                    break;
                }
                this.L$0 = callbackToFutureAdapter$Completer3;
                this.label = 2;
                if (AwaitKt.joinAll((Collection) obj, this) != coroutineSingletons) {
                    callbackToFutureAdapter$Completer = callbackToFutureAdapter$Completer3;
                    callbackToFutureAdapter$Completer.set(null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(CapturePipelineImpl.PipelineTask.POST_CAPTURE);
                    this.L$0 = callbackToFutureAdapter$Completer3;
                    this.label = 1;
                    capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1 = this;
                    obj = this.this$0.invokeCaptureTasks(listOf2, this.$captureMode$inlined, this.$flashMode$inlined, 1, null, capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1);
                    break;
                } else if (i3 == 1) {
                    callbackToFutureAdapter$Completer3 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1 = this;
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    callbackToFutureAdapter$Completer2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    callbackToFutureAdapter$Completer2.set(null);
                    break;
                }
                capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1.L$0 = callbackToFutureAdapter$Completer3;
                capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1.label = 2;
                if (AwaitKt.joinAll((Collection) obj, capturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1) != coroutineSingletons2) {
                    callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer3;
                    callbackToFutureAdapter$Completer2.set(null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
