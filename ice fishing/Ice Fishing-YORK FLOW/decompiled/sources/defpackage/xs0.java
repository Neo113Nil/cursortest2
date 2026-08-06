package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xs0 implements defpackage.e7, defpackage.ht1 {
    public final java.lang.Object QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public xs0(int i, int i2, defpackage.ot otVar) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = new defpackage.s81((defpackage.mx) new defpackage.rx(i, i2, otVar));
    }

    @Override // defpackage.e7
    public void GE9mJIPrb8gP(int i, int i2) {
        ((defpackage.e7) this.QiMR8OkAhezm).GE9mJIPrb8gP(i + (this.oh71FJcDz6S2 == 0 ? this.WDYagTQQm9ns : 0), i2);
    }

    @Override // defpackage.e7
    public void JhCgjQRTAOCT(java.lang.Object obj) {
        this.oh71FJcDz6S2++;
        ((defpackage.e7) this.QiMR8OkAhezm).JhCgjQRTAOCT(obj);
    }

    @Override // defpackage.ht1
    public int Ns0WNyEWdPsk() {
        return this.oh71FJcDz6S2;
    }

    @Override // defpackage.e7
    public void P05cfTpS5W5L(int i, int i2, int i3) {
        int i4 = this.oh71FJcDz6S2 == 0 ? this.WDYagTQQm9ns : 0;
        ((defpackage.e7) this.QiMR8OkAhezm).P05cfTpS5W5L(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.ft1
    public defpackage.g6 T1fB7bDYiVJQ(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.QiMR8OkAhezm).T1fB7bDYiVJQ(j, g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.e7
    public void WDYagTQQm9ns() {
        ((defpackage.e7) this.QiMR8OkAhezm).WDYagTQQm9ns();
    }

    @Override // defpackage.e7
    public void WmetiUbpKU9I() {
        if (this.oh71FJcDz6S2 <= 0) {
            defpackage.ej.ZpBGe2uQfcn8("OffsetApplier up called with no corresponding down");
        }
        this.oh71FJcDz6S2--;
        ((defpackage.e7) this.QiMR8OkAhezm).WmetiUbpKU9I();
    }

    @Override // defpackage.e7
    public java.lang.Object e6mdH7fiFuta() {
        return ((defpackage.e7) this.QiMR8OkAhezm).e6mdH7fiFuta();
    }

    @Override // defpackage.ft1
    public defpackage.g6 fNwYGHIYeJcR(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return ((defpackage.s81) this.QiMR8OkAhezm).fNwYGHIYeJcR(j, g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.e7
    public void fWTAfUmVKrZq(int i, java.lang.Object obj) {
        ((defpackage.e7) this.QiMR8OkAhezm).fWTAfUmVKrZq(i + (this.oh71FJcDz6S2 == 0 ? this.WDYagTQQm9ns : 0), obj);
    }

    @Override // defpackage.ht1
    public int gUjdnLbkVAaA() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.e7
    public void h3m55N1URyyK(defpackage.c20 c20Var, java.lang.Object obj) {
        ((defpackage.e7) this.QiMR8OkAhezm).h3m55N1URyyK(c20Var, obj);
    }

    @Override // defpackage.e7
    public void oh71FJcDz6S2(int i, java.lang.Object obj) {
        ((defpackage.e7) this.QiMR8OkAhezm).oh71FJcDz6S2(i + (this.oh71FJcDz6S2 == 0 ? this.WDYagTQQm9ns : 0), obj);
    }

    public xs0(defpackage.e7 e7Var, int i) {
        this.QiMR8OkAhezm = e7Var;
        this.WDYagTQQm9ns = i;
    }
}
