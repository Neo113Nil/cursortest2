package s2;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f6400b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f6401c = a0.E(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f6402a;

    public /* synthetic */ n(long j3) {
        this.f6402a = j3;
    }

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static final long b(long j3) {
        return f6400b[(int) ((j3 & 1095216660480L) >>> 32)].f6403a;
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        long b2 = b(j3);
        if (o.a(b2, 0L)) {
            return "Unspecified";
        }
        if (o.a(b2, 4294967296L)) {
            return c(j3) + ".sp";
        }
        if (!o.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j3) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f6402a == ((n) obj).f6402a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6402a);
    }

    public final String toString() {
        return d(this.f6402a);
    }
}
