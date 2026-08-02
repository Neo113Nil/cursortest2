package io.appmetrica.analytics.billingv8.impl;

import defpackage.bg1;
import defpackage.es5;
import defpackage.ns5;
import defpackage.scc;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes4.dex */
public final class a extends SafeRunnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ ns5 b;

    public a(b bVar, ns5 ns5Var) {
        this.a = bVar;
        this.b = ns5Var;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.a;
        ns5 ns5Var = this.b;
        bVar.getClass();
        if (ns5Var.a != 0) {
            bVar.e.onUpdateFinished();
            return;
        }
        if (!bVar.b.e()) {
            bVar.e.onUpdateFinished();
            return;
        }
        for (String str : scc.g("inapp", "subs")) {
            BillingConfig billingConfig = bVar.a;
            es5 es5Var = bVar.b;
            UtilsProvider utilsProvider = bVar.c;
            d dVar = bVar.d;
            i iVar = new i(billingConfig, es5Var, utilsProvider, str, dVar, bVar.e);
            dVar.b.add(iVar);
            es5 es5Var2 = bVar.b;
            bg1 bg1Var = new bg1();
            bg1Var.b = str;
            es5Var2.i(bg1Var.l(), iVar);
        }
    }
}
