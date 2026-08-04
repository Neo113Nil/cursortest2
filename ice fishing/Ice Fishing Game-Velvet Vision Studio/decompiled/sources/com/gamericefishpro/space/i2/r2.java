package com.gamericefishpro.space.i2;

import android.view.View;
import android.view.ViewGroup;
import com.gamericefishpro.space.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r2 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    public static final p2 a(a aVar, com.gamericefishpro.space.t0.u uVar, com.gamericefishpro.space.b1.h hVar) {
        t tVar;
        p2 p2Var;
        Object[] objArr = 0;
        if (f1.a.compareAndSet(false, true)) {
            com.gamericefishpro.space.ri.e eVarA = com.gamericefishpro.space.hj.c.a(1, 6, null);
            com.gamericefishpro.space.pi.a0.u(com.gamericefishpro.space.pi.a0.b((CoroutineContext) l0.F.getValue()), null, new com.gamericefishpro.space.db.d((Object) eVarA, (com.gamericefishpro.space.th.a) (objArr == true ? 1 : 0), 3), 3);
            com.gamericefishpro.space.b2.d0 d0Var = new com.gamericefishpro.space.b2.d0(10, eVarA);
            synchronized (com.gamericefishpro.space.f1.p.c) {
                com.gamericefishpro.space.f1.p.i = CollectionsKt.E(com.gamericefishpro.space.f1.p.i, d0Var);
                Unit unit = Unit.a;
            }
            com.gamericefishpro.space.f1.p.a();
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof t) {
                tVar = (t) childAt;
            }
            if (tVar == null) {
                tVar = new t(aVar.getContext(), uVar.j());
                aVar.addView(tVar.getView(), a);
            }
            Object tag = tVar.getView().getTag(R.id.wrapped_composition_tag);
            p2Var = tag instanceof p2 ? (p2) tag : null;
            if (p2Var == null) {
                p2Var = new p2(tVar, new com.gamericefishpro.space.t0.x(uVar, new com.gamericefishpro.space.h2.d2(tVar.getRoot())));
                tVar.getView().setTag(R.id.wrapped_composition_tag, p2Var);
            }
            p2Var.d(hVar);
            if (!Intrinsics.a(tVar.getCoroutineContext(), uVar.j())) {
                tVar.setCoroutineContext(uVar.j());
            }
            tVar.setFrameEndScheduler$ui(new q2(uVar));
            return p2Var;
        }
        aVar.removeAllViews();
        tVar = null;
        if (tVar == null) {
            tVar = new t(aVar.getContext(), uVar.j());
            aVar.addView(tVar.getView(), a);
        }
        Object tag2 = tVar.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof p2) {
        }
        if (p2Var == null) {
            p2Var = new p2(tVar, new com.gamericefishpro.space.t0.x(uVar, new com.gamericefishpro.space.h2.d2(tVar.getRoot())));
            tVar.getView().setTag(R.id.wrapped_composition_tag, p2Var);
        }
        p2Var.d(hVar);
        if (!Intrinsics.a(tVar.getCoroutineContext(), uVar.j())) {
            tVar.setCoroutineContext(uVar.j());
        }
        tVar.setFrameEndScheduler$ui(new q2(uVar));
        return p2Var;
    }
}
