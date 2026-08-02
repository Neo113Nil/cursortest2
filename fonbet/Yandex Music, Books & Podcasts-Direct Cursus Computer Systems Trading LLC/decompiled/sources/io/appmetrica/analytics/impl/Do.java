package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Do implements InterfaceC0824z3 {
    public final Context a;

    public Do(@NotNull Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0824z3, io.appmetrica.analytics.impl.InterfaceC0530op
    public final void a(@NotNull C0385jp c0385jp) {
    }

    @NotNull
    public final Context b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
