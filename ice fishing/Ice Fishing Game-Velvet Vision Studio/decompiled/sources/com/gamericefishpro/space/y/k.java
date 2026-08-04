package com.gamericefishpro.space.y;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements PointerInputEventHandler {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(com.gamericefishpro.space.b2.r rVar, com.gamericefishpro.space.th.a frame) {
        com.gamericefishpro.space.uh.a aVar;
        Object obj;
        com.gamericefishpro.space.z.f0 f0Var = new com.gamericefishpro.space.z.f0(frame.getContext(), new j(this.a, null), null);
        com.gamericefishpro.space.b2.f0 f0Var2 = (com.gamericefishpro.space.b2.f0) rVar;
        f0Var2.getClass();
        com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(frame));
        hVar.s();
        com.gamericefishpro.space.b2.c0 completion = new com.gamericefishpro.space.b2.c0(f0Var2, hVar);
        synchronized (f0Var2.N) {
            f0Var2.M.b(completion);
            Intrinsics.checkNotNullParameter(f0Var, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            com.gamericefishpro.space.th.a aVarB = com.gamericefishpro.space.uh.f.b(com.gamericefishpro.space.uh.f.a(completion, completion, f0Var));
            aVar = com.gamericefishpro.space.uh.a.d;
            com.gamericefishpro.space.th.d dVar = new com.gamericefishpro.space.th.d(aVarB);
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            obj = Unit.a;
            dVar.resumeWith(obj);
        }
        hVar.u(new com.gamericefishpro.space.b2.d0(0, completion));
        Object objR = hVar.r();
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objR == aVar) {
            obj = objR;
        }
        return obj == com.gamericefishpro.space.uh.a.d ? obj : Unit.a;
    }
}
