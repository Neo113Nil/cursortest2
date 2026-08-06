package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nm1 {
    public final defpackage.l6 ZpBGe2uQfcn8;
    public final defpackage.in1 fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public nm1(defpackage.l6 l6Var, long j, defpackage.in1 in1Var) {
        defpackage.in1 in1Var2;
        this.ZpBGe2uQfcn8 = l6Var;
        this.giKS3J6vZuNy = defpackage.j80.WmetiUbpKU9I(l6Var.oh71FJcDz6S2.length(), j);
        if (in1Var != null) {
            in1Var2 = new defpackage.in1(defpackage.j80.WmetiUbpKU9I(l6Var.oh71FJcDz6S2.length(), in1Var.ZpBGe2uQfcn8));
        } else {
            in1Var2 = null;
        }
        this.fWTAfUmVKrZq = in1Var2;
    }

    public static defpackage.nm1 ZpBGe2uQfcn8(defpackage.nm1 nm1Var, defpackage.l6 l6Var, long j, int i) {
        if ((i & 1) != 0) {
            l6Var = nm1Var.ZpBGe2uQfcn8;
        }
        if ((i & 2) != 0) {
            j = nm1Var.giKS3J6vZuNy;
        }
        defpackage.in1 in1Var = (i & 4) != 0 ? nm1Var.fWTAfUmVKrZq : null;
        nm1Var.getClass();
        return new defpackage.nm1(l6Var, j, in1Var);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nm1)) {
            return false;
        }
        defpackage.nm1 nm1Var = (defpackage.nm1) obj;
        return defpackage.in1.giKS3J6vZuNy(this.giKS3J6vZuNy, nm1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, nm1Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, nm1Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        int hashCode = this.ZpBGe2uQfcn8.hashCode() * 31;
        int i = defpackage.in1.fWTAfUmVKrZq;
        int fWTAfUmVKrZq = defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(hashCode, 31, this.giKS3J6vZuNy);
        defpackage.in1 in1Var = this.fWTAfUmVKrZq;
        return fWTAfUmVKrZq + (in1Var != null ? java.lang.Long.hashCode(in1Var.ZpBGe2uQfcn8) : 0);
    }

    public final java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.ZpBGe2uQfcn8) + "', selection=" + ((java.lang.Object) defpackage.in1.P05cfTpS5W5L(this.giKS3J6vZuNy)) + ", composition=" + this.fWTAfUmVKrZq + ')';
    }

    public nm1(java.lang.String str, long j, int i) {
        this(new defpackage.l6((i & 1) != 0 ? "" : str), (i & 2) != 0 ? defpackage.in1.giKS3J6vZuNy : j, (defpackage.in1) null);
    }
}
