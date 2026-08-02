package io.appmetrica.analytics.egress.internal;

import defpackage.gw00;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.egress.impl.a;
import io.appmetrica.analytics.egress.impl.c;
import io.appmetrica.analytics.egress.impl.d;
import io.appmetrica.analytics.egress.impl.j;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/appmetrica/analytics/egress/internal/EgressModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/egress/internal/config/EgressConfig;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "e", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "egress_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EgressModuleEntryPoint extends ModuleServiceEntryPoint<EgressConfig> {

    /* renamed from: a, reason: from kotlin metadata */
    private final String identifier = "egress";
    private final c b;
    private final a c;
    private j d;
    private final EgressModuleEntryPoint$remoteConfigExtensionConfiguration$1 e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.egress.internal.EgressModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public EgressModuleEntryPoint() {
        d dVar = new d();
        this.b = new c(dVar);
        this.c = new a(dVar);
        this.e = new RemoteConfigExtensionConfiguration<EgressConfig>() { // from class: io.appmetrica.analytics.egress.internal.EgressModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return gw00.e(new Pair("eg", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return Collections.singletonList("eg");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<EgressConfig> getJsonParser() {
                a aVar;
                aVar = EgressModuleEntryPoint.this.c;
                return aVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<EgressConfig, byte[]> getProtobufConverter() {
                c cVar;
                cVar = EgressModuleEntryPoint.this.b;
                return cVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            /* renamed from: getRemoteConfigUpdateListener */
            public RemoteConfigUpdateListener<EgressConfig> getRemoteConfigUpdateListener2() {
                final EgressModuleEntryPoint egressModuleEntryPoint = EgressModuleEntryPoint.this;
                return new RemoteConfigUpdateListener<EgressConfig>() { // from class: io.appmetrica.analytics.egress.internal.EgressModuleEntryPoint$remoteConfigExtensionConfiguration$1$getRemoteConfigUpdateListener$1
                    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
                    public void onRemoteConfigUpdated(ModuleRemoteConfig<EgressConfig> config) {
                        j jVar;
                        EgressConfig featuresConfig;
                        j jVar2;
                        EgressModuleEntryPoint egressModuleEntryPoint2 = EgressModuleEntryPoint.this;
                        synchronized (egressModuleEntryPoint2) {
                            jVar = egressModuleEntryPoint2.d;
                            if (jVar != null && (featuresConfig = config.getFeaturesConfig()) != null) {
                                jVar2 = egressModuleEntryPoint2.d;
                                if (jVar2 == null) {
                                    jVar2 = null;
                                }
                                jVar2.b(featuresConfig);
                            }
                        }
                    }
                };
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<EgressConfig> getRemoteConfigExtensionConfiguration() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<EgressConfig> initialConfig) {
        synchronized (this) {
            if (this.d == null) {
                j jVar = new j(serviceContext);
                this.d = jVar;
                jVar.a(initialConfig.getFeaturesConfig());
            }
        }
    }
}
