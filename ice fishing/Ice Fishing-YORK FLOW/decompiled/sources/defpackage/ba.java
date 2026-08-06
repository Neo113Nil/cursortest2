package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ba implements defpackage.iYH9ueRbBBFm {
    public final float ZpBGe2uQfcn8;

    public ba(float f) {
        this.ZpBGe2uQfcn8 = f;
    }

    @Override // defpackage.iYH9ueRbBBFm
    public final long ZpBGe2uQfcn8(long j, long j2, defpackage.sc0 sc0Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        return (java.lang.Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (java.lang.Math.round((1.0f + this.ZpBGe2uQfcn8) * (((int) (j3 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ba) && java.lang.Float.compare(this.ZpBGe2uQfcn8, ((defpackage.ba) obj).ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(-1.0f) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.ZpBGe2uQfcn8 + ", verticalBias=-1.0)";
    }
}
