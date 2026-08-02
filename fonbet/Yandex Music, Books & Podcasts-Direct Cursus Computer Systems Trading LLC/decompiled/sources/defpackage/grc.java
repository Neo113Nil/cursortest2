package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class grc implements Application.ActivityLifecycleCallbacks {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final xdr g = ydr.a(new drc(false, false, false));

    public final boolean a() {
        return this.c.size() != 0;
    }

    public final void b() {
        drc drcVar = new drc(this.e.get(), this.d.size() != 0, a());
        xdr xdrVar = this.g;
        xdrVar.getClass();
        xdrVar.m(null, drcVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        this.c.remove(activity);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        bsd bsdVar;
        activity.getClass();
        this.c.add(activity);
        if (!this.e.getAndSet(true)) {
            if (this.f.getAndSet(false)) {
                dq7 dq7Var = ca8.a;
                bsdVar = j5h.a;
            } else {
                dq7 dq7Var2 = ca8.a;
                bsdVar = j5h.a.g;
            }
            x97.y(cmd.a, bsdVar, null, new ox1(this, null, 17), 2);
        }
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.d.add(activity);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        ArrayList arrayList = this.d;
        arrayList.remove(activity);
        if (arrayList.isEmpty() && !activity.isChangingConfigurations() && this.e.getAndSet(false)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((erc) it.next()).b();
            }
        }
        b();
    }
}
