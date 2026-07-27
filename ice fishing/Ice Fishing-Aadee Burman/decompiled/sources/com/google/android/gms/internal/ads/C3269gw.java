package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.gw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3269gw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public boolean f30676n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30677u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3215fw f30678v;

    public boolean a() {
        return false;
    }

    public void b(boolean z3) {
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
        if (!this.f30677u) {
            this.f30677u = true;
            if (this.f30676n) {
                b(true);
                InterfaceC3215fw interfaceC3215fw = this.f30678v;
                if (interfaceC3215fw != null) {
                    interfaceC3215fw.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = runningAppProcessInfo.importance == 100 || a();
        if (this.f30677u != z3) {
            this.f30677u = z3;
            if (this.f30676n) {
                b(z3);
                InterfaceC3215fw interfaceC3215fw = this.f30678v;
                if (interfaceC3215fw != null) {
                    interfaceC3215fw.a(z3);
                }
            }
        }
    }
}
