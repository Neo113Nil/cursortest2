package com.gamericefishpro.space.h0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public final com.gamericefishpro.space.e1.c a;
    public final com.gamericefishpro.space.f0.k b;
    public final com.gamericefishpro.space.t.h0 c;

    public y(com.gamericefishpro.space.e1.c cVar, com.gamericefishpro.space.f0.k kVar) {
        this.a = cVar;
        this.b = kVar;
        long[] jArr = com.gamericefishpro.space.t.p0.a;
        this.c = new com.gamericefishpro.space.t.h0();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        com.gamericefishpro.space.t.h0 h0Var = this.c;
        x xVar = (x) h0Var.g(obj);
        if (xVar != null && xVar.c == i && Intrinsics.a(xVar.b, obj2)) {
            com.gamericefishpro.space.b1.h hVar = xVar.d;
            if (hVar != null) {
                return hVar;
            }
            com.gamericefishpro.space.b1.h hVar2 = new com.gamericefishpro.space.b1.h(818252804, new com.gamericefishpro.space.d0.w(5, xVar.e, xVar), true);
            xVar.d = hVar2;
            return hVar2;
        }
        x xVar2 = new x(this, i, obj, obj2);
        h0Var.m(obj, xVar2);
        com.gamericefishpro.space.b1.h hVar3 = xVar2.d;
        if (hVar3 != null) {
            return hVar3;
        }
        com.gamericefishpro.space.b1.h hVar4 = new com.gamericefishpro.space.b1.h(818252804, new com.gamericefishpro.space.d0.w(5, this, xVar2), true);
        xVar2.d = hVar4;
        return hVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = (x) this.c.g(obj);
        if (xVar != null) {
            return xVar.b;
        }
        z zVar = (z) this.b.invoke();
        int iD = zVar.d(obj);
        if (iD != -1) {
            return zVar.c(iD);
        }
        return null;
    }
}
