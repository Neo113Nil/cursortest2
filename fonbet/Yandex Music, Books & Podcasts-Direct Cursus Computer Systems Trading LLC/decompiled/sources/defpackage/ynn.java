package defpackage;

/* loaded from: classes.dex */
public final class ynn {
    public static final ynn e = new ynn(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ynn(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static ynn b(ynn ynnVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = ynnVar.a;
        }
        float f4 = (i & 2) != 0 ? ynnVar.b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = ynnVar.c;
        }
        if ((i & 8) != 0) {
            f3 = ynnVar.d;
        }
        return new ynn(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final float d() {
        return this.d - this.b;
    }

    public final long e() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynn)) {
            return false;
        }
        ynn ynnVar = (ynn) obj;
        return Float.compare(this.a, ynnVar.a) == 0 && Float.compare(this.b, ynnVar.b) == 0 && Float.compare(this.c, ynnVar.c) == 0 && Float.compare(this.d, ynnVar.d) == 0;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final float g() {
        return this.c - this.a;
    }

    public final ynn h(ynn ynnVar) {
        return new ynn(Math.max(this.a, ynnVar.a), Math.max(this.b, ynnVar.b), Math.min(this.c, ynnVar.c), Math.min(this.d, ynnVar.d));
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + eta.a(eta.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final boolean i() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean j(ynn ynnVar) {
        return (this.a < ynnVar.c) & (ynnVar.a < this.c) & (this.b < ynnVar.d) & (ynnVar.b < this.d);
    }

    public final ynn k(float f, float f2) {
        return new ynn(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final ynn l(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ynn(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + jf0.a0(this.a) + ", " + jf0.a0(this.b) + ", " + jf0.a0(this.c) + ", " + jf0.a0(this.d) + ')';
    }
}
