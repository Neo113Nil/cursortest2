package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tc1 implements defpackage.bu {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public tc1(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        boolean z = cuVar.JhCgjQRTAOCT != -1;
        defpackage.rw0 rw0Var = cuVar.ZpBGe2uQfcn8;
        if (z) {
            cuVar.JhCgjQRTAOCT = -1;
            cuVar.WDYagTQQm9ns = -1;
        }
        int T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(this.ZpBGe2uQfcn8, 0, rw0Var.giKS3J6vZuNy());
        int T1fB7bDYiVJQ2 = defpackage.j80.T1fB7bDYiVJQ(this.giKS3J6vZuNy, 0, rw0Var.giKS3J6vZuNy());
        if (T1fB7bDYiVJQ != T1fB7bDYiVJQ2) {
            if (T1fB7bDYiVJQ < T1fB7bDYiVJQ2) {
                cuVar.WDYagTQQm9ns(T1fB7bDYiVJQ, T1fB7bDYiVJQ2);
            } else {
                cuVar.WDYagTQQm9ns(T1fB7bDYiVJQ2, T1fB7bDYiVJQ);
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tc1)) {
            return false;
        }
        defpackage.tc1 tc1Var = (defpackage.tc1) obj;
        return this.ZpBGe2uQfcn8 == tc1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == tc1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", end=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
