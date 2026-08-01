package v1;

import C1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f4494a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4495b;

    public c(g gVar, i iVar) {
        D1.i.e(iVar, "left");
        D1.i.e(gVar, "element");
        this.f4494a = iVar;
        this.f4495b = gVar;
    }

    @Override // v1.i
    public final i c(h hVar) {
        D1.i.e(hVar, "key");
        g gVar = this.f4495b;
        g e = gVar.e(hVar);
        i iVar = this.f4494a;
        if (e != null) {
            return iVar;
        }
        i c2 = iVar.c(hVar);
        return c2 == iVar ? this : c2 == j.f4497a ? gVar : new c(gVar, c2);
    }

    @Override // v1.i
    public final Object d(Object obj, p pVar) {
        return pVar.d(this.f4494a.d(obj, pVar), this.f4495b);
    }

    @Override // v1.i
    public final g e(h hVar) {
        D1.i.e(hVar, "key");
        c cVar = this;
        while (true) {
            g e = cVar.f4495b.e(hVar);
            if (e != null) {
                return e;
            }
            i iVar = cVar.f4494a;
            if (!(iVar instanceof c)) {
                return iVar.e(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                i iVar = cVar2.f4494a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f4494a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f4495b;
                if (!D1.i.a(cVar.e(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f4494a;
                if (!(iVar3 instanceof c)) {
                    D1.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = D1.i.a(cVar.e(gVar2.getKey()), gVar2);
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

    @Override // v1.i
    public final i f(i iVar) {
        return h0.f.w(this, iVar);
    }

    public final int hashCode() {
        return this.f4495b.hashCode() + this.f4494a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) d("", b.f4491c)) + ']';
    }
}
