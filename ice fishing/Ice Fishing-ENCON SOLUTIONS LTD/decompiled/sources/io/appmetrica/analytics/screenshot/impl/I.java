package io.appmetrica.analytics.screenshot.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* loaded from: classes.dex */
public final class I implements InterfaceC0943i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7590a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7591b;

    public I(ClientContext clientContext, U u2) {
        this.f7590a = clientContext;
        this.f7591b = u2;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0943i
    public final List<T> a() {
        return AbstractC0253j.B(new C0955v(this.f7590a, this.f7591b), new g0(this.f7590a, this.f7591b));
    }
}
