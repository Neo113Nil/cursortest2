package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class z5r {
    public static final /* synthetic */ s9f[] i;
    public final mm6 a;
    public final tc1 b;
    public final kj3 c;
    public final y5r d = new y5r(this, 0);
    public final y5r e = new y5r(this, 1);
    public final jyr f = btf.b(new nrq(14));
    public rar g;
    public e6r h;

    static {
        opi opiVar = new opi(z5r.class, "alpha", "getAlpha()F", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar, new opi(z5r.class, "collapsedMode", "getCollapsedMode()Z", 0)};
    }

    public z5r(mm6 mm6Var, tc1 tc1Var, kxi kxiVar) {
        this.a = mm6Var;
        this.b = tc1Var;
        this.c = new kj3(kxiVar.a);
    }

    public final void a(e6r e6rVar) {
        this.h = e6rVar;
        e6rVar.c = new c5p(5, this);
        rar rarVar = this.g;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        iug iugVar = (iug) this.f.getValue();
        this.g = ox6.B(new u21(10, zsd.b0(new njf(((oq7) iugVar.b.getValue()).a.c, iugVar, 4)), new bca(((snu) iugVar.c.getValue()).b, 18), new hk4(3, 5, continuation)), this.a, new ryp(16, this));
        s9f[] s9fVarArr = i;
        s9f s9fVar = s9fVarArr[0];
        y5r y5rVar = this.d;
        y5rVar.setValue(this, s9fVarArr[0], Float.valueOf(((Number) y5rVar.getValue(this, s9fVar)).floatValue()));
    }
}
