package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rw implements defpackage.d11 {
    public final defpackage.bv1 GE9mJIPrb8gP;
    public final defpackage.bv1 Ns0WNyEWdPsk;
    public final defpackage.leBOUblNrHZh P05cfTpS5W5L;
    public final defpackage.iw QiMR8OkAhezm;
    public final defpackage.cv1 T1fB7bDYiVJQ;
    public final int WDYagTQQm9ns;
    public final defpackage.leBOUblNrHZh e6mdH7fiFuta;
    public final defpackage.rB0K1rYXS4Nc fNwYGHIYeJcR;
    public final defpackage.cv1 gUjdnLbkVAaA;
    public final defpackage.rB0K1rYXS4Nc h3m55N1URyyK;
    public final defpackage.fo0 oh71FJcDz6S2;

    public rw(defpackage.hp hpVar, int i, defpackage.fo0 fo0Var, defpackage.iw iwVar) {
        int OVwOqzUGHcCU = hpVar.OVwOqzUGHcCU(48.0f);
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = fo0Var;
        this.QiMR8OkAhezm = iwVar;
        defpackage.ca caVar = defpackage.jVUAPb5NnIYW.s0TASMVLSWD5;
        this.P05cfTpS5W5L = new defpackage.leBOUblNrHZh(caVar, caVar);
        defpackage.ca caVar2 = defpackage.jVUAPb5NnIYW.ZVVdXbWmyCSK;
        this.e6mdH7fiFuta = new defpackage.leBOUblNrHZh(caVar2, caVar2);
        this.GE9mJIPrb8gP = new defpackage.bv1(defpackage.h0.fWTAfUmVKrZq);
        this.Ns0WNyEWdPsk = new defpackage.bv1(defpackage.h0.JhCgjQRTAOCT);
        defpackage.da daVar = defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ;
        defpackage.da daVar2 = defpackage.jVUAPb5NnIYW.WmetiUbpKU9I;
        this.fNwYGHIYeJcR = new defpackage.rB0K1rYXS4Nc(daVar, daVar2);
        this.h3m55N1URyyK = new defpackage.rB0K1rYXS4Nc(daVar2, daVar);
        this.gUjdnLbkVAaA = new defpackage.cv1(daVar, OVwOqzUGHcCU);
        this.T1fB7bDYiVJQ = new defpackage.cv1(daVar2, OVwOqzUGHcCU);
    }

    @Override // defpackage.d11
    public final long ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, defpackage.sc0 sc0Var, long j2) {
        defpackage.q90 q90Var2;
        char c;
        long j3;
        int i;
        defpackage.fo0 fo0Var = this.oh71FJcDz6S2;
        if (fo0Var != null) {
            fo0Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + this.WDYagTQQm9ns) & 4294967295L);
        int i2 = (int) (j5 >> 32);
        int i3 = 0;
        java.util.List oCu53ZX2v4Ju = defpackage.ma0.oCu53ZX2v4Ju(this.P05cfTpS5W5L, this.e6mdH7fiFuta, ((int) (q90Var.ZpBGe2uQfcn8() >> 32)) < i2 / 2 ? this.GE9mJIPrb8gP : this.Ns0WNyEWdPsk);
        int size = oCu53ZX2v4Ju.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                q90Var2 = q90Var;
                c = c2;
                j3 = j4;
                i = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i5 = (int) (j2 >> c);
            int i6 = size;
            int i7 = i4;
            q90Var2 = q90Var;
            java.util.List list = oCu53ZX2v4Ju;
            i = ((defpackage.hl0) oCu53ZX2v4Ju.get(i4)).ZpBGe2uQfcn8(q90Var2, j5, i5, sc0Var);
            if (i7 == list.size() - 1 || (i >= 0 && i5 + i <= i2)) {
                break;
            }
            i4 = i7 + 1;
            oCu53ZX2v4Ju = list;
            size = i6;
            c2 = c;
            j4 = j3;
        }
        int i8 = (int) (j5 & j3);
        java.util.List oCu53ZX2v4Ju2 = defpackage.ma0.oCu53ZX2v4Ju(this.fNwYGHIYeJcR, this.h3m55N1URyyK, ((int) (q90Var2.ZpBGe2uQfcn8() & j3)) < i8 / 2 ? this.gUjdnLbkVAaA : this.T1fB7bDYiVJQ);
        int size2 = oCu53ZX2v4Ju2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (j2 & j3);
            int ZpBGe2uQfcn8 = ((defpackage.il0) oCu53ZX2v4Ju2.get(i9)).ZpBGe2uQfcn8(q90Var2, j5, i10);
            if (i9 == oCu53ZX2v4Ju2.size() - 1 || (ZpBGe2uQfcn8 >= 0 && i10 + ZpBGe2uQfcn8 <= i8)) {
                i3 = ZpBGe2uQfcn8;
                break;
            }
        }
        long j6 = (i << c) | (i3 & j3);
        this.QiMR8OkAhezm.QiMR8OkAhezm(q90Var2, defpackage.wc1.giKS3J6vZuNy(j6, j2));
        return j6;
    }
}
