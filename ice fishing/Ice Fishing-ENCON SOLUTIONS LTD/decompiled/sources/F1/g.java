package F1;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient l1.i f601a;

    public g(l1.i iVar) {
        this.f601a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f601a.toString();
    }
}
