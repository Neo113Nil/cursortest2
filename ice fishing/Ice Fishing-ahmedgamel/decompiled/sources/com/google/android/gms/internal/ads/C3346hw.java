package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.hw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3346hw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public boolean f31744n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31745u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3292gw f31746v;

    public boolean a() {
        return false;
    }

    public void b(boolean z6) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f31745u) {
            this.f31745u = true;
            if (this.f31744n) {
                b(true);
                InterfaceC3292gw interfaceC3292gw = this.f31746v;
                if (interfaceC3292gw != null) {
                    interfaceC3292gw.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z6 = runningAppProcessInfo.importance == 100 || a();
        if (this.f31745u != z6) {
            this.f31745u = z6;
            if (this.f31744n) {
                b(z6);
                InterfaceC3292gw interfaceC3292gw = this.f31746v;
                if (interfaceC3292gw != null) {
                    interfaceC3292gw.a(z6);
                }
            }
        }
    }
}
