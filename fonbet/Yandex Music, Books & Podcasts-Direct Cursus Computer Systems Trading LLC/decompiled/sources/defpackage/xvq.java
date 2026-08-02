package defpackage;

/* loaded from: classes4.dex */
public abstract class xvq {
    public static final float a = 24;
    public static final float b = 8;
    public static final float c = 40;
    public static final float d = 16;

    public static final void a(kwq kwqVar, vvo vvoVar, hvq hvqVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        kwqVar.getClass();
        vvoVar.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1754715801);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(vvoVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wct.l(kwqVar.a.b, ild.C(1040968779, new m3e(1, kwqVar, vvoVar, hvqVar), oq5Var), ild.C(1544342191, new jv(19, hvqVar, kwqVar), oq5Var), oq5Var, (i3 & 7168) | 432);
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 10, kwqVar, vvoVar, hvqVar, yciVar2);
        }
    }
}
