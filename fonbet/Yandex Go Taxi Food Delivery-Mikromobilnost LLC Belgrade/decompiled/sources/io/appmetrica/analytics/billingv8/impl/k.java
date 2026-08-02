package io.appmetrica.analytics.billingv8.impl;

import defpackage.j0g0;
import defpackage.ns5;
import defpackage.sls;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes4.dex */
public final class k implements j0g0 {
    public final UtilsProvider a;
    public final sls b;
    public final List c;
    public final List d;
    public final d e;
    public final n f;

    public k(UtilsProvider utilsProvider, sls slsVar, List list, List list2, d dVar, n nVar) {
        this.a = utilsProvider;
        this.b = slsVar;
        this.c = list;
        this.d = list2;
        this.e = dVar;
        this.f = nVar;
    }

    @Override // defpackage.j0g0
    public final void onQueryPurchasesResponse(ns5 ns5Var, List list) {
        this.a.getWorkerExecutor().execute(new j(this, ns5Var, list));
    }
}
