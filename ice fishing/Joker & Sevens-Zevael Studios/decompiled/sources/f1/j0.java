package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2266b = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2267c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2268a;

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        return "TransformOrigin(packedValue=" + j3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f2268a == ((j0) obj).f2268a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2268a);
    }

    public final String toString() {
        return d(this.f2268a);
    }
}
