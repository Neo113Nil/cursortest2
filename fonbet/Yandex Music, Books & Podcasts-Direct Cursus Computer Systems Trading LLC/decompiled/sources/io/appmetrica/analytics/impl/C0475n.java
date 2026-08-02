package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0475n implements ActivityLifecycleListener {
    public final HashSet a = new HashSet();

    public C0475n(@NonNull C0533p c0533p) {
        c0533p.registerListener(this, new ActivityEvent[0]);
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Zl) ((InterfaceC0446m) it.next())).a(activity);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        R4.l().c.a().execute(new RunnableC0417l(this, activity));
    }

    public final synchronized void a(@NonNull InterfaceC0446m interfaceC0446m) {
        this.a.add(interfaceC0446m);
    }
}
