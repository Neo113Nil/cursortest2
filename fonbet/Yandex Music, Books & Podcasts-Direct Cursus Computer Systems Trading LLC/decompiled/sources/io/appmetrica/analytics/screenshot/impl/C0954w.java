package io.appmetrica.analytics.screenshot.impl;

import defpackage.u75;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0954w implements InterfaceC0941i {
    public final ClientContext a;
    public final U b;

    public C0954w(@NotNull ClientContext clientContext, @NotNull U u) {
        this.a = clientContext;
        this.b = u;
    }

    @Override // io.appmetrica.analytics.screenshot.impl.InterfaceC0941i
    @NotNull
    public final List<T> a() {
        return u75.h(new C0936d(this.a, this.b), new C0953v(this.a, this.b), new g0(this.a, this.b));
    }
}
