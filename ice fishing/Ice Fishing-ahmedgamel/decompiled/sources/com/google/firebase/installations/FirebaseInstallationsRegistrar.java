package com.google.firebase.installations;

import H3.l;
import O3.g;
import Q3.a;
import Q3.b;
import R3.c;
import R3.r;
import S3.j;
import a4.e;
import a4.f;
import androidx.annotation.Keep;
import com.bumptech.glide.h;
import com.google.firebase.components.ComponentRegistrar;
import d4.C4449c;
import d4.InterfaceC4450d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC4450d lambda$getComponents$0(c cVar) {
        return new C4449c((g) cVar.a(g.class), cVar.b(f.class), (ExecutorService) cVar.d(new r(a.class, ExecutorService.class)), new j((Executor) cVar.d(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<R3.b> getComponents() {
        R3.a aVar = new R3.a(InterfaceC4450d.class, new Class[0]);
        aVar.f2707n = LIBRARY_NAME;
        aVar.a(R3.j.a(g.class));
        aVar.a(new R3.j(0, 1, f.class));
        aVar.a(new R3.j(new r(a.class, ExecutorService.class), 1, 0));
        aVar.a(new R3.j(new r(b.class, Executor.class), 1, 0));
        aVar.f2713z = new d4.f(0);
        R3.b b9 = aVar.b();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        return Arrays.asList(b9, new R3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new l(1, eVar), hashSet3), h.e(LIBRARY_NAME, "17.2.0"));
    }
}
