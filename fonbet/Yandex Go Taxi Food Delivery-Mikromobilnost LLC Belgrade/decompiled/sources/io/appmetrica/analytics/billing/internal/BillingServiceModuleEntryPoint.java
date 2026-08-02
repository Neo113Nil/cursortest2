package io.appmetrica.analytics.billing.internal;

import defpackage.gw00;
import io.appmetrica.analytics.billing.impl.A;
import io.appmetrica.analytics.billing.impl.B;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billing.impl.p;
import io.appmetrica.analytics.billing.impl.q;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/appmetrica/analytics/billing/internal/BillingServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/billing/internal/config/RemoteBillingConfig;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "billing_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BillingServiceModuleEntryPoint extends ModuleServiceEntryPoint<RemoteBillingConfig> {
    private m a;
    private final q b = new q(null, null, 3, null);
    private final p c = new p(null, 1, null);
    private final BillingServiceModuleEntryPoint$configUpdateListener$1 d = new RemoteConfigUpdateListener<RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<RemoteBillingConfig> config) {
            m mVar;
            mVar = BillingServiceModuleEntryPoint.this.a;
            if (mVar != null) {
                RemoteBillingConfig featuresConfig = config.getFeaturesConfig();
                mVar.a(featuresConfig != null ? new B(featuresConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String(), new A(featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String())) : null);
            }
        }
    };

    /* renamed from: e, reason: from kotlin metadata */
    private final String identifier = "billing";
    private final BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f = new RemoteConfigExtensionConfiguration<RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return gw00.e(new Pair("aic", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return EmptyList.a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<RemoteBillingConfig> getJsonParser() {
            q qVar;
            qVar = BillingServiceModuleEntryPoint.this.b;
            return qVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<RemoteBillingConfig, byte[]> getProtobufConverter() {
            p pVar;
            pVar = BillingServiceModuleEntryPoint.this.c;
            return pVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        /* renamed from: getRemoteConfigUpdateListener */
        public RemoteConfigUpdateListener<RemoteBillingConfig> getRemoteConfigUpdateListener2() {
            BillingServiceModuleEntryPoint$configUpdateListener$1 billingServiceModuleEntryPoint$configUpdateListener$1;
            billingServiceModuleEntryPoint$configUpdateListener$1 = BillingServiceModuleEntryPoint.this.d;
            return billingServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<RemoteBillingConfig> getRemoteConfigExtensionConfiguration() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<RemoteBillingConfig> initialConfig) {
        RemoteBillingConfig featuresConfig = initialConfig.getFeaturesConfig();
        m mVar = new m(serviceContext, featuresConfig != null ? new B(featuresConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String(), new A(featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String())) : null);
        serviceContext.getServiceModuleReporterComponentLifecycle().subscribe(mVar);
        this.a = mVar;
    }
}
