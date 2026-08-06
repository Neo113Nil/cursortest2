package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* loaded from: classes.dex */
public final class b implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final BillingClient f3642b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f3643c;

    /* renamed from: d, reason: collision with root package name */
    public final d f3644d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3645e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f3641a = billingConfig;
        this.f3642b = billingClient;
        this.f3643c = billingLibraryMonitor$updateBilling$1;
        this.f3644d = dVar;
        this.f3645e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f3643c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
