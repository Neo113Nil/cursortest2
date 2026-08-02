package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.rzm;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0;

/* loaded from: classes5.dex */
public final class CastModule_Companion_ProvideCastAvailabilityProviderFactory implements rzm {

    public static final class InstanceHolder {
        private static final CastModule_Companion_ProvideCastAvailabilityProviderFactory INSTANCE = new CastModule_Companion_ProvideCastAvailabilityProviderFactory();

        private InstanceHolder() {
        }
    }

    public static CastModule_Companion_ProvideCastAvailabilityProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InterfaceC1185q0 provideCastAvailabilityProvider() {
        InterfaceC1185q0 provideCastAvailabilityProvider = CastModule.INSTANCE.provideCastAvailabilityProvider();
        a4g.t(provideCastAvailabilityProvider);
        return provideCastAvailabilityProvider;
    }

    @Override // defpackage.szm
    public InterfaceC1185q0 get() {
        return provideCastAvailabilityProvider();
    }
}
