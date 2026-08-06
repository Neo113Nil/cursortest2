package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o61 {
    public final int ZpBGe2uQfcn8;
    public final android.graphics.Point fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public o61(int i, int i2, android.graphics.Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = new android.graphics.Point(i3, i4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.o61) {
            defpackage.o61 o61Var = (defpackage.o61) obj;
            if (this.ZpBGe2uQfcn8 == o61Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == o61Var.giKS3J6vZuNy && this.fWTAfUmVKrZq.equals(o61Var.fWTAfUmVKrZq)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + (((this.ZpBGe2uQfcn8 * 31) + this.giKS3J6vZuNy) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RoundedCornerCompat{position=");
        int i = this.ZpBGe2uQfcn8;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", center=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append('}');
        return sb.toString();
    }
}
