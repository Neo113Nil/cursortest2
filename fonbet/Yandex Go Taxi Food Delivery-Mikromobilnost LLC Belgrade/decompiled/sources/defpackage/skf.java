package defpackage;

/* loaded from: classes2.dex */
public final class skf implements r3l0 {
    public final tbl a;
    public final int b;
    public final qgh c;
    public final vkr d;
    public final chr e;
    public final chr f;
    public final s1r g;
    public final boolean h;

    public skf(tbl tblVar, int i, qgh qghVar, vkr vkrVar, chr chrVar, chr chrVar2, s1r s1rVar, boolean z) {
        this.a = tblVar;
        this.b = i;
        this.c = qghVar;
        this.d = vkrVar;
        this.e = chrVar;
        this.f = chrVar2;
        this.g = s1rVar;
        this.h = z;
    }

    @Override // defpackage.r3l0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rkf get() {
        tbl tblVar = this.a;
        return new rkf(this.b, new qyl(tblVar), new oyl(tblVar), this.h ? new yif(tblVar, 0) : new yif(tblVar, 1), this.c, this.d, this.e, this.f, this.g);
    }
}
