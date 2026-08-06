package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ep implements defpackage.bu {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public ep(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        int i = cuVar.fWTAfUmVKrZq;
        defpackage.rw0 rw0Var = cuVar.ZpBGe2uQfcn8;
        int i2 = this.giKS3J6vZuNy;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = rw0Var.giKS3J6vZuNy();
        }
        cuVar.ZpBGe2uQfcn8(cuVar.fWTAfUmVKrZq, java.lang.Math.min(i3, rw0Var.giKS3J6vZuNy()));
        int i4 = cuVar.giKS3J6vZuNy;
        int i5 = this.ZpBGe2uQfcn8;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        cuVar.ZpBGe2uQfcn8(java.lang.Math.max(0, i6), cuVar.giKS3J6vZuNy);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ep)) {
            return false;
        }
        defpackage.ep epVar = (defpackage.ep) obj;
        return this.ZpBGe2uQfcn8 == epVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == epVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", lengthAfterCursor=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
