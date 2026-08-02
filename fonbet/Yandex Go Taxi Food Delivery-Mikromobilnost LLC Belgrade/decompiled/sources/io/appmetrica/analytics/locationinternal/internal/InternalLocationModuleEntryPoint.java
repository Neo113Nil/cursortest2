package io.appmetrica.analytics.locationinternal.internal;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.locationinternal.impl.C0950g1;
import io.appmetrica.analytics.locationinternal.impl.C0988t1;
import io.appmetrica.analytics.locationinternal.impl.G1;
import io.appmetrica.analytics.locationinternal.impl.J1;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/appmetrica/analytics/locationinternal/internal/InternalLocationModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/locationinternal/internal/config/LocationConfig;", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", ConfigConstants.CONFIG, "Lzy11;", "onRemoteConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "initialConfig", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "b", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "c", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "d", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "getModuleEventServiceHandlerFactory", "()Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "moduleEventServiceHandlerFactory", "Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "e", "Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "getLocationServiceExtension", "()Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "locationServiceExtension", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "f", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "getModuleServicesDatabase", "()Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "moduleServicesDatabase", "location-yandex_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class InternalLocationModuleEntryPoint extends ModuleServiceEntryPoint<LocationConfig> implements RemoteConfigUpdateListener<LocationConfig> {
    private volatile G1 a;

    /* renamed from: b, reason: from kotlin metadata */
    private final String identifier = "int-loc";
    private final C0988t1 c = new C0988t1(this);
    private final InternalLocationModuleEntryPoint$moduleEventServiceHandlerFactory$1 d = new ModuleEventServiceHandlerFactory() { // from class: io.appmetrica.analytics.locationinternal.internal.InternalLocationModuleEntryPoint$moduleEventServiceHandlerFactory$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory
        public ModuleServiceEventHandler createEventHandler(String tag) {
            G1 g1;
            C0950g1 a;
            InternalLocationModuleEntryPoint internalLocationModuleEntryPoint = InternalLocationModuleEntryPoint.this;
            synchronized (internalLocationModuleEntryPoint) {
                g1 = internalLocationModuleEntryPoint.a;
                if (g1 == null) {
                    g1 = null;
                }
                a = g1.a(tag);
            }
            return a;
        }
    };
    private final InternalLocationModuleEntryPoint$locationServiceExtension$1 e = new LocationServiceExtension() { // from class: io.appmetrica.analytics.locationinternal.internal.InternalLocationModuleEntryPoint$locationServiceExtension$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension
        public Consumer<Location> getLocationConsumer() {
            G1 g1;
            g1 = InternalLocationModuleEntryPoint.this.a;
            if (g1 == null) {
                g1 = null;
            }
            return g1.h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension
        public Toggle getLocationControllerAppStateToggle() {
            G1 g1;
            g1 = InternalLocationModuleEntryPoint.this.a;
            if (g1 == null) {
                g1 = null;
            }
            return g1.j;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension
        public ModuleLocationSourcesServiceController getLocationSourcesController() {
            G1 g1;
            g1 = InternalLocationModuleEntryPoint.this.a;
            if (g1 == null) {
                g1 = null;
            }
            return g1.k;
        }
    };
    private final J1 f = new J1();

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public LocationServiceExtension getLocationServiceExtension() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ModuleServicesDatabase getModuleServicesDatabase() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<LocationConfig> getRemoteConfigExtensionConfiguration() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public synchronized void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<LocationConfig> initialConfig) {
        this.a = new G1(getIdentifier(), serviceContext, initialConfig);
        G1 g1 = this.a;
        if (g1 == null) {
            g1 = null;
        }
        g1.e();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<LocationConfig> config) {
        if (this.a != null) {
            G1 g1 = this.a;
            if (g1 == null) {
                g1 = null;
            }
            g1.onRemoteConfigUpdated(config);
        }
    }
}
