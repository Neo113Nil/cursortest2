package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class E2 implements ActivityLifecycleListener {
    public final ArrayList a = new ArrayList();
    public volatile C0818w8 b = null;

    public final void a(C0818w8 c0818w8) {
        ArrayList a;
        synchronized (this) {
            this.b = c0818w8;
            a = a();
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((Ng) it.next()).consume(c0818w8);
        }
    }

    public final void b() {
        V4.l().e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        V4.l().e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C2());
        String dataString = intent == null ? null : intent.getDataString();
        if (StringUtils.isNullOrEmpty(dataString)) {
            return;
        }
        D2 d2 = new D2(dataString);
        synchronized (this) {
            try {
                C0818w8 c0818w8 = this.b;
                if (c0818w8 == null) {
                    this.a.add(d2);
                } else {
                    ((Pa) V4.l().c.a()).b.post(new B2(d2, c0818w8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.a);
        this.a.clear();
        return arrayList;
    }
}
