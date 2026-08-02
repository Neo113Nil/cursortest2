package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import com.bugsnag.android.Client;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class ChainingListenableFuture extends FutureChain implements Runnable {
    public AsyncFunction mFunction;
    public ListenableFuture mInputFuture;
    public final LinkedBlockingQueue mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    public final CountDownLatch mOutputCreated = new CountDownLatch(1);
    public volatile ListenableFuture mOutputFuture;

    public ChainingListenableFuture(AsyncFunction asyncFunction, ListenableFuture listenableFuture) {
        this.mFunction = asyncFunction;
        listenableFuture.getClass();
        this.mInputFuture = listenableFuture;
    }

    public static Object takeUninterruptibly(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
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
        return take;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.mDelegate.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.mMayInterruptIfRunningChannel.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.mInputFuture;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.mOutputFuture;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!this.mDelegate.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.mOutputCreated.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - nanoTime2);
            ListenableFuture listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return this.mDelegate.get(j, timeUnit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.camera.core.impl.utils.futures.ChainingListenableFuture, androidx.camera.core.impl.utils.futures.FutureChain, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.camera.core.impl.utils.futures.ChainingListenableFuture] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.camera.core.impl.utils.futures.FutureChain] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.camera.core.impl.utils.futures.FutureChain] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.camera.core.impl.utils.futures.FutureChain] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        ChainingListenableFuture chainingListenableFuture;
        boolean z = false;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture apply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                            this.mOutputFuture = apply;
                            if (this.mDelegate.isCancelled()) {
                                apply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                                this.mOutputFuture = null;
                            } else {
                                apply.addListener(new Client.AnonymousClass4(this, apply, z, 3), zzabp.directExecutor());
                            }
                        } catch (Error e) {
                            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.mCompleter;
                            chainingListenableFuture = this;
                            if (callbackToFutureAdapter$Completer != null) {
                                callbackToFutureAdapter$Completer.setException(e);
                                chainingListenableFuture = this;
                            }
                        }
                    } catch (UndeclaredThrowableException e2) {
                        Throwable cause = e2.getCause();
                        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = this.mCompleter;
                        chainingListenableFuture = this;
                        if (callbackToFutureAdapter$Completer2 != null) {
                            callbackToFutureAdapter$Completer2.setException(cause);
                            chainingListenableFuture = this;
                        }
                    }
                } finally {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                Throwable cause2 = e3.getCause();
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = this.mCompleter;
                if (callbackToFutureAdapter$Completer3 != null) {
                    callbackToFutureAdapter$Completer3.setException(cause2);
                }
            }
        } catch (Exception e4) {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer4 = this.mCompleter;
            chainingListenableFuture = this;
            if (callbackToFutureAdapter$Completer4 != null) {
                callbackToFutureAdapter$Completer4.setException(e4);
                chainingListenableFuture = this;
            }
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public final Object get() {
        if (!this.mDelegate.isDone()) {
            ListenableFuture listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            ListenableFuture listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.mDelegate.get();
    }
}
