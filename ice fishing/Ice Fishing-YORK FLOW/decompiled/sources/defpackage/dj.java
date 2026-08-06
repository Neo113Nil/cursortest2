package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dj {
    public int QiMR8OkAhezm;
    public final defpackage.e30 ZpBGe2uQfcn8;
    public int fNwYGHIYeJcR;
    public boolean fWTAfUmVKrZq;
    public defpackage.nd giKS3J6vZuNy;
    public int oh71FJcDz6S2;
    public final defpackage.v90 JhCgjQRTAOCT = new defpackage.v90();
    public boolean WDYagTQQm9ns = true;
    public final java.util.ArrayList P05cfTpS5W5L = new java.util.ArrayList();
    public int e6mdH7fiFuta = -1;
    public int GE9mJIPrb8gP = -1;
    public int Ns0WNyEWdPsk = -1;

    public dj(defpackage.e30 e30Var, defpackage.nd ndVar) {
        this.ZpBGe2uQfcn8 = e30Var;
        this.giKS3J6vZuNy = ndVar;
    }

    public final void JhCgjQRTAOCT(boolean z) {
        defpackage.fe1 fe1Var = this.ZpBGe2uQfcn8.frSwwKIlbUhK;
        int i = z ? fe1Var.e6mdH7fiFuta : fe1Var.QiMR8OkAhezm;
        int i2 = i - this.oh71FJcDz6S2;
        if (i2 < 0) {
            defpackage.ej.ZpBGe2uQfcn8("Tried to seek backward");
        }
        if (i2 > 0) {
            defpackage.dv0 dv0Var = this.giKS3J6vZuNy.ZVVdXbWmyCSK;
            dv0Var.w6IV1lieBIux(defpackage.vt0.fWTAfUmVKrZq);
            dv0Var.WDYagTQQm9ns[dv0Var.oh71FJcDz6S2 - dv0Var.fWTAfUmVKrZq[dv0Var.JhCgjQRTAOCT - 1].ZpBGe2uQfcn8] = i2;
            this.oh71FJcDz6S2 = i;
        }
    }

    public final void WDYagTQQm9ns(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                defpackage.ej.ZpBGe2uQfcn8("Invalid remove index " + i);
            }
            if (this.e6mdH7fiFuta == i) {
                this.fNwYGHIYeJcR += i2;
                return;
            }
            fWTAfUmVKrZq();
            this.e6mdH7fiFuta = i;
            this.fNwYGHIYeJcR = i2;
        }
    }

    public final void ZpBGe2uQfcn8() {
        fWTAfUmVKrZq();
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        if (arrayList.isEmpty()) {
            this.QiMR8OkAhezm++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void fWTAfUmVKrZq() {
        int i = this.fNwYGHIYeJcR;
        if (i > 0) {
            int i2 = this.e6mdH7fiFuta;
            if (i2 >= 0) {
                giKS3J6vZuNy();
                defpackage.dv0 dv0Var = this.giKS3J6vZuNy.ZVVdXbWmyCSK;
                dv0Var.w6IV1lieBIux(defpackage.ru0.fWTAfUmVKrZq);
                int i3 = dv0Var.oh71FJcDz6S2 - dv0Var.fWTAfUmVKrZq[dv0Var.JhCgjQRTAOCT - 1].ZpBGe2uQfcn8;
                int[] iArr = dv0Var.WDYagTQQm9ns;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.e6mdH7fiFuta = -1;
            } else {
                int i4 = this.Ns0WNyEWdPsk;
                int i5 = this.GE9mJIPrb8gP;
                giKS3J6vZuNy();
                defpackage.dv0 dv0Var2 = this.giKS3J6vZuNy.ZVVdXbWmyCSK;
                dv0Var2.w6IV1lieBIux(defpackage.nu0.fWTAfUmVKrZq);
                int i6 = dv0Var2.oh71FJcDz6S2 - dv0Var2.fWTAfUmVKrZq[dv0Var2.JhCgjQRTAOCT - 1].ZpBGe2uQfcn8;
                int[] iArr2 = dv0Var2.WDYagTQQm9ns;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.GE9mJIPrb8gP = -1;
                this.Ns0WNyEWdPsk = -1;
            }
            this.fNwYGHIYeJcR = 0;
        }
    }

    public final void giKS3J6vZuNy() {
        int i = this.QiMR8OkAhezm;
        if (i > 0) {
            defpackage.dv0 dv0Var = this.giKS3J6vZuNy.ZVVdXbWmyCSK;
            dv0Var.w6IV1lieBIux(defpackage.zu0.fWTAfUmVKrZq);
            dv0Var.WDYagTQQm9ns[dv0Var.oh71FJcDz6S2 - dv0Var.fWTAfUmVKrZq[dv0Var.JhCgjQRTAOCT - 1].ZpBGe2uQfcn8] = i;
            this.QiMR8OkAhezm = 0;
        }
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        if (arrayList.isEmpty()) {
            return;
        }
        defpackage.nd ndVar = this.giKS3J6vZuNy;
        int size = arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        ndVar.getClass();
        if (size != 0) {
            defpackage.dv0 dv0Var2 = ndVar.ZVVdXbWmyCSK;
            dv0Var2.w6IV1lieBIux(defpackage.cu0.fWTAfUmVKrZq);
            defpackage.q70.hH0RRJrNssvh(dv0Var2, 0, objArr);
        }
        arrayList.clear();
    }
}
