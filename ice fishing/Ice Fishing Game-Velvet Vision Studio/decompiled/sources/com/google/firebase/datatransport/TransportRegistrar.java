package com.google.firebase.datatransport;

import android.content.Context;
import com.gamericefishpro.space.a8.a;
import com.gamericefishpro.space.bb.b;
import com.gamericefishpro.space.bb.c;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.c8.r;
import com.gamericefishpro.space.z7.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(c cVar) {
        r.b((Context) cVar.b(Context.class));
        return r.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(c cVar) {
        r.b((Context) cVar.b(Context.class));
        return r.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(c cVar) {
        r.b((Context) cVar.b(Context.class));
        return r.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        com.gamericefishpro.space.bb.a aVarB = b.b(e.class);
        aVarB.c = LIBRARY_NAME;
        aVarB.a(l.a(Context.class));
        aVarB.g = new s(8);
        b bVarC = aVarB.c();
        com.gamericefishpro.space.bb.a aVarA = b.a(new v(com.gamericefishpro.space.eb.a.class, e.class));
        aVarA.a(l.a(Context.class));
        aVarA.g = new s(9);
        b bVarC2 = aVarA.c();
        com.gamericefishpro.space.bb.a aVarA2 = b.a(new v(com.gamericefishpro.space.eb.b.class, e.class));
        aVarA2.a(l.a(Context.class));
        aVarA2.g = new s(10);
        return Arrays.asList(bVarC, bVarC2, aVarA2.c(), com.gamericefishpro.space.wa.b.p(LIBRARY_NAME, "18.2.0"));
    }
}
