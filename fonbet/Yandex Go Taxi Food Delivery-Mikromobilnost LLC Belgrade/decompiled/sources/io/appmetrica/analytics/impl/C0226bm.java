package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0226bm {
    public final Context a;

    public C0226bm(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Wi wi) {
        ComponentName componentName;
        List<ResolveInfo> queryIntentServices;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            Intent intent = new Intent("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
            intent.setPackage("ru.vk.store");
            queryIntentServices = this.a.getPackageManager().queryIntentServices(intent, 0);
        } catch (Throwable unused) {
        }
        if (queryIntentServices.isEmpty()) {
            componentName = null;
            int i = 2;
            if (componentName != null) {
                wi.a(new C0252cj("RuStore service component not found", th, i, objArr3 == true ? 1 : 0));
                return;
            }
            Intent intent2 = new Intent("ru.vk.store.sdk.install.referrer.InstallReferrerProvider");
            intent2.setComponent(componentName);
            try {
                if (this.a.bindService(intent2, new ServiceConnectionC0197am(this, wi), 1)) {
                    return;
                }
                wi.a(new C0252cj("bindService returned false for RuStore service: " + componentName, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0));
                return;
            } catch (Throwable th2) {
                wi.a(new C0252cj("Failed to bind RuStore service", th2));
                return;
            }
        }
        ServiceInfo serviceInfo = ((ResolveInfo) kotlin.collections.a.P(queryIntentServices)).serviceInfo;
        componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
        int i2 = 2;
        if (componentName != null) {
        }
    }

    public static final void a(C0226bm c0226bm, ServiceConnection serviceConnection) {
        c0226bm.getClass();
        try {
            c0226bm.a.unbindService(serviceConnection);
        } catch (Throwable unused) {
        }
    }
}
