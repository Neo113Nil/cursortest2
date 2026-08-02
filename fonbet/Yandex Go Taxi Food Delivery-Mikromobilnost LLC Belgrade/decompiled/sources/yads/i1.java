package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.fr71;
import defpackage.jl40;
import defpackage.ycc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.collections.a;

/* loaded from: classes7.dex */
public final class i1 implements Application.ActivityLifecycleCallbacks {
    public final fr71 a;

    public i1(Activity activity) {
        this.a = new fr71(activity);
    }

    public final Activity a() {
        Activity activity;
        fr71 fr71Var = this.a;
        synchronized (fr71Var) {
            ycc.w(fr71Var.a, k1.w, true);
            WeakReference weakReference = (WeakReference) a.R(fr71Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final Activity b() {
        Activity activity;
        fr71 fr71Var = this.a;
        synchronized (fr71Var) {
            ycc.w(fr71Var.a, l1.w, true);
            WeakReference weakReference = (WeakReference) a.b0(fr71Var.a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        fr71 fr71Var = this.a;
        synchronized (fr71Var) {
            try {
                ArrayList arrayList = fr71Var.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (jl40.l(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                fr71Var.a.add(new WeakReference(activity));
                Objects.toString(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.a.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
