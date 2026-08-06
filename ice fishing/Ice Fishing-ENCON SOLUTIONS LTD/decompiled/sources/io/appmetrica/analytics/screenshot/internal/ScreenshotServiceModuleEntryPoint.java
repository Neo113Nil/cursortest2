package io.appmetrica.analytics.screenshot.internal;

import a.AbstractC0083a;
import android.os.Bundle;
import h1.C0234d;
import i1.v;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.J;
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.j0;
import io.appmetrica.analytics.screenshot.impl.m0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ScreenshotServiceModuleEntryPoint extends ModuleServiceEntryPoint<J> {

    /* renamed from: a, reason: collision with root package name */
    private j0 f7693a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f7694b = new m0();

    /* renamed from: c, reason: collision with root package name */
    private final L f7695c = new L(null, null, 3, null);

    /* renamed from: d, reason: collision with root package name */
    private final K f7696d = new K(null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$configUpdateListener$1 f7697e = new RemoteConfigUpdateListener<J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<J> moduleRemoteConfig) {
            ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = ScreenshotServiceModuleEntryPoint.this;
            J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
            screenshotServiceModuleEntryPoint.f7693a = featuresConfig != null ? new j0(featuresConfig) : null;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private final String f7698f = "screenshot";

    /* renamed from: g, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f7699g = new RemoteConfigExtensionConfiguration<J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return v.H(new C0234d("scr", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return AbstractC0083a.m("scr");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<J> getJsonParser() {
            L l2;
            l2 = ScreenshotServiceModuleEntryPoint.this.f7695c;
            return l2;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<J, byte[]> getProtobufConverter() {
            K k2;
            k2 = ScreenshotServiceModuleEntryPoint.this.f7696d;
            return k2;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<J> getRemoteConfigUpdateListener() {
            ScreenshotServiceModuleEntryPoint$configUpdateListener$1 screenshotServiceModuleEntryPoint$configUpdateListener$1;
            screenshotServiceModuleEntryPoint$configUpdateListener$1 = ScreenshotServiceModuleEntryPoint.this.f7697e;
            return screenshotServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$clientConfigProvider$1 f7700h = new ClientConfigProvider() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        public Bundle getConfigBundleForClient() {
            m0 m0Var;
            j0 j0Var;
            m0Var = ScreenshotServiceModuleEntryPoint.this.f7694b;
            j0Var = ScreenshotServiceModuleEntryPoint.this.f7693a;
            m0Var.getClass();
            if (j0Var == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("config", new D(j0Var));
            return bundle;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ClientConfigProvider getClientConfigProvider() {
        return this.f7700h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f7698f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<J> getRemoteConfigExtensionConfiguration() {
        return this.f7699g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<J> moduleRemoteConfig) {
        J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        this.f7693a = featuresConfig != null ? new j0(featuresConfig) : null;
    }
}
