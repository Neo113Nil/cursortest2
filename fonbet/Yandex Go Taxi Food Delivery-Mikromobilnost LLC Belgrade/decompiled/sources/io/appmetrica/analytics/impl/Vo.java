package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class Vo implements InterfaceC0900z3 {
    public final Context a;

    public Vo(Context context) {
        this.a = context;
    }

    public final Context a() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0900z3, io.appmetrica.analytics.impl.Gp
    public final void a(Bp bp) {
    }
}
