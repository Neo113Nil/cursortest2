package com.gamericefishpro.space.u1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public Function1 a;

    public abstract void a(com.gamericefishpro.space.q1.d dVar);

    public Function1 b() {
        return this.a;
    }

    public final void c() {
        Function1 function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(com.gamericefishpro.space.b2.d0 d0Var) {
        this.a = d0Var;
    }
}
