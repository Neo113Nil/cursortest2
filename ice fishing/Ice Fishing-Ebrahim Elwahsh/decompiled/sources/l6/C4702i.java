package l6;

import D.y;

/* renamed from: l6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4702i implements InterfaceC4699f {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4699f f39065n;

    /* renamed from: u, reason: collision with root package name */
    public final C4700g f39066u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4703j f39067v;

    public C4702i(C4703j c4703j, InterfaceC4699f interfaceC4699f, C4700g c4700g) {
        this.f39067v = c4703j;
        this.f39065n = interfaceC4699f;
        this.f39066u = c4700g;
        c4703j.f39069n.d(this, c4700g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f39066u.f39063w = true;
        C4701h c4701h = this.f39067v.f39069n;
        c4701h.getClass();
        m6.e c4 = c4701h.c(this);
        try {
            c4701h.f39576n.remove(c4);
            c4701h.e(c4);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement.getClassName().equals(C4702i.class.getName()) && stackTraceElement.getMethodName().equals(com.anythink.expressad.foundation.d.d.cs)) {
                    int i4 = i + 2;
                    int i9 = i + 1;
                    if (i9 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i9];
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
            if (Thread.currentThread().getId() != this.f39066u.f39061u) {
                throw new IllegalStateException(y.l("Thread [", this.f39066u.f39060n, "] opened scope, but thread [", Thread.currentThread().getName(), "] closed it"), this.f39066u);
            }
            this.f39065n.close();
        } catch (Throwable th) {
            c4701h.e(c4);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f39066u.getMessage();
        return message != null ? message : super.toString();
    }
}
