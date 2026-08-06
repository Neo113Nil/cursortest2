package io.appmetrica.analytics.idsync.internal;

import a.AbstractC0083a;
import h1.C0234d;
import i1.v;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.idsync.impl.C0258c;
import io.appmetrica.analytics.idsync.impl.C0259d;
import io.appmetrica.analytics.idsync.impl.C0260e;
import io.appmetrica.analytics.idsync.impl.h;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class IdSyncModuleEntryPoint extends ModuleServiceEntryPoint<IdSyncConfig> implements RemoteConfigUpdateListener<IdSyncConfig> {

    /* renamed from: a, reason: collision with root package name */
    private final C0259d f4073a;

    /* renamed from: b, reason: collision with root package name */
    private final C0258c f4074b;

    /* renamed from: c, reason: collision with root package name */
    private h f4075c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4076d;

    /* renamed from: e, reason: collision with root package name */
    private final IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1 f4077e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public IdSyncModuleEntryPoint() {
        C0260e c0260e = new C0260e();
        this.f4073a = new C0259d(c0260e);
        this.f4074b = new C0258c(c0260e);
        this.f4076d = "id-sync";
        this.f4077e = new RemoteConfigExtensionConfiguration<IdSyncConfig>() { // from class: io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return v.H(new C0234d("is", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return AbstractC0083a.m("is");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<IdSyncConfig> getJsonParser() {
                C0258c c0258c;
                c0258c = IdSyncModuleEntryPoint.this.f4074b;
                return c0258c;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<IdSyncConfig, byte[]> getProtobufConverter() {
                C0259d c0259d;
                c0259d = IdSyncModuleEntryPoint.this.f4073a;
                return c0259d;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public RemoteConfigUpdateListener<IdSyncConfig> getRemoteConfigUpdateListener() {
                return IdSyncModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f4076d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<IdSyncConfig> getRemoteConfigExtensionConfiguration() {
        return this.f4077e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        synchronized (this) {
            if (this.f4075c == null) {
                h hVar = new h(serviceContext, moduleRemoteConfig.getIdentifiers());
                this.f4075c = hVar;
                IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                if (featuresConfig != null) {
                    hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        h hVar;
        IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null && (hVar = this.f4075c) != null) {
            hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
        }
    }
}
