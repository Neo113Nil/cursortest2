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
public final class C3017bp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30118a;

    /* renamed from: b, reason: collision with root package name */
    public C3941t f30119b;

    public C3017bp(Context context) {
        this.f30118a = context;
    }

    public final void a(C3680o7 c3680o7) {
        ServiceInfo serviceInfo;
        C3941t c3941t = this.f30119b;
        if (c3941t.a()) {
            AbstractC3066cl.n("Service connection is valid. No need to re-initialize.");
            c3680o7.l(0);
            return;
        }
        int i = c3941t.f34963n;
        if (i == 1) {
            AbstractC3066cl.v("Client is already in the process of connecting to the service.");
            c3680o7.l(3);
            return;
        }
        if (i == 3) {
            AbstractC3066cl.v("Client was already closed and can't be reused. Please create another instance.");
            c3680o7.l(3);
            return;
        }
        AbstractC3066cl.n("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = (Context) c3941t.f34964u;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            c3941t.f34963n = 0;
            AbstractC3066cl.n("Install Referrer service unavailable on device.");
            c3680o7.l(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    O4 o4 = new O4(c3941t, c3680o7);
                    c3941t.f34967x = o4;
                    try {
                        if (context.bindService(intent2, o4, 1)) {
                            AbstractC3066cl.n("Service was bonded successfully.");
                            return;
                        }
                        AbstractC3066cl.v("Connection to service is blocked.");
                        c3941t.f34963n = 0;
                        c3680o7.l(1);
                        return;
                    } catch (SecurityException unused) {
                        AbstractC3066cl.v("No permission to connect to service.");
                        c3941t.f34963n = 0;
                        c3680o7.l(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        AbstractC3066cl.v("Play Store missing or incompatible. Version 8.3.73 or later required.");
        c3941t.f34963n = 0;
        c3680o7.l(2);
    }
}
