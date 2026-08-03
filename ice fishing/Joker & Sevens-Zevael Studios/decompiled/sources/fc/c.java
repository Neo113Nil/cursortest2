package fc;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final i f2345g;

    /* renamed from: h, reason: collision with root package name */
    public final g f2346h;

    public c(g gVar, i iVar) {
        pc.j.e(iVar, "left");
        pc.j.e(gVar, "element");
        this.f2345g = iVar;
        this.f2346h = gVar;
    }

    @Override // fc.i
    public final i d(i iVar) {
        pc.j.e(iVar, "context");
        return iVar == j.f2348g ? this : (i) iVar.i(this, b.f2343i);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i10 = 2;
            c cVar2 = cVar;
            int i11 = 2;
            while (true) {
                i iVar = cVar2.f2345g;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i11++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f2345g;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f2346h;
                    if (!pc.j.a(cVar.v(gVar.getKey()), gVar)) {
                        z10 = false;
                        break;
                    }
                    i iVar3 = cVar4.f2345g;
                    if (!(iVar3 instanceof c)) {
                        pc.j.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z10 = pc.j.a(cVar.v(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fc.i
    public final i g(h hVar) {
        pc.j.e(hVar, "key");
        g gVar = this.f2346h;
        g v10 = gVar.v(hVar);
        i iVar = this.f2345g;
        if (v10 != null) {
            return iVar;
        }
        i g8 = iVar.g(hVar);
        return g8 == iVar ? this : g8 == j.f2348g ? gVar : new c(gVar, g8);
    }

    public final int hashCode() {
        return this.f2346h.hashCode() + this.f2345g.hashCode();
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(this.f2345g.i(obj, eVar), this.f2346h);
    }

    public final String toString() {
        return "[" + ((String) i("", b.f2342h)) + ']';
    }

    @Override // fc.i
    public final g v(h hVar) {
        pc.j.e(hVar, "key");
        c cVar = this;
        while (true) {
            g v10 = cVar.f2346h.v(hVar);
            if (v10 != null) {
                return v10;
            }
            i iVar = cVar.f2345g;
            if (!(iVar instanceof c)) {
                return iVar.v(hVar);
            }
            cVar = (c) iVar;
        }
    }
}
