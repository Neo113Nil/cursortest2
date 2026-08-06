package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lp implements defpackage.hp {
    public final defpackage.p00 QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final float oh71FJcDz6S2;

    public lp(float f, float f2, defpackage.p00 p00Var) {
        this.WDYagTQQm9ns = f;
        this.oh71FJcDz6S2 = f2;
        this.QiMR8OkAhezm = p00Var;
    }

    @Override // defpackage.hp
    public final float BXaznwstz2U0(long j) {
        if (defpackage.un1.ZpBGe2uQfcn8(defpackage.tn1.giKS3J6vZuNy(j), 4294967296L)) {
            return this.QiMR8OkAhezm.giKS3J6vZuNy(defpackage.tn1.fWTAfUmVKrZq(j));
        }
        defpackage.h7.P05cfTpS5W5L("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // defpackage.hp
    public final long VFeft99leXEK(float f) {
        return defpackage.m90.UmgHb6n58gfG(4294967296L, this.QiMR8OkAhezm.ZpBGe2uQfcn8(f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lp)) {
            return false;
        }
        defpackage.lp lpVar = (defpackage.lp) obj;
        return java.lang.Float.compare(this.WDYagTQQm9ns, lpVar.WDYagTQQm9ns) == 0 && java.lang.Float.compare(this.oh71FJcDz6S2, lpVar.oh71FJcDz6S2) == 0 && this.QiMR8OkAhezm.equals(lpVar.QiMR8OkAhezm);
    }

    @Override // defpackage.hp
    public final float giKS3J6vZuNy() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.hp
    public final float h3m55N1URyyK() {
        return this.oh71FJcDz6S2;
    }

    public final int hashCode() {
        return this.QiMR8OkAhezm.hashCode() + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.oh71FJcDz6S2, java.lang.Float.hashCode(this.WDYagTQQm9ns) * 31, 31);
    }

    public final java.lang.String toString() {
        return "DensityWithConverter(density=" + this.WDYagTQQm9ns + ", fontScale=" + this.oh71FJcDz6S2 + ", converter=" + this.QiMR8OkAhezm + ')';
    }
}
