package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.d0.x0;
import com.gamericefishpro.space.f2.k1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.h, com.gamericefishpro.space.h2.v {
    public LinkedHashMap H;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        float f = ((com.gamericefishpro.space.c3.f) com.gamericefishpro.space.h2.k.h(this, m.c)).d;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(j);
        boolean z = this.G && !Float.isNaN(f) && com.gamericefishpro.space.c3.f.a(f, f2) > 0;
        int iJ = !Float.isNaN(f) ? n0Var.J(f) : 0;
        int iMax = z ? Math.max(u0VarE.d, iJ) : u0VarE.d;
        int iMax2 = z ? Math.max(u0VarE.e, iJ) : u0VarE.e;
        if (z) {
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.H = linkedHashMap;
            }
            k1 k1Var = m.b;
            int iRound = Math.round((iJ - u0VarE.d) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(k1Var, Integer.valueOf(iRound));
            com.gamericefishpro.space.f2.k kVar = m.a;
            int iRound2 = Math.round((iJ - u0VarE.e) / 2.0f);
            linkedHashMap.put(kVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapC = this.H;
        if (mapC == null) {
            mapC = com.gamericefishpro.space.ph.m0.c();
        }
        return n0Var.y(iMax, iMax2, mapC, new x0(iMax, u0VarE, iMax2));
    }
}
