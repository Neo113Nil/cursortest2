package io.appmetrica.analytics.impl;

import java.util.Collection;

/* loaded from: classes.dex */
public final class Yd implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final String f5432a;

    public Yd(String str) {
        this.f5432a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Collection<Object> collection) {
        return AbstractC0572lo.a((Collection) collection) ? new C0702qo(this, false, C1.a.k(new StringBuilder(), this.f5432a, " is null or empty.")) : new C0702qo(this, true, "");
    }
}
