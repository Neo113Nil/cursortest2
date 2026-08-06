package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xb implements defpackage.pm1 {
    public final defpackage.xc1 ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public xb(defpackage.xc1 xc1Var, float f) {
        this.ZpBGe2uQfcn8 = xc1Var;
        this.giKS3J6vZuNy = f;
    }

    @Override // defpackage.pm1
    public final float ZpBGe2uQfcn8() {
        return this.giKS3J6vZuNy;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xb)) {
            return false;
        }
        defpackage.xb xbVar = (defpackage.xb) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, xbVar.ZpBGe2uQfcn8) && java.lang.Float.compare(this.giKS3J6vZuNy, xbVar.giKS3J6vZuNy) == 0;
    }

    @Override // defpackage.pm1
    public final defpackage.vb fWTAfUmVKrZq() {
        return this.ZpBGe2uQfcn8;
    }

    @Override // defpackage.pm1
    public final long giKS3J6vZuNy() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return defpackage.pf.QiMR8OkAhezm;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BrushStyle(value=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", alpha=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }
}
