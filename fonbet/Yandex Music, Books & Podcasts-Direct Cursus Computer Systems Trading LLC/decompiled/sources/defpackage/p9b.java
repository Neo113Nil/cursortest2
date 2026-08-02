package defpackage;

/* loaded from: classes3.dex */
public abstract class p9b {
    public static final float a = 64;

    public static final void a(wn5 wn5Var, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(638211994);
        int i3 = (oq5Var.f(yciVar) ? 32 : 16) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z2 = true;
            if (i4 != 0) {
                z = true;
            }
            qzm[] qzmVarArr = new qzm[0];
            if (z) {
                oq5Var.Z(-846547737);
            } else {
                oq5Var.Z(-858591168);
                z2 = true ^ ((ma5) oq5Var.j(pa5.a)).g();
            }
            oq5Var.p(false);
            jf0.a(qzmVarArr, null, z2, ild.C(792349202, new pg6(yciVar, wn5Var, 1, (byte) 0), oq5Var), oq5Var, 3072, 2);
        }
        boolean z3 = z;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(wn5Var, yciVar, z3, i, i2, 2);
        }
    }
}
