package com.gamericefishpro.space.k1;

import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.f3.f;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends l implements c2, u {
    public e H;
    public e I;
    public long J;

    public final boolean A0(com.gamericefishpro.space.vb.c cVar) {
        e eVar = this.H;
        if (eVar != null) {
            return eVar.A0(cVar);
        }
        e eVar2 = this.I;
        if (eVar2 != null) {
            return eVar2.A0(cVar);
        }
        return false;
    }

    public final void B0(com.gamericefishpro.space.vb.c cVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.B0(cVar);
            return;
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.B0(cVar);
        }
    }

    public final void C0(com.gamericefishpro.space.vb.c cVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.C0(cVar);
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.C0(cVar);
        }
        this.H = null;
    }

    public final void D0(com.gamericefishpro.space.vb.c cVar) {
        c2 c2Var;
        e eVar;
        e eVar2 = this.H;
        if (eVar2 == null || !com.gamericefishpro.space.wa.b.b(eVar2, com.gamericefishpro.space.a.a.r(cVar))) {
            if (this.d.G) {
                a0 a0Var = new a0();
                k.x(this, new f(a0Var, this, cVar, 1));
                c2Var = (c2) a0Var.d;
            } else {
                c2Var = null;
            }
            eVar = (e) c2Var;
        } else {
            eVar = eVar2;
        }
        if (eVar != null && eVar2 == null) {
            eVar.B0(cVar);
            eVar.D0(cVar);
            e eVar3 = this.I;
            if (eVar3 != null) {
                eVar3.C0(cVar);
            }
        } else if (eVar == null && eVar2 != null) {
            e eVar4 = this.I;
            if (eVar4 != null) {
                eVar4.B0(cVar);
                eVar4.D0(cVar);
            }
            eVar2.C0(cVar);
        } else if (!Intrinsics.a(eVar, eVar2)) {
            if (eVar != null) {
                eVar.B0(cVar);
                eVar.D0(cVar);
            }
            if (eVar2 != null) {
                eVar2.C0(cVar);
            }
        } else if (eVar != null) {
            eVar.D0(cVar);
        } else {
            e eVar5 = this.I;
            if (eVar5 != null) {
                eVar5.D0(cVar);
            }
        }
        this.H = eVar;
    }

    public final void E0(com.gamericefishpro.space.vb.c cVar) {
        e eVar = this.I;
        if (eVar != null) {
            eVar.E0(cVar);
            return;
        }
        e eVar2 = this.H;
        if (eVar2 != null) {
            eVar2.E0(cVar);
        }
    }

    @Override // com.gamericefishpro.space.h2.c2
    public final Object i() {
        return d.a;
    }

    @Override // com.gamericefishpro.space.h2.u
    public final void l(long j) {
        this.J = j;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void t0() {
        this.I = null;
        this.H = null;
    }
}
