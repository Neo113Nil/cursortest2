package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C0942h;
import io.appmetrica.analytics.screenshot.impl.C0946l;
import io.appmetrica.analytics.screenshot.impl.C0947m;
import io.appmetrica.analytics.screenshot.impl.C0956w;
import io.appmetrica.analytics.screenshot.impl.C0957x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* renamed from: a, reason: collision with root package name */
    private C0946l f7685a;

    /* renamed from: d, reason: collision with root package name */
    private V f7688d;

    /* renamed from: b, reason: collision with root package name */
    private final C0942h f7686b = new C0942h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f7687c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C0946l c0946l;
            V v2;
            V v3;
            C0946l c0946l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b2 = featuresConfig.b();
                        F a2 = featuresConfig.a();
                        c0946l = new C0946l(b2, a2 != null ? new C0947m(a2) : null);
                    } else {
                        c0946l = null;
                    }
                    screenshotClientModuleEntryPoint.f7685a = c0946l;
                    v2 = screenshotClientModuleEntryPoint.f7688d;
                    if (v2 != null) {
                        v3 = screenshotClientModuleEntryPoint.f7688d;
                        if (v3 == null) {
                            i.i("screenshotCaptorsController");
                            throw null;
                        }
                        c0946l2 = screenshotClientModuleEntryPoint.f7685a;
                        v3.a(c0946l2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f7689e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f7690f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            C0942h c0942h;
            c0942h = ScreenshotClientModuleEntryPoint.this.f7686b;
            return c0942h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f7687c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f7689e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f7690f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C0957x c0957x = new C0957x(clientContext);
                this.f7688d = new V(AndroidUtils.isApiAchieved(34) ? new C0956w(clientContext, c0957x) : new I(clientContext, c0957x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v2 = this.f7688d;
                if (v2 != null) {
                    C0946l c0946l = this.f7685a;
                    Iterator it = v2.f7614a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v2.a(c0946l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
