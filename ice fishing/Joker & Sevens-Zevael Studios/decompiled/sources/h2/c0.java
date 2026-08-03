package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2635a;

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return pc.j.a(this.f2635a, ((c0) obj).f2635a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2635a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f2635a + ')';
    }
}
