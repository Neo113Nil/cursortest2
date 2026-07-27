package U7;

import D.y;
import S7.y0;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: D, reason: collision with root package name */
    public final a f3263D;

    public n(int i, a aVar) {
        super(i);
        this.f3263D = aVar;
        if (aVar != a.f3219n) {
            if (i < 1) {
                throw new IllegalArgumentException(y.k(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
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
    public final Object E(Object obj, boolean z3) {
        a aVar = a.f3221v;
        v vVar = v.f41350a;
        if (this.f3263D == aVar) {
            Object e9 = super.e(obj);
            return (!(e9 instanceof i) || (e9 instanceof h)) ? e9 : vVar;
        }
        Object obj2 = e.f3240d;
        k kVar = (k) c.f3233y.get(this);
        while (true) {
            long andIncrement = c.f3229u.getAndIncrement(this);
            long j6 = 1152921504606846975L & andIncrement;
            boolean t6 = t(andIncrement, false);
            int i = e.f3238b;
            long j9 = i;
            long j10 = j6 / j9;
            int i6 = (int) (j6 % j9);
            if (kVar.f3860v != j10) {
                k c9 = c.c(this, j10, kVar);
                if (c9 != null) {
                    kVar = c9;
                } else if (t6) {
                    return new h(q());
                }
            }
            int g4 = c.g(this, kVar, i6, obj, j6, obj2, t6);
            if (g4 == 0) {
                kVar.a();
                return vVar;
            }
            if (g4 == 1) {
                break;
            }
            if (g4 != 2) {
                if (g4 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (g4 == 4) {
                    if (j6 < c.f3230v.get(this)) {
                        kVar.a();
                    }
                    return new h(q());
                }
                if (g4 == 5) {
                    kVar.a();
                }
            } else {
                if (t6) {
                    kVar.h();
                    return new h(q());
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i6 + i);
                }
                l((kVar.f3860v * j9) + i6);
            }
        }
    }

    @Override // U7.c, U7.r
    public final Object d(Object obj, InterfaceC5267d interfaceC5267d) {
        Object E8 = E(obj, true);
        if (!(E8 instanceof h)) {
            return v.f41350a;
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
        return this.f3263D == a.f3220u;
    }
}
