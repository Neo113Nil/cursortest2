package com.gamericefishpro.space.n9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends com.gamericefishpro.space.r5.s0 {
    public final /* synthetic */ l1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l1 l1Var) {
        super(20);
        this.h = l1Var;
    }

    @Override // com.gamericefishpro.space.r5.s0
    public final Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        com.gamericefishpro.space.v8.c0.d(str);
        l1 l1Var = this.h;
        l1Var.s();
        com.gamericefishpro.space.v8.c0.d(str);
        m mVar = l1Var.e.i;
        m4.T(mVar);
        com.gamericefishpro.space.a8.c cVarX0 = mVar.x0(str);
        if (cVarX0 == null) {
            return null;
        }
        v0 v0Var = ((r1) l1Var.d).y;
        r1.l(v0Var);
        v0Var.G.b(str, "Populate EES config from database on cache miss. appId");
        l1Var.z(str, l1Var.A(str, (byte[]) cVarX0.e));
        i1 i1Var = l1Var.C;
        synchronized (((a0) i1Var.g)) {
            Set setEntrySet = ((com.gamericefishpro.space.c5.e) i1Var.f).a.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = ((com.gamericefishpro.space.c5.e) i1Var.f).a.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.gamericefishpro.space.i9.d0) linkedHashMap.get(str);
    }
}
