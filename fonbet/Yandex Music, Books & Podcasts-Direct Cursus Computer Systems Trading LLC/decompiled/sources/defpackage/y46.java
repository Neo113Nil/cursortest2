package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class y46 extends zi3 {
    public final oi3 k;

    public y46(int i, oi3 oi3Var) {
        super(i);
        this.k = oi3Var;
        if (oi3Var == oi3.a) {
            tiu.g(ern.a(zi3.class).h(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        xq0.o(dfi.c(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // defpackage.zi3
    public final boolean C() {
        return this.k == oi3.b;
    }

    public final Object O(Object obj, boolean z) {
        hd4 hd4Var;
        y46 y46Var;
        Object obj2;
        if (this.k == oi3.c) {
            Object c = super.c(obj);
            return (!(c instanceof fd4) || (c instanceof ed4)) ? c : Unit.a;
        }
        Object obj3 = bj3.d;
        hd4 hd4Var2 = (hd4) zi3.f.get(this);
        while (true) {
            long andIncrement = zi3.b.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean z2 = z(andIncrement, false);
            int i = bj3.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (hd4Var2.c != j3) {
                hd4 a = zi3.a(this, j3, hd4Var2);
                if (a != null) {
                    hd4Var = a;
                    obj2 = obj;
                    y46Var = this;
                } else if (z2) {
                    return new ed4(v());
                }
            } else {
                hd4Var = hd4Var2;
                y46Var = this;
                obj2 = obj;
            }
            int h = zi3.h(y46Var, hd4Var, i2, obj2, j, obj3, z2);
            hd4Var2 = hd4Var;
            if (h == 0) {
                hd4Var2.a();
                return Unit.a;
            }
            if (h == 1) {
                return Unit.a;
            }
            if (h == 2) {
                if (z2) {
                    hd4Var2.i();
                    return new ed4(v());
                }
                hku hkuVar = obj3 instanceof hku ? (hku) obj3 : null;
                if (hkuVar != null) {
                    hkuVar.a(hd4Var2, i2 + i);
                }
                q((hd4Var2.c * j2) + i2);
                return Unit.a;
            }
            if (h == 3) {
                xq0.q("unexpected");
                return null;
            }
            if (h == 4) {
                if (j < zi3.c.get(this)) {
                    hd4Var2.a();
                }
                return new ed4(v());
            }
            if (h == 5) {
                hd4Var2.a();
            }
            obj = obj2;
        }
    }

    @Override // defpackage.zi3, defpackage.fgp
    public final Object c(Object obj) {
        return O(obj, false);
    }

    @Override // defpackage.zi3, defpackage.fgp
    public final Object m(Object obj, Continuation continuation) {
        if (O(obj, true) instanceof ed4) {
            throw v();
        }
        return Unit.a;
    }
}
