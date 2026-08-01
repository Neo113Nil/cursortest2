package X7;

import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final transient InterfaceC5272i f3832n;

    public g(InterfaceC5272i interfaceC5272i) {
        this.f3832n = interfaceC5272i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3832n.toString();
    }
}
