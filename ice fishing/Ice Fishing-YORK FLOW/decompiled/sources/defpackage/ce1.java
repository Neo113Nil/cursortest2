package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ce1 {
    public static final defpackage.mx1 JhCgjQRTAOCT;
    public static final defpackage.mx1 WDYagTQQm9ns;
    public static final defpackage.zw ZpBGe2uQfcn8 = new defpackage.zw(defpackage.mq.oh71FJcDz6S2, 1.0f);
    public static final defpackage.zw fWTAfUmVKrZq;
    public static final defpackage.zw giKS3J6vZuNy;

    static {
        defpackage.mq mqVar = defpackage.mq.WDYagTQQm9ns;
        giKS3J6vZuNy = new defpackage.zw(mqVar, 1.0f);
        fWTAfUmVKrZq = new defpackage.zw(defpackage.mq.QiMR8OkAhezm, 1.0f);
        defpackage.da daVar = defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j;
        int i = 24;
        JhCgjQRTAOCT = new defpackage.mx1(mqVar, new defpackage.l2(i, daVar), daVar);
        defpackage.da daVar2 = defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ;
        WDYagTQQm9ns = new defpackage.mx1(mqVar, new defpackage.l2(i, daVar2), daVar2);
    }

    public static defpackage.vl0 JhCgjQRTAOCT(defpackage.vl0 vl0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return vl0Var.fWTAfUmVKrZq(new defpackage.be1(f, f2));
    }

    public static final defpackage.vl0 P05cfTpS5W5L(defpackage.vl0 vl0Var, float f) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.be1(112.0f, 48.0f, 280.0f, f, true));
    }

    public static final defpackage.vl0 QiMR8OkAhezm(defpackage.vl0 vl0Var, float f) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.be1(f, 25.0f, f, 25.0f, true));
    }

    public static defpackage.vl0 WDYagTQQm9ns(defpackage.vl0 vl0Var, float f, float f2, float f3, float f4, int i) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.be1(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    public static final defpackage.vl0 ZpBGe2uQfcn8(defpackage.vl0 vl0Var, float f, float f2) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.ns1(f, f2));
    }

    public static defpackage.vl0 e6mdH7fiFuta(defpackage.vl0 vl0Var) {
        defpackage.mx1 mx1Var;
        defpackage.da daVar = defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j;
        if (defpackage.ma0.QiMR8OkAhezm(daVar, daVar)) {
            mx1Var = JhCgjQRTAOCT;
        } else if (defpackage.ma0.QiMR8OkAhezm(daVar, defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ)) {
            mx1Var = WDYagTQQm9ns;
        } else {
            mx1Var = new defpackage.mx1(defpackage.mq.WDYagTQQm9ns, new defpackage.l2(24, daVar), daVar);
        }
        return vl0Var.fWTAfUmVKrZq(mx1Var);
    }

    public static final defpackage.vl0 fWTAfUmVKrZq(defpackage.vl0 vl0Var, float f) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.be1(f, f));
    }

    public static final defpackage.vl0 giKS3J6vZuNy(defpackage.vl0 vl0Var, float f) {
        return vl0Var.fWTAfUmVKrZq(f == 1.0f ? ZpBGe2uQfcn8 : new defpackage.zw(defpackage.mq.oh71FJcDz6S2, f));
    }

    public static final defpackage.vl0 oh71FJcDz6S2(float f) {
        return new defpackage.be1(f, f, f, f, true);
    }
}
