package com.iab.omid.library.toponad.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36243a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f36244b;

    /* renamed from: c, reason: collision with root package name */
    private a f36245c;

    public interface a {
        void a(boolean z3);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f36244b;
    }

    public boolean d() {
        return false;
    }

    public void e() {
        this.f36243a = true;
        boolean a9 = a();
        this.f36244b = a9;
        b(a9);
    }

    public void f() {
        this.f36243a = false;
        this.f36245c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f36245c = aVar;
    }

    public void b(boolean z3) {
    }

    private void a(boolean z3) {
        if (this.f36244b != z3) {
            this.f36244b = z3;
            if (this.f36243a) {
                b(z3);
                a aVar = this.f36245c;
                if (aVar != null) {
                    aVar.a(z3);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
