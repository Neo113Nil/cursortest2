package p6;

import D.y;

/* renamed from: p6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4848i implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4845f f39785n;

    /* renamed from: u, reason: collision with root package name */
    public final C4846g f39786u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4849j f39787v;

    public C4848i(C4849j c4849j, InterfaceC4845f interfaceC4845f, C4846g c4846g) {
        this.f39787v = c4849j;
        this.f39785n = interfaceC4845f;
        this.f39786u = c4846g;
        c4849j.f39789n.d(this, c4846g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f39786u.f39783w = true;
        C4847h c4847h = this.f39787v.f39789n;
        c4847h.getClass();
        q6.e c9 = c4847h.c(this);
        try {
            c4847h.f40250n.remove(c9);
            c4847h.e(c9);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(C4848i.class.getName()) && stackTraceElement.getMethodName().equals(com.anythink.expressad.foundation.d.d.cs)) {
                    int i6 = i + 2;
                    int i9 = i + 1;
                    if (i9 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i9];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i6 < stackTrace.length) {
                            i6 = i + 3;
                        }
                    }
                    if (stackTrace[i6].getMethodName().equals("invokeSuspend")) {
                        i6++;
                    }
                    if (i6 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i6];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() != this.f39786u.f39781u) {
                throw new IllegalStateException(y.p("Thread [", this.f39786u.f39780n, "] opened scope, but thread [", Thread.currentThread().getName(), "] closed it"), this.f39786u);
            }
            this.f39785n.close();
        } catch (Throwable th) {
            c4847h.e(c9);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f39786u.getMessage();
        return message != null ? message : super.toString();
    }
}
