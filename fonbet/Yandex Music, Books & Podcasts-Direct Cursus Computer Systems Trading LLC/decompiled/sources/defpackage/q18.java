package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class q18 extends RuntimeException {
    public final transient CoroutineContext a;

    public q18(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.a);
    }
}
