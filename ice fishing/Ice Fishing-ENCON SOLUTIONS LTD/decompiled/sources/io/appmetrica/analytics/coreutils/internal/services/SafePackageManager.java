package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import h1.C0239i;
import io.appmetrica.analytics.coreutils.impl.c;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class SafePackageManager {
    private static Object a(Boolean bool, InterfaceC1046a interfaceC1046a) {
        try {
            Object invoke = interfaceC1046a.invoke();
            return invoke == null ? bool : invoke;
        } catch (Throwable unused) {
            return bool;
        }
    }

    public final ActivityInfo getActivityInfo(Context context, ComponentName componentName, int i2) {
        return (ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i2));
    }

    public final ApplicationInfo getApplicationInfo(Context context, String str, int i2) {
        return (ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i2));
    }

    public final Bundle getApplicationMetaData(Context context) {
        return (Bundle) a(null, new c(this, context));
    }

    public final String getInstallerPackageName(Context context, String str) {
        return (String) a(null, new d(context, str));
    }

    public final PackageInfo getPackageInfo(Context context, String str) {
        return getPackageInfo(context, str, 0);
    }

    public final ServiceInfo getServiceInfo(Context context, ComponentName componentName, int i2) {
        return (ServiceInfo) a(null, new f(context, componentName, i2));
    }

    public final boolean hasSystemFeature(Context context, String str) {
        return ((Boolean) a(Boolean.FALSE, new g(context, str))).booleanValue();
    }

    public final ResolveInfo resolveActivity(Context context, Intent intent, int i2) {
        return (ResolveInfo) a(null, new h(context, intent, i2));
    }

    public final ProviderInfo resolveContentProvider(Context context, String str) {
        return (ProviderInfo) a(null, new i(context, str));
    }

    public final ResolveInfo resolveService(Context context, Intent intent, int i2) {
        return (ResolveInfo) a(null, new j(context, intent, i2));
    }

    public final C0239i setComponentEnabledSetting(Context context, ComponentName componentName, int i2, int i3) {
        return (C0239i) a(null, new k(context, componentName, i2, i3));
    }

    public final PackageInfo getPackageInfo(Context context, String str, int i2) {
        return (PackageInfo) a(null, new e(context, str, i2));
    }
}
