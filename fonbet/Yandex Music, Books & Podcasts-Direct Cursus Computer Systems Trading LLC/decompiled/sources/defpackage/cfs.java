package defpackage;

/* loaded from: classes6.dex */
public abstract class cfs {
    public static final agr a = new agr(wjp.G);
    public static final agr b = new agr(wjp.K);
    public static final agr c = new agr(wjp.I);

    public static final void a(boolean z, wbl wblVar, wn5 wn5Var, hq5 hq5Var, int i) {
        boolean B;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1107609198);
        if (((i | 2 | (oq5Var.f(wblVar) ? 32 : 16)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            B = z;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                B = xv7.B(oq5Var);
            } else {
                oq5Var.S();
                B = z;
            }
            oq5Var.q();
            g95 g95Var = B ? new g95(a97.a, a97.b, a97.c, a97.d, a97.e, a97.f, a97.g) : new g95(mzf.a, mzf.b, mzf.c, mzf.d, mzf.e, mzf.f, mzf.g);
            kes kesVar = wblVar.a;
            oq5Var.a0(1000554526);
            long l = kesVar == null ? ((jx7) oq5Var.j(es5.h)).l(7) : kesVar.a;
            oq5Var.p(false);
            float f = 4;
            etn.m(new qzm[]{a.a(g95Var), b.a(new sdt(new ges(0L, l, null, null, null, null, null, 0L, null, 0, 0L, null, null, 0, 16777213), 0.8f)), c.a(new v3r(f, f, 2))}, ild.s(oq5Var, 82132178, new pp0(wn5Var, 7)), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new afs(B, wblVar, wn5Var, i);
        }
    }
}
