package com.yandex.plus.core.activity.result.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.bjt;
import defpackage.ern;
import defpackage.gfu;
import defpackage.gn5;
import defpackage.hn5;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.xdr;
import defpackage.xq0;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ h a;

    public b(h hVar) {
        this.a = hVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (activity instanceof hn5) {
            hn5 hn5Var = (hn5) activity;
            gn5 gn5Var = new gn5(hn5Var, 4);
            lm4 a = ern.a(m.class);
            bjt bjtVar = new bjt((jfu) new gn5(hn5Var, 5).invoke(), (gfu) gn5Var.invoke(), (is6) new gn5(hn5Var, 6).invoke());
            String f = a.f();
            if (f == null) {
                xq0.x("Local and anonymous classes can not be ViewModels");
                return;
            }
            m mVar = (m) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
            h hVar = this.a;
            hVar.b.add(mVar);
            a aVar = new a(1, hVar.b, List.class, "remove", "remove(Ljava/lang/Object;)Z", 8, 0);
            mVar.n = hn5Var.registerForActivityResult(mVar.q, mVar.r);
            mVar.o = aVar;
            hn5Var.getLifecycle().a(new k(mVar));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object value;
        activity.getClass();
        xdr xdrVar = this.a.c;
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, CollectionsKt.d0((List) value, activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object value;
        activity.getClass();
        xdr xdrVar = this.a.c;
        do {
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, CollectionsKt.h0((List) value, activity)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
