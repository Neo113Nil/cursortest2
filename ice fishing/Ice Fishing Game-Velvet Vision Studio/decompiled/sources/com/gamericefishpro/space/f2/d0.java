package com.gamericefishpro.space.f2;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends com.gamericefishpro.space.h2.c0 {
    public final /* synthetic */ h0 b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, Function2 function2, String str) {
        super(str);
        this.b = h0Var;
        this.c = function2;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final m0 a(n0 n0Var, List list, long j) {
        h0 h0Var = this.b;
        b0 b0Var = h0Var.A;
        b0Var.d = n0Var.getLayoutDirection();
        b0Var.e = n0Var.b();
        b0Var.i = n0Var.g();
        boolean zN = n0Var.n();
        Function2 function2 = this.c;
        if (zN || h0Var.d.B == null) {
            h0Var.v = 0;
            m0 m0Var = (m0) function2.invoke(b0Var, new com.gamericefishpro.space.c3.a(j));
            return new c0(m0Var, h0Var, h0Var.v, m0Var, 1);
        }
        h0Var.w = 0;
        m0 m0Var2 = (m0) function2.invoke(h0Var.B, new com.gamericefishpro.space.c3.a(j));
        return new c0(m0Var2, h0Var, h0Var.w, m0Var2, 0);
    }
}
