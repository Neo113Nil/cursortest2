package P0;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: f, reason: collision with root package name */
    public final transient v0.i f872f;

    public g(v0.i iVar) {
        this.f872f = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f872f.toString();
    }
}
