package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import defpackage.hpc;
import defpackage.pz2;
import defpackage.uz2;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class e extends SafeRunnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ uz2 b;
    public final /* synthetic */ QueryProductDetailsResult c;

    public e(f fVar, uz2 uz2Var, QueryProductDetailsResult queryProductDetailsResult) {
        this.a = fVar;
        this.b = uz2Var;
        this.c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.a;
        uz2 uz2Var = this.b;
        List productDetailsList = this.c.getProductDetailsList();
        fVar.getClass();
        if (uz2Var.a != 0 || productDetailsList.isEmpty()) {
            fVar.g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.c;
            Function0 function0 = fVar.d;
            List list = fVar.e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, function0, list, productDetailsList, dVar, fVar.g);
            dVar.b.add(kVar);
            if (fVar.b.d()) {
                pz2 pz2Var = fVar.b;
                hpc hpcVar = new hpc();
                hpcVar.b = fVar.a;
                pz2Var.g(hpcVar.b(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.g.onUpdateFinished();
            }
        }
        f fVar2 = this.a;
        fVar2.f.a(fVar2);
    }
}
