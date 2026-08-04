package com.gamericefishpro.space.si;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends com.gamericefishpro.space.ti.d {
    public final AtomicReference a = new AtomicReference(null);

    @Override // com.gamericefishpro.space.ti.d
    public final boolean a(com.gamericefishpro.space.ti.b bVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(e0.b);
        return true;
    }

    @Override // com.gamericefishpro.space.ti.d
    public final com.gamericefishpro.space.th.a[] b(com.gamericefishpro.space.ti.b bVar) {
        this.a.set(null);
        return com.gamericefishpro.space.ti.c.a;
    }

    public final Object c(m0 frame) {
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        com.gamericefishpro.space.d6.a aVar = e0.b;
        while (true) {
            AtomicReference atomicReference = this.a;
            if (atomicReference.compareAndSet(aVar, hVar)) {
                break;
            }
            if (atomicReference.get() != aVar) {
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                hVar.resumeWith(Unit.a);
                break;
            }
        }
        Object objR = hVar.r();
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        if (objR == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar2 ? objR : Unit.a;
    }
}
