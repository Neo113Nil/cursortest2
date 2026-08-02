package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.Plaid;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes5.dex */
public final class M2 {
    public final C0216l0 a;
    public final List<String> b;

    public M2(Application application) {
        application.getClass();
        C0216l0 c0216l0 = new C0216l0();
        this.a = c0216l0;
        this.b = CollectionsKt__CollectionsJVMKt.listOf(LinkActivity.class.getName());
        application.registerActivityLifecycleCallbacks(c0216l0);
    }

    public final boolean a(Throwable th) {
        th.getClass();
        Activity activity = this.a.a.get();
        if (activity == null || !this.b.contains(activity.getClass().getName())) {
            return false;
        }
        Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(activity, 6148, L2.b(th, null));
        C0216l0 c0216l0 = this.a;
        WeakReference<Activity> weakReference = new WeakReference<>(null);
        c0216l0.getClass();
        c0216l0.a = weakReference;
        return true;
    }
}
