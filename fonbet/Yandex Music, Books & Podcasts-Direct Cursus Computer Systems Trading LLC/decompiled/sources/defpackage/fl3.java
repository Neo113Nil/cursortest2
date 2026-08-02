package defpackage;

/* loaded from: classes.dex */
public final class fl3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public fl3(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return cma.a(this.a, fl3Var.a) && cma.a(this.b, fl3Var.b) && cma.a(this.c, fl3Var.c) && cma.a(this.d, fl3Var.d) && cma.a(this.e, fl3Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
