package N1;

import D1.o;
import L1.d0;
import Q1.u;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: k, reason: collision with root package name */
    public final int f738k;

    public k(int i, int i2, C1.l lVar) {
        super(i, lVar);
        this.f738k = i2;
        if (i2 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + o.a(b.class).b() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // N1.b
    public final boolean m() {
        return this.f738k == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N1.b
    public final Object s(Object obj) {
        h hVar;
        t1.i iVar = t1.i.f4388c;
        if (this.f738k == 3) {
            Object s2 = super.s(obj);
            return (!(s2 instanceof f) || (s2 instanceof e)) ? s2 : iVar;
        }
        u uVar = d.f724d;
        h hVar2 = (h) b.f717g.get(this);
        while (true) {
            long andIncrement = b.f714c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean l2 = l(andIncrement, false);
            int i = d.f722b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            u uVar2 = uVar;
            if (hVar2.f970c != j3) {
                h a2 = b.a(this, j3, hVar2);
                if (a2 != null) {
                    hVar = a2;
                } else {
                    if (l2) {
                        return new e(i());
                    }
                    uVar = uVar2;
                }
            } else {
                hVar = hVar2;
            }
            int b2 = b.b(this, hVar, i2, obj, j, uVar2, l2);
            if (b2 == 0) {
                hVar.a();
                return iVar;
            }
            if (b2 == 1) {
                return iVar;
            }
            if (b2 == 2) {
                if (l2) {
                    hVar.h();
                    return new e(i());
                }
                d0 d0Var = uVar2 instanceof d0 ? (d0) uVar2 : null;
                if (d0Var != null) {
                    d0Var.a(hVar, i2 + i);
                }
                f((hVar.f970c * j2) + i2);
                return iVar;
            }
            if (b2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (b2 == 4) {
                if (j < b.f715d.get(this)) {
                    hVar.a();
                }
                return new e(i());
            }
            if (b2 == 5) {
                hVar.a();
            }
            hVar2 = hVar;
            uVar = uVar2;
        }
    }
}
