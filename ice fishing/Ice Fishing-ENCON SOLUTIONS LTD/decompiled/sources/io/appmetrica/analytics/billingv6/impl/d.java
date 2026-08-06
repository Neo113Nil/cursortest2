package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f3649a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f3650b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f3649a = billingClient;
    }

    public final void a(Object obj) {
        this.f3650b.remove(obj);
        if (this.f3650b.size() == 0) {
            this.f3649a.endConnection();
        }
    }
}
