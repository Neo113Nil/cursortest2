package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wq {
    public final java.lang.String ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public wq(int i, int i2, java.lang.String str) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.wq)) {
            return false;
        }
        defpackage.wq wqVar = (defpackage.wq) obj;
        return this.ZpBGe2uQfcn8.equals(wqVar.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == wqVar.giKS3J6vZuNy && this.fWTAfUmVKrZq == wqVar.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.giKS3J6vZuNy);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.fWTAfUmVKrZq);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(1.0f);
        return java.util.Objects.hash(this.ZpBGe2uQfcn8, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final java.lang.String toString() {
        return "DisplayShapeCompat{ spec=" + java.lang.Integer.valueOf(this.ZpBGe2uQfcn8.hashCode()) + " displayWidth=" + this.giKS3J6vZuNy + " displayHeight=" + this.fWTAfUmVKrZq + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
