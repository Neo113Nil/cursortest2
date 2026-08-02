package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class jbk extends a {
    public final a d;
    public final AtomicInteger e;
    public volatile boolean f;
    public final LinkedBlockingQueue g;

    public jbk(bsd bsdVar) {
        bsdVar.getClass();
        this.d = bsdVar;
        this.e = new AtomicInteger();
        this.f = true;
        this.g = new LinkedBlockingQueue();
    }

    @Override // kotlinx.coroutines.a
    public final void F0(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        this.e.incrementAndGet();
        a aVar = this.d;
        ibk ibkVar = new ibk(runnable, coroutineContext, aVar);
        if (this.f) {
            this.g.offer(ibkVar);
        } else {
            aVar.F0(coroutineContext, runnable);
        }
    }
}
