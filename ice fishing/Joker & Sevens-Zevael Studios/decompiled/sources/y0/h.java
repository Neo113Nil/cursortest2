package y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f8438a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8439b;

    public h(n nVar, n nVar2) {
        this.f8438a = nVar;
        this.f8439b = nVar2;
    }

    @Override // y0.n
    public final boolean a(oc.c cVar) {
        return this.f8438a.a(cVar) && this.f8439b.a(cVar);
    }

    @Override // y0.n
    public final Object c(Object obj, oc.e eVar) {
        return this.f8439b.c(this.f8438a.c(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return pc.j.a(this.f8438a, hVar.f8438a) && pc.j.a(this.f8439b, hVar.f8439b);
    }

    public final int hashCode() {
        return (this.f8439b.hashCode() * 31) + this.f8438a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) c("", g.f8437g)) + ']';
    }
}
