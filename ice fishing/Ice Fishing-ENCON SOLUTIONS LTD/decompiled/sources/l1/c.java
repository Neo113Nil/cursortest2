package l1;

import java.io.Serializable;
import t1.p;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f8135a;

    /* renamed from: b, reason: collision with root package name */
    public final g f8136b;

    public c(i left, g element) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f8135a = left;
        this.f8136b = element;
    }

    @Override // l1.i
    public final i c(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        g gVar = this.f8136b;
        g m2 = gVar.m(key);
        i iVar = this.f8135a;
        if (m2 != null) {
            return iVar;
        }
        i c2 = iVar.c(key);
        return c2 == iVar ? this : c2 == j.f8138a ? gVar : new c(c2, gVar);
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
                i iVar = cVar2.f8135a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f8135a;
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
                g gVar = cVar4.f8136b;
                if (!kotlin.jvm.internal.i.a(cVar.m(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f8135a;
                if (!(iVar3 instanceof c)) {
                    kotlin.jvm.internal.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = kotlin.jvm.internal.i.a(cVar.m(gVar2.getKey()), gVar2);
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

    public final int hashCode() {
        return this.f8136b.hashCode() + this.f8135a.hashCode();
    }

    @Override // l1.i
    public final Object k(Object obj, p pVar) {
        return pVar.invoke(this.f8135a.k(obj, pVar), this.f8136b);
    }

    @Override // l1.i
    public final i l(i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == j.f8138a ? this : (i) context.k(this, new C0982b(1));
    }

    @Override // l1.i
    public final g m(h key) {
        kotlin.jvm.internal.i.e(key, "key");
        c cVar = this;
        while (true) {
            g m2 = cVar.f8136b.m(key);
            if (m2 != null) {
                return m2;
            }
            i iVar = cVar.f8135a;
            if (!(iVar instanceof c)) {
                return iVar.m(key);
            }
            cVar = (c) iVar;
        }
    }

    public final String toString() {
        return "[" + ((String) k("", new C0982b(0))) + ']';
    }
}
