package defpackage;

/* loaded from: classes.dex */
public final class cwc extends RuntimeException {
    public final dwc a;
    public final Throwable b;

    public cwc(dwc dwcVar, Throwable th) {
        super(th);
        this.a = dwcVar;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
