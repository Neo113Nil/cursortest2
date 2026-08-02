package defpackage;

/* loaded from: classes.dex */
public final class jgo {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        cb0.m(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public jgo(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgo)) {
            return false;
        }
        jgo jgoVar = (jgo) obj;
        return Float.compare(this.a, jgoVar.a) == 0 && Float.compare(this.b, jgoVar.b) == 0 && Float.compare(this.c, jgoVar.c) == 0 && Float.compare(this.d, jgoVar.d) == 0 && up6.t(this.e, jgoVar.e) && up6.t(this.f, jgoVar.f) && up6.t(this.g, jgoVar.g) && up6.t(this.h, jgoVar.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + tlm.c(this.g, tlm.c(this.f, tlm.c(this.e, eta.a(eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31);
    }

    public final String toString() {
        String str = jf0.a0(this.a) + ", " + jf0.a0(this.b) + ", " + jf0.a0(this.c) + ", " + jf0.a0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean t = up6.t(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!t || !up6.t(j2, j3) || !up6.t(j3, j4)) {
            StringBuilder u = ouj.u("RoundRect(rect=", str, ", topLeft=");
            u.append((Object) up6.T(j));
            u.append(", topRight=");
            u.append((Object) up6.T(j2));
            u.append(", bottomRight=");
            u.append((Object) up6.T(j3));
            u.append(", bottomLeft=");
            u.append((Object) up6.T(j4));
            u.append(')');
            return u.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder u2 = ouj.u("RoundRect(rect=", str, ", radius=");
            u2.append(jf0.a0(Float.intBitsToFloat(i)));
            u2.append(')');
            return u2.toString();
        }
        StringBuilder u3 = ouj.u("RoundRect(rect=", str, ", x=");
        u3.append(jf0.a0(Float.intBitsToFloat(i)));
        u3.append(", y=");
        u3.append(jf0.a0(Float.intBitsToFloat(i2)));
        u3.append(')');
        return u3.toString();
    }
}
