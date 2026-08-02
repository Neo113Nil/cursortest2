package com.squareup.cash.onboarding.check.checkers;

import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealIntegrityCheckFactory {
    public final Provider appLock;
    public final Provider marketCapabilities;
    public final Provider profile;
    public final MusicViewFactory$MetroFactory tabs;

    public RealIntegrityCheckFactory(Provider provider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, Provider provider2, Provider provider3) {
        provider.getClass();
        provider2.getClass();
        provider3.getClass();
        this.appLock = provider;
        this.tabs = musicViewFactory$MetroFactory;
        this.profile = provider2;
        this.marketCapabilities = provider3;
    }

    public final IntegrityCheck create(IntegrityCheckFactory$Type integrityCheckFactory$Type) {
        integrityCheckFactory$Type.getClass();
        int ordinal = integrityCheckFactory$Type.ordinal();
        if (ordinal == 0) {
            return (IntegrityCheck) this.profile.invoke();
        }
        if (ordinal == 1) {
            return (IntegrityCheck) this.marketCapabilities.invoke();
        }
        if (ordinal == 2) {
            return (IntegrityCheck) this.appLock.invoke();
        }
        if (ordinal == 3) {
            return (IntegrityCheck) this.tabs.invoke();
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
