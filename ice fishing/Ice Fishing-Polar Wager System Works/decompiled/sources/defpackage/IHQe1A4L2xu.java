package defpackage;

/* loaded from: classes.dex */
public final class IHQe1A4L2xu extends java.util.concurrent.CancellationException {
    public final transient java.lang.Object adDC3e2L;

    public IHQe1A4L2xu(defpackage.iw iwVar) {
        super("Flow was aborted, no more elements needed");
        this.adDC3e2L = iwVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
