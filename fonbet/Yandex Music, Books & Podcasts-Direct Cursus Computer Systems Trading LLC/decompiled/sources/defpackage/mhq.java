package defpackage;

/* loaded from: classes4.dex */
public final class mhq {
    public final lhq a;
    public final hjl b;
    public final String c;
    public final by7 d;

    public mhq(xhq xhqVar, lhq lhqVar, hjl hjlVar) {
        hjlVar.getClass();
        this.a = lhqVar;
        this.b = hjlVar;
        this.c = xhqVar.d.c;
        this.d = sj2.q(xhqVar.h, hjlVar.c, new j1p(10));
    }

    public final qkl a(qkl qklVar, mqs mqsVar) {
        if (qklVar == null) {
            dfi.r("Can't get analytics payload", "SimilarTracksBlock");
        }
        if (qklVar != null) {
            return qklVar;
        }
        gjl gjlVar = new gjl((pkl) this.b.c.getValue(), 0, 6);
        mqsVar.getClass();
        return new qkl(gjlVar, szf.M(mqsVar, 0, 0));
    }
}
