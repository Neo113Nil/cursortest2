package com.gamericefishpro.space.h0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final Function1 a;
    public z0 c;
    public int f;
    public final com.gamericefishpro.space.a8.c b = new com.gamericefishpro.space.a8.c(8);
    public int d = -1;
    public int e = -1;

    public m0(Function1 function1) {
        this.a = function1;
    }

    public final l0 a(int i, long j, boolean z, Function1 function1) {
        z0 z0Var = this.c;
        if (z0Var == null) {
            return i.a;
        }
        a1 a1Var = (a1) z0Var.d;
        boolean z2 = a1Var instanceof c;
        y0 y0Var = new y0(z0Var, i, this.b, function1);
        y0Var.d = new com.gamericefishpro.space.c3.a(j);
        if (!z2) {
            a1Var.a(y0Var);
        } else if (z) {
            c cVar = (c) a1Var;
            cVar.e.add(new d1(1, y0Var));
            if (!cVar.i) {
                cVar.i = true;
                cVar.d.post(cVar);
            }
        } else {
            c cVar2 = (c) a1Var;
            cVar2.e.add(new d1(0, y0Var));
            if (!cVar2.i) {
                cVar2.i = true;
                cVar2.d.post(cVar2);
            }
        }
        com.gamericefishpro.space.i.a.S("compose:lazy:schedule_prefetch:index", i);
        return y0Var;
    }
}
