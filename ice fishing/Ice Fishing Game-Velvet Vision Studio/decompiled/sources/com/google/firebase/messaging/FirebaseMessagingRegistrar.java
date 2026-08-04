package com.google.firebase.messaging;

import com.gamericefishpro.space.bb.c;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.mb.a;
import com.gamericefishpro.space.ob.d;
import com.gamericefishpro.space.vb.b;
import com.gamericefishpro.space.wa.g;
import com.gamericefishpro.space.z7.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(v vVar, c cVar) {
        g gVar = (g) cVar.b(g.class);
        if (cVar.b(a.class) == null) {
            return new FirebaseMessaging(gVar, cVar.e(b.class), cVar.e(com.gamericefishpro.space.lb.g.class), (d) cVar.b(d.class), cVar.d(vVar), (com.gamericefishpro.space.kb.c) cVar.b(com.gamericefishpro.space.kb.c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.gamericefishpro.space.bb.b> getComponents() {
        v vVar = new v(com.gamericefishpro.space.eb.b.class, e.class);
        com.gamericefishpro.space.bb.a aVarB = com.gamericefishpro.space.bb.b.b(FirebaseMessaging.class);
        aVarB.c = LIBRARY_NAME;
        aVarB.a(l.a(g.class));
        aVarB.a(new l(0, 0, a.class));
        aVarB.a(new l(0, 1, b.class));
        aVarB.a(new l(0, 1, com.gamericefishpro.space.lb.g.class));
        aVarB.a(l.a(d.class));
        aVarB.a(new l(vVar, 0, 1));
        aVarB.a(l.a(com.gamericefishpro.space.kb.c.class));
        aVarB.g = new com.gamericefishpro.space.lb.b(vVar, 1);
        if (!(aVarB.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVarB.a = 1;
        return Arrays.asList(aVarB.c(), com.gamericefishpro.space.wa.b.p(LIBRARY_NAME, "25.0.1"));
    }
}
