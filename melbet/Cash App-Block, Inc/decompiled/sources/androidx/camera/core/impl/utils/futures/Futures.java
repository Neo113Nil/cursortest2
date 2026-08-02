package androidx.camera.core.impl.utils.futures;

import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import com.bugsnag.android.Client;
import com.bumptech.glide.util.Executors$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public abstract class Futures {
    public static void addCallback(ListenableFuture listenableFuture, FutureCallback futureCallback, Executor executor) {
        futureCallback.getClass();
        listenableFuture.addListener(new Client.AnonymousClass4(1, listenableFuture, futureCallback), executor);
    }

    public static Object getDone(Future future) {
        TransactorKt.checkState("Future was expected to be done, " + future, future.isDone());
        return getUninterruptibly(future);
    }

    public static Object getUninterruptibly(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static ImmediateFuture$ImmediateFailedFuture immediateFuture(Object obj) {
        return obj == null ? ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE : new ImmediateFuture$ImmediateFailedFuture(obj, 1);
    }

    public static ListenableFuture nonCancellationPropagating(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : DBUtil.getFuture(new Futures$$ExternalSyntheticLambda0(listenableFuture, 0));
    }

    public static void propagateTransform(boolean z, ListenableFuture listenableFuture, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, Executors$1 executors$1) {
        listenableFuture.getClass();
        callbackToFutureAdapter$Completer.getClass();
        executors$1.getClass();
        addCallback(listenableFuture, new Recorder.AnonymousClass6(callbackToFutureAdapter$Completer, 12), executors$1);
        if (z) {
            callbackToFutureAdapter$Completer.addCancellationListener(new Client.AnonymousClass7(listenableFuture, 8), zzabp.directExecutor());
        }
    }

    public static ChainingListenableFuture transformAsync(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }
}
