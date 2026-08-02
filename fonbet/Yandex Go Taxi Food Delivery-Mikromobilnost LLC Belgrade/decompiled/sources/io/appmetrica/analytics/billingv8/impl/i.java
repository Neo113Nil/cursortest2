package io.appmetrica.analytics.billingv8.impl;

import defpackage.es5;
import defpackage.j0g0;
import defpackage.ns5;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes4.dex */
public final class i implements j0g0 {
    public final BillingConfig a;
    public final es5 b;
    public final UtilsProvider c;
    public final String d;
    public final d e;
    public final n f;

    public i(BillingConfig billingConfig, es5 es5Var, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.a = billingConfig;
        this.b = es5Var;
        this.c = utilsProvider;
        this.d = str;
        this.e = dVar;
        this.f = nVar;
    }

    @Override // defpackage.j0g0
    public final void onQueryPurchasesResponse(ns5 ns5Var, List list) {
        this.c.getWorkerExecutor().execute(new g(this, ns5Var, list));
    }
}
