package defpackage;

/* loaded from: classes5.dex */
public final class tgr extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final sgr a;
    public final s2i b;
    public final boolean c;

    public tgr(sgr sgrVar, s2i s2iVar) {
        super(sgr.d(sgrVar), sgrVar.c);
        this.a = sgrVar;
        this.b = s2iVar;
        this.c = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.c ? super.fillInStackTrace() : this;
    }
}
