package defpackage;

/* loaded from: classes4.dex */
public abstract class jft {
    public static final agr a = new agr(new hft(0));
    public static final agr b = new agr(new hft(1));
    public static final agr c = new agr(new hft(2));

    public static final void a(lmn lmnVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(321148384);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(lmnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            etn.m(new qzm[]{a.a(lmnVar.a ? lmnVar.e : lmnVar.d), b.a(lmnVar.b), c.a(lmnVar.c)}, wn5Var, oq5Var, (i2 & 112) | 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(lmnVar, wn5Var, i, 24);
        }
    }
}
