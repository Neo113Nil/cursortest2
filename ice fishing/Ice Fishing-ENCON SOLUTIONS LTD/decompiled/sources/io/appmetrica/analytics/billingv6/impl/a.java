package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import i1.AbstractC0253j;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3640b;

    public a(b bVar, BillingResult billingResult) {
        this.f3639a = bVar;
        this.f3640b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f3639a;
        BillingResult billingResult = this.f3640b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f3645e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0253j.B("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f3641a;
            BillingClient billingClient = bVar.f3642b;
            UtilsProvider utilsProvider = bVar.f3643c;
            d dVar = bVar.f3644d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f3645e);
            dVar.f3650b.add(iVar);
            if (bVar.f3642b.isReady()) {
                bVar.f3642b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f3644d.a(iVar);
                bVar.f3645e.onUpdateFinished();
            }
        }
    }
}
