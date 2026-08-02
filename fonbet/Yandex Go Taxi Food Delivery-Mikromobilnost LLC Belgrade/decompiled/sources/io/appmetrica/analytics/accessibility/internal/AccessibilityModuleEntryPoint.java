package io.appmetrica.analytics.accessibility.internal;

import defpackage.gw00;
import io.appmetrica.analytics.accessibility.impl.a;
import io.appmetrica.analytics.accessibility.impl.c;
import io.appmetrica.analytics.accessibility.impl.f;
import io.appmetrica.analytics.accessibility.impl.k;
import io.appmetrica.analytics.accessibility.internal.config.AccessibilityConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lio/appmetrica/analytics/accessibility/internal/AccessibilityModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/accessibility/internal/config/AccessibilityConfig;", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", ConfigConstants.CONFIG, "onRemoteConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "d", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "getModuleEventServiceHandlerFactory", "()Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "moduleEventServiceHandlerFactory", "accessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class AccessibilityModuleEntryPoint extends ModuleServiceEntryPoint<AccessibilityConfig> implements RemoteConfigUpdateListener<AccessibilityConfig> {
    private f b;

    /* renamed from: a, reason: from kotlin metadata */
    private final String identifier = "accessibility";
    private final k c = new k();
    private final AccessibilityModuleEntryPoint$moduleEventServiceHandlerFactory$1 d = new ModuleEventServiceHandlerFactory() { // from class: io.appmetrica.analytics.accessibility.internal.AccessibilityModuleEntryPoint$moduleEventServiceHandlerFactory$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory
        public ModuleServiceEventHandler createEventHandler(String tag) {
            k kVar;
            kVar = AccessibilityModuleEntryPoint.this.c;
            return kVar;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<AccessibilityConfig> getRemoteConfigExtensionConfiguration() {
        return new RemoteConfigExtensionConfiguration<AccessibilityConfig>() { // from class: io.appmetrica.analytics.accessibility.internal.AccessibilityModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return gw00.e(new Pair("ai", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return Collections.singletonList("ai");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<AccessibilityConfig> getJsonParser() {
                return new a();
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<AccessibilityConfig, byte[]> getProtobufConverter() {
                return new c();
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            /* renamed from: getRemoteConfigUpdateListener */
            public RemoteConfigUpdateListener<AccessibilityConfig> getRemoteConfigUpdateListener2() {
                return AccessibilityModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public synchronized void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<AccessibilityConfig> initialConfig) {
        if (this.b == null) {
            f fVar = new f(serviceContext, initialConfig.getFeaturesConfig());
            this.b = fVar;
            this.c.a = fVar;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<AccessibilityConfig> config) {
        f fVar;
        AccessibilityConfig featuresConfig = config.getFeaturesConfig();
        if (featuresConfig != null && (fVar = this.b) != null) {
            fVar.g = featuresConfig;
        }
    }
}
