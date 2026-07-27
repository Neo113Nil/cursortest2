package v0;

import D0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final i f3011e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3012f;

    public c(i iVar, g gVar) {
        E0.i.e(iVar, "left");
        E0.i.e(gVar, "element");
        this.f3011e = iVar;
        this.f3012f = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f3011e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f3011e;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f3012f;
                if (!E0.i.a(cVar.i(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f3011e;
                if (!(iVar3 instanceof c)) {
                    E0.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = E0.i.a(cVar.i(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    @Override // v0.i
    public final i f(i iVar) {
        E0.i.e(iVar, "context");
        return iVar == j.f3014e ? this : (i) iVar.m(this, new b(1));
    }

    @Override // v0.i
    public final i g(h hVar) {
        E0.i.e(hVar, "key");
        g gVar = this.f3012f;
        g i2 = gVar.i(hVar);
        i iVar = this.f3011e;
        if (i2 != null) {
            return iVar;
        }
        i g2 = iVar.g(hVar);
        return g2 == iVar ? this : g2 == j.f3014e ? gVar : new c(g2, gVar);
    }

    public final int hashCode() {
        return this.f3012f.hashCode() + this.f3011e.hashCode();
    }

    @Override // v0.i
    public final g i(h hVar) {
        E0.i.e(hVar, "key");
        c cVar = this;
        while (true) {
            g i2 = cVar.f3012f.i(hVar);
            if (i2 != null) {
                return i2;
            }
            i iVar = cVar.f3011e;
            if (!(iVar instanceof c)) {
                return iVar.i(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // v0.i
    public final Object m(Object obj, p pVar) {
        return pVar.f(this.f3011e.m(obj, pVar), this.f3012f);
    }

    public final String toString() {
        return "[" + ((String) m("", new b(0))) + ']';
    }
}
