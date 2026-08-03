package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final s f2708a;

    public t(s sVar) {
        this.f2708a = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return pc.j.a(this.f2708a, ((t) obj).f2708a);
        }
        return false;
    }

    public final int hashCode() {
        s sVar = this.f2708a;
        if (sVar != null) {
            return sVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f2708a + ')';
    }
}
