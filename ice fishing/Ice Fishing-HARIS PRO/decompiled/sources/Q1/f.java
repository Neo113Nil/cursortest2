package Q1;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient v1.i f943a;

    public f(v1.i iVar) {
        this.f943a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f943a.toString();
    }
}
