package io.appmetrica.analytics.billingv6.impl;

import defpackage.pz2;
import defpackage.rz2;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes5.dex */
public final class b implements rz2 {
    public final BillingConfig a;
    public final pz2 b;
    public final UtilsProvider c;
    public final d d;
    public final n e;

    public b(BillingConfig billingConfig, pz2 pz2Var, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.a = billingConfig;
        this.b = pz2Var;
        this.c = billingLibraryMonitor$updateBilling$1;
        this.d = dVar;
        this.e = nVar;
    }

    @Override // defpackage.rz2
    public final void onBillingServiceDisconnected() {
    }

    @Override // defpackage.rz2
    public final void onBillingSetupFinished(uz2 uz2Var) {
        this.c.getWorkerExecutor().execute(new a(this, uz2Var));
    }
}
