package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573m implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6469a = new HashSet();

    public C0573m(C0625o c0625o) {
        c0625o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC0547l interfaceC0547l) {
        this.f6469a.add(interfaceC0547l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C0294b4.l().f5584c.a().execute(new RunnableC0521k(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f6469a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0309bj) ((InterfaceC0547l) it.next())).a(activity);
        }
    }
}
