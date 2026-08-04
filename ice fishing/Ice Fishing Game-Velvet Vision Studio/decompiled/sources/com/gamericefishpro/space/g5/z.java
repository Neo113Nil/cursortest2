package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.s0;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ s0 d;
    public final /* synthetic */ com.gamericefishpro.space.f5.k e;
    public final /* synthetic */ com.gamericefishpro.space.e1.c i;
    public final /* synthetic */ v0 v;
    public final /* synthetic */ s2 w;

    public z(s0 s0Var, com.gamericefishpro.space.f5.k kVar, com.gamericefishpro.space.e1.d dVar, v0 v0Var, s2 s2Var) {
        this.d = s0Var;
        this.e = kVar;
        this.i = dVar;
        this.v = v0Var;
        this.w = s2Var;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        com.gamericefishpro.space.v.k kVar = (com.gamericefishpro.space.v.k) obj;
        com.gamericefishpro.space.f5.k kVar2 = (com.gamericefishpro.space.f5.k) obj2;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj3;
        ((Number) obj4).intValue();
        boolean zA = Intrinsics.a(this.d.i.getValue(), this.e);
        if (!((Boolean) this.v.getValue()).booleanValue() && !zA) {
            List list = (List) this.w.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!Intrinsics.a(kVar2, (com.gamericefishpro.space.f5.k) objPrevious));
            kVar2 = (com.gamericefishpro.space.f5.k) objPrevious;
        }
        if (kVar2 == null) {
            rVar.a0(105930796);
        } else {
            rVar.a0(-1520603531);
            a4.i(kVar2, this.i, com.gamericefishpro.space.b1.n.c(-1263531443, new m(kVar2, kVar), rVar), rVar, 384);
        }
        rVar.p(false);
        return Unit.a;
    }
}
