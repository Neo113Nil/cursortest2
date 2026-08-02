package X7;

import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final transient InterfaceC5245i f3787n;

    public g(InterfaceC5245i interfaceC5245i) {
        this.f3787n = interfaceC5245i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3787n.toString();
    }
}
