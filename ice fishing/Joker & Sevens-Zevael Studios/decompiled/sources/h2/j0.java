package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2682a;

    public j0(String str) {
        this.f2682a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return pc.j.a(this.f2682a, ((j0) obj).f2682a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2682a.hashCode();
    }

    public final String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f2682a + ')';
    }
}
