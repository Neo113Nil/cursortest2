package io.appmetrica.analytics.adrevenue.other.internal;

import android.os.Bundle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.scc;
import io.appmetrica.analytics.adrevenue.other.impl.j;
import io.appmetrica.analytics.adrevenue.other.impl.k;
import io.appmetrica.analytics.adrevenue.other.impl.l;
import io.appmetrica.analytics.adrevenue.other.impl.m;
import io.appmetrica.analytics.adrevenue.other.internal.ServiceSideAdRevenueOtherConfigWrapper;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/appmetrica/analytics/adrevenue/other/internal/AdRevenueOtherServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/adrevenue/other/internal/ServiceSideAdRevenueOtherConfigWrapper;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "f", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "g", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "h", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "getClientConfigProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "clientConfigProvider", "ad-revenue-other_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class AdRevenueOtherServiceModuleEntryPoint extends ModuleServiceEntryPoint<ServiceSideAdRevenueOtherConfigWrapper> {
    private j a;
    private final m b = new m();
    private final l c = new l(null, 1, null);
    private final k d = new k(null, 1, null);
    private final AdRevenueOtherServiceModuleEntryPoint$configUpdateListener$1 e = new RemoteConfigUpdateListener<ServiceSideAdRevenueOtherConfigWrapper>() { // from class: io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<ServiceSideAdRevenueOtherConfigWrapper> config) {
            AdRevenueOtherServiceModuleEntryPoint adRevenueOtherServiceModuleEntryPoint = AdRevenueOtherServiceModuleEntryPoint.this;
            ServiceSideAdRevenueOtherConfigWrapper featuresConfig = config.getFeaturesConfig();
            adRevenueOtherServiceModuleEntryPoint.a = featuresConfig != null ? featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String() : null;
        }
    };

    /* renamed from: f, reason: from kotlin metadata */
    private final String identifier = "ad-revenue-other";
    private final AdRevenueOtherServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 g = new RemoteConfigExtensionConfiguration<ServiceSideAdRevenueOtherConfigWrapper>() { // from class: io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return b.f();
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return scc.g("aro", "arois");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<ServiceSideAdRevenueOtherConfigWrapper> getJsonParser() {
            l lVar;
            lVar = AdRevenueOtherServiceModuleEntryPoint.this.c;
            return lVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<ServiceSideAdRevenueOtherConfigWrapper, byte[]> getProtobufConverter() {
            final AdRevenueOtherServiceModuleEntryPoint adRevenueOtherServiceModuleEntryPoint = AdRevenueOtherServiceModuleEntryPoint.this;
            return new Converter<ServiceSideAdRevenueOtherConfigWrapper, byte[]>() { // from class: io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1$getProtobufConverter$1
                @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
                public byte[] fromModel(ServiceSideAdRevenueOtherConfigWrapper value) {
                    k kVar;
                    kVar = AdRevenueOtherServiceModuleEntryPoint.this.d;
                    return MessageNano.toByteArray(kVar.a.fromModel(value.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String()));
                }

                @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
                public ServiceSideAdRevenueOtherConfigWrapper toModel(byte[] value) {
                    k kVar;
                    ServiceSideAdRevenueOtherConfigWrapper.Companion companion = ServiceSideAdRevenueOtherConfigWrapper.INSTANCE;
                    kVar = AdRevenueOtherServiceModuleEntryPoint.this.d;
                    return companion.toWrapper$ad_revenue_other_release(kVar.toModel(value));
                }
            };
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        /* renamed from: getRemoteConfigUpdateListener, reason: merged with bridge method [inline-methods] */
        public RemoteConfigUpdateListener<ServiceSideAdRevenueOtherConfigWrapper> getRemoteConfigUpdateListener2() {
            AdRevenueOtherServiceModuleEntryPoint$configUpdateListener$1 adRevenueOtherServiceModuleEntryPoint$configUpdateListener$1;
            adRevenueOtherServiceModuleEntryPoint$configUpdateListener$1 = AdRevenueOtherServiceModuleEntryPoint.this.e;
            return adRevenueOtherServiceModuleEntryPoint$configUpdateListener$1;
        }
    };
    private final AdRevenueOtherServiceModuleEntryPoint$clientConfigProvider$1 h = new ClientConfigProvider() { // from class: io.appmetrica.analytics.adrevenue.other.internal.AdRevenueOtherServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        public Bundle getConfigBundleForClient() {
            m mVar;
            j jVar;
            mVar = AdRevenueOtherServiceModuleEntryPoint.this.b;
            jVar = AdRevenueOtherServiceModuleEntryPoint.this.a;
            mVar.getClass();
            if (jVar == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(BackendConfig.Restrictions.ENABLED, jVar.a);
            bundle.putBoolean("include_source", jVar.b);
            return bundle;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ClientConfigProvider getClientConfigProvider() {
        return this.h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<ServiceSideAdRevenueOtherConfigWrapper> getRemoteConfigExtensionConfiguration() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<ServiceSideAdRevenueOtherConfigWrapper> initialConfig) {
        ServiceSideAdRevenueOtherConfigWrapper featuresConfig = initialConfig.getFeaturesConfig();
        this.a = featuresConfig != null ? featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String() : null;
    }
}
