package com.google.firebase.installations;

import com.gamericefishpro.space.ab.a;
import com.gamericefishpro.space.ab.b;
import com.gamericefishpro.space.bb.c;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.cb.j;
import com.gamericefishpro.space.lb.e;
import com.gamericefishpro.space.lb.f;
import com.gamericefishpro.space.ob.d;
import com.gamericefishpro.space.wa.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new com.gamericefishpro.space.ob.c((g) cVar.b(g.class), cVar.e(f.class), (ExecutorService) cVar.f(new v(a.class, ExecutorService.class)), new j((Executor) cVar.f(new v(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.gamericefishpro.space.bb.b> getComponents() {
        com.gamericefishpro.space.bb.a aVarB = com.gamericefishpro.space.bb.b.b(d.class);
        aVarB.c = LIBRARY_NAME;
        aVarB.a(l.a(g.class));
        aVarB.a(new l(0, 1, f.class));
        aVarB.a(new l(new v(a.class, ExecutorService.class), 1, 0));
        aVarB.a(new l(new v(b.class, Executor.class), 1, 0));
        aVarB.g = new s(20);
        com.gamericefishpro.space.bb.b bVarC = aVarB.c();
        e eVar = new e(0);
        com.gamericefishpro.space.bb.a aVarB2 = com.gamericefishpro.space.bb.b.b(e.class);
        aVarB2.b = 1;
        aVarB2.g = new com.gamericefishpro.space.a8.b(1, eVar);
        return Arrays.asList(bVarC, aVarB2.c(), com.gamericefishpro.space.wa.b.p(LIBRARY_NAME, "19.0.1"));
    }
}
