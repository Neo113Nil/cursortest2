package ad;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f327b = new k();

    /* renamed from: a, reason: collision with root package name */
    public final Object f328a;

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return pc.j.a(this.f328a, ((l) obj).f328a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f328a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f328a;
        if (obj instanceof j) {
            return ((j) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
