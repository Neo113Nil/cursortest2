package defpackage;

/* loaded from: classes6.dex */
public abstract class bfs {
    public static final agr a = new agr(wjp.F);
    public static final agr b = new agr(wjp.J);
    public static final agr c = new agr(wjp.H);

    public static final void a(boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        boolean B;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(684201976);
        if (((i | 2) & 19) == 18 && oq5Var.z()) {
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
            float f = 4;
            etn.m(new qzm[]{a.a(B ? new h95(z87.a, z87.b, z87.c, z87.d, z87.e, z87.f, z87.g) : new h95(lzf.a, lzf.b, lzf.c, lzf.d, lzf.e, lzf.f, lzf.g)), b.a(new tdt(ges.d, ((jx7) oq5Var.j(es5.h)).l(7), 0.8f)), c.a(new u3r(f, f, 3.8f, 2))}, ild.s(oq5Var, 1528515768, new pp0(wn5Var, 6)), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f9k(B, wn5Var, i, 2);
        }
    }
}
