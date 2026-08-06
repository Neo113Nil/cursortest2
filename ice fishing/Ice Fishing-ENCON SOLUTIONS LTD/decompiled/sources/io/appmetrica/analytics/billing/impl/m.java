package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f3562a;

    /* renamed from: b, reason: collision with root package name */
    public B f3563b;

    /* renamed from: c, reason: collision with root package name */
    public BillingMonitor f3564c;

    public m(ServiceContext serviceContext, B b2) {
        this.f3562a = serviceContext;
        this.f3563b = b2;
    }

    public final void a(B b2) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f3564c;
        if (billingMonitor != null) {
            if (b2 != null) {
                A a2 = b2.f3539b;
                billingConfig = new BillingConfig(a2.f3536a, a2.f3537b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f3563b = b2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        Field field;
        if (serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            Context context = this.f3562a.getContext();
            IHandlerExecutor defaultExecutor = this.f3562a.getExecutorProvider().getDefaultExecutor();
            Executor uiExecutor = this.f3562a.getExecutorProvider().getUiExecutor();
            try {
                Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
                str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
            } catch (Throwable unused) {
                str = null;
            }
            BillingType billingType = (str == null || z1.g.a0(str)) ? BillingType.NONE : z1.o.R(str, "2.", false) ? BillingType.NONE : z1.o.R(str, "3.", false) ? BillingType.NONE : z1.o.R(str, "4.", false) ? BillingType.NONE : z1.o.R(str, "5.", false) ? BillingType.LIBRARY_V6 : z1.o.R(str, "6.", false) ? BillingType.LIBRARY_V6 : z1.o.R(str, "7.", false) ? BillingType.LIBRARY_V6 : z1.o.R(str, "8.", false) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
            k kVar = new k(this.f3562a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C0255b(null, 1, null)).create(this.f3562a.getContext()));
            j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.f3562a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
            int i2 = l.f3561a[billingType.ordinal()];
            this.f3564c = i2 != 1 ? i2 != 2 ? new DummyBillingMonitor() : new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null) : new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
            a(this.f3563b);
            if (this.f3562a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: J0.a
                @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                public final void onApplicationStateChanged(ApplicationState applicationState) {
                    m.a(m.this, applicationState);
                }
            }) == ApplicationState.VISIBLE) {
                try {
                    BillingMonitor billingMonitor = this.f3564c;
                    if (billingMonitor != null) {
                        billingMonitor.onSessionResumed();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f3564c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
