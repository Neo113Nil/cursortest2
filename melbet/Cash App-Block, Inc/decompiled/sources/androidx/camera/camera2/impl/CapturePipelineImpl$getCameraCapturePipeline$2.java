package androidx.camera.camera2.impl;

import _COROUTINE.ArtificialStackFrames;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl$getCameraCapturePipeline$2 implements CameraCapturePipeline {
    public final /* synthetic */ int $captureMode;
    public final /* synthetic */ int $flashMode;
    public final /* synthetic */ CapturePipelineImpl this$0;

    public CapturePipelineImpl$getCameraCapturePipeline$2(CapturePipelineImpl capturePipelineImpl, int i, int i2) {
        this.this$0 = capturePipelineImpl;
        this.$captureMode = i;
        this.$flashMode = i2;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePostCapture() {
        CapturePipelineImpl capturePipelineImpl = this.this$0;
        ContextScope contextScope = capturePipelineImpl.threads.scope;
        int i = this.$captureMode;
        int i2 = this.$flashMode;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = ArtificialStackFrames.class;
        try {
            callbackToFutureAdapter$Completer.tag = JobKt.launch$default(contextScope, null, null, new CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1(callbackToFutureAdapter$Completer, null, capturePipelineImpl, i, i2, 1), 3);
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        return callbackToFutureAdapter$SafeFuture;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePreCapture() {
        CapturePipelineImpl capturePipelineImpl = this.this$0;
        ContextScope contextScope = capturePipelineImpl.threads.scope;
        int i = this.$captureMode;
        int i2 = this.$flashMode;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = OnBackPressedDispatcherKt.class;
        try {
            callbackToFutureAdapter$Completer.tag = JobKt.launch$default(contextScope, null, null, new CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1(callbackToFutureAdapter$Completer, null, capturePipelineImpl, i, i2, 0), 3);
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        return callbackToFutureAdapter$SafeFuture;
    }
}
