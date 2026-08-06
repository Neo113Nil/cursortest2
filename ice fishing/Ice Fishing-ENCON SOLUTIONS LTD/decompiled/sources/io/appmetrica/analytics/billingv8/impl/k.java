package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class k implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1046a f3730b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3731c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3732d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3733e;

    /* renamed from: f, reason: collision with root package name */
    public final n f3734f;

    public k(UtilsProvider utilsProvider, InterfaceC1046a interfaceC1046a, List list, List list2, d dVar, n nVar) {
        this.f3729a = utilsProvider;
        this.f3730b = interfaceC1046a;
        this.f3731c = list;
        this.f3732d = list2;
        this.f3733e = dVar;
        this.f3734f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f3729a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
