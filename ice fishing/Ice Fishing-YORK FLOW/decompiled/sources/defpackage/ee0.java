package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ee0 {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public ee0(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        if (!(i >= 0)) {
            defpackage.h80.ZpBGe2uQfcn8("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        defpackage.h80.ZpBGe2uQfcn8("end index greater than start");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ee0)) {
            return false;
        }
        defpackage.ee0 ee0Var = (defpackage.ee0) obj;
        return this.ZpBGe2uQfcn8 == ee0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == ee0Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.giKS3J6vZuNy) + (java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Interval(start=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", end=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
