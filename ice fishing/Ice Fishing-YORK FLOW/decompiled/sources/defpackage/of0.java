package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class of0 implements defpackage.wk0 {
    public final long GE9mJIPrb8gP;
    public final float JhCgjQRTAOCT;
    public final java.util.List Ns0WNyEWdPsk;
    public final defpackage.sm P05cfTpS5W5L;
    public final boolean QiMR8OkAhezm;
    public final defpackage.fv0 T1fB7bDYiVJQ;
    public final defpackage.wk0 WDYagTQQm9ns;
    public final int WmetiUbpKU9I;
    public final int XntWc4eZSQ8j;
    public final defpackage.pf0 ZpBGe2uQfcn8;
    public final defpackage.hp e6mdH7fiFuta;
    public final int fNwYGHIYeJcR;
    public final boolean fWTAfUmVKrZq;
    public final int gUjdnLbkVAaA;
    public final int giKS3J6vZuNy;
    public final int h3m55N1URyyK;
    public final float oh71FJcDz6S2;

    public of0(defpackage.pf0 pf0Var, int i, boolean z, float f, defpackage.wk0 wk0Var, float f2, boolean z2, defpackage.sm smVar, defpackage.hp hpVar, long j, java.util.List list, int i2, int i3, int i4, defpackage.fv0 fv0Var, int i5, int i6) {
        this.ZpBGe2uQfcn8 = pf0Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = z;
        this.JhCgjQRTAOCT = f;
        this.WDYagTQQm9ns = wk0Var;
        this.oh71FJcDz6S2 = f2;
        this.QiMR8OkAhezm = z2;
        this.P05cfTpS5W5L = smVar;
        this.e6mdH7fiFuta = hpVar;
        this.GE9mJIPrb8gP = j;
        this.Ns0WNyEWdPsk = list;
        this.fNwYGHIYeJcR = i2;
        this.h3m55N1URyyK = i3;
        this.gUjdnLbkVAaA = i4;
        this.T1fB7bDYiVJQ = fv0Var;
        this.XntWc4eZSQ8j = i5;
        this.WmetiUbpKU9I = i6;
    }

    @Override // defpackage.wk0
    public final defpackage.y10 JhCgjQRTAOCT() {
        return this.WDYagTQQm9ns.JhCgjQRTAOCT();
    }

    public final long QiMR8OkAhezm() {
        defpackage.wk0 wk0Var = this.WDYagTQQm9ns;
        return (wk0Var.WDYagTQQm9ns() << 32) | (wk0Var.fWTAfUmVKrZq() & 4294967295L);
    }

    @Override // defpackage.wk0
    public final int WDYagTQQm9ns() {
        return this.WDYagTQQm9ns.WDYagTQQm9ns();
    }

    @Override // defpackage.wk0
    public final java.util.Map ZpBGe2uQfcn8() {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8();
    }

    @Override // defpackage.wk0
    public final int fWTAfUmVKrZq() {
        return this.WDYagTQQm9ns.fWTAfUmVKrZq();
    }

    @Override // defpackage.wk0
    public final void giKS3J6vZuNy() {
        this.WDYagTQQm9ns.giKS3J6vZuNy();
    }

    public final defpackage.of0 oh71FJcDz6S2(int i, boolean z) {
        defpackage.pf0 pf0Var;
        if (this.QiMR8OkAhezm) {
            return null;
        }
        java.util.List list = this.Ns0WNyEWdPsk;
        if (list.isEmpty() || (pf0Var = this.ZpBGe2uQfcn8) == null) {
            return null;
        }
        int i2 = pf0Var.fNwYGHIYeJcR;
        int i3 = this.giKS3J6vZuNy - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        defpackage.pf0 pf0Var2 = (defpackage.pf0) defpackage.hf.fhbmYuu9J3cT(list);
        defpackage.pf0 pf0Var3 = (defpackage.pf0) defpackage.hf.EgL5gQQnyJKX(list);
        if (pf0Var2.gUjdnLbkVAaA || pf0Var3.gUjdnLbkVAaA) {
            return null;
        }
        int i4 = pf0Var2.GE9mJIPrb8gP;
        int i5 = this.h3m55N1URyyK;
        int i6 = this.fNwYGHIYeJcR;
        if (i < 0) {
            if (java.lang.Math.min((i4 + pf0Var2.fNwYGHIYeJcR) - i6, (pf0Var3.GE9mJIPrb8gP + pf0Var3.fNwYGHIYeJcR) - i5) <= (-i)) {
                return null;
            }
        } else if (java.lang.Math.min(i6 - i4, i5 - pf0Var3.GE9mJIPrb8gP) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            defpackage.pf0 pf0Var4 = (defpackage.pf0) list.get(i7);
            pf0Var4.getClass();
            int[] iArr = pf0Var4.XntWc4eZSQ8j;
            if (!pf0Var4.gUjdnLbkVAaA) {
                pf0Var4.GE9mJIPrb8gP += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = pf0Var4.giKS3J6vZuNy.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        defpackage.pVQOaWB9QMo4.ZVVdXbWmyCSK(pf0Var4.e6mdH7fiFuta.ZpBGe2uQfcn8.QiMR8OkAhezm(pf0Var4.QiMR8OkAhezm));
                    }
                }
            }
        }
        return new defpackage.of0(this.ZpBGe2uQfcn8, i3, this.fWTAfUmVKrZq || i > 0, i, this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, list, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, this.T1fB7bDYiVJQ, this.XntWc4eZSQ8j, this.WmetiUbpKU9I);
    }
}
