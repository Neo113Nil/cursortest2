package androidx.lifecycle.viewmodel.internal;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class CloseableCoroutineScope implements AutoCloseable, CoroutineScope {
    public final CoroutineContext coroutineContext;

    public CloseableCoroutineScope(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        JobKt.cancel(this.coroutineContext, (CancellationException) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
