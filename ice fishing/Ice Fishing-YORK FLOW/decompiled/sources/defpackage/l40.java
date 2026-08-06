package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l40 extends defpackage.us1 {
    public boolean BHfvd2J71qpO;
    public final defpackage.YjS0G3zEDWNX GE9mJIPrb8gP;
    public java.lang.String Ns0WNyEWdPsk;
    public defpackage.s2 P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public float T1fB7bDYiVJQ;
    public float WmetiUbpKU9I;
    public float XntWc4eZSQ8j;
    public defpackage.y10 e6mdH7fiFuta;
    public float fNwYGHIYeJcR;
    public float gUjdnLbkVAaA;
    public float[] giKS3J6vZuNy;
    public float h3m55N1URyyK;
    public java.util.List oh71FJcDz6S2;
    public float s0TASMVLSWD5;
    public final java.util.ArrayList fWTAfUmVKrZq = new java.util.ArrayList();
    public boolean JhCgjQRTAOCT = true;
    public long WDYagTQQm9ns = defpackage.pf.QiMR8OkAhezm;

    public l40() {
        int i = defpackage.bt1.ZpBGe2uQfcn8;
        this.oh71FJcDz6S2 = defpackage.av.WDYagTQQm9ns;
        this.QiMR8OkAhezm = true;
        this.GE9mJIPrb8gP = new defpackage.YjS0G3zEDWNX(14, this);
        this.Ns0WNyEWdPsk = "";
        this.T1fB7bDYiVJQ = 1.0f;
        this.XntWc4eZSQ8j = 1.0f;
        this.BHfvd2J71qpO = true;
    }

    @Override // defpackage.us1
    public final void JhCgjQRTAOCT(defpackage.YjS0G3zEDWNX yjS0G3zEDWNX) {
        this.e6mdH7fiFuta = yjS0G3zEDWNX;
    }

    public final void QiMR8OkAhezm(defpackage.us1 us1Var) {
        if (!(us1Var instanceof defpackage.zw0)) {
            if (us1Var instanceof defpackage.l40) {
                defpackage.l40 l40Var = (defpackage.l40) us1Var;
                if (l40Var.JhCgjQRTAOCT && this.JhCgjQRTAOCT) {
                    oh71FJcDz6S2(l40Var.WDYagTQQm9ns);
                    return;
                } else {
                    this.JhCgjQRTAOCT = false;
                    this.WDYagTQQm9ns = defpackage.pf.QiMR8OkAhezm;
                    return;
                }
            }
            return;
        }
        defpackage.zw0 zw0Var = (defpackage.zw0) us1Var;
        defpackage.vb vbVar = zw0Var.giKS3J6vZuNy;
        if (this.JhCgjQRTAOCT && vbVar != null) {
            if (vbVar instanceof defpackage.lf1) {
                oh71FJcDz6S2(((defpackage.lf1) vbVar).ZpBGe2uQfcn8);
            } else {
                this.JhCgjQRTAOCT = false;
                this.WDYagTQQm9ns = defpackage.pf.QiMR8OkAhezm;
            }
        }
        defpackage.vb vbVar2 = zw0Var.QiMR8OkAhezm;
        if (this.JhCgjQRTAOCT && vbVar2 != null) {
            if (vbVar2 instanceof defpackage.lf1) {
                oh71FJcDz6S2(((defpackage.lf1) vbVar2).ZpBGe2uQfcn8);
            } else {
                this.JhCgjQRTAOCT = false;
                this.WDYagTQQm9ns = defpackage.pf.QiMR8OkAhezm;
            }
        }
    }

    public final void WDYagTQQm9ns(int i, defpackage.us1 us1Var) {
        java.util.ArrayList arrayList = this.fWTAfUmVKrZq;
        if (i < arrayList.size()) {
            arrayList.set(i, us1Var);
        } else {
            arrayList.add(us1Var);
        }
        QiMR8OkAhezm(us1Var);
        us1Var.JhCgjQRTAOCT(this.GE9mJIPrb8gP);
        fWTAfUmVKrZq();
    }

    @Override // defpackage.us1
    public final void ZpBGe2uQfcn8(defpackage.ct ctVar) {
        if (this.BHfvd2J71qpO) {
            float[] fArr = this.giKS3J6vZuNy;
            if (fArr == null) {
                fArr = defpackage.pk0.ZpBGe2uQfcn8();
                this.giKS3J6vZuNy = fArr;
            } else {
                defpackage.pk0.JhCgjQRTAOCT(fArr);
            }
            defpackage.pk0.oh71FJcDz6S2(fArr, this.WmetiUbpKU9I + this.h3m55N1URyyK, this.s0TASMVLSWD5 + this.gUjdnLbkVAaA);
            float f = this.fNwYGHIYeJcR;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) java.lang.Math.sin(d);
                float cos = (float) java.lang.Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.T1fB7bDYiVJQ;
            float f18 = this.XntWc4eZSQ8j;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            defpackage.pk0.oh71FJcDz6S2(fArr, -this.h3m55N1URyyK, -this.gUjdnLbkVAaA);
            this.BHfvd2J71qpO = false;
        }
        if (this.QiMR8OkAhezm) {
            if (!this.oh71FJcDz6S2.isEmpty()) {
                defpackage.s2 s2Var = this.P05cfTpS5W5L;
                if (s2Var == null) {
                    s2Var = defpackage.u2.ZpBGe2uQfcn8();
                    this.P05cfTpS5W5L = s2Var;
                }
                defpackage.w60.CZa7MwI9IzLd(this.oh71FJcDz6S2, s2Var);
            }
            this.QiMR8OkAhezm = false;
        }
        defpackage.a7 qjMheFZ0l9kA = ctVar.qjMheFZ0l9kA();
        long Ns0WNyEWdPsk = qjMheFZ0l9kA.Ns0WNyEWdPsk();
        qjMheFZ0l9kA.oh71FJcDz6S2().fNwYGHIYeJcR();
        try {
            defpackage.a7 a7Var = (defpackage.a7) ((defpackage.k0) qjMheFZ0l9kA.giKS3J6vZuNy).oh71FJcDz6S2;
            float[] fArr2 = this.giKS3J6vZuNy;
            if (fArr2 != null) {
                a7Var.oh71FJcDz6S2().WmetiUbpKU9I(fArr2);
            }
            defpackage.s2 s2Var2 = this.P05cfTpS5W5L;
            if (!this.oh71FJcDz6S2.isEmpty() && s2Var2 != null) {
                a7Var.oh71FJcDz6S2().BHfvd2J71qpO(s2Var2);
            }
            java.util.ArrayList arrayList = this.fWTAfUmVKrZq;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.us1) arrayList.get(i)).ZpBGe2uQfcn8(ctVar);
            }
        } finally {
            qjMheFZ0l9kA.oh71FJcDz6S2().e6mdH7fiFuta();
            qjMheFZ0l9kA.IJ0hOnjhPOri(Ns0WNyEWdPsk);
        }
    }

    @Override // defpackage.us1
    public final defpackage.y10 giKS3J6vZuNy() {
        return this.e6mdH7fiFuta;
    }

    public final void oh71FJcDz6S2(long j) {
        if (this.JhCgjQRTAOCT && j != 16) {
            long j2 = this.WDYagTQQm9ns;
            if (j2 == 16) {
                this.WDYagTQQm9ns = j;
                return;
            }
            int i = defpackage.bt1.ZpBGe2uQfcn8;
            if (defpackage.pf.P05cfTpS5W5L(j2) == defpackage.pf.P05cfTpS5W5L(j) && defpackage.pf.QiMR8OkAhezm(j2) == defpackage.pf.QiMR8OkAhezm(j) && defpackage.pf.WDYagTQQm9ns(j2) == defpackage.pf.WDYagTQQm9ns(j)) {
                return;
            }
            this.JhCgjQRTAOCT = false;
            this.WDYagTQQm9ns = defpackage.pf.QiMR8OkAhezm;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VGroup: ");
        sb.append(this.Ns0WNyEWdPsk);
        java.util.ArrayList arrayList = this.fWTAfUmVKrZq;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.us1 us1Var = (defpackage.us1) arrayList.get(i);
            sb.append("\t");
            sb.append(us1Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
