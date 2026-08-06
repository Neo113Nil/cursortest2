package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i60 {
    public final defpackage.h60 GE9mJIPrb8gP;
    public final float JhCgjQRTAOCT;
    public boolean Ns0WNyEWdPsk;
    public final boolean P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final java.util.ArrayList e6mdH7fiFuta;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;
    public final long oh71FJcDz6S2;

    public i60(java.lang.String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? defpackage.pf.QiMR8OkAhezm : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = f;
        this.fWTAfUmVKrZq = f2;
        this.JhCgjQRTAOCT = f3;
        this.WDYagTQQm9ns = f4;
        this.oh71FJcDz6S2 = j2;
        this.QiMR8OkAhezm = i3;
        this.P05cfTpS5W5L = z2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.e6mdH7fiFuta = arrayList;
        defpackage.h60 h60Var = new defpackage.h60(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.GE9mJIPrb8gP = h60Var;
        arrayList.add(h60Var);
    }

    public static void ZpBGe2uQfcn8(defpackage.i60 i60Var, java.util.ArrayList arrayList, defpackage.lf1 lf1Var) {
        if (i60Var.Ns0WNyEWdPsk) {
            defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((defpackage.h60) i60Var.e6mdH7fiFuta.get(r0.size() - 1)).GE9mJIPrb8gP.add(new defpackage.et1("", arrayList, 0, lf1Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final defpackage.j60 giKS3J6vZuNy() {
        if (this.Ns0WNyEWdPsk) {
            defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            java.util.ArrayList arrayList = this.e6mdH7fiFuta;
            if (arrayList.size() <= 1) {
                defpackage.h60 h60Var = this.GE9mJIPrb8gP;
                defpackage.j60 j60Var = new defpackage.j60(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT, this.WDYagTQQm9ns, new defpackage.at1(h60Var.ZpBGe2uQfcn8, h60Var.giKS3J6vZuNy, h60Var.fWTAfUmVKrZq, h60Var.JhCgjQRTAOCT, h60Var.WDYagTQQm9ns, h60Var.oh71FJcDz6S2, h60Var.QiMR8OkAhezm, h60Var.P05cfTpS5W5L, h60Var.e6mdH7fiFuta, h60Var.GE9mJIPrb8gP), this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L);
                this.Ns0WNyEWdPsk = true;
                return j60Var;
            }
            if (this.Ns0WNyEWdPsk) {
                defpackage.e80.giKS3J6vZuNy("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            defpackage.h60 h60Var2 = (defpackage.h60) arrayList.remove(arrayList.size() - 1);
            ((defpackage.h60) arrayList.get(arrayList.size() - 1)).GE9mJIPrb8gP.add(new defpackage.at1(h60Var2.ZpBGe2uQfcn8, h60Var2.giKS3J6vZuNy, h60Var2.fWTAfUmVKrZq, h60Var2.JhCgjQRTAOCT, h60Var2.WDYagTQQm9ns, h60Var2.oh71FJcDz6S2, h60Var2.QiMR8OkAhezm, h60Var2.P05cfTpS5W5L, h60Var2.e6mdH7fiFuta, h60Var2.GE9mJIPrb8gP));
        }
    }
}
