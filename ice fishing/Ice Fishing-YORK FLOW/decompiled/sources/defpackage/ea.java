package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ea implements defpackage.iYH9ueRbBBFm {
    public final float ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public ea(float f, float f2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
    }

    @Override // defpackage.iYH9ueRbBBFm
    public final long ZpBGe2uQfcn8(long j, long j2, defpackage.sc0 sc0Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        defpackage.sc0 sc0Var2 = defpackage.sc0.WDYagTQQm9ns;
        float f3 = this.ZpBGe2uQfcn8;
        if (sc0Var != sc0Var2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.giKS3J6vZuNy) * f2;
        int round = java.lang.Math.round((f3 + 1.0f) * f);
        return (java.lang.Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ea)) {
            return false;
        }
        defpackage.ea eaVar = (defpackage.ea) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, eaVar.ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(this.giKS3J6vZuNy, eaVar.giKS3J6vZuNy) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", verticalBias=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }
}
