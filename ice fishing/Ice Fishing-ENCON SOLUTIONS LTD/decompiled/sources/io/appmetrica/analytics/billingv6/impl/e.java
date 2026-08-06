package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3653c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f3651a = fVar;
        this.f3652b = billingResult;
        this.f3653c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f3651a;
        BillingResult billingResult = this.f3652b;
        List list = this.f3653c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f3660g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f3656c;
            InterfaceC1046a interfaceC1046a = fVar.f3657d;
            List list2 = fVar.f3658e;
            d dVar = fVar.f3659f;
            k kVar = new k(utilsProvider, interfaceC1046a, list2, list, dVar, fVar.f3660g);
            dVar.f3650b.add(kVar);
            if (fVar.f3655b.isReady()) {
                fVar.f3655b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f3654a).build(), kVar);
            } else {
                fVar.f3659f.a(kVar);
                fVar.f3660g.onUpdateFinished();
            }
        }
        f fVar2 = this.f3651a;
        fVar2.f3659f.a(fVar2);
    }
}
