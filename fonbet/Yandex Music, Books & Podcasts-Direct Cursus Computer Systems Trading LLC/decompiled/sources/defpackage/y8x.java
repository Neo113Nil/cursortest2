package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class y8x implements a9x {
    public static final pbx a = new pbx(3, y8x.class);

    @Override // defpackage.a9x
    public final void b(Runnable runnable, Executor executor) {
        if (executor == null) {
            jj4.j("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            a.c().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", hrg.r("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Integer num = 0;
        return k5r.m(super.toString(), "[status=SUCCESS, result=[", num.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
    }
}
