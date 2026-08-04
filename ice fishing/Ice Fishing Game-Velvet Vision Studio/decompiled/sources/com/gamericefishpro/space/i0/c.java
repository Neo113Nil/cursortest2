package com.gamericefishpro.space.i0;

import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.u;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.z.i;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l implements com.gamericefishpro.space.l2.a, u {
    public i H;
    public boolean I;

    public static final com.gamericefishpro.space.n1.c A0(c cVar, f1 f1Var, com.gamericefishpro.space.b2.b bVar) {
        com.gamericefishpro.space.n1.c cVar2;
        if (cVar.G && cVar.I) {
            f1 f1VarR = k.r(cVar);
            if (!f1Var.K0().G) {
                f1Var = null;
            }
            if (f1Var != null && (cVar2 = (com.gamericefishpro.space.n1.c) bVar.invoke()) != null) {
                com.gamericefishpro.space.n1.c cVarZ = f1VarR.z(f1Var, false);
                return cVar2.e((((long) Float.floatToRawIntBits(cVarZ.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarZ.a)) << 32));
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.l2.a
    public final Object B(f1 f1Var, com.gamericefishpro.space.b2.b bVar, com.gamericefishpro.space.vh.i iVar) {
        Object objH = a0.h(new b(this, f1Var, bVar, new com.gamericefishpro.space.b1.b(this, f1Var, bVar, 2), null), iVar);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void z(com.gamericefishpro.space.f2.u uVar) {
        this.I = true;
    }
}
