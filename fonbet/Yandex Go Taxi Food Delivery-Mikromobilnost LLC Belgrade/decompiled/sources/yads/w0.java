package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.bi71;
import defpackage.jl40;
import defpackage.qk61;
import defpackage.xq81;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class w0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ xq81 a;

    public w0(xq81 xq81Var) {
        this.a = xq81Var;
    }

    public final HashSet a(WeakHashMap weakHashMap) {
        HashSet hashSet;
        synchronized (this.a.a) {
            Set keySet = weakHashMap.keySet();
            hashSet = new HashSet(keySet.size());
            for (Object obj : keySet) {
                if (obj != null) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String string;
        Iterator it = a(this.a.c).iterator();
        while (it.hasNext()) {
            qk61 qk61Var = (qk61) it.next();
            qk61Var.getClass();
            Objects.toString(activity);
            if (bundle != null && (string = bundle.getString("monetization_ads_activity_id")) != null && string.equals(qk61Var.c)) {
                qk61Var.a.m();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = a(this.a.b).iterator();
        while (it.hasNext()) {
            ((bi71) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = a(this.a.b).iterator();
        while (it.hasNext()) {
            ((bi71) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Iterator it = a(this.a.c).iterator();
        while (it.hasNext()) {
            qk61 qk61Var = (qk61) it.next();
            qk61Var.getClass();
            Objects.toString(activity);
            if (bundle != null && (weakReference = qk61Var.b) != null && jl40.l(activity, (Activity) weakReference.get())) {
                String uuid = UUID.randomUUID().toString();
                qk61Var.c = uuid;
                bundle.putString("monetization_ads_activity_id", uuid);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.c(activity);
    }
}
