package O0;

import K0.AbstractC0046w;
import K0.C0041q;
import P0.AbstractC0068a;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: i, reason: collision with root package name */
    public final N0.d f827i;

    public h(N0.d dVar, v0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f827i = dVar;
    }

    @Override // O0.f
    public final Object a(M0.p pVar, v0.d dVar) {
        Object n2 = this.f827i.n(new r(pVar), dVar);
        w0.a aVar = w0.a.f3071f;
        t0.g gVar = t0.g.f2989a;
        if (n2 != aVar) {
            n2 = gVar;
        }
        return n2 == aVar ? n2 : gVar;
    }

    @Override // O0.f
    public final f b(v0.i iVar, int i2, int i3) {
        return new h(this.f827i, iVar, i2, i3);
    }

    @Override // O0.f, N0.d
    public final Object n(N0.e eVar, v0.d dVar) {
        Object n2;
        t0.g gVar = t0.g.f2989a;
        int i2 = this.f822g;
        w0.a aVar = w0.a.f3071f;
        if (i2 == -3) {
            v0.i j2 = dVar.j();
            Boolean bool = Boolean.FALSE;
            C0041q c0041q = C0041q.f527i;
            v0.i iVar = this.f821f;
            v0.i f2 = !((Boolean) iVar.m(bool, c0041q)).booleanValue() ? j2.f(iVar) : AbstractC0046w.a(j2, iVar, false);
            if (E0.i.a(f2, j2)) {
                n2 = this.f827i.n(eVar, dVar);
                if (n2 != aVar) {
                    n2 = gVar;
                }
                if (n2 != aVar) {
                    return gVar;
                }
            } else {
                v0.e eVar2 = v0.e.f3008f;
                if (E0.i.a(f2.i(eVar2), j2.i(eVar2))) {
                    v0.i j3 = dVar.j();
                    if (!(eVar instanceof r)) {
                        eVar = new N0.l(eVar, j3);
                    }
                    n2 = l.b(f2, eVar, AbstractC0068a.m(f2), new g(this, null), dVar);
                    if (n2 != aVar) {
                        n2 = gVar;
                    }
                    if (n2 != aVar) {
                        return gVar;
                    }
                }
            }
            return n2;
        }
        n2 = super.n(eVar, dVar);
        if (n2 != aVar) {
            return gVar;
        }
        return n2;
    }

    @Override // O0.f
    public final String toString() {
        return this.f827i + " -> " + super.toString();
    }
}
