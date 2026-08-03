package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f6043a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f6043a == ((r) obj).f6043a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6043a);
    }

    public final String toString() {
        int i10 = this.f6043a;
        return i10 == 1 ? "Linearity.Linear" : i10 == 2 ? "Linearity.FontHinting" : i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
