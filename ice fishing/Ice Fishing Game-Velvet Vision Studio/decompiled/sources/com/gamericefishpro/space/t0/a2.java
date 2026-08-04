package com.gamericefishpro.space.t0;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements com.gamericefishpro.space.pi.x, x1 {
    public static final h w = new h();
    public final CoroutineContext d;
    public final CoroutineContext e;
    public final a2 i = this;
    public volatile CoroutineContext v;

    public a2(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.d = coroutineContext;
        this.e = coroutineContext2;
    }

    public final void b() {
        synchronized (this.i) {
            try {
                CoroutineContext coroutineContext = this.v;
                if (coroutineContext == null) {
                    this.v = w;
                } else {
                    com.gamericefishpro.space.pi.a0.g(coroutineContext, new i0(0));
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void d() {
        b();
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void e() {
        b();
    }

    @Override // com.gamericefishpro.space.pi.x
    public final CoroutineContext l() {
        CoroutineContext coroutineContextO;
        CoroutineContext coroutineContext = this.v;
        if (coroutineContext == null || coroutineContext == w) {
            com.gamericefishpro.space.g1.f fVar = (com.gamericefishpro.space.g1.f) this.d.j(com.gamericefishpro.space.g1.f.e);
            CoroutineContext z1Var = fVar != null ? new z1(fVar, this) : kotlin.coroutines.g.d;
            synchronized (this.i) {
                try {
                    CoroutineContext coroutineContext2 = this.v;
                    if (coroutineContext2 == null) {
                        CoroutineContext coroutineContext3 = this.d;
                        coroutineContextO = coroutineContext3.o(new com.gamericefishpro.space.pi.f1((com.gamericefishpro.space.pi.d1) coroutineContext3.j(com.gamericefishpro.space.pi.u.e))).o(this.e).o(z1Var);
                    } else if (coroutineContext2 == w) {
                        CoroutineContext coroutineContext4 = this.d;
                        com.gamericefishpro.space.pi.f1 f1Var = new com.gamericefishpro.space.pi.f1((com.gamericefishpro.space.pi.d1) coroutineContext4.j(com.gamericefishpro.space.pi.u.e));
                        f1Var.u(new i0(0));
                        coroutineContextO = coroutineContext4.o(f1Var).o(this.e).o(z1Var);
                    } else {
                        coroutineContextO = coroutineContext2;
                    }
                    this.v = coroutineContextO;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextO;
        }
        Intrinsics.b(coroutineContext);
        return coroutineContext;
    }

    @Override // com.gamericefishpro.space.t0.x1
    public final void a() {
    }
}
