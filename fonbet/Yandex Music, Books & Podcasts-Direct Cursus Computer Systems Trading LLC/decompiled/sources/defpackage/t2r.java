package defpackage;

/* loaded from: classes.dex */
public final class t2r extends per {
    public dmk c;
    public int d;

    public t2r(long j, dmk dmkVar) {
        super(j);
        this.c = dmkVar;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        t2r t2rVar = (t2r) perVar;
        synchronized (wct.g) {
            this.c = t2rVar.c;
            this.d = t2rVar.d;
        }
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new t2r(j, this.c);
    }
}
