package defpackage;

import android.app.Activity;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class v08 extends yhq {
    public final /* synthetic */ sj a;

    public v08(sj sjVar) {
        this.a = sjVar;
    }

    @Override // defpackage.yhq, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        sj sjVar = this.a;
        if (((frt) ((jyr) sjVar.d).getValue()).c().a()) {
            boolean H = asq.H(activity);
            boolean isInMultiWindowMode = activity.isInMultiWindowMode();
            sjVar.a = System.identityHashCode(activity);
            rar rarVar = (rar) sjVar.c;
            if (rarVar != null) {
                rarVar.g(null);
            }
            sjVar.c = x97.y((tf6) sjVar.b, null, null, new x08(sjVar, H, isInMultiWindowMode, (Continuation) null), 3);
        }
    }

    @Override // defpackage.yhq, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        sj sjVar = this.a;
        if (sjVar.a != System.identityHashCode(activity)) {
            return;
        }
        rar rarVar = (rar) sjVar.c;
        if (rarVar != null) {
            rarVar.g(null);
        }
        sjVar.c = null;
    }
}
