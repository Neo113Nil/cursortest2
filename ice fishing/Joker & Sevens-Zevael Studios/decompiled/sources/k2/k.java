package k2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f3610a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f3610a == ((k) obj).f3610a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3610a);
    }

    public final String toString() {
        int i10 = this.f3610a;
        return i10 == 0 ? "None" : i10 == 1 ? "Weight" : i10 == 2 ? "Style" : i10 == 65535 ? "All" : "Invalid";
    }
}
