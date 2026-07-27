package P0;

import L0.AbstractC0064w;
import L0.C0059q;
import Q0.AbstractC0068a;
import t0.C0252g;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final O0.d f846h;

    public h(O0.d dVar, v0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f846h = dVar;
    }

    @Override // P0.f
    public final Object a(N0.p pVar, v0.d dVar) {
        Object c2 = this.f846h.c(new r(pVar), dVar);
        w0.a aVar = w0.a.f3076e;
        C0252g c0252g = C0252g.f2994a;
        if (c2 != aVar) {
            c2 = c0252g;
        }
        return c2 == aVar ? c2 : c0252g;
    }

    @Override // P0.f
    public final f b(v0.i iVar, int i2, int i3) {
        return new h(this.f846h, iVar, i2, i3);
    }

    @Override // P0.f, O0.d
    public final Object c(O0.e eVar, v0.d dVar) {
        Object c2;
        C0252g c0252g = C0252g.f2994a;
        int i2 = this.f841f;
        w0.a aVar = w0.a.f3076e;
        if (i2 == -3) {
            v0.i j2 = dVar.j();
            Boolean bool = Boolean.FALSE;
            C0059q c0059q = C0059q.f675h;
            v0.i iVar = this.f840e;
            v0.i f2 = !((Boolean) iVar.m(bool, c0059q)).booleanValue() ? j2.f(iVar) : AbstractC0064w.a(j2, iVar, false);
            if (E0.i.a(f2, j2)) {
                c2 = this.f846h.c(eVar, dVar);
                if (c2 != aVar) {
                    c2 = c0252g;
                }
                if (c2 != aVar) {
                    return c0252g;
                }
            } else {
                v0.e eVar2 = v0.e.f3013e;
                if (E0.i.a(f2.i(eVar2), j2.i(eVar2))) {
                    v0.i j3 = dVar.j();
                    if (!(eVar instanceof r)) {
                        eVar = new O0.l(eVar, j3);
                    }
                    c2 = l.b(f2, eVar, AbstractC0068a.m(f2), new g(this, null), dVar);
                    if (c2 != aVar) {
                        c2 = c0252g;
                    }
                    if (c2 != aVar) {
                        return c0252g;
                    }
                }
            }
            return c2;
        }
        c2 = super.c(eVar, dVar);
        if (c2 != aVar) {
            return c0252g;
        }
        return c2;
    }

    @Override // P0.f
    public final String toString() {
        return this.f846h + " -> " + super.toString();
    }
}
