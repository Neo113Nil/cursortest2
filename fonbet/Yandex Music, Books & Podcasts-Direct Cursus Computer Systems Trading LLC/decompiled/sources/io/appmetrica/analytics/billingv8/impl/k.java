package io.appmetrica.analytics.billingv8.impl;

import defpackage.m4n;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k implements m4n {
    public final UtilsProvider a;
    public final Function0 b;
    public final List c;
    public final List d;
    public final d e;
    public final n f;

    public k(UtilsProvider utilsProvider, Function0 function0, List list, List list2, d dVar, n nVar) {
        this.a = utilsProvider;
        this.b = function0;
        this.c = list;
        this.d = list2;
        this.e = dVar;
        this.f = nVar;
    }

    @Override // defpackage.m4n
    public final void onQueryPurchasesResponse(uz2 uz2Var, List list) {
        this.a.getWorkerExecutor().execute(new j(this, uz2Var, list));
    }
}
