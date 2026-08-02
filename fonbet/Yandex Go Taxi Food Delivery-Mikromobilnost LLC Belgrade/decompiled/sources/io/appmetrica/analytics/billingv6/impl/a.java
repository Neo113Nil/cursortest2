package io.appmetrica.analytics.billingv6.impl;

import defpackage.ag1;
import defpackage.es5;
import defpackage.mf1;
import defpackage.ns5;
import defpackage.scc;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes9.dex */
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
        for (String str : scc.g("inapp", "subs")) {
            BillingConfig billingConfig = bVar.a;
            es5 es5Var = bVar.b;
            UtilsProvider utilsProvider = bVar.c;
            d dVar = bVar.d;
            i iVar = new i(billingConfig, es5Var, utilsProvider, str, dVar, bVar.e);
            dVar.b.add(iVar);
            if (bVar.b.e()) {
                es5 es5Var2 = bVar.b;
                mf1 f = ag1.f();
                f.p(str);
                es5Var2.h(f.f(), iVar);
            } else {
                bVar.d.a(iVar);
                bVar.e.onUpdateFinished();
            }
        }
    }
}
