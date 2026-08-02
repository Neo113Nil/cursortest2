package io.appmetrica.analytics.screenshot.internal;

import android.os.Bundle;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.gw00;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.screenshot.impl.N;
import io.appmetrica.analytics.screenshot.impl.O;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.Q;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.U;
import io.appmetrica.analytics.screenshot.internal.ServiceSideScreenshotConfigWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotServiceModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/screenshot/internal/ServiceSideScreenshotConfigWrapper;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lzy11;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "f", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "g", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "h", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "getClientConfigProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "clientConfigProvider", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ScreenshotServiceModuleEntryPoint extends ModuleServiceEntryPoint<ServiceSideScreenshotConfigWrapper> {
    private P a;
    private final T b = new T();
    private final S c = new S(null, 1, null);
    private final Q d = new Q(null, 1, null);
    private final ScreenshotServiceModuleEntryPoint$configUpdateListener$1 e = new RemoteConfigUpdateListener<ServiceSideScreenshotConfigWrapper>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<ServiceSideScreenshotConfigWrapper> config) {
            ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = ScreenshotServiceModuleEntryPoint.this;
            ServiceSideScreenshotConfigWrapper featuresConfig = config.getFeaturesConfig();
            screenshotServiceModuleEntryPoint.a = featuresConfig != null ? featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String() : null;
        }
    };

    /* renamed from: f, reason: from kotlin metadata */
    private final String identifier = "screenshot";
    private final ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 g = new RemoteConfigExtensionConfiguration<ServiceSideScreenshotConfigWrapper>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return gw00.e(new Pair("scr", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return Collections.singletonList("scr");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<ServiceSideScreenshotConfigWrapper> getJsonParser() {
            S s;
            s = ScreenshotServiceModuleEntryPoint.this.c;
            return s;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<ServiceSideScreenshotConfigWrapper, byte[]> getProtobufConverter() {
            final ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = ScreenshotServiceModuleEntryPoint.this;
            return new Converter<ServiceSideScreenshotConfigWrapper, byte[]>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1$getProtobufConverter$1
                @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
                public byte[] fromModel(ServiceSideScreenshotConfigWrapper value) {
                    Q q;
                    q = ScreenshotServiceModuleEntryPoint.this.d;
                    return MessageNano.toByteArray(q.a.fromModel(value.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String()));
                }

                @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
                public ServiceSideScreenshotConfigWrapper toModel(byte[] value) {
                    Q q;
                    ServiceSideScreenshotConfigWrapper.Companion companion = ServiceSideScreenshotConfigWrapper.INSTANCE;
                    q = ScreenshotServiceModuleEntryPoint.this.d;
                    return companion.toWrapper$screenshot_release(q.toModel(value));
                }
            };
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        /* renamed from: getRemoteConfigUpdateListener */
        public RemoteConfigUpdateListener<ServiceSideScreenshotConfigWrapper> getRemoteConfigUpdateListener2() {
            ScreenshotServiceModuleEntryPoint$configUpdateListener$1 screenshotServiceModuleEntryPoint$configUpdateListener$1;
            screenshotServiceModuleEntryPoint$configUpdateListener$1 = ScreenshotServiceModuleEntryPoint.this.e;
            return screenshotServiceModuleEntryPoint$configUpdateListener$1;
        }
    };
    private final ScreenshotServiceModuleEntryPoint$clientConfigProvider$1 h = new ClientConfigProvider() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        public Bundle getConfigBundleForClient() {
            T t;
            P p;
            t = ScreenshotServiceModuleEntryPoint.this.b;
            p = ScreenshotServiceModuleEntryPoint.this.a;
            t.getClass();
            if (p == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean(BackendConfig.Restrictions.ENABLED, p.a);
            N n = p.b;
            if (n != null) {
                bundle.putBoolean("api_captor_enabled", n.a);
            }
            U u = p.c;
            if (u != null) {
                bundle.putBoolean("service_captor_enabled", u.a);
                bundle.putLong("service_captor_delay_seconds", u.b);
            }
            O o = p.d;
            if (o != null) {
                bundle.putBoolean("content_observer_enabled", o.a);
                bundle.putStringArrayList("content_observer_media_store_column_names", new ArrayList<>(o.b));
                bundle.putLong("content_observer_detect_window_seconds", o.c);
            }
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
    public RemoteConfigExtensionConfiguration<ServiceSideScreenshotConfigWrapper> getRemoteConfigExtensionConfiguration() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<ServiceSideScreenshotConfigWrapper> initialConfig) {
        ServiceSideScreenshotConfigWrapper featuresConfig = initialConfig.getFeaturesConfig();
        this.a = featuresConfig != null ? featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String() : null;
    }
}
