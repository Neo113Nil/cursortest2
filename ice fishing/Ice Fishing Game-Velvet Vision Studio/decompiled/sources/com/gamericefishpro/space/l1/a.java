package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.o1.g0;
import com.gamericefishpro.space.o1.h0;
import com.gamericefishpro.space.o1.n;
import com.gamericefishpro.space.o1.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f, float f2, int i, boolean z) {
        super(1);
        this.d = f;
        this.e = f2;
        this.i = i;
        this.v = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g0 g0Var = o.b;
        h0 h0Var = (h0) obj;
        float fB = h0Var.F.b() * this.d;
        float fB2 = h0Var.F.b() * this.e;
        h0Var.h((fB <= 0.0f || fB2 <= 0.0f) ? null : new n(fB, fB2, this.i));
        h0Var.o(g0Var);
        h0Var.f(this.v);
        return Unit.a;
    }
}
