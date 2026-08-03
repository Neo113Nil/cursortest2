package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4584a;

    public f1(String str) {
        this.f4584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && pc.j.a(this.f4584a, ((f1) obj).f4584a);
    }

    public final int hashCode() {
        return this.f4584a.hashCode();
    }

    public final String toString() {
        return "OpaqueKey(key=" + this.f4584a + ')';
    }
}
