package defpackage;

/* loaded from: classes.dex */
public final class kes {
    public static final les[] b = {new les(0), new les(4294967296L), new les(8589934592L)};
    public static final long c = v7g.D(Float.NaN, 0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long b2 = b(j);
        if (les.a(b2, 0L)) {
            return "Unspecified";
        }
        if (les.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!les.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kes) {
            return this.a == ((kes) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
