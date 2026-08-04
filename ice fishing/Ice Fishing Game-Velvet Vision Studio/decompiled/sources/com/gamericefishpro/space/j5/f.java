package com.gamericefishpro.space.j5;

import com.gamericefishpro.space.d.r;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.tb.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public s a;
    public boolean b;

    public final void a() {
        s sVar = this.a;
        if (sVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.b) {
            sVar.d(this, null);
        }
        Intrinsics.checkNotNullParameter(this, "input");
        g gVar = (g) sVar.e;
        com.gamericefishpro.space.a8.b bVar = (com.gamericefishpro.space.a8.b) sVar.d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "input");
        if (equals(gVar.h) && -1 == gVar.g) {
            d dVarC = gVar.f;
            if (dVarC == null) {
                dVarC = gVar.c(-1);
            }
            gVar.f = null;
            gVar.g = 0;
            gVar.h = null;
            if (dVarC == null) {
                ((r) bVar.e).a.run();
            } else {
                dVarC.b();
            }
            n0 n0Var = gVar.a;
            n0Var.getClass();
            n0Var.j(null, h.e);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
