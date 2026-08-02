package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;

/* loaded from: classes9.dex */
public final class Cc implements ClientComponentsInitializer {
    public final C0905z8 a = new C0905z8();

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        this.a.onCreate();
        V4.l().i = new Nc();
        Iq iq = V4.l().j;
        iq.a.add(Fc.a);
        V4.l().u.a = new I();
        V4.l().x = new C0494l2();
    }
}
