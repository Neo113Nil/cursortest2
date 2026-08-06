package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j60 {
    public static int Ns0WNyEWdPsk;
    public static final defpackage.hu fNwYGHIYeJcR = new defpackage.hu(10);
    public final int GE9mJIPrb8gP;
    public final float JhCgjQRTAOCT;
    public final int P05cfTpS5W5L;
    public final long QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final boolean e6mdH7fiFuta;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;
    public final defpackage.at1 oh71FJcDz6S2;

    public j60(java.lang.String str, float f, float f2, float f3, float f4, defpackage.at1 at1Var, long j, int i, boolean z) {
        int i2;
        synchronized (fNwYGHIYeJcR) {
            i2 = Ns0WNyEWdPsk;
            Ns0WNyEWdPsk = i2 + 1;
        }
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = f;
        this.fWTAfUmVKrZq = f2;
        this.JhCgjQRTAOCT = f3;
        this.WDYagTQQm9ns = f4;
        this.oh71FJcDz6S2 = at1Var;
        this.QiMR8OkAhezm = j;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = z;
        this.GE9mJIPrb8gP = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.j60)) {
            return false;
        }
        defpackage.j60 j60Var = (defpackage.j60) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, j60Var.ZpBGe2uQfcn8) && defpackage.or.giKS3J6vZuNy(this.giKS3J6vZuNy, j60Var.giKS3J6vZuNy) && defpackage.or.giKS3J6vZuNy(this.fWTAfUmVKrZq, j60Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT == j60Var.JhCgjQRTAOCT && this.WDYagTQQm9ns == j60Var.WDYagTQQm9ns && this.oh71FJcDz6S2.equals(j60Var.oh71FJcDz6S2) && defpackage.pf.fWTAfUmVKrZq(this.QiMR8OkAhezm, j60Var.QiMR8OkAhezm) && this.P05cfTpS5W5L == j60Var.P05cfTpS5W5L && this.e6mdH7fiFuta == j60Var.e6mdH7fiFuta;
    }

    public final int hashCode() {
        int hashCode = (this.oh71FJcDz6S2.hashCode() + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Boolean.hashCode(this.e6mdH7fiFuta) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.P05cfTpS5W5L, defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(hashCode, 31, this.QiMR8OkAhezm), 31);
    }
}
