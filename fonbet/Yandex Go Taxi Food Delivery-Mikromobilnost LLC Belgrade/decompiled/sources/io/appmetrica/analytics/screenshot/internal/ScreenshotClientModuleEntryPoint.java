package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.C1102g;
import io.appmetrica.analytics.screenshot.impl.C1106k;
import io.appmetrica.analytics.screenshot.impl.C1114t;
import io.appmetrica.analytics.screenshot.impl.C1115u;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.v;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/internal/ClientSideScreenshotConfigWrapper;", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "Lzy11;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "onActivated", "", "e", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "f", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<ClientSideScreenshotConfigWrapper> {
    private C1106k a;
    private D d;
    private final C1102g b = new C1102g();
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 c = new ServiceConfigUpdateListener<ClientSideScreenshotConfigWrapper>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<ClientSideScreenshotConfigWrapper> config) {
            D d;
            D d2;
            C1106k c1106k;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    ClientSideScreenshotConfigWrapper featuresConfig = config.getFeaturesConfig();
                    screenshotClientModuleEntryPoint.a = featuresConfig != null ? featuresConfig.getRu.cprocsp.ACSP.tools.config.ConfigConstants.CONFIG java.lang.String() : null;
                    d = screenshotClientModuleEntryPoint.d;
                    if (d != null) {
                        d2 = screenshotClientModuleEntryPoint.d;
                        if (d2 == null) {
                            d2 = null;
                        }
                        c1106k = screenshotClientModuleEntryPoint.a;
                        Iterator it = d2.a.iterator();
                        while (it.hasNext()) {
                            ((B) it.next()).a((c1106k == null || !c1106k.a) ? null : c1106k);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: from kotlin metadata */
    private final String identifier = "screenshot";
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f = new ServiceConfigExtensionConfiguration<ClientSideScreenshotConfigWrapper>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        /* renamed from: getBundleConverter, reason: avoid collision after fix types in other method */
        public BundleToServiceConfigConverter<ClientSideScreenshotConfigWrapper> getBundleConverter2() {
            C1102g c1102g;
            c1102g = ScreenshotClientModuleEntryPoint.this.b;
            return c1102g;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        /* renamed from: getServiceConfigUpdateListener, reason: avoid collision after fix types in other method */
        public ServiceConfigUpdateListener<ClientSideScreenshotConfigWrapper> getServiceConfigUpdateListener2() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<ClientSideScreenshotConfigWrapper> getServiceConfigExtensionConfiguration() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C1115u c1115u = new C1115u(clientContext);
                this.d = new D(AndroidUtils.isApiAchieved(34) ? new C1114t(clientContext, c1115u) : new v(clientContext, c1115u));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                D d = this.d;
                if (d != null) {
                    C1106k c1106k = this.a;
                    Iterator it = d.a.iterator();
                    while (it.hasNext()) {
                        ((B) it.next()).a();
                    }
                    Iterator it2 = d.a.iterator();
                    while (it2.hasNext()) {
                        ((B) it2.next()).a((c1106k == null || !c1106k.a) ? null : c1106k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
