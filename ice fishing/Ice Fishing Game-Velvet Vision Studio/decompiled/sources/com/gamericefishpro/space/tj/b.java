package com.gamericefishpro.space.tj;

import com.gamericefishpro.space.b1.d;
import com.gamericefishpro.space.c5.f;
import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.f1.h;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.ph.v;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.u0;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u0 {
    public final g a;
    public final com.gamericefishpro.space.pj.a b;
    public final Function0 c;

    public b(g kClass, com.gamericefishpro.space.pj.a scope, Function0 function0) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.a = kClass;
        this.b = scope;
        this.c = function0;
    }

    @Override // com.gamericefishpro.space.z4.u0
    public final s0 c(g modelClass, f extras) throws h {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        a aVar = new a(this.c, extras);
        d dVar = this.b.e;
        com.gamericefishpro.space.l6.f fVar = (com.gamericefishpro.space.l6.f) dVar.w;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        com.gamericefishpro.space.kj.a op = com.gamericefishpro.space.kj.a.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(op, "op");
        Object obj = fVar.a.get(op);
        if (obj == null) {
            obj = null;
        }
        if (!Intrinsics.a(obj, Boolean.TRUE)) {
            com.gamericefishpro.space.pj.a aVar2 = this.b;
            g clazz = this.a;
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return (s0) aVar2.b(clazz, aVar);
        }
        String scopeId = modelClass.c() + '-' + a4.x();
        com.gamericefishpro.space.mj.c qualifier = new com.gamericefishpro.space.mj.c(modelClass);
        com.gamericefishpro.space.mj.c cVar = com.gamericefishpro.space.uj.a.a;
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        com.gamericefishpro.space.nj.a aVar3 = (com.gamericefishpro.space.nj.a) dVar.i;
        ConcurrentHashMap concurrentHashMap = aVar3.c;
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        d dVar2 = aVar3.a;
        ((com.gamericefishpro.space.g1.b) dVar2.d).i("| (+) Scope - id:'" + scopeId + "' q:'" + qualifier + '\'');
        Set set = aVar3.b;
        if (!set.contains(qualifier)) {
            ((com.gamericefishpro.space.g1.b) dVar2.d).i("| Scope '" + qualifier + "' not defined. Creating it ...");
            set.add(qualifier);
        }
        if (concurrentHashMap.containsKey(scopeId)) {
            String s = "Scope with id '" + scopeId + "' is already created";
            Intrinsics.checkNotNullParameter(s, "s");
            throw new h(s);
        }
        com.gamericefishpro.space.pj.a aVar4 = new com.gamericefishpro.space.pj.a(qualifier, scopeId, cVar, aVar3.a, 4);
        com.gamericefishpro.space.pj.a[] scopes = {aVar3.d};
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        if (aVar4.c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        aVar4.f.addAll(0, v.w(scopes));
        concurrentHashMap.put(scopeId, aVar4);
        g clazz2 = this.a;
        Intrinsics.checkNotNullParameter(clazz2, "clazz");
        s0 s0Var = (s0) aVar4.b(clazz2, aVar);
        c closeable = new c(scopeId, dVar);
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        com.gamericefishpro.space.e5.d dVar3 = s0Var.a;
        if (dVar3 == null) {
            return s0Var;
        }
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (dVar3.d) {
            com.gamericefishpro.space.e5.d.a(closeable);
            return s0Var;
        }
        synchronized (dVar3.a) {
            dVar3.c.add(closeable);
            Unit unit = Unit.a;
        }
        return s0Var;
    }
}
