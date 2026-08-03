package r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f5962a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static String b(long j3) {
        return "PointerId(value=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f5962a == ((m) obj).f5962a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5962a);
    }

    public final String toString() {
        return b(this.f5962a);
    }
}
