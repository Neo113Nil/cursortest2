package io.appmetrica.analytics.billingv6.impl;

import defpackage.bg1;
import defpackage.es5;
import defpackage.ns5;
import defpackage.sls;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;

/* loaded from: classes4.dex */
public final class e extends SafeRunnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ ns5 b;
    public final /* synthetic */ List c;

    public e(f fVar, ns5 ns5Var, List list) {
        this.a = fVar;
        this.b = ns5Var;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.a;
        ns5 ns5Var = this.b;
        List list = this.c;
        fVar.getClass();
        if (ns5Var.a != 0 || list.isEmpty()) {
            fVar.g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.c;
            sls slsVar = fVar.d;
            List list2 = fVar.e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, slsVar, list2, list, dVar, fVar.g);
            dVar.b.add(kVar);
            if (fVar.b.e()) {
                es5 es5Var = fVar.b;
                bg1 bg1Var = new bg1();
                bg1Var.b = fVar.a;
                es5Var.i(bg1Var.l(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.g.onUpdateFinished();
            }
        }
        f fVar2 = this.a;
        fVar2.f.a(fVar2);
    }
}
