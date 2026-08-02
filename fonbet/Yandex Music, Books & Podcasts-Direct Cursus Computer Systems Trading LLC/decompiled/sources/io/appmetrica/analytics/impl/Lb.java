package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public interface Lb extends SimpleAdvertisingIdGetter, InterfaceC0530op {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull InterfaceC0526ol interfaceC0526ol);

    @Override // io.appmetrica.analytics.impl.InterfaceC0530op
    /* synthetic */ void a(@NonNull C0385jp c0385jp);

    void b(boolean z);

    void c(boolean z);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
