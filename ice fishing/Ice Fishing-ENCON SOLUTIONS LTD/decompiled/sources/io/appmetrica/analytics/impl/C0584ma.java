package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584ma implements InterfaceC0568lk {
    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
