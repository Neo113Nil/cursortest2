package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f2677a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f2678b;

    public i(String str, f0 f0Var) {
        this.f2677a = str;
        this.f2678b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return pc.j.a(this.f2677a, iVar.f2677a) && pc.j.a(this.f2678b, iVar.f2678b);
    }

    public final int hashCode() {
        int hashCode = this.f2677a.hashCode() * 31;
        f0 f0Var = this.f2678b;
        return (hashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f2677a + ')';
    }
}
