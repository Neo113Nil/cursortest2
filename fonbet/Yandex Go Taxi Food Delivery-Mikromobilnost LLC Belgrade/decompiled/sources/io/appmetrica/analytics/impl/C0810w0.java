package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import defpackage.d82;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0810w0 implements InterfaceC0216bc {
    public final Context a;
    public final IHandlerExecutor b;
    public final Y4 c = new Y4();
    public final Handler d = f().getHandler();
    public final E2 e = new E2();
    public final Zc f = new Zc();

    public C0810w0(Context context, L4 l4) {
        this.a = context;
        this.b = l4.a();
        BaseReleaseLogger.init(context);
        f().execute(new d82(9));
        c().a();
        AbstractC0872y4.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 8.2.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 14.05.2026.", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:20:0x0041, B:22:0x004e, B:24:0x0047, B:25:0x001d, B:27:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:20:0x0041, B:22:0x004e, B:24:0x0047, B:25:0x001d, B:27:0x002b), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(AppMetricaConfig appMetricaConfig, InterfaceC0677rc interfaceC0677rc) {
        try {
            if (!E0.g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.e.c();
                                if (appMetricaConfig != null) {
                                    E0.g = true;
                                }
                            }
                        }
                        this.e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f.b();
                this.f.a(this.a, interfaceC0677rc);
                if (appMetricaConfig != null) {
                    this.f.a(this.a, appMetricaConfig, interfaceC0677rc);
                }
                if (appMetricaConfig != null) {
                }
                this.e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Zc b() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Y4 c() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Handler d() {
        return this.d;
    }

    public final IHandlerExecutor f() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final E2 a() {
        return this.e;
    }
}
