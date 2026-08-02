package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* loaded from: classes9.dex */
public final class Ib implements Dn {
    @Override // io.appmetrica.analytics.impl.Dn
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
