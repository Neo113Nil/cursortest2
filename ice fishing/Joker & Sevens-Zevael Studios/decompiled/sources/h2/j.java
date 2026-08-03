package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f2681b;

    public j(String str, f0 f0Var) {
        this.f2680a = str;
        this.f2681b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return pc.j.a(this.f2680a, jVar.f2680a) && pc.j.a(this.f2681b, jVar.f2681b);
    }

    public final int hashCode() {
        int hashCode = this.f2680a.hashCode() * 31;
        f0 f0Var = this.f2681b;
        return (hashCode + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f2680a + ')';
    }
}
