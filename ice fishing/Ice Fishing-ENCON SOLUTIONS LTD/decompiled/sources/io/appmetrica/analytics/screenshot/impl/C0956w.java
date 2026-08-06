package io.appmetrica.analytics.screenshot.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956w implements InterfaceC0943i {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7681a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7682b;

    public C0956w(ClientContext clientContext, U u2) {
        this.f7681a = clientContext;
        this.f7682b = u2;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0943i
    public final List<T> a() {
        return AbstractC0253j.B(new C0938d(this.f7681a, this.f7682b), new C0955v(this.f7681a, this.f7682b), new g0(this.f7681a, this.f7682b));
    }
}
