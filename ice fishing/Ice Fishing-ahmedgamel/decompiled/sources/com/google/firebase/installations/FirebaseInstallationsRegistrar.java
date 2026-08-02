package com.google.firebase.installations;

import J3.l;
import Q3.g;
import S3.a;
import S3.b;
import T3.c;
import T3.j;
import T3.r;
import U3.i;
import androidx.annotation.Keep;
import c4.e;
import c4.f;
import com.anythink.core.common.n.b.A;
import com.google.firebase.components.ComponentRegistrar;
import f4.d;
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
    public static d lambda$getComponents$0(c cVar) {
        return new f4.c((g) cVar.a(g.class), cVar.e(f.class), (ExecutorService) cVar.b(new r(a.class, ExecutorService.class)), new i((Executor) cVar.b(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<T3.b> getComponents() {
        T3.a aVar = new T3.a(d.class, new Class[0]);
        aVar.f3162n = LIBRARY_NAME;
        aVar.a(j.a(g.class));
        aVar.a(new j(0, 1, f.class));
        aVar.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        aVar.a(new j(new r(b.class, Executor.class), 1, 0));
        aVar.f3168z = new A(1);
        T3.b b9 = aVar.b();
        e eVar = new e();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(e.class));
        return Arrays.asList(b9, new T3.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new l(2, eVar), hashSet3), S0.f.i(LIBRARY_NAME, "17.2.0"));
    }
}
