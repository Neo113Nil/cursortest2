package com.gamericefishpro.space.h2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements com.gamericefishpro.space.f2.m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ n0 f;

    public m0(int i, int i2, Map map, Function1 function1, Function1 function2, n0 n0Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = function2;
        this.f = n0Var;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final Map a() {
        return this.c;
    }

    @Override // com.gamericefishpro.space.f2.m0
    public final void b() {
        this.e.invoke(this.f.E);
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
