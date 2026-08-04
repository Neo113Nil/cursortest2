package com.gamericefishpro.space.i2;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ p2 e;
    public final /* synthetic */ Function2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(p2 p2Var, Function2 function2, int i) {
        super(2);
        this.d = i;
        this.e = p2Var;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a(this.e.d, this.i, rVar, 0);
                } else {
                    rVar.V();
                }
                break;
            default:
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p2 p2Var = this.e;
                    t tVar = p2Var.d;
                    Object tag = tVar.getTag(R.id.inspection_slot_table_set);
                    com.gamericefishpro.space.th.a aVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof com.gamericefishpro.space.fi.a) && !(tag instanceof com.gamericefishpro.space.fi.f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = tVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof com.gamericefishpro.space.fi.a) && !(tag2 instanceof com.gamericefishpro.space.fi.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(rVar2.y());
                        rVar2.q = true;
                        rVar2.C = true;
                        rVar2.c.c();
                        rVar2.H.c();
                        com.gamericefishpro.space.t0.h2 h2Var = rVar2.I;
                        com.gamericefishpro.space.t0.e2 e2Var = h2Var.a;
                        h2Var.e = e2Var.C;
                        h2Var.f = e2Var.D;
                    }
                    boolean zH = rVar2.h(p2Var);
                    Object objP = rVar2.P();
                    com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                    if (zH || objP == fVar) {
                        objP = new n2(p2Var, aVar, 0);
                        rVar2.k0(objP);
                    }
                    com.gamericefishpro.space.t0.i.e(rVar2, tVar, (Function2) objP);
                    boolean zH2 = rVar2.h(p2Var);
                    Object objP2 = rVar2.P();
                    if (zH2 || objP2 == fVar) {
                        objP2 = new n2(p2Var, aVar, 1);
                        rVar2.k0(objP2);
                    }
                    com.gamericefishpro.space.t0.i.e(rVar2, tVar, (Function2) objP2);
                    com.gamericefishpro.space.t0.i.a(com.gamericefishpro.space.g1.i.a.a(set), com.gamericefishpro.space.b1.n.c(-280240369, new o2(p2Var, this.i, 0), rVar2), rVar2, 56);
                } else {
                    rVar2.V();
                }
                break;
        }
        return Unit.a;
    }
}
