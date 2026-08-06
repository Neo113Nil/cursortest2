package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801uk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f7022b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7023c;

    public C0801uk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f7021a = sdkIdentifiers;
        this.f7022b = remoteConfigMetaInfo;
        this.f7023c = obj;
    }

    public final C0801uk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C0801uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f7022b;
    }

    public final Object c() {
        return this.f7023c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0801uk)) {
            return false;
        }
        C0801uk c0801uk = (C0801uk) obj;
        return kotlin.jvm.internal.i.a(this.f7021a, c0801uk.f7021a) && kotlin.jvm.internal.i.a(this.f7022b, c0801uk.f7022b) && kotlin.jvm.internal.i.a(this.f7023c, c0801uk.f7023c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f7023c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f7021a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f7022b;
    }

    public final int hashCode() {
        int hashCode = (this.f7022b.hashCode() + (this.f7021a.hashCode() * 31)) * 31;
        Object obj = this.f7023c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f7021a + ", remoteConfigMetaInfo=" + this.f7022b + ", featuresConfig=" + this.f7023c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f7021a;
    }

    public static C0801uk a(C0801uk c0801uk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            sdkIdentifiers = c0801uk.f7021a;
        }
        if ((i2 & 2) != 0) {
            remoteConfigMetaInfo = c0801uk.f7022b;
        }
        if ((i2 & 4) != 0) {
            obj = c0801uk.f7023c;
        }
        c0801uk.getClass();
        return new C0801uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
