package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hx {
    public final float ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public hx(float f, float f2, long j) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hx)) {
            return false;
        }
        defpackage.hx hxVar = (defpackage.hx) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, hxVar.ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(this.giKS3J6vZuNy, hxVar.giKS3J6vZuNy) == 0 && this.fWTAfUmVKrZq == hxVar.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.ZpBGe2uQfcn8 + ", distance=" + this.giKS3J6vZuNy + ", duration=" + this.fWTAfUmVKrZq + ')';
    }
}
