package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878xj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f7209a;

    public C0878xj(ECommerceEvent eCommerceEvent) {
        this.f7209a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportECommerce(this.f7209a);
    }
}
