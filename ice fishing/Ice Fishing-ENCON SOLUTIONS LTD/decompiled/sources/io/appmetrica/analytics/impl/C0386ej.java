package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
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

/* renamed from: io.appmetrica.analytics.impl.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386ej implements SdkEnvironmentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5945a;

    /* renamed from: b, reason: collision with root package name */
    public final Ib f5946b = new Ib();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f5947c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public SdkEnvironment f5948d;

    /* renamed from: e, reason: collision with root package name */
    public String f5949e;

    public C0386ej(Context context) {
        this.f5945a = context;
        this.f5948d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("8.0.0", "50147728", AbstractC0412fj.a()), "phone", Ib.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(ScreenInfo screenInfo) {
        float f2;
        if (screenInfo != null) {
            try {
                if (!screenInfo.equals(getSdkEnvironment().getScreenInfo())) {
                    String str = this.f5949e;
                    if (str == null) {
                        Context context = this.f5945a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = N7.f4801a;
                        try {
                            f2 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f2 = 0.0f;
                        }
                        if (!Float.isNaN(f2) && f2 != 0.0f) {
                            int i2 = point.x;
                            int i3 = point.y;
                            if (N7.a(context)) {
                                str = "tv";
                            } else {
                                float f3 = 160 * f2;
                                float f4 = i2;
                                float f5 = f4 / f3;
                                float f6 = i3;
                                float f7 = f6 / f3;
                                double sqrt = Math.sqrt((f7 * f7) + (f5 * f5));
                                float f8 = f4 / f2;
                                float f9 = f6 / f2;
                                if (f8 > f9) {
                                    f8 = f9;
                                }
                                if (sqrt < 7 && f8 < 600) {
                                    str = "phone";
                                }
                                str = "tablet";
                            }
                        }
                        str = "phone";
                    }
                    this.f5948d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f5947c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0631o5) ((InterfaceC0361dj) it.next())).d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC0361dj interfaceC0361dj) {
        this.f5947c.remove(interfaceC0361dj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f5948d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        kotlin.jvm.internal.i.i("sdkEnvironment");
        throw null;
    }

    public final synchronized void a(String str) {
        if (str != null) {
            if (!str.equals(this.f5949e)) {
                this.f5949e = str;
                if (!str.equals(getSdkEnvironment().getDeviceType())) {
                    this.f5948d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f5947c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC0631o5) ((InterfaceC0361dj) it.next())).d();
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
        if (!kotlin.jvm.internal.i.a(appVersionInfo.getAppVersionName(), str) || !kotlin.jvm.internal.i.a(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f5948d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f5947c.iterator();
            while (it.hasNext()) {
                ((AbstractC0631o5) ((InterfaceC0361dj) it.next())).d();
            }
        }
    }

    public final synchronized void a(Configuration configuration) {
        this.f5946b.getClass();
        List a2 = Ib.a(configuration);
        if (!kotlin.jvm.internal.i.a(getSdkEnvironment().getLocales(), a2)) {
            this.f5948d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, a2, 31, null);
            Iterator it = this.f5947c.iterator();
            while (it.hasNext()) {
                ((AbstractC0631o5) ((InterfaceC0361dj) it.next())).d();
            }
        }
    }

    public final void a(InterfaceC0361dj interfaceC0361dj) {
        this.f5947c.add(interfaceC0361dj);
    }
}
