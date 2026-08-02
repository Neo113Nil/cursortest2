package defpackage;

/* loaded from: classes.dex */
public final class r2r extends per {
    public m8 c;
    public int d;
    public int e;

    public r2r(long j, m8 m8Var) {
        super(j);
        this.c = m8Var;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        synchronized (fgq.g) {
            perVar.getClass();
            this.c = ((r2r) perVar).c;
            this.d = ((r2r) perVar).d;
            this.e = ((r2r) perVar).e;
        }
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new r2r(j, this.c);
    }
}
