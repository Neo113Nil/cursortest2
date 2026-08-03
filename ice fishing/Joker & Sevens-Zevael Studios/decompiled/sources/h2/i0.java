package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2679a;

    public i0(String str) {
        this.f2679a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return pc.j.a(this.f2679a, ((i0) obj).f2679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2679a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.f2679a + ')';
    }
}
