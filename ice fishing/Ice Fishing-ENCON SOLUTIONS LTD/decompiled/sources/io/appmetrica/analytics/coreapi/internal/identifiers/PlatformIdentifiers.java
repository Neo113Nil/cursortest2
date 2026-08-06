package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f3756a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f3757b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f3756a = simpleAdvertisingIdGetter;
        this.f3757b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f3756a;
        }
        if ((i2 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f3757b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f3756a;
    }

    public final AppSetIdProvider component2() {
        return this.f3757b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return i.a(this.f3756a, platformIdentifiers.f3756a) && i.a(this.f3757b, platformIdentifiers.f3757b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f3756a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f3757b;
    }

    public int hashCode() {
        return this.f3757b.hashCode() + (this.f3756a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f3756a + ", appSetIdProvider=" + this.f3757b + ')';
    }
}
