package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class f implements ProductDetailsResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f3654a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f3655b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f3656c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1046a f3657d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3658e;

    /* renamed from: f, reason: collision with root package name */
    public final d f3659f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3660g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f3654a = str;
        this.f3655b = billingClient;
        this.f3656c = utilsProvider;
        this.f3657d = hVar;
        this.f3658e = list;
        this.f3659f = dVar;
        this.f3660g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f3656c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
