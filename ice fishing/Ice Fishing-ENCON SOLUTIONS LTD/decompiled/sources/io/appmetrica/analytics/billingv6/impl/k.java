package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class k implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final UtilsProvider f3676a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1046a f3677b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3678c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3679d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3680e;

    /* renamed from: f, reason: collision with root package name */
    public final n f3681f;

    public k(UtilsProvider utilsProvider, InterfaceC1046a interfaceC1046a, List list, List list2, d dVar, n nVar) {
        this.f3676a = utilsProvider;
        this.f3677b = interfaceC1046a;
        this.f3678c = list;
        this.f3679d = list2;
        this.f3680e = dVar;
        this.f3681f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f3676a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
