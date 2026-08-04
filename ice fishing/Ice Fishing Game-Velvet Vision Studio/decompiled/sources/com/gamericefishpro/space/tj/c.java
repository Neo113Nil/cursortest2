package com.gamericefishpro.space.tj;

import com.gamericefishpro.space.b1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AutoCloseable {
    public final String d;
    public final d e;

    public c(String scopeId, d koin) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(koin, "koin");
        this.d = scopeId;
        this.e = koin;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String scopeId = this.d;
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        com.gamericefishpro.space.nj.a aVar = (com.gamericefishpro.space.nj.a) this.e.i;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        ConcurrentHashMap concurrentHashMap = aVar.c;
        com.gamericefishpro.space.pj.a scope = (com.gamericefishpro.space.pj.a) concurrentHashMap.get(scopeId);
        if (scope != null) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) aVar.a.v;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            com.gamericefishpro.space.hj.b[] bVarArr = (com.gamericefishpro.space.hj.b[]) ((ConcurrentHashMap) cVar.i).values().toArray(new com.gamericefishpro.space.hj.b[0]);
            ArrayList arrayList = new ArrayList();
            for (com.gamericefishpro.space.hj.b bVar : bVarArr) {
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw com.gamericefishpro.space.m5.a.f(it);
            }
            concurrentHashMap.remove(scope.b);
        }
    }
}
