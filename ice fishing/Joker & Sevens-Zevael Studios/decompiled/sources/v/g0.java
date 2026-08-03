package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Float f6849a;

    /* renamed from: b, reason: collision with root package name */
    public v f6850b;

    public g0(Float f10, v vVar) {
        this.f6849a = f10;
        this.f6850b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return g0Var.f6849a.equals(this.f6849a) && pc.j.a(g0Var.f6850b, this.f6850b);
    }

    public final int hashCode() {
        return this.f6850b.hashCode() + f.b(0, this.f6849a.hashCode() * 31, 31);
    }
}
