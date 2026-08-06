package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zw0 extends defpackage.us1 {
    public defpackage.s2 BHfvd2J71qpO;
    public float GE9mJIPrb8gP;
    public java.util.List JhCgjQRTAOCT;
    public float Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public defpackage.vb QiMR8OkAhezm;
    public boolean T1fB7bDYiVJQ;
    public float WDYagTQQm9ns;
    public defpackage.bh1 WmetiUbpKU9I;
    public boolean XntWc4eZSQ8j;
    public defpackage.s2 ZVVdXbWmyCSK;
    public int e6mdH7fiFuta;
    public float fNwYGHIYeJcR;
    public float fWTAfUmVKrZq = 1.0f;
    public boolean gUjdnLbkVAaA;
    public defpackage.vb giKS3J6vZuNy;
    public float h3m55N1URyyK;
    public float oh71FJcDz6S2;
    public final defpackage.s2 s0TASMVLSWD5;
    public final defpackage.be0 w7APNrr0aGRc;

    public zw0() {
        int i = defpackage.bt1.ZpBGe2uQfcn8;
        this.JhCgjQRTAOCT = defpackage.av.WDYagTQQm9ns;
        this.WDYagTQQm9ns = 1.0f;
        this.P05cfTpS5W5L = 0;
        this.e6mdH7fiFuta = 0;
        this.GE9mJIPrb8gP = 4.0f;
        this.fNwYGHIYeJcR = 1.0f;
        this.gUjdnLbkVAaA = true;
        this.T1fB7bDYiVJQ = true;
        defpackage.s2 ZpBGe2uQfcn8 = defpackage.u2.ZpBGe2uQfcn8();
        this.s0TASMVLSWD5 = ZpBGe2uQfcn8;
        this.BHfvd2J71qpO = ZpBGe2uQfcn8;
        this.w7APNrr0aGRc = defpackage.t80.oCu53ZX2v4Ju(defpackage.yf0.oh71FJcDz6S2, defpackage.pj.XntWc4eZSQ8j);
    }

    public final void WDYagTQQm9ns() {
        float f = this.Ns0WNyEWdPsk;
        defpackage.s2 s2Var = this.s0TASMVLSWD5;
        if (f == 0.0f && this.fNwYGHIYeJcR == 1.0f) {
            this.BHfvd2J71qpO = s2Var;
            return;
        }
        if (defpackage.ma0.QiMR8OkAhezm(this.BHfvd2J71qpO, s2Var)) {
            this.BHfvd2J71qpO = defpackage.u2.ZpBGe2uQfcn8();
        } else {
            android.graphics.Path.FillType fillType = this.BHfvd2J71qpO.ZpBGe2uQfcn8.getFillType();
            android.graphics.Path.FillType fillType2 = android.graphics.Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.BHfvd2J71qpO.ZpBGe2uQfcn8.rewind();
            android.graphics.Path path = this.BHfvd2J71qpO.ZpBGe2uQfcn8;
            if (!z) {
                fillType2 = android.graphics.Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        defpackage.be0 be0Var = this.w7APNrr0aGRc;
        ((defpackage.t2) be0Var.getValue()).ZpBGe2uQfcn8.setPath(s2Var != null ? s2Var.ZpBGe2uQfcn8 : null, false);
        float length = ((defpackage.t2) be0Var.getValue()).ZpBGe2uQfcn8.getLength();
        float f2 = this.Ns0WNyEWdPsk;
        float f3 = this.h3m55N1URyyK;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.fNwYGHIYeJcR + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((defpackage.t2) be0Var.getValue()).ZpBGe2uQfcn8(f4, f5, this.BHfvd2J71qpO);
            return;
        }
        defpackage.s2 s2Var2 = this.ZVVdXbWmyCSK;
        if (s2Var2 == null) {
            s2Var2 = defpackage.u2.ZpBGe2uQfcn8();
            this.ZVVdXbWmyCSK = s2Var2;
        }
        s2Var2.oh71FJcDz6S2();
        ((defpackage.t2) be0Var.getValue()).ZpBGe2uQfcn8(f4, length, s2Var2);
        defpackage.s2.ZpBGe2uQfcn8(this.BHfvd2J71qpO, s2Var2);
        s2Var2.oh71FJcDz6S2();
        ((defpackage.t2) be0Var.getValue()).ZpBGe2uQfcn8(0.0f, f5, s2Var2);
        defpackage.s2.ZpBGe2uQfcn8(this.BHfvd2J71qpO, s2Var2);
    }

    @Override // defpackage.us1
    public final void ZpBGe2uQfcn8(defpackage.ct ctVar) {
        defpackage.ct ctVar2;
        defpackage.bh1 bh1Var;
        if (this.gUjdnLbkVAaA) {
            defpackage.w60.CZa7MwI9IzLd(this.JhCgjQRTAOCT, this.s0TASMVLSWD5);
            WDYagTQQm9ns();
        } else if (this.XntWc4eZSQ8j) {
            WDYagTQQm9ns();
        }
        this.gUjdnLbkVAaA = false;
        this.XntWc4eZSQ8j = false;
        defpackage.vb vbVar = this.giKS3J6vZuNy;
        if (vbVar != null) {
            ctVar2 = ctVar;
            defpackage.ct.w7APNrr0aGRc(ctVar2, this.BHfvd2J71qpO, vbVar, this.fWTAfUmVKrZq, null, 56);
        } else {
            ctVar2 = ctVar;
        }
        defpackage.vb vbVar2 = this.QiMR8OkAhezm;
        if (vbVar2 != null) {
            defpackage.bh1 bh1Var2 = this.WmetiUbpKU9I;
            if (this.T1fB7bDYiVJQ || bh1Var2 == null) {
                defpackage.bh1 bh1Var3 = new defpackage.bh1(this.oh71FJcDz6S2, this.GE9mJIPrb8gP, this.P05cfTpS5W5L, this.e6mdH7fiFuta, 16);
                this.WmetiUbpKU9I = bh1Var3;
                this.T1fB7bDYiVJQ = false;
                bh1Var = bh1Var3;
            } else {
                bh1Var = bh1Var2;
            }
            defpackage.ct.w7APNrr0aGRc(ctVar2, this.BHfvd2J71qpO, vbVar2, this.WDYagTQQm9ns, bh1Var, 48);
        }
    }

    public final java.lang.String toString() {
        return this.s0TASMVLSWD5.toString();
    }
}
