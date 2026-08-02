package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.vb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0718vb implements InterfaceC0441ln {
    @Override // io.appmetrica.analytics.impl.InterfaceC0441ln
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0441ln
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
