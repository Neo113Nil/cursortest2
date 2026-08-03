package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f2290a;

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f2290a == ((w) obj).f2290a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2290a);
    }

    public final String toString() {
        int i10 = this.f2290a;
        return i10 == 0 ? "Argb8888" : i10 == 1 ? "Alpha8" : i10 == 2 ? "Rgb565" : i10 == 3 ? "F16" : i10 == 4 ? "Gpu" : "Unknown";
    }
}
