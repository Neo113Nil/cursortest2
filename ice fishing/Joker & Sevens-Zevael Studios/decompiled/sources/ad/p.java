package ad;

import yc.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: q, reason: collision with root package name */
    public final a f332q;

    public p(int i10, a aVar) {
        super(i10);
        this.f332q = aVar;
        if (aVar != a.f280g) {
            if (i10 < 1) {
                throw new IllegalArgumentException(a4.d.h("Buffered channel capacity must be at least 1, but ", i10, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + pc.t.a(e.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Object obj, boolean z10) {
        a aVar = this.f332q;
        a aVar2 = a.f282i;
        ac.o oVar = ac.o.f277a;
        if (aVar == aVar2) {
            Object s10 = super.s(obj);
            return (!(s10 instanceof k) || (s10 instanceof j)) ? s10 : oVar;
        }
        h4.f fVar = g.f307d;
        m mVar = (m) e.f297l.get(this);
        while (true) {
            long andIncrement = e.f293h.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean v10 = v(false, andIncrement);
            int i10 = g.f305b;
            long j6 = i10;
            long j10 = j3 / j6;
            int i11 = (int) (j3 % j6);
            if (mVar.f1884c != j10) {
                m b2 = e.b(this, j10, mVar);
                if (b2 != null) {
                    mVar = b2;
                } else if (v10) {
                    return new j(q());
                }
            }
            int e10 = e.e(this, mVar, i11, obj, j3, fVar, v10);
            if (e10 == 0) {
                mVar.a();
                return oVar;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                if (e10 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e10 == 4) {
                    if (j3 < e.f294i.get(this)) {
                        mVar.a();
                    }
                    return new j(q());
                }
                if (e10 == 5) {
                    mVar.a();
                }
            } else {
                if (v10) {
                    mVar.h();
                    return new j(q());
                }
                b2 b2Var = fVar instanceof b2 ? (b2) fVar : null;
                if (b2Var != null) {
                    b2Var.a(mVar, i11 + i10);
                }
                k((mVar.f1884c * j6) + i11);
            }
        }
    }

    @Override // ad.e, ad.u
    public final Object c(fc.d dVar, Object obj) {
        if (J(obj, true) instanceof j) {
            throw q();
        }
        return ac.o.f277a;
    }

    @Override // ad.e, ad.u
    public final Object s(Object obj) {
        return J(obj, false);
    }

    @Override // ad.e
    public final boolean x() {
        return this.f332q == a.f281h;
    }
}
