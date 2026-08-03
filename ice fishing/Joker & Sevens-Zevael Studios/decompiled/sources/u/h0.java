package u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final v.x f6603a;

    public h0(v.x xVar) {
        this.f6603a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return Float.compare(0.0f, 0.0f) == 0 && pc.j.a(this.f6603a, ((h0) obj).f6603a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6603a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f6603a + ')';
    }
}
