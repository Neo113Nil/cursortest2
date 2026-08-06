package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f4014a;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f4016c;

    /* renamed from: d, reason: collision with root package name */
    public final n f4017d;

    /* renamed from: e, reason: collision with root package name */
    public volatile IdSyncConfig f4018e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f4019f;

    /* renamed from: b, reason: collision with root package name */
    public final long f4015b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public final C0261f f4020g = new C0261f(this);

    public h(ServiceContext serviceContext, SdkIdentifiers sdkIdentifiers) {
        this.f4014a = serviceContext;
        this.f4016c = serviceContext.getExecutorProvider().getModuleExecutor();
        this.f4017d = new n(serviceContext, new G(serviceContext.getServiceStorageProvider().modulePreferences("id-sync")), sdkIdentifiers);
    }

    public final synchronized void a(IdSyncConfig idSyncConfig, SdkIdentifiers sdkIdentifiers) {
        try {
            this.f4017d.f4046c = sdkIdentifiers;
            if (!kotlin.jvm.internal.i.a(this.f4018e, idSyncConfig)) {
                this.f4018e = idSyncConfig;
                if (a(idSyncConfig) && !this.f4019f) {
                    this.f4014a.getActivationBarrier().subscribe(idSyncConfig.getLaunchDelay(), this.f4016c, new C0262g(this));
                    this.f4019f = true;
                } else if (!a(idSyncConfig) && this.f4019f) {
                    this.f4019f = false;
                    IHandlerExecutor iHandlerExecutor = this.f4016c;
                    C0261f c0261f = this.f4020g;
                    if (c0261f == null) {
                        kotlin.jvm.internal.i.i("syncRunnable");
                        throw null;
                    }
                    iHandlerExecutor.remove(c0261f);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean a(IdSyncConfig idSyncConfig) {
        idSyncConfig.getEnabled();
        return idSyncConfig.getEnabled() && !idSyncConfig.getRequests().isEmpty();
    }
}
