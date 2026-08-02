package defpackage;

/* loaded from: classes.dex */
public final class ct2 implements q0o {
    public final nyf a;
    public final r2f b;

    public ct2(nyf nyfVar, r2f r2fVar) {
        this.a = nyfVar;
        this.b = r2fVar;
    }

    @Override // defpackage.q0o
    public final void g() {
        this.a.d(this);
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        this.b.g(null);
    }

    @Override // defpackage.q0o
    public final void start() {
        this.a.a(this);
    }
}
