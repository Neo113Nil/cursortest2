package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import defpackage.jl40;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0745tm implements SdkEnvironmentProvider {
    public final Context a;
    public final C0881yd b = new C0881yd();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public SdkEnvironment d;
    public String e;

    public C0745tm(Context context) {
        this.a = context;
        this.d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("8.2.0", BuildConfig.BUILD_NUMBER, AbstractC0774um.a()), "phone", C0881yd.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.e;
                    if (str == null) {
                        Context context = this.a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = L8.a;
                        try {
                            f = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f = 0.0f;
                        }
                        if (!Float.isNaN(f) && f != 0.0f) {
                            int i = point.x;
                            int i2 = point.y;
                            if (L8.a(context)) {
                                str = "tv";
                            } else {
                                float f2 = 160.0f * f;
                                float f3 = i;
                                float f4 = f3 / f2;
                                float f5 = i2;
                                float f6 = f5 / f2;
                                double sqrt = Math.sqrt((f6 * f6) + (f4 * f4));
                                float f7 = f3 / f;
                                float f8 = f5 / f;
                                if (f7 > f8) {
                                    f7 = f8;
                                }
                                if (sqrt < 7.0d && f7 < 600.0f) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0440j6) ((InterfaceC0716sm) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC0716sm interfaceC0716sm) {
        this.c.remove(interfaceC0716sm);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        return null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.e)) {
                this.e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0440j6) ((InterfaceC0716sm) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!jl40.l(appVersionInfo.getAppVersionName(), str) || !jl40.l(appVersionInfo.getAppBuildNumber(), str2)) {
            this.d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((AbstractC0440j6) ((InterfaceC0716sm) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.b.getClass();
        List a = C0881yd.a(configuration);
        if (!jl40.l(getSdkEnvironment().getLocales(), a)) {
            this.d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a, 31, null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((AbstractC0440j6) ((InterfaceC0716sm) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC0716sm interfaceC0716sm) {
        this.c.add(interfaceC0716sm);
    }
}
