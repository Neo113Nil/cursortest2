package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import i1.AbstractC0253j;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f3693b;

    public a(b bVar, BillingResult billingResult) {
        this.f3692a = bVar;
        this.f3693b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f3692a;
        BillingResult billingResult = this.f3693b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f3698e.onUpdateFinished();
            return;
        }
        if (!bVar.f3695b.isReady()) {
            bVar.f3698e.onUpdateFinished();
            return;
        }
        for (String str : AbstractC0253j.B("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f3694a;
            BillingClient billingClient = bVar.f3695b;
            UtilsProvider utilsProvider = bVar.f3696c;
            d dVar = bVar.f3697d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f3698e);
            dVar.f3703b.add(iVar);
            bVar.f3695b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
