package defpackage;

/* loaded from: classes10.dex */
public final class xb30 implements s820 {
    public final float a;
    public final float b;

    public xb30(float f, float f2) {
        d6z.k("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xb30.class == obj.getClass()) {
            xb30 xb30Var = (xb30) obj;
            if (this.a == xb30Var.a && this.b == xb30Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + g8e.c(this.a, 527, 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
