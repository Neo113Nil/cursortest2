package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.bumptech.glide.util.Executors$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final /* synthetic */ class Futures$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter$Resolver, AsyncFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListenableFuture f$0;

    public /* synthetic */ Futures$$ExternalSyntheticLambda0(ListenableFuture listenableFuture, int i) {
        this.$r8$classId = i;
        this.f$0 = listenableFuture;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        int i = this.$r8$classId;
        ListenableFuture listenableFuture = this.f$0;
        switch (i) {
            case 1:
                return ((CameraCapturePipeline) listenableFuture.get()).invokePreCapture();
            default:
                return ((CameraCapturePipeline) listenableFuture.get()).invokePostCapture();
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        Executors$1 directExecutor = zzabp.directExecutor();
        ListenableFuture listenableFuture = this.f$0;
        Futures.propagateTransform(false, listenableFuture, callbackToFutureAdapter$Completer, directExecutor);
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }
}
