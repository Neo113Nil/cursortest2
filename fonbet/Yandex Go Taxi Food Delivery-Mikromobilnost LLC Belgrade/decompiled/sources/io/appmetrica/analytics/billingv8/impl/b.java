package io.appmetrica.analytics.billingv8.impl;

import defpackage.es5;
import defpackage.gs5;
import defpackage.ns5;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes4.dex */
public final class b implements gs5 {
    public final BillingConfig a;
    public final es5 b;
    public final UtilsProvider c;
    public final d d;
    public final n e;

    public b(BillingConfig billingConfig, es5 es5Var, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.a = billingConfig;
        this.b = es5Var;
        this.c = billingLibraryMonitor$updateBilling$1;
        this.d = dVar;
        this.e = nVar;
    }

    @Override // defpackage.gs5
    public final void onBillingServiceDisconnected() {
    }

    @Override // defpackage.gs5
    public final void onBillingSetupFinished(ns5 ns5Var) {
        this.c.getWorkerExecutor().execute(new a(this, ns5Var));
    }
}
