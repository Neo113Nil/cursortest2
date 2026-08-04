package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.pi.e2;
import com.gamericefishpro.space.t0.y0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final a D;

    public o(int i, a aVar) {
        super(i);
        this.D = aVar;
        if (aVar != a.d) {
            if (i < 1) {
                throw new IllegalArgumentException(y0.f(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + b0.a(e.class).c() + " instead").toString());
        }
    }

    public final Object J(Object obj, boolean z) {
        m mVar;
        if (this.D == a.i) {
            Object objK = super.k(obj);
            return (!(objK instanceof k) || (objK instanceof j)) ? objK : Unit.a;
        }
        com.gamericefishpro.space.s4.o oVar = g.d;
        m mVar2 = (m) e.y.get(this);
        while (true) {
            long andIncrement = e.e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zV = v(false, andIncrement);
            int i = g.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (mVar2.c != j3) {
                m mVarB = e.b(this, j3, mVar2);
                if (mVarB != null) {
                    mVar = mVarB;
                } else if (zV) {
                    return new j(s());
                }
            } else {
                mVar = mVar2;
            }
            int iH = e.h(this, mVar, i2, obj, j, oVar, zV);
            mVar2 = mVar;
            if (iH == 0) {
                mVar2.a();
                return Unit.a;
            }
            if (iH == 1) {
                return Unit.a;
            }
            if (iH == 2) {
                if (zV) {
                    mVar2.h();
                    return new j(s());
                }
                e2 e2Var = oVar instanceof e2 ? (e2) oVar : null;
                if (e2Var != null) {
                    e2Var.a(mVar2, i2 + i);
                }
                n((mVar2.c * j2) + ((long) i2));
                return Unit.a;
            }
            if (iH == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iH == 4) {
                if (j < e.i.get(this)) {
                    mVar2.a();
                }
                return new j(s());
            }
            if (iH == 5) {
                mVar2.a();
            }
            obj = obj;
        }
    }

    @Override // com.gamericefishpro.space.ri.e, com.gamericefishpro.space.ri.t
    public final Object d(com.gamericefishpro.space.th.a aVar, Object obj) throws Throwable {
        if (J(obj, true) instanceof j) {
            throw s();
        }
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.ri.e, com.gamericefishpro.space.ri.t
    public final Object k(Object obj) {
        return J(obj, false);
    }

    @Override // com.gamericefishpro.space.ri.e
    public final boolean x() {
        return this.D == a.e;
    }
}
