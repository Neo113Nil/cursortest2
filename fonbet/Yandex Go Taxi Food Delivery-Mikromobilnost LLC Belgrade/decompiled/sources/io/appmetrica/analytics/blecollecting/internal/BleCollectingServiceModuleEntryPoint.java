package io.appmetrica.analytics.blecollecting.internal;

import android.content.Context;
import defpackage.gw00;
import io.appmetrica.analytics.blecollecting.impl.C0152g;
import io.appmetrica.analytics.blecollecting.impl.C0153h;
import io.appmetrica.analytics.blecollecting.impl.C0157l;
import io.appmetrica.analytics.blecollecting.impl.C0158m;
import io.appmetrica.analytics.blecollecting.impl.C0161p;
import io.appmetrica.analytics.blecollecting.impl.C0165u;
import io.appmetrica.analytics.blecollecting.impl.C0166v;
import io.appmetrica.analytics.blecollecting.internal.config.RemoteBleCollectingConfig;
import io.appmetrica.analytics.blewrapper.internal.BleScanner;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/appmetrica/analytics/blecollecting/internal/BleCollectingServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/blecollecting/internal/config/RemoteBleCollectingConfig;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "f", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "g", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "h", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "getModuleEventServiceHandlerFactory", "()Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "moduleEventServiceHandlerFactory", "ble-collecting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class BleCollectingServiceModuleEntryPoint extends ModuleServiceEntryPoint<RemoteBleCollectingConfig> {
    private volatile ServiceContext a;
    private volatile C0158m b;
    private final C0166v c = new C0166v(null, null, 3, null);
    private final C0165u d = new C0165u(null, 1, null);
    private final BleCollectingServiceModuleEntryPoint$configUpdateListener$1 e = new RemoteConfigUpdateListener<RemoteBleCollectingConfig>() { // from class: io.appmetrica.analytics.blecollecting.internal.BleCollectingServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<RemoteBleCollectingConfig> config) {
            C0158m c0158m;
            c0158m = BleCollectingServiceModuleEntryPoint.this.b;
            if (c0158m != null) {
                c0158m.a(config.getFeaturesConfig());
            }
        }
    };

    /* renamed from: f, reason: from kotlin metadata */
    private final String identifier = "bleCollecting";
    private final BleCollectingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 g = new RemoteConfigExtensionConfiguration<RemoteBleCollectingConfig>() { // from class: io.appmetrica.analytics.blecollecting.internal.BleCollectingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return gw00.e(new Pair("bbc", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return Collections.singletonList("bbc");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<RemoteBleCollectingConfig> getJsonParser() {
            C0166v c0166v;
            c0166v = BleCollectingServiceModuleEntryPoint.this.c;
            return c0166v;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<RemoteBleCollectingConfig, byte[]> getProtobufConverter() {
            C0165u c0165u;
            c0165u = BleCollectingServiceModuleEntryPoint.this.d;
            return c0165u;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        /* renamed from: getRemoteConfigUpdateListener */
        public RemoteConfigUpdateListener<RemoteBleCollectingConfig> getRemoteConfigUpdateListener2() {
            BleCollectingServiceModuleEntryPoint$configUpdateListener$1 bleCollectingServiceModuleEntryPoint$configUpdateListener$1;
            bleCollectingServiceModuleEntryPoint$configUpdateListener$1 = BleCollectingServiceModuleEntryPoint.this.e;
            return bleCollectingServiceModuleEntryPoint$configUpdateListener$1;
        }
    };
    private final BleCollectingServiceModuleEntryPoint$moduleEventServiceHandlerFactory$1 h = new ModuleEventServiceHandlerFactory() { // from class: io.appmetrica.analytics.blecollecting.internal.BleCollectingServiceModuleEntryPoint$moduleEventServiceHandlerFactory$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory
        public ModuleServiceEventHandler createEventHandler(String tag) {
            ServiceContext serviceContext;
            serviceContext = BleCollectingServiceModuleEntryPoint.this.a;
            return new C0152g(serviceContext, tag, null, 4, null);
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return this.h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<RemoteBleCollectingConfig> getRemoteConfigExtensionConfiguration() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<RemoteBleCollectingConfig> initialConfig) {
        if (AndroidUtils.isApiAchieved(26)) {
            if (this.a == null) {
                this.a = serviceContext;
            }
            if (this.b == null) {
                new C0161p(serviceContext.getContext()).a();
                Context context = serviceContext.getContext();
                this.b = new C0158m(context, new BleScanner(context), new C0157l(serviceContext.getContext(), new C0153h()), new C0165u(null, 1, null));
                C0158m c0158m = this.b;
                if (c0158m != null) {
                    c0158m.a(initialConfig.getFeaturesConfig());
                }
            }
        }
    }
}
