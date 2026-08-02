package defpackage;

/* loaded from: classes10.dex */
public final class yd10 {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new yd10(new xd10());
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
    }

    public yd10(xd10 xd10Var) {
        long j = xd10Var.a;
        long j2 = xd10Var.b;
        long j3 = xd10Var.c;
        float f = xd10Var.d;
        float f2 = xd10Var.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final xd10 a() {
        xd10 xd10Var = new xd10();
        xd10Var.a = this.a;
        xd10Var.b = this.b;
        xd10Var.c = this.c;
        xd10Var.d = this.d;
        xd10Var.e = this.e;
        return xd10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd10)) {
            return false;
        }
        yd10 yd10Var = (yd10) obj;
        return this.a == yd10Var.a && this.b == yd10Var.b && this.c == yd10Var.c && this.d == yd10Var.d && this.e == yd10Var.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int floatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
