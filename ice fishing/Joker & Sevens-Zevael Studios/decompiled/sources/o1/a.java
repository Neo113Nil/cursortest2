package o1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5149a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5149a == ((a) obj).f5149a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5149a);
    }

    public final String toString() {
        int i10 = this.f5149a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
