package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f7329a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7330b;

    /* renamed from: c, reason: collision with root package name */
    public final h f7331c;

    /* renamed from: d, reason: collision with root package name */
    public final List f7332d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f7333e = new HashMap();

    public p(List list, i iVar) {
        this.f7332d = list;
        this.f7329a = iVar;
        m mVar = new m();
        this.f7330b = mVar;
        this.f7331c = new h(mVar);
    }

    public final m a() {
        return this.f7330b;
    }
}
