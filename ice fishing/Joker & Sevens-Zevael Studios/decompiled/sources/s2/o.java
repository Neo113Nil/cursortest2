package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f6403a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6403a == ((o) obj).f6403a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6403a);
    }

    public final String toString() {
        long j3 = this.f6403a;
        return a(j3, 0L) ? "Unspecified" : a(j3, 4294967296L) ? "Sp" : a(j3, 8589934592L) ? "Em" : "Invalid";
    }
}
