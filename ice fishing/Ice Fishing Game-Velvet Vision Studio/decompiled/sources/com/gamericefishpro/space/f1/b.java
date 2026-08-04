package com.gamericefishpro.space.f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    @Override // com.gamericefishpro.space.f1.c
    public final c C(Function1 function1, Function1 function2) {
        return (c) ((g) p.e(new o(0, new a(0, function1, function2))));
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void c() {
        synchronized (p.c) {
            o();
            Unit unit = Unit.a;
        }
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void k() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void l() {
        v.l();
        throw null;
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final void m() {
        p.a();
    }

    @Override // com.gamericefishpro.space.f1.c, com.gamericefishpro.space.f1.g
    public final g u(Function1 function1) {
        return (f) ((g) p.e(new o(0, new com.gamericefishpro.space.b2.z(3, function1))));
    }

    @Override // com.gamericefishpro.space.f1.c
    public final v w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
