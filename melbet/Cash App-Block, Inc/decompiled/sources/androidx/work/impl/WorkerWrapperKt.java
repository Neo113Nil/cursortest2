package androidx.work.impl;

import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger$LogcatLogger;
import com.google.android.gms.tasks.zzi;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class WorkerWrapperKt {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("WorkerWrapper");

    public static final Object awaitWithin(ListenableFuture listenableFuture, ListenableWorker listenableWorker, SuspendLambda suspendLambda) {
        Object obj;
        try {
            int i = 0;
            if (!listenableFuture.isDone()) {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(suspendLambda));
                cancellableContinuationImpl.initCancellability();
                listenableFuture.addListener(new zzi(listenableFuture, cancellableContinuationImpl), DirectExecutor.INSTANCE);
                cancellableContinuationImpl.invokeOnCancellation(new WorkerWrapperKt$awaitWithin$2$1(i, listenableWorker, listenableFuture));
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return result;
            }
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
