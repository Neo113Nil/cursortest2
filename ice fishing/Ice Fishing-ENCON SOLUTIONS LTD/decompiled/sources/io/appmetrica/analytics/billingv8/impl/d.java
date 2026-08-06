package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3703b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f3702a = billingClient;
    }

    public final void a(Object obj) {
        this.f3703b.remove(obj);
        if (this.f3703b.size() == 0) {
            this.f3702a.endConnection();
        }
    }
}
