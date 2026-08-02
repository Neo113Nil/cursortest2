package io.appmetrica.analytics.networkquality.internal;

import defpackage.gw00;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networkquality.impl.g;
import io.appmetrica.analytics.networkquality.impl.k;
import io.appmetrica.analytics.networkquality.impl.l;
import io.appmetrica.analytics.networkquality.impl.n;
import io.appmetrica.analytics.networkquality.impl.o;
import io.appmetrica.analytics.networkquality.impl.q;
import io.appmetrica.analytics.networkquality.impl.r;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.random.Random;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/appmetrica/analytics/networkquality/internal/NetworkQualityModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/networkquality/internal/NetworkQualityConfigWrapper;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "e", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "network-quality_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class NetworkQualityModuleEntryPoint extends ModuleServiceEntryPoint<NetworkQualityConfigWrapper> {
    private n d;

    /* renamed from: a, reason: from kotlin metadata */
    private final String identifier = "network-quality";
    private final k b = new k(new l());
    private final g c = new g();
    private final NetworkQualityModuleEntryPoint$remoteConfigExtensionConfiguration$1 e = new RemoteConfigExtensionConfiguration<NetworkQualityConfigWrapper>() { // from class: io.appmetrica.analytics.networkquality.internal.NetworkQualityModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return gw00.e(new Pair("nq", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return Collections.singletonList("nq");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<NetworkQualityConfigWrapper> getJsonParser() {
            g gVar;
            gVar = NetworkQualityModuleEntryPoint.this.c;
            return gVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<NetworkQualityConfigWrapper, byte[]> getProtobufConverter() {
            k kVar;
            kVar = NetworkQualityModuleEntryPoint.this.b;
            return kVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        /* renamed from: getRemoteConfigUpdateListener */
        public RemoteConfigUpdateListener<NetworkQualityConfigWrapper> getRemoteConfigUpdateListener2() {
            final NetworkQualityModuleEntryPoint networkQualityModuleEntryPoint = NetworkQualityModuleEntryPoint.this;
            return new RemoteConfigUpdateListener<NetworkQualityConfigWrapper>() { // from class: io.appmetrica.analytics.networkquality.internal.NetworkQualityModuleEntryPoint$remoteConfigExtensionConfiguration$1$getRemoteConfigUpdateListener$1
                /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
                
                    r0 = r1.d;
                 */
                @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onRemoteConfigUpdated(ModuleRemoteConfig<NetworkQualityConfigWrapper> config) {
                    n nVar;
                    NetworkQualityModuleEntryPoint networkQualityModuleEntryPoint2 = NetworkQualityModuleEntryPoint.this;
                    synchronized (networkQualityModuleEntryPoint2) {
                        NetworkQualityConfigWrapper featuresConfig = config.getFeaturesConfig();
                        if (featuresConfig != null && nVar != null) {
                            nVar.a(featuresConfig);
                        }
                    }
                }
            };
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<NetworkQualityConfigWrapper> getRemoteConfigExtensionConfiguration() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<NetworkQualityConfigWrapper> initialConfig) {
        synchronized (this) {
            try {
                if (this.d == null) {
                    n nVar = new n(serviceContext, new r(serviceContext, new q(serviceContext.getNetworkContext().getExecutionPolicy())), new o(), Random.a);
                    NetworkQualityConfigWrapper featuresConfig = initialConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        nVar.a(featuresConfig);
                    }
                    this.d = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
