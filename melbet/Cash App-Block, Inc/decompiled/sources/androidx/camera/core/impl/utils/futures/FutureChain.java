package androidx.camera.core.impl.utils.futures;

import androidx.camera.view.PreviewView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.room.util.DBUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class FutureChain implements ListenableFuture {
    public CallbackToFutureAdapter$Completer mCompleter;
    public final ListenableFuture mDelegate;

    public FutureChain() {
        this.mDelegate = DBUtil.getFuture(new PreviewView.AnonymousClass1(this, false));
    }

    public static FutureChain from(ListenableFuture listenableFuture) {
        return listenableFuture instanceof FutureChain ? (FutureChain) listenableFuture : new FutureChain(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.mDelegate.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.mDelegate.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.mDelegate.get(j, timeUnit);
    }

    public FutureChain(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.mDelegate = listenableFuture;
    }
}
