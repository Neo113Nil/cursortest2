package defpackage;

/* loaded from: classes.dex */
public final class mhs implements aoo {
    public final aoo a;
    public final long b;

    public mhs(aoo aooVar, long j) {
        this.a = aooVar;
        this.b = j;
    }

    @Override // defpackage.aoo
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.aoo
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        int q = this.a.q(qdcVar, qg7Var, i);
        if (q == -4) {
            qg7Var.k += this.b;
        }
        return q;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        return this.a.x(j - this.b);
    }
}
