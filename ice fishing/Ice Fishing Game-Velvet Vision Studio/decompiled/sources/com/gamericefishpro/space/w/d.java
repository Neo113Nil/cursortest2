package com.gamericefishpro.space.w;

import com.gamericefishpro.space.i2.i2;
import com.gamericefishpro.space.t0.s2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final v0 a = c.n(0.0f, 0.0f, null, 7);
    public static final v0 b;

    static {
        Object obj = t1.a;
        b = c.n(0.0f, 0.0f, new com.gamericefishpro.space.c3.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final s2 a(float f, o1 o1Var, String str, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        i iVar = o1Var;
        if ((i2 & 2) != 0) {
            iVar = b;
        }
        return b(new com.gamericefishpro.space.c3.f(f), c.l, iVar, null, str, rVar, ((i << 3) & 896) | 24576, 8);
    }

    public static final s2 b(Comparable comparable, com.gamericefishpro.space.u6.l lVar, i iVar, Float f, String str, com.gamericefishpro.space.t0.r rVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objP = rVar.P();
        Object obj = com.gamericefishpro.space.t0.n.a;
        if (objP == obj) {
            objP = com.gamericefishpro.space.t0.i.v(null);
            rVar.k0(objP);
        }
        com.gamericefishpro.space.t0.v0 v0Var = (com.gamericefishpro.space.t0.v0) objP;
        Object objP2 = rVar.P();
        if (objP2 == obj) {
            objP2 = new b(comparable, lVar, f);
            rVar.k0(objP2);
        }
        b bVar = (b) objP2;
        com.gamericefishpro.space.t0.v0 v0VarZ = com.gamericefishpro.space.t0.i.z(null, rVar);
        if (f != null && (iVar instanceof v0)) {
            v0 v0Var2 = (v0) iVar;
            if (!Intrinsics.a(v0Var2.c, f)) {
                iVar = new v0(v0Var2.a, v0Var2.b, f);
            }
        }
        com.gamericefishpro.space.t0.v0 v0VarZ2 = com.gamericefishpro.space.t0.i.z(iVar, rVar);
        Object objP3 = rVar.P();
        if (objP3 == obj) {
            objP3 = com.gamericefishpro.space.hj.c.a(-1, 6, null);
            rVar.k0(objP3);
        }
        com.gamericefishpro.space.ri.i iVar2 = (com.gamericefishpro.space.ri.i) objP3;
        boolean zH = rVar.h(iVar2) | rVar.h(comparable);
        Object objP4 = rVar.P();
        if (zH || objP4 == obj) {
            objP4 = new com.gamericefishpro.space.e.e(12, iVar2, comparable);
            rVar.k0(objP4);
        }
        com.gamericefishpro.space.t0.i.g((Function0) objP4, rVar);
        boolean zH2 = rVar.h(iVar2) | rVar.h(bVar) | rVar.f(v0VarZ2) | rVar.f(v0VarZ);
        Object objP5 = rVar.P();
        if (zH2 || objP5 == obj) {
            Object i2Var = new i2(iVar2, bVar, v0VarZ2, v0VarZ, null);
            rVar.k0(i2Var);
            objP5 = i2Var;
        }
        com.gamericefishpro.space.t0.i.e(rVar, iVar2, (Function2) objP5);
        s2 s2Var = (s2) v0Var.getValue();
        return s2Var == null ? bVar.c : s2Var;
    }
}
