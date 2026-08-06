package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pf0 {
    public int GE9mJIPrb8gP;
    public final defpackage.sc0 JhCgjQRTAOCT;
    public final int Ns0WNyEWdPsk;
    public final java.lang.Object P05cfTpS5W5L;
    public final java.lang.Object QiMR8OkAhezm;
    public int T1fB7bDYiVJQ = Integer.MIN_VALUE;
    public final int WDYagTQQm9ns;
    public final int[] XntWc4eZSQ8j;
    public final int ZpBGe2uQfcn8;
    public final defpackage.me0 e6mdH7fiFuta;
    public final int fNwYGHIYeJcR;
    public final defpackage.KN4muQto0Nd5 fWTAfUmVKrZq;
    public boolean gUjdnLbkVAaA;
    public final java.util.List giKS3J6vZuNy;
    public final int h3m55N1URyyK;
    public final long oh71FJcDz6S2;

    public pf0(int i, java.util.List list, defpackage.KN4muQto0Nd5 kN4muQto0Nd5, defpackage.sc0 sc0Var, int i2, int i3, int i4, long j, java.lang.Object obj, java.lang.Object obj2, defpackage.me0 me0Var, long j2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = list;
        this.fWTAfUmVKrZq = kN4muQto0Nd5;
        this.JhCgjQRTAOCT = sc0Var;
        this.WDYagTQQm9ns = i4;
        this.oh71FJcDz6S2 = j;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = obj2;
        this.e6mdH7fiFuta = me0Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            defpackage.ry0 ry0Var = (defpackage.ry0) list.get(i7);
            i5 += ry0Var.oh71FJcDz6S2;
            i6 = java.lang.Math.max(i6, ry0Var.WDYagTQQm9ns);
        }
        this.Ns0WNyEWdPsk = i5;
        int i8 = i5 + this.WDYagTQQm9ns;
        this.fNwYGHIYeJcR = i8 >= 0 ? i8 : 0;
        this.h3m55N1URyyK = i6;
        this.XntWc4eZSQ8j = new int[this.giKS3J6vZuNy.size() * 2];
    }

    public final long ZpBGe2uQfcn8(int i) {
        if (i == 0 && this.giKS3J6vZuNy.size() == 0) {
            return this.GE9mJIPrb8gP & 4294967295L;
        }
        int[] iArr = this.XntWc4eZSQ8j;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void fWTAfUmVKrZq(int i, int i2, int i3) {
        this.GE9mJIPrb8gP = i;
        this.T1fB7bDYiVJQ = i3;
        java.util.List list = this.giKS3J6vZuNy;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.ry0 ry0Var = (defpackage.ry0) list.get(i4);
            int i5 = i4 * 2;
            defpackage.KN4muQto0Nd5 kN4muQto0Nd5 = this.fWTAfUmVKrZq;
            if (kN4muQto0Nd5 == null) {
                defpackage.h80.giKS3J6vZuNy("null horizontalAlignment when isVertical == true");
                defpackage.h7.JhCgjQRTAOCT();
                return;
            }
            int ZpBGe2uQfcn8 = kN4muQto0Nd5.ZpBGe2uQfcn8(ry0Var.WDYagTQQm9ns, i2, this.JhCgjQRTAOCT);
            int[] iArr = this.XntWc4eZSQ8j;
            iArr[i5] = ZpBGe2uQfcn8;
            iArr[i5 + 1] = i;
            i += ry0Var.oh71FJcDz6S2;
        }
    }

    public final void giKS3J6vZuNy(defpackage.qy0 qy0Var) {
        defpackage.qv0 qv0Var = defpackage.qv0.Ns0WNyEWdPsk;
        if (this.T1fB7bDYiVJQ == Integer.MIN_VALUE) {
            defpackage.h80.ZpBGe2uQfcn8("position() should be called first");
        }
        java.util.List list = this.giKS3J6vZuNy;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.ry0 ry0Var = (defpackage.ry0) list.get(i);
            int i2 = ry0Var.oh71FJcDz6S2;
            long ZpBGe2uQfcn8 = ZpBGe2uQfcn8(i);
            defpackage.pVQOaWB9QMo4.ZVVdXbWmyCSK(this.e6mdH7fiFuta.ZpBGe2uQfcn8.QiMR8OkAhezm(this.QiMR8OkAhezm));
            long fWTAfUmVKrZq = defpackage.l90.fWTAfUmVKrZq(ZpBGe2uQfcn8, this.oh71FJcDz6S2);
            int i3 = defpackage.sy0.giKS3J6vZuNy;
            qy0Var.getClass();
            defpackage.qy0.ZpBGe2uQfcn8(qy0Var, ry0Var);
            ry0Var.I5Vdbaz9SDkL(defpackage.l90.fWTAfUmVKrZq(fWTAfUmVKrZq, ry0Var.e6mdH7fiFuta), 0.0f, qv0Var);
        }
    }
}
