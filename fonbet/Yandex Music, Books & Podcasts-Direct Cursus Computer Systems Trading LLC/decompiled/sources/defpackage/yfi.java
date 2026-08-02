package defpackage;

/* loaded from: classes.dex */
public final class yfi implements n2i {
    public final float a;
    public final float b;

    public yfi(float f, float f2) {
        vq1.u("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yfi.class == obj.getClass()) {
            yfi yfiVar = (yfi) obj;
            if (this.a == yfiVar.a && this.b == yfiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
