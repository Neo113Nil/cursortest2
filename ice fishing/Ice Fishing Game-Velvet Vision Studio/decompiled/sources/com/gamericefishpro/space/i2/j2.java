package com.gamericefishpro.space.i2;

import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements com.gamericefishpro.space.z4.s {
    public final /* synthetic */ com.gamericefishpro.space.ui.c d;
    public final /* synthetic */ com.gamericefishpro.space.t0.h1 e;
    public final /* synthetic */ com.gamericefishpro.space.t0.u1 i;
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 v;
    public final /* synthetic */ View w;

    public j2(com.gamericefishpro.space.ui.c cVar, com.gamericefishpro.space.t0.h1 h1Var, com.gamericefishpro.space.t0.u1 u1Var, com.gamericefishpro.space.ei.a0 a0Var, View view) {
        this.d = cVar;
        this.e = h1Var;
        this.i = u1Var;
        this.v = a0Var;
        this.w = view;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(com.gamericefishpro.space.z4.u uVar, com.gamericefishpro.space.z4.o oVar) {
        boolean z;
        com.gamericefishpro.space.pi.f fVarY = null;
        switch (g2.a[oVar.ordinal()]) {
            case 1:
                com.gamericefishpro.space.ui.c cVar = this.d;
                com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.d;
                com.gamericefishpro.space.pi.a0.u(cVar, null, new i2(this.v, this.i, uVar, this, this.w, null), 1);
                return;
            case 2:
                com.gamericefishpro.space.t0.h1 h1Var = this.e;
                if (h1Var != null) {
                    com.gamericefishpro.space.h0.z0 z0Var = h1Var.e;
                    synchronized (z0Var.b) {
                        try {
                            synchronized (z0Var.b) {
                                z = z0Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) z0Var.c;
                                z0Var.c = (ArrayList) z0Var.d;
                                z0Var.d = arrayList;
                                z0Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) arrayList.get(i);
                                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                                    aVar.resumeWith(Unit.a);
                                }
                                arrayList.clear();
                                Unit unit = Unit.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                com.gamericefishpro.space.t0.u1 u1Var = this.i;
                synchronized (u1Var.c) {
                    if (u1Var.t) {
                        u1Var.t = false;
                        fVarY = u1Var.y();
                    }
                    break;
                }
                if (fVarY != null) {
                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                    ((com.gamericefishpro.space.pi.h) fVarY).resumeWith(Unit.a);
                    return;
                }
                return;
            case 3:
                com.gamericefishpro.space.t0.u1 u1Var2 = this.i;
                synchronized (u1Var2.c) {
                    u1Var2.t = true;
                    Unit unit2 = Unit.a;
                }
                return;
            case 4:
                this.i.x();
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                throw new com.gamericefishpro.space.oh.k();
        }
    }
}
