package defpackage;

/* loaded from: classes4.dex */
public abstract class yvq {
    public static final float a = 24;
    public static final float b = 8;
    public static final float c = 40;

    public static final void a(hvq hvqVar, vvo vvoVar, yci yciVar, hq5 hq5Var, int i) {
        hvqVar.getClass();
        vvoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(737037808);
        if ((((oq5Var.h(hvqVar) ? 4 : 2) | i | (oq5Var.h(vvoVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            tt0.g(szf.Q(hvqVar.m(), oq5Var).getValue(), null, weo.S(600, 0, null, 6), "SlidesCrossfade", ild.C(1048475618, new aqp(4, hvqVar, yciVar, vvoVar), oq5Var), oq5Var, 28032, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(hvqVar, vvoVar, yciVar, i, 17);
        }
    }
}
