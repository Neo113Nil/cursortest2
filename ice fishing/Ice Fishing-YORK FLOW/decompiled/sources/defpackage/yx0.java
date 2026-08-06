package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yx0 implements defpackage.gm {
    public final float ZpBGe2uQfcn8;

    public yx0(float f) {
        this.ZpBGe2uQfcn8 = f;
        if (f < 0.0f || f > 100.0f) {
            defpackage.h80.ZpBGe2uQfcn8("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.gm
    public final float ZpBGe2uQfcn8(long j, defpackage.hp hpVar) {
        return (this.ZpBGe2uQfcn8 / 100.0f) * defpackage.ae1.giKS3J6vZuNy(j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.yx0) && java.lang.Float.compare(this.ZpBGe2uQfcn8, ((defpackage.yx0) obj).ZpBGe2uQfcn8) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.ZpBGe2uQfcn8 + "%)";
    }
}
