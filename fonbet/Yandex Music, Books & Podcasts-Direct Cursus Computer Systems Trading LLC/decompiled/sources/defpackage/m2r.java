package defpackage;

/* loaded from: classes.dex */
public final class m2r extends per {
    public Object c;

    public m2r(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        this.c = ((m2r) perVar).c;
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new m2r(g2r.k().g(), this.c);
    }
}
