package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bv1 implements defpackage.hl0 {
    public final defpackage.aa ZpBGe2uQfcn8;

    public bv1(defpackage.aa aaVar) {
        this.ZpBGe2uQfcn8 = aaVar;
    }

    @Override // defpackage.hl0
    public final int ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, int i, defpackage.sc0 sc0Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return java.lang.Math.round((1.0f + (sc0Var == defpackage.sc0.WDYagTQQm9ns ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return defpackage.j80.T1fB7bDYiVJQ(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(i, i2, sc0Var), 0, i2 - i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bv1) && this.ZpBGe2uQfcn8.equals(((defpackage.bv1) obj).ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        return "Horizontal(alignment=" + this.ZpBGe2uQfcn8 + ", margin=0)";
    }
}
