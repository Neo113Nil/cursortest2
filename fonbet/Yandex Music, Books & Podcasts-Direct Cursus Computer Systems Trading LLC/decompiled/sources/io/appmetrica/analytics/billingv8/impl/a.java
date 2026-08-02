package io.appmetrica.analytics.billingv8.impl;

import defpackage.hpc;
import defpackage.pz2;
import defpackage.u75;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes5.dex */
public final class a extends SafeRunnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ uz2 b;

    public a(b bVar, uz2 uz2Var) {
        this.a = bVar;
        this.b = uz2Var;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.a;
        uz2 uz2Var = this.b;
        bVar.getClass();
        if (uz2Var.a != 0) {
            bVar.e.onUpdateFinished();
            return;
        }
        if (!bVar.b.d()) {
            bVar.e.onUpdateFinished();
            return;
        }
        for (String str : u75.h("inapp", "subs")) {
            BillingConfig billingConfig = bVar.a;
            pz2 pz2Var = bVar.b;
            UtilsProvider utilsProvider = bVar.c;
            d dVar = bVar.d;
            i iVar = new i(billingConfig, pz2Var, utilsProvider, str, dVar, bVar.e);
            dVar.b.add(iVar);
            pz2 pz2Var2 = bVar.b;
            hpc hpcVar = new hpc();
            hpcVar.b = str;
            pz2Var2.g(hpcVar.b(), iVar);
        }
    }
}
