package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f3706c;

    public e(f fVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f3704a = fVar;
        this.f3705b = billingResult;
        this.f3706c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f3704a;
        BillingResult billingResult = this.f3705b;
        List productDetailsList = this.f3706c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.f3713g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f3709c;
            InterfaceC1046a interfaceC1046a = fVar.f3710d;
            List list = fVar.f3711e;
            d dVar = fVar.f3712f;
            k kVar = new k(utilsProvider, interfaceC1046a, list, productDetailsList, dVar, fVar.f3713g);
            dVar.f3703b.add(kVar);
            if (fVar.f3708b.isReady()) {
                fVar.f3708b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f3707a).build(), kVar);
            } else {
                fVar.f3712f.a(kVar);
                fVar.f3713g.onUpdateFinished();
            }
        }
        f fVar2 = this.f3704a;
        fVar2.f3712f.a(fVar2);
    }
}
