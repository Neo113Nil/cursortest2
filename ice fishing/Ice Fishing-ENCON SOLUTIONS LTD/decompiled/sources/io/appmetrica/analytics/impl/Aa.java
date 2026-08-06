package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes.dex */
public interface Aa extends SimpleAdvertisingIdGetter, InterfaceC0544km {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Gi gi);

    @Override // io.appmetrica.analytics.impl.InterfaceC0544km
    /* synthetic */ void a(C0415fm c0415fm);

    void b(boolean z2);

    void c(boolean z2);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
