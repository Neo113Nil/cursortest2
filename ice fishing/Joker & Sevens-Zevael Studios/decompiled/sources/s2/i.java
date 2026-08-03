package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f6389a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static final long b(long j3, long j6) {
        return ((((int) (j3 >> 32)) - ((int) (j6 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static final long c(long j3, long j6) {
        return ((((int) (j3 >> 32)) + ((int) (j6 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j6 & 4294967295L))) & 4294967295L);
    }

    public static String d(long j3) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j3 >> 32));
        sb.append(", ");
        return a4.d.l(sb, (int) (j3 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f6389a == ((i) obj).f6389a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6389a);
    }

    public final String toString() {
        return d(this.f6389a);
    }
}
