package Q7;

import D.y;
import O7.y0;
import q7.v;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class n extends c {

    /* renamed from: D, reason: collision with root package name */
    public final a f2775D;

    public n(int i, a aVar) {
        super(i);
        this.f2775D = aVar;
        if (aVar != a.f2731n) {
            if (i < 1) {
                throw new IllegalArgumentException(y.i(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
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
    public final Object E(Object obj, boolean z8) {
        a aVar = a.f2733v;
        v vVar = v.f40183a;
        if (this.f2775D == aVar) {
            Object e6 = super.e(obj);
            return (!(e6 instanceof i) || (e6 instanceof h)) ? e6 : vVar;
        }
        Object obj2 = e.f2752d;
        k kVar = (k) c.f2745y.get(this);
        while (true) {
            long andIncrement = c.f2741u.getAndIncrement(this);
            long j9 = 1152921504606846975L & andIncrement;
            boolean t9 = t(andIncrement, false);
            int i = e.f2750b;
            long j10 = i;
            long j11 = j9 / j10;
            int i4 = (int) (j9 % j10);
            if (kVar.f3166v != j11) {
                k d2 = c.d(this, j11, kVar);
                if (d2 != null) {
                    kVar = d2;
                } else if (t9) {
                    return new h(q());
                }
            }
            int g9 = c.g(this, kVar, i4, obj, j9, obj2, t9);
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
                    if (j9 < c.f2742v.get(this)) {
                        kVar.a();
                    }
                    return new h(q());
                }
                if (g9 == 5) {
                    kVar.a();
                }
            } else {
                if (t9) {
                    kVar.h();
                    return new h(q());
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i4 + i);
                }
                l((kVar.f3166v * j10) + i4);
            }
        }
    }

    @Override // Q7.c, Q7.r
    public final Object b(Object obj, InterfaceC5133d interfaceC5133d) {
        Object E8 = E(obj, true);
        if (!(E8 instanceof h)) {
            return v.f40183a;
        }
        j.b(E8);
        throw q();
    }

    @Override // Q7.c, Q7.r
    public final Object e(Object obj) {
        return E(obj, false);
    }

    @Override // Q7.c
    public final boolean u() {
        return this.f2775D == a.f2732u;
    }
}
