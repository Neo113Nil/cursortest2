package io.appmetrica.analytics.remotepermissions.internal;

import h1.C0234d;
import i1.r;
import i1.t;
import i1.v;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.b;
import io.appmetrica.analytics.remotepermissions.impl.d;
import io.appmetrica.analytics.remotepermissions.impl.e;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemotePermissionsModuleEntryPoint extends ModuleServiceEntryPoint<a> implements AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<a> {

    /* renamed from: a, reason: collision with root package name */
    private final d f7572a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final b f7573b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint f7574c = this;

    /* renamed from: d, reason: collision with root package name */
    private final e f7575d = new e();

    /* renamed from: e, reason: collision with root package name */
    private final String f7576e = "rp";

    /* renamed from: f, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1 f7577f = new RemoteConfigExtensionConfiguration<a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return v.H(new C0234d("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return r.f3416a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<a> getJsonParser() {
            JsonParser<a> jsonParser;
            jsonParser = RemotePermissionsModuleEntryPoint.this.f7572a;
            return jsonParser;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<a, byte[]> getProtobufConverter() {
            Converter<a, byte[]> converter;
            converter = RemotePermissionsModuleEntryPoint.this.f7573b;
            return converter;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<a> getRemoteConfigUpdateListener() {
            RemoteConfigUpdateListener<a> remoteConfigUpdateListener;
            remoteConfigUpdateListener = RemotePermissionsModuleEntryPoint.this.f7574c;
            return remoteConfigUpdateListener;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f7575d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f7576e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<a> getRemoteConfigExtensionConfiguration() {
        return this.f7577f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f7575d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7563a) == null) {
            set = t.f3418a;
        }
        synchronized (eVar) {
            eVar.f7569a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f7575d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f7563a) == null) {
            set = t.f3418a;
        }
        synchronized (eVar) {
            eVar.f7569a = set;
        }
    }
}
