package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nh0 implements defpackage.p00 {
    public final float ZpBGe2uQfcn8;

    public nh0(float f) {
        this.ZpBGe2uQfcn8 = f;
    }

    @Override // defpackage.p00
    public final float ZpBGe2uQfcn8(float f) {
        return f / this.ZpBGe2uQfcn8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.nh0) && java.lang.Float.compare(this.ZpBGe2uQfcn8, ((defpackage.nh0) obj).ZpBGe2uQfcn8) == 0;
    }

    @Override // defpackage.p00
    public final float giKS3J6vZuNy(float f) {
        return f * this.ZpBGe2uQfcn8;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(new java.lang.StringBuilder("LinearFontScaleConverter(fontScale="), this.ZpBGe2uQfcn8, ')');
    }
}
