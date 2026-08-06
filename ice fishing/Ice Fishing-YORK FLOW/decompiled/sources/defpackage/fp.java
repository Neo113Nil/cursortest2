package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fp implements defpackage.bu {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public fp(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.ZpBGe2uQfcn8) {
                int i4 = i3 + 1;
                int i5 = cuVar.giKS3J6vZuNy;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (java.lang.Character.isHighSurrogate(cuVar.giKS3J6vZuNy((i5 - i4) + (-1))) && java.lang.Character.isLowSurrogate(cuVar.giKS3J6vZuNy(cuVar.giKS3J6vZuNy - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.giKS3J6vZuNy) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = cuVar.fWTAfUmVKrZq;
            defpackage.rw0 rw0Var = cuVar.ZpBGe2uQfcn8;
            if (i8 + i7 >= rw0Var.giKS3J6vZuNy()) {
                i6 = rw0Var.giKS3J6vZuNy() - cuVar.fWTAfUmVKrZq;
                break;
            } else {
                i6 = (java.lang.Character.isHighSurrogate(cuVar.giKS3J6vZuNy((cuVar.fWTAfUmVKrZq + i7) + (-1))) && java.lang.Character.isLowSurrogate(cuVar.giKS3J6vZuNy(cuVar.fWTAfUmVKrZq + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = cuVar.fWTAfUmVKrZq;
        cuVar.ZpBGe2uQfcn8(i9, i6 + i9);
        int i10 = cuVar.giKS3J6vZuNy;
        cuVar.ZpBGe2uQfcn8(i10 - i3, i10);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fp)) {
            return false;
        }
        defpackage.fp fpVar = (defpackage.fp) obj;
        return this.ZpBGe2uQfcn8 == fpVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == fpVar.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", lengthAfterCursor=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
