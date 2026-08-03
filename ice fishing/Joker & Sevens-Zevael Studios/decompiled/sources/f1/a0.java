package f1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1.d f2212a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2213b;

    public a0(e1.d dVar) {
        i iVar;
        this.f2212a = dVar;
        if (a.a.C(dVar)) {
            iVar = null;
        } else {
            iVar = k.a();
            i.a(iVar, dVar);
        }
        this.f2213b = iVar;
    }

    @Override // f1.b0
    public final e1.c a() {
        e1.d dVar = this.f2212a;
        return new e1.c(dVar.f1935a, dVar.f1936b, dVar.f1937c, dVar.f1938d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return pc.j.a(this.f2212a, ((a0) obj).f2212a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2212a.hashCode();
    }
}
