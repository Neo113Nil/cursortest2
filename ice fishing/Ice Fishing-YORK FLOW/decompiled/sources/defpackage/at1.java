package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class at1 extends defpackage.ct1 implements java.lang.Iterable, defpackage.nb0 {
    public final float GE9mJIPrb8gP;
    public final float Ns0WNyEWdPsk;
    public final float P05cfTpS5W5L;
    public final float QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final float e6mdH7fiFuta;
    public final float fNwYGHIYeJcR;
    public final java.util.List gUjdnLbkVAaA;
    public final java.util.List h3m55N1URyyK;
    public final float oh71FJcDz6S2;

    public at1(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List list, java.util.ArrayList arrayList) {
        this.WDYagTQQm9ns = str;
        this.oh71FJcDz6S2 = f;
        this.QiMR8OkAhezm = f2;
        this.P05cfTpS5W5L = f3;
        this.e6mdH7fiFuta = f4;
        this.GE9mJIPrb8gP = f5;
        this.Ns0WNyEWdPsk = f6;
        this.fNwYGHIYeJcR = f7;
        this.h3m55N1URyyK = list;
        this.gUjdnLbkVAaA = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.at1)) {
            defpackage.at1 at1Var = (defpackage.at1) obj;
            return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, at1Var.WDYagTQQm9ns) && this.oh71FJcDz6S2 == at1Var.oh71FJcDz6S2 && this.QiMR8OkAhezm == at1Var.QiMR8OkAhezm && this.P05cfTpS5W5L == at1Var.P05cfTpS5W5L && this.e6mdH7fiFuta == at1Var.e6mdH7fiFuta && this.GE9mJIPrb8gP == at1Var.GE9mJIPrb8gP && this.Ns0WNyEWdPsk == at1Var.Ns0WNyEWdPsk && this.fNwYGHIYeJcR == at1Var.fNwYGHIYeJcR && defpackage.ma0.QiMR8OkAhezm(this.h3m55N1URyyK, at1Var.h3m55N1URyyK) && defpackage.ma0.QiMR8OkAhezm(this.gUjdnLbkVAaA, at1Var.gUjdnLbkVAaA);
        }
        return false;
    }

    public final int hashCode() {
        return this.gUjdnLbkVAaA.hashCode() + ((this.h3m55N1URyyK.hashCode() + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fNwYGHIYeJcR, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.Ns0WNyEWdPsk, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.GE9mJIPrb8gP, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.e6mdH7fiFuta, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.P05cfTpS5W5L, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.QiMR8OkAhezm, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.oh71FJcDz6S2, this.WDYagTQQm9ns.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.fy0(this);
    }
}
