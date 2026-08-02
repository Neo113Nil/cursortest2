package io.appmetrica.analytics.billingv6.impl;

import defpackage.hpc;
import defpackage.pz2;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e extends SafeRunnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ uz2 b;
    public final /* synthetic */ List c;

    public e(f fVar, uz2 uz2Var, List list) {
        this.a = fVar;
        this.b = uz2Var;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.a;
        uz2 uz2Var = this.b;
        List list = this.c;
        fVar.getClass();
        if (uz2Var.a != 0 || list.isEmpty()) {
            fVar.g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.c;
            Function0 function0 = fVar.d;
            List list2 = fVar.e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, function0, list2, list, dVar, fVar.g);
            dVar.b.add(kVar);
            if (fVar.b.d()) {
                pz2 pz2Var = fVar.b;
                hpc hpcVar = new hpc();
                hpcVar.b = fVar.a;
                pz2Var.g(hpcVar.b(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.g.onUpdateFinished();
            }
        }
        f fVar2 = this.a;
        fVar2.f.a(fVar2);
    }
}
