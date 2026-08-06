package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f3667a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f3668b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f3669c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3670d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3671e;

    /* renamed from: f, reason: collision with root package name */
    public final n f3672f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f3667a = billingConfig;
        this.f3668b = billingClient;
        this.f3669c = utilsProvider;
        this.f3670d = str;
        this.f3671e = dVar;
        this.f3672f = nVar;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f3669c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
