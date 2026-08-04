package com.gamericefishpro.space.u6;

import com.gamericefishpro.space.i9.t;
import com.gamericefishpro.space.tb.u;
import com.gamericefishpro.space.w.s1;
import com.gamericefishpro.space.w.v;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements s1 {
    public Object d;
    public Object e;
    public Object i;
    public Object v;

    public n(n nVar, t tVar) {
        this.i = new HashMap();
        this.v = new HashMap();
        this.d = nVar;
        this.e = tVar;
    }

    @Override // com.gamericefishpro.space.w.p1
    public long b(com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        int iB = oVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((u) this.d).v(i).d(oVar.a(i), oVar2.a(i), oVar3.a(i)));
        }
        return jMax;
    }

    public com.gamericefishpro.space.i9.n c(com.gamericefishpro.space.i9.n nVar) {
        return ((t) this.e).c(this, nVar);
    }

    public com.gamericefishpro.space.i9.n d(com.gamericefishpro.space.i9.d dVar) {
        com.gamericefishpro.space.i9.n nVarC = com.gamericefishpro.space.i9.n.j;
        Iterator itQ = dVar.q();
        while (itQ.hasNext()) {
            nVarC = ((t) this.e).c(this, dVar.s(((Integer) itQ.next()).intValue()));
            if (nVarC instanceof com.gamericefishpro.space.i9.f) {
                break;
            }
        }
        return nVarC;
    }

    public n e() {
        return new n(this, (t) this.e);
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o f(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        if (((com.gamericefishpro.space.w.o) this.i) == null) {
            this.i = oVar3.c();
        }
        com.gamericefishpro.space.w.o oVar4 = (com.gamericefishpro.space.w.o) this.i;
        if (oVar4 == null) {
            Intrinsics.h("velocityVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            com.gamericefishpro.space.w.o oVar5 = (com.gamericefishpro.space.w.o) this.i;
            if (oVar5 == null) {
                Intrinsics.h("velocityVector");
                throw null;
            }
            oVar5.e(i, ((u) this.d).v(i).c(j, oVar.a(i), oVar2.a(i), oVar3.a(i)));
        }
        com.gamericefishpro.space.w.o oVar6 = (com.gamericefishpro.space.w.o) this.i;
        if (oVar6 != null) {
            return oVar6;
        }
        Intrinsics.h("velocityVector");
        throw null;
    }

    public boolean g(String str) {
        if (((HashMap) this.i).containsKey(str)) {
            return true;
        }
        n nVar = (n) this.d;
        if (nVar != null) {
            return nVar.g(str);
        }
        return false;
    }

    public void h(String str, com.gamericefishpro.space.i9.n nVar) {
        n nVar2;
        HashMap map = (HashMap) this.i;
        if (!map.containsKey(str) && (nVar2 = (n) this.d) != null && nVar2.g(str)) {
            nVar2.h(str, nVar);
        } else {
            if (((HashMap) this.v).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void i(String str, com.gamericefishpro.space.i9.n nVar) {
        HashMap map = (HashMap) this.i;
        if (((HashMap) this.v).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public com.gamericefishpro.space.i9.n j(String str) {
        HashMap map = (HashMap) this.i;
        if (map.containsKey(str)) {
            return (com.gamericefishpro.space.i9.n) map.get(str);
        }
        n nVar = (n) this.d;
        if (nVar != null) {
            return nVar.j(str);
        }
        throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.h(str, " is not defined"));
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o k(com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        if (((com.gamericefishpro.space.w.o) this.v) == null) {
            this.v = oVar3.c();
        }
        com.gamericefishpro.space.w.o oVar4 = (com.gamericefishpro.space.w.o) this.v;
        if (oVar4 == null) {
            Intrinsics.h("endVelocityVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            com.gamericefishpro.space.w.o oVar5 = (com.gamericefishpro.space.w.o) this.v;
            if (oVar5 == null) {
                Intrinsics.h("endVelocityVector");
                throw null;
            }
            oVar5.e(i, ((u) this.d).v(i).e(oVar.a(i), oVar2.a(i), oVar3.a(i)));
        }
        com.gamericefishpro.space.w.o oVar6 = (com.gamericefishpro.space.w.o) this.v;
        if (oVar6 != null) {
            return oVar6;
        }
        Intrinsics.h("endVelocityVector");
        throw null;
    }

    @Override // com.gamericefishpro.space.w.p1
    public com.gamericefishpro.space.w.o r(long j, com.gamericefishpro.space.w.o oVar, com.gamericefishpro.space.w.o oVar2, com.gamericefishpro.space.w.o oVar3) {
        if (((com.gamericefishpro.space.w.o) this.e) == null) {
            this.e = oVar.c();
        }
        com.gamericefishpro.space.w.o oVar4 = (com.gamericefishpro.space.w.o) this.e;
        if (oVar4 == null) {
            Intrinsics.h("valueVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            com.gamericefishpro.space.w.o oVar5 = (com.gamericefishpro.space.w.o) this.e;
            if (oVar5 == null) {
                Intrinsics.h("valueVector");
                throw null;
            }
            oVar5.e(i, ((u) this.d).v(i).b(j, oVar.a(i), oVar2.a(i), oVar3.a(i)));
        }
        com.gamericefishpro.space.w.o oVar6 = (com.gamericefishpro.space.w.o) this.e;
        if (oVar6 != null) {
            return oVar6;
        }
        Intrinsics.h("valueVector");
        throw null;
    }

    public n(u uVar) {
        this.d = uVar;
    }

    public n(v vVar) {
        this(new u(20, vVar));
    }
}
