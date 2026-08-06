package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f3722c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3723d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3724e;

    /* renamed from: f, reason: collision with root package name */
    public final n f3725f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f3720a = billingConfig;
        this.f3721b = billingClient;
        this.f3722c = utilsProvider;
        this.f3723d = str;
        this.f3724e = dVar;
        this.f3725f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f3722c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
