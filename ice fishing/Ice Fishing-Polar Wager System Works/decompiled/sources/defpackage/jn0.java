package defpackage;

/* loaded from: classes.dex */
public final class jn0 {
    public int IHQe1A4L2xu;
    public java.lang.Object adDC3e2L;
    public java.lang.Object xiZrDbcSW0;
    public java.lang.Object oh6vYeIP = new defpackage.i40[32];
    public java.lang.Object r1MBDhnF = new float[32];
    public java.lang.Object F7NU4MC0GW = new byte[32];

    public jn0() {
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.adDC3e2L = new defpackage.ol0();
        this.xiZrDbcSW0 = new defpackage.ol0();
    }

    public defpackage.fn0 IHQe1A4L2xu(java.lang.String str) {
        defpackage.en0 en0Var;
        str.getClass();
        defpackage.le1 le1Var = (defpackage.le1) this.xiZrDbcSW0;
        if (le1Var == null || (en0Var = (defpackage.en0) le1Var.getValue()) == null) {
            return null;
        }
        int i = defpackage.gn0.riuEU0zW4;
        android.net.Uri parse = android.net.Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        android.os.Bundle F7NU4MC0GW = en0Var.F7NU4MC0GW(parse, (java.util.LinkedHashMap) this.F7NU4MC0GW);
        if (F7NU4MC0GW == null) {
            return null;
        }
        return new defpackage.fn0((defpackage.gn0) this.oh6vYeIP, F7NU4MC0GW, en0Var.JlrlGoKF, en0Var.oh6vYeIP(parse), false);
    }
}
