package defpackage;

/* loaded from: classes9.dex */
public final class wol implements vol {
    public final mw5 b;
    public final tol c;

    public wol(mw5 mw5Var, tol tolVar) {
        this.b = mw5Var;
        this.c = tolVar;
    }

    @Override // defpackage.vol
    public final dee a(bpl bplVar) {
        dee deeVar = new dee(bplVar, this.b);
        deeVar.d = this.c;
        return deeVar;
    }

    public wol() {
        this(null, null);
    }
}
