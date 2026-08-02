package defpackage;

import java.lang.Thread;

/* loaded from: classes5.dex */
public final class y9o implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw sgr.f(th).i("Uncaught exception in the SynchronizationContext. Re-thrown.").b();
    }
}
