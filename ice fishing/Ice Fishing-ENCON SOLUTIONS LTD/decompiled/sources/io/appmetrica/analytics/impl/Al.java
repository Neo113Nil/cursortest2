package io.appmetrica.analytics.impl;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class Al implements K2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4162a;

    public Al(Context context) {
        this.f4162a = context;
    }

    @Override // io.appmetrica.analytics.impl.K2, io.appmetrica.analytics.impl.InterfaceC0544km
    public final void a(C0415fm c0415fm) {
    }

    public final Context b() {
        return this.f4162a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider
    public final SSLSocketFactory getSslSocketFactory() {
        return null;
    }
}
