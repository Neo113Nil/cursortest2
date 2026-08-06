package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class S1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5021a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile C0892y7 f5022b = null;

    public final void a(C0892y7 c0892y7) {
        ArrayList a2;
        synchronized (this) {
            this.f5022b = c0892y7;
            a2 = a();
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ((InterfaceC0278ae) it.next()).consume(c0892y7);
        }
    }

    public final void b() {
        C0294b4.l().f5586e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C0294b4.l().f5586e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Q1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        R1 r12 = new R1(dataString);
        synchronized (this) {
            try {
                C0892y7 c0892y7 = this.f5022b;
                if (c0892y7 == null) {
                    this.f5021a.add(r12);
                } else {
                    ((C0920z9) C0294b4.l().f5584c.a()).f7271b.post(new P1(r12, c0892y7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f5021a);
        this.f5021a.clear();
        return arrayList;
    }
}
