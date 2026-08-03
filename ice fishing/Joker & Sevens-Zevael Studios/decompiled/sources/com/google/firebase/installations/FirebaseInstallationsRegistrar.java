package com.google.firebase.installations;

import bc.a0;
import com.google.firebase.components.ComponentRegistrar;
import i7.g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k7.a;
import k7.b;
import l7.c;
import l7.j;
import l7.r;
import m7.k;
import u7.e;
import x7.d;
import x7.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new x7.c((g) cVar.a(g.class), cVar.d(e.class), (ExecutorService) cVar.b(new r(a.class, ExecutorService.class)), new k((Executor) cVar.b(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<l7.b> getComponents() {
        l7.a aVar = new l7.a(d.class, new Class[0]);
        aVar.f4208c = LIBRARY_NAME;
        aVar.a(j.a(g.class));
        aVar.a(new j(0, 1, e.class));
        aVar.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        aVar.a(new j(new r(b.class, Executor.class), 1, 0));
        aVar.f4212g = new f();
        l7.b c3 = aVar.c();
        u7.d dVar = new u7.d();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(u7.d.class));
        return Arrays.asList(c3, new l7.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new c6.f(9, dVar), hashSet3), a0.g(LIBRARY_NAME, "17.2.0"));
    }
}
