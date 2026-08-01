package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2994bp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29330a;

    /* renamed from: b, reason: collision with root package name */
    public C3918t f29331b;

    public C2994bp(Context context) {
        this.f29330a = context;
    }

    public final void a(C3657o7 c3657o7) {
        ServiceInfo serviceInfo;
        C3918t c3918t = this.f29331b;
        if (c3918t.a()) {
            AbstractC3043cl.n("Service connection is valid. No need to re-initialize.");
            c3657o7.h(0);
            return;
        }
        int i = c3918t.f34177n;
        if (i == 1) {
            AbstractC3043cl.v("Client is already in the process of connecting to the service.");
            c3657o7.h(3);
            return;
        }
        if (i == 3) {
            AbstractC3043cl.v("Client was already closed and can't be reused. Please create another instance.");
            c3657o7.h(3);
            return;
        }
        AbstractC3043cl.n("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = (Context) c3918t.f34178u;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            c3918t.f34177n = 0;
            AbstractC3043cl.n("Install Referrer service unavailable on device.");
            c3657o7.h(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    O4 o42 = new O4(c3918t, c3657o7);
                    c3918t.f34181x = o42;
                    try {
                        if (context.bindService(intent2, o42, 1)) {
                            AbstractC3043cl.n("Service was bonded successfully.");
                            return;
                        }
                        AbstractC3043cl.v("Connection to service is blocked.");
                        c3918t.f34177n = 0;
                        c3657o7.h(1);
                        return;
                    } catch (SecurityException unused) {
                        AbstractC3043cl.v("No permission to connect to service.");
                        c3918t.f34177n = 0;
                        c3657o7.h(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        AbstractC3043cl.v("Play Store missing or incompatible. Version 8.3.73 or later required.");
        c3918t.f34177n = 0;
        c3657o7.h(2);
    }
}
