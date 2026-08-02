package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes11.dex */
public final class vo91 implements wp91 {
    public static final c7y a = new c7y(vo91.class);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // defpackage.wp91
    public final void d(Runnable runnable, Executor executor) {
        if (executor == null) {
            ny61.t("Executor was null.");
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            a.b().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", b64.l("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
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
        return unr0.o(super.toString(), "[status=SUCCESS, result=[", num.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return 0;
    }
}
