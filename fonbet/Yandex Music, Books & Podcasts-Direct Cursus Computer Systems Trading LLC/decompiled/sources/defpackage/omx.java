package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class omx implements a9x {
    public final WeakReference a;
    public final bmx b = new bmx(this);

    public omx(nkx nkxVar) {
        this.a = new WeakReference(nkxVar);
    }

    @Override // defpackage.a9x
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        nkx nkxVar = (nkx) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || nkxVar == null) {
            return cancel;
        }
        nkxVar.a = null;
        nkxVar.b = null;
        nkxVar.c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof rax;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
