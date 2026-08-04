package com.gamericefishpro.space.h2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ n0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long i;
    public final /* synthetic */ s1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, long j, long j2, s1 s1Var) {
        super(0);
        this.d = n0Var;
        this.e = j;
        this.i = j2;
        this.v = s1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n0 n0Var = this.d;
        n0Var.v0().d = false;
        n0Var.v0().e = this.e;
        n0Var.v0().i = this.i;
        Function1 function1D = this.v.d.d();
        if (function1D != null) {
            function1D.invoke(n0Var.v0());
        }
        return Unit.a;
    }
}
