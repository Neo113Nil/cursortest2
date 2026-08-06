package defpackage;

/* loaded from: classes.dex */
public final class eo extends java.lang.RuntimeException {
    public final transient defpackage.lj adDC3e2L;

    public eo(defpackage.lj ljVar) {
        this.adDC3e2L = ljVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return this.adDC3e2L.toString();
    }
}
