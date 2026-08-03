package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final n f6904a;

    /* renamed from: b, reason: collision with root package name */
    public final v f6905b;

    public n1(n nVar, v vVar) {
        this.f6904a = nVar;
        this.f6905b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return pc.j.a(this.f6904a, n1Var.f6904a) && pc.j.a(this.f6905b, n1Var.f6905b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f6905b.hashCode() + (this.f6904a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f6904a + ", easing=" + this.f6905b + ", arcMode=ArcMode(value=0))";
    }
}
