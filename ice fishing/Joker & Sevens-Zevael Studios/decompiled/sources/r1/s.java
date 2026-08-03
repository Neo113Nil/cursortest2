package r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f5992a;

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f5992a == ((s) obj).f5992a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5992a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f5992a + ')';
    }
}
