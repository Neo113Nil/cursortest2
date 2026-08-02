package defpackage;

/* loaded from: classes5.dex */
public final class wgr extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final sgr a;
    public final boolean b;

    public wgr(sgr sgrVar, boolean z) {
        super(sgr.d(sgrVar), sgrVar.c);
        this.a = sgrVar;
        this.b = z;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.b ? super.fillInStackTrace() : this;
    }
}
