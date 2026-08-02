package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.yandex.passport.api.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class qju implements Application.ActivityLifecycleCallbacks {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public hn5 e;
    public boolean d = true;
    public final HashMap f = new HashMap();

    public qju(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        ctm ctmVar = ctm.i;
        ctmVar.f.a(new g(1, this));
        Continuation continuation = null;
        x97.y(wyf.F(ctmVar.getLifecycle()), dm6.b, null, new zts(this, continuation, 20), 2);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        x97.y(wyf.F(ctmVar.getLifecycle()), null, null, new npt(zsd.b0(ox6.S((bqi) ((rju) ((byb) qdcVar.C(I)).b(rju.class)).e.getValue())), continuation, this, 10), 3);
    }

    public static oju a(Activity activity) {
        return new oju(System.identityHashCode(activity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (activity instanceof hn5) {
            this.f.put(a(activity), new WeakReference(((g) this.a.getValue()).h((sh) activity, wyf.F(((dzf) activity).getLifecycle()))));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.f.remove(a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        activity.getClass();
        if (Intrinsics.d(activity, this.e)) {
            this.e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        activity.getClass();
        if (this.d && (activity instanceof hn5) && (weakReference = (WeakReference) this.f.get(a(activity))) != null) {
            this.d = false;
            x97.y(wyf.F(((dzf) activity).getLifecycle()), null, null, new ak1(this, weakReference, (hn5) activity, (Continuation) null), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        if (activity instanceof hn5) {
            this.e = (hn5) activity;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
