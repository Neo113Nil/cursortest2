package com.gamericefishpro.space.f2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ b0 e;
    public final /* synthetic */ h0 f;
    public final /* synthetic */ Function1 g;

    public a0(int i, int i2, Map map, Function1 function1, b0 b0Var, h0 h0Var, Function1 function2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = b0Var;
        this.f = h0Var;
        this.g = function2;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Map a() {
        return this.c;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final void b() {
        com.gamericefishpro.space.h2.p pVar;
        com.gamericefishpro.space.h2.f0 f0Var = this.f.d;
        boolean zN = this.e.n();
        Function1 function1 = this.g;
        if (!zN || (pVar = f0Var.Z.c.k0) == null) {
            function1.invoke(f0Var.Z.c.E);
        } else {
            function1.invoke(pVar.E);
        }
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int c() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Function1 d() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final int e() {
        return this.a;
    }
}
