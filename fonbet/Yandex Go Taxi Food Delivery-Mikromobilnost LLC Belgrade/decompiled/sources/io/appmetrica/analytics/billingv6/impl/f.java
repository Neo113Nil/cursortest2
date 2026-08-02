package io.appmetrica.analytics.billingv6.impl;

import defpackage.es5;
import defpackage.ns5;
import defpackage.sls;
import defpackage.u7f0;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes4.dex */
public final class f implements u7f0 {
    public final String a;
    public final es5 b;
    public final UtilsProvider c;
    public final sls d;
    public final List e;
    public final d f;
    public final n g;

    public f(String str, es5 es5Var, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.a = str;
        this.b = es5Var;
        this.c = utilsProvider;
        this.d = hVar;
        this.e = list;
        this.f = dVar;
        this.g = nVar;
    }

    @Override // defpackage.u7f0
    public final void onProductDetailsResponse(ns5 ns5Var, List list) {
        this.c.getWorkerExecutor().execute(new e(this, ns5Var, list));
    }
}
