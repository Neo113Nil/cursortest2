package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vc1 implements defpackage.bu {
    public final int ZpBGe2uQfcn8;
    public final int giKS3J6vZuNy;

    public vc1(int i, int i2) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
    }

    @Override // defpackage.bu
    public final void ZpBGe2uQfcn8(defpackage.cu cuVar) {
        int T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(this.ZpBGe2uQfcn8, 0, cuVar.ZpBGe2uQfcn8.giKS3J6vZuNy());
        int T1fB7bDYiVJQ2 = defpackage.j80.T1fB7bDYiVJQ(this.giKS3J6vZuNy, 0, cuVar.ZpBGe2uQfcn8.giKS3J6vZuNy());
        if (T1fB7bDYiVJQ < T1fB7bDYiVJQ2) {
            cuVar.oh71FJcDz6S2(T1fB7bDYiVJQ, T1fB7bDYiVJQ2);
        } else {
            cuVar.oh71FJcDz6S2(T1fB7bDYiVJQ2, T1fB7bDYiVJQ);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.vc1)) {
            return false;
        }
        defpackage.vc1 vc1Var = (defpackage.vc1) obj;
        return this.ZpBGe2uQfcn8 == vc1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == vc1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return (this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetSelectionCommand(start=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", end=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.giKS3J6vZuNy, ')');
    }
}
