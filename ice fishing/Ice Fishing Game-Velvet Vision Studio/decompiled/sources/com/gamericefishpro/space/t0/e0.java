package com.gamericefishpro.space.t0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements x1 {
    public final Function1 d;
    public f0 e;

    public e0(Function1 function1) {
        this.d = function1;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void a() {
        this.e = (f0) this.d.invoke(i.e);
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void e() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            f0Var.a();
        }
        this.e = null;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void d() {
    }
}
