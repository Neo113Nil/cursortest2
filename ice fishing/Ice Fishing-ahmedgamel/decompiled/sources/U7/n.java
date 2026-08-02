package U7;

import D.x;
import S7.y0;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: D, reason: collision with root package name */
    public final a f3386D;

    public n(int i, a aVar) {
        super(i);
        this.f3386D = aVar;
        if (aVar != a.f3342n) {
            if (i < 1) {
                throw new IllegalArgumentException(x.j(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.s.a(c.class).b() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(Object obj, boolean z6) {
        a aVar = a.f3344v;
        v vVar = v.f41073a;
        if (this.f3386D == aVar) {
            Object e9 = super.e(obj);
            return (!(e9 instanceof i) || (e9 instanceof h)) ? e9 : vVar;
        }
        x2.e eVar = e.f3363d;
        k kVar = (k) c.f3356y.get(this);
        while (true) {
            long andIncrement = c.f3352u.getAndIncrement(this);
            long j6 = 1152921504606846975L & andIncrement;
            boolean t6 = t(andIncrement, false);
            int i = e.f3361b;
            long j9 = i;
            long j10 = j6 / j9;
            int i4 = (int) (j6 % j9);
            if (kVar.f3815v != j10) {
                k c9 = c.c(this, j10, kVar);
                if (c9 != null) {
                    kVar = c9;
                } else if (t6) {
                    return new h(q());
                }
            }
            int g9 = c.g(this, kVar, i4, obj, j6, eVar, t6);
            if (g9 == 0) {
                kVar.a();
                return vVar;
            }
            if (g9 == 1) {
                break;
            }
            if (g9 != 2) {
                if (g9 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (g9 == 4) {
                    if (j6 < c.f3353v.get(this)) {
                        kVar.a();
                    }
                    return new h(q());
                }
                if (g9 == 5) {
                    kVar.a();
                }
            } else {
                if (t6) {
                    kVar.h();
                    return new h(q());
                }
                y0 y0Var = eVar instanceof y0 ? (y0) eVar : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i4 + i);
                }
                l((kVar.f3815v * j9) + i4);
            }
        }
    }

    @Override // U7.c, U7.r
    public final Object d(Object obj, InterfaceC5240d interfaceC5240d) {
        Object E8 = E(obj, true);
        if (!(E8 instanceof h)) {
            return v.f41073a;
        }
        j.b(E8);
        throw q();
    }

    @Override // U7.c, U7.r
    public final Object e(Object obj) {
        return E(obj, false);
    }

    @Override // U7.c
    public final boolean u() {
        return this.f3386D == a.f3343u;
    }
}
