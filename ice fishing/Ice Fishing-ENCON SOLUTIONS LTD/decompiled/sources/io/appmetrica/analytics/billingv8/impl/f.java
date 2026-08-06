package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class f implements ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f3707a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f3708b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f3709c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1046a f3710d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3711e;

    /* renamed from: f, reason: collision with root package name */
    public final d f3712f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3713g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f3707a = str;
        this.f3708b = billingClient;
        this.f3709c = utilsProvider;
        this.f3710d = hVar;
        this.f3711e = list;
        this.f3712f = dVar;
        this.f3713g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.f3709c.getWorkerExecutor().execute(new e(this, billingResult, queryProductDetailsResult));
    }
}
