package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.qv10;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* loaded from: classes9.dex */
public final class Mn implements ModuleRemoteConfig {
    public final SdkIdentifiers a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public Mn(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = obj;
    }

    public static Mn a(Mn mn, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = mn.a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = mn.b;
        }
        if ((i & 4) != 0) {
            obj = mn.c;
        }
        mn.getClass();
        return new Mn(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mn)) {
            return false;
        }
        Mn mn = (Mn) obj;
        return jl40.l(this.a, mn.a) && jl40.l(this.b, mn.b) && jl40.l(this.c, mn.c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceModuleRemoteConfigModel(identifiers=");
        sb.append(this.a);
        sb.append(", remoteConfigMetaInfo=");
        sb.append(this.b);
        sb.append(", featuresConfig=");
        return qv10.r(sb, this.c, ')');
    }

    public final Mn a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new Mn(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final SdkIdentifiers a() {
        return this.a;
    }
}
