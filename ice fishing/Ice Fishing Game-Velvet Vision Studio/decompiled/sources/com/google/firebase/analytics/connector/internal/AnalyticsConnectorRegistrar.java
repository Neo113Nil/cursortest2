package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.bb.c;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.o;
import com.gamericefishpro.space.i9.j1;
import com.gamericefishpro.space.r9.n;
import com.gamericefishpro.space.u4.f;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.wa.g;
import com.gamericefishpro.space.ya.a;
import com.gamericefishpro.space.ya.b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(c cVar) {
        boolean z;
        g gVar = (g) cVar.b(g.class);
        Context context = (Context) cVar.b(Context.class);
        com.gamericefishpro.space.kb.c cVar2 = (com.gamericefishpro.space.kb.c) cVar.b(com.gamericefishpro.space.kb.c.class);
        c0.g(gVar);
        c0.g(context);
        c0.g(cVar2);
        c0.g(context.getApplicationContext());
        if (b.b == null) {
            synchronized (b.class) {
                if (b.b == null) {
                    Bundle bundle = new Bundle(1);
                    gVar.a();
                    if ("[DEFAULT]".equals(gVar.b)) {
                        ((o) cVar2).a(n.e, f.d);
                        gVar.a();
                        com.gamericefishpro.space.sb.a aVar = (com.gamericefishpro.space.sb.a) gVar.g.get();
                        synchronized (aVar) {
                            z = aVar.a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    b.b = new b(j1.c(context, bundle).b);
                }
            }
        }
        return b.b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.gamericefishpro.space.bb.b> getComponents() {
        com.gamericefishpro.space.bb.a aVarB = com.gamericefishpro.space.bb.b.b(a.class);
        aVarB.a(l.a(g.class));
        aVarB.a(l.a(Context.class));
        aVarB.a(l.a(com.gamericefishpro.space.kb.c.class));
        aVarB.g = com.gamericefishpro.space.u4.b.d;
        if (!(aVarB.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        aVarB.a = 2;
        return Arrays.asList(aVarB.c(), com.gamericefishpro.space.wa.b.p("fire-analytics", "23.0.0"));
    }
}
