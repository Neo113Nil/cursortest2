package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0549n implements ActivityLifecycleListener {
    public final HashSet a = new HashSet();

    public C0549n(C0607p c0607p) {
        c0607p.registerListener(this, new ActivityEvent[0]);
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0659qm) ((InterfaceC0520m) it.next())).a(activity);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        V4.l().c.a().execute(new RunnableC0491l(this, activity));
    }

    public final synchronized void a(InterfaceC0520m interfaceC0520m) {
        this.a.add(interfaceC0520m);
    }
}
