package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceReferrer;

/* renamed from: io.appmetrica.analytics.impl.xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875xg {

    /* renamed from: a, reason: collision with root package name */
    public final String f7202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7203b;

    /* renamed from: c, reason: collision with root package name */
    public final C0335cj f7204c;

    public C0875xg(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0335cj(eCommerceReferrer.getScreen()));
    }

    public final String toString() {
        return "ReferrerWrapper{type='" + this.f7202a + "', identifier='" + this.f7203b + "', screen=" + this.f7204c + '}';
    }

    public C0875xg(String str, String str2, C0335cj c0335cj) {
        this.f7202a = str;
        this.f7203b = str2;
        this.f7204c = c0335cj;
    }
}
