package io.appmetrica.analytics.billingv6.impl;

import defpackage.b6x;
import defpackage.pz2;
import defpackage.qz2;
import defpackage.rxw;
import defpackage.tzw;
import defpackage.u75;
import defpackage.uz2;
import defpackage.xq0;
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
        for (String str : u75.h("inapp", "subs")) {
            BillingConfig billingConfig = bVar.a;
            pz2 pz2Var = bVar.b;
            UtilsProvider utilsProvider = bVar.c;
            d dVar = bVar.d;
            i iVar = new i(billingConfig, pz2Var, utilsProvider, str, dVar, bVar.e);
            dVar.b.add(iVar);
            if (bVar.b.d()) {
                pz2 pz2Var2 = bVar.b;
                if (str == null) {
                    xq0.x("Product type must be set");
                    return;
                }
                qz2 qz2Var = (qz2) pz2Var2;
                qz2Var.getClass();
                if (qz2Var.d()) {
                    int i = 4;
                    if (qz2.i(new tzw(qz2Var, str, iVar, i), 30000L, new rxw(qz2Var, iVar, false, i), qz2Var.v(), qz2Var.m()) == null) {
                        uz2 j = qz2Var.j();
                        qz2Var.y(25, 11, j);
                        iVar.onPurchaseHistoryResponse(j, null);
                    }
                } else {
                    uz2 uz2Var2 = b6x.k;
                    qz2Var.y(2, 11, uz2Var2);
                    iVar.onPurchaseHistoryResponse(uz2Var2, null);
                }
            } else {
                bVar.d.a(iVar);
                bVar.e.onUpdateFinished();
            }
        }
    }
}
