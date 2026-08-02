package p6;

import D.x;

/* renamed from: p6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4848i implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4845f f39832n;

    /* renamed from: u, reason: collision with root package name */
    public final C4846g f39833u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4849j f39834v;

    public C4848i(C4849j c4849j, InterfaceC4845f interfaceC4845f, C4846g c4846g) {
        this.f39834v = c4849j;
        this.f39832n = interfaceC4845f;
        this.f39833u = c4846g;
        c4849j.f39836n.d(this, c4846g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f39833u.f39830w = true;
        C4847h c4847h = this.f39834v.f39836n;
        c4847h.getClass();
        q6.e c9 = c4847h.c(this);
        try {
            c4847h.f40061n.remove(c9);
            c4847h.e(c9);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(C4848i.class.getName()) && stackTraceElement.getMethodName().equals(com.anythink.expressad.foundation.d.d.cs)) {
                    int i4 = i + 2;
                    int i6 = i + 1;
                    if (i6 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i6];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i4 < stackTrace.length) {
                            i4 = i + 3;
                        }
                    }
                    if (stackTrace[i4].getMethodName().equals("invokeSuspend")) {
                        i4++;
                    }
                    if (i4 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i4];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() != this.f39833u.f39828u) {
                throw new IllegalStateException(x.m("Thread [", this.f39833u.f39827n, "] opened scope, but thread [", Thread.currentThread().getName(), "] closed it"), this.f39833u);
            }
            this.f39832n.close();
        } catch (Throwable th) {
            c4847h.e(c9);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f39833u.getMessage();
        return message != null ? message : super.toString();
    }
}
