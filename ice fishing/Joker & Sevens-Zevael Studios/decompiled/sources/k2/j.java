package k2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3609a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f3609a == ((j) obj).f3609a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3609a);
    }

    public final String toString() {
        int i10 = this.f3609a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
