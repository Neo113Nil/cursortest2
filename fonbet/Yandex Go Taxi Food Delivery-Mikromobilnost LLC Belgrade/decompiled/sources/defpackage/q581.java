package defpackage;

/* loaded from: classes7.dex */
public final class q581 implements kq71 {
    public static final q581 y = new q581(-3.4028235E38f, -3.4028235E38f, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
    public final long a;
    public final long b;
    public final long c;
    public final float w;
    public final float x;

    public q581(float f, float f2, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.w = f;
        this.x = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q581)) {
            return false;
        }
        q581 q581Var = (q581) obj;
        return this.a == q581Var.a && this.b == q581Var.b && this.c == q581Var.c && this.w == q581Var.w && this.x == q581Var.x;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.w;
        int floatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.x;
        return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
