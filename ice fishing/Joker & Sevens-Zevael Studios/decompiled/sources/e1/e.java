package e1;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1943a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final float c(long j3) {
        return Math.min(Float.intBitsToFloat((int) ((j3 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j3 & 2147483647L)));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final boolean e(long j3) {
        return (j3 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j3 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j3 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j3) {
        if (j3 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + a0.L(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + a0.L(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1943a == ((e) obj).f1943a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1943a);
    }

    public final String toString() {
        return f(this.f1943a);
    }
}
