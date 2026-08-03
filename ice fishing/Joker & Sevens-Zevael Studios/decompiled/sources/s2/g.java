package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6388a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6388a == ((g) obj).f6388a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6388a);
    }

    public final String toString() {
        long j3 = this.f6388a;
        if (j3 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j3 >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j3 & 4294967295L)))) + ')';
    }
}
