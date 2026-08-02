package io.appmetrica.analytics.billingv8.impl;

import defpackage.m4n;
import defpackage.pz2;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes5.dex */
public final class i implements m4n {
    public final BillingConfig a;
    public final pz2 b;
    public final UtilsProvider c;
    public final String d;
    public final d e;
    public final n f;

    public i(BillingConfig billingConfig, pz2 pz2Var, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.a = billingConfig;
        this.b = pz2Var;
        this.c = utilsProvider;
        this.d = str;
        this.e = dVar;
        this.f = nVar;
    }

    @Override // defpackage.m4n
    public final void onQueryPurchasesResponse(uz2 uz2Var, List list) {
        this.c.getWorkerExecutor().execute(new g(this, uz2Var, list));
    }
}
