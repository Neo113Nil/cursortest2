package defpackage;

/* loaded from: classes.dex */
public final class zc1 extends defpackage.w70 {
    public final float WLpAkxCo;

    public zc1(float f) {
        this.WLpAkxCo = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zc1) {
            return this.WLpAkxCo == ((defpackage.zc1) obj).WLpAkxCo;
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.fx0.oh6vYeIP(0, defpackage.fx0.oh6vYeIP(0, defpackage.fx0.IHQe1A4L2xu(4.0f, java.lang.Float.hashCode(this.WLpAkxCo) * 31, 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "Stroke(width=" + this.WLpAkxCo + ", miter=4.0, cap=" + ((java.lang.Object) "Butt") + ", join=" + ((java.lang.Object) "Miter") + ", pathEffect=null)";
    }
}
