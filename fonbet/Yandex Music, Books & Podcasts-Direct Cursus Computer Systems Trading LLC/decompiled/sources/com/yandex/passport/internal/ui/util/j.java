package com.yandex.passport.internal.ui.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.bqi;
import defpackage.btf;
import defpackage.dkn;
import defpackage.fkn;
import defpackage.fm6;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.x97;
import defpackage.xpi;
import defpackage.ydr;
import defpackage.z75;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class j implements Application.ActivityLifecycleCallbacks {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public j(Context context, fm6 fm6Var) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        this.a = btf.b(new h0(fm6Var));
        this.b = btf.b(new w0(19));
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ydr.a(this.b.a());
                    case 1:
                        return new fkn((bqi) this.b.c.getValue());
                    default:
                        return new dkn((xpi) this.b.e.getValue());
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ydr.a(this.b.a());
                    case 1:
                        return new fkn((bqi) this.b.c.getValue());
                    default:
                        return new dkn((xpi) this.b.e.getValue());
                }
            }
        });
        this.e = btf.b(new w0(20));
        final int i3 = 2;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ydr.a(this.b.a());
                    case 1:
                        return new fkn((bqi) this.b.c.getValue());
                    default:
                        return new dkn((xpi) this.b.e.getValue());
                }
            }
        });
    }

    public final Activity a() {
        Object obj;
        List list = (List) this.b.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((WeakReference) obj).get() != null) {
                break;
            }
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        x97.y((mm6) this.a.getValue(), null, null, new com.yandex.passport.internal.ui.sloth.q(this, activity, (Continuation) null, 15), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        z75.z((List) this.b.getValue(), new com.yandex.passport.internal.ui.bouncer.roundabout.k(10, activity));
        x97.y((mm6) this.a.getValue(), null, null, new i(this, null, 0), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        activity.getClass();
        ((List) this.b.getValue()).add(new WeakReference(activity));
        x97.y((mm6) this.a.getValue(), null, null, new i(this, null, 1), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
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
