package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f6395a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static String b(long j3) {
        return ((int) (j3 >> 32)) + " x " + ((int) (j3 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f6395a == ((k) obj).f6395a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6395a);
    }

    public final String toString() {
        return b(this.f6395a);
    }
}
