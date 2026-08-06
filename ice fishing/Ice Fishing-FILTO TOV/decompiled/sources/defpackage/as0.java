package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class as0 extends tp {
    final /* synthetic */ bs0 this$0;

    /* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
    public static final class GWasM1elztuh extends tp {
        final /* synthetic */ bs0 this$0;

        public GWasM1elztuh(bs0 bs0Var) {
            this.this$0 = bs0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.GWasM1elztuh();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            bs0 bs0Var = this.this$0;
            int i = bs0Var.OOA6hdeuvCS + 1;
            bs0Var.OOA6hdeuvCS = i;
            if (i == 1 && bs0Var.encWxUiV2) {
                bs0Var.JFJ3QoxA.xqGvceK5x(l90.ON_START);
                bs0Var.encWxUiV2 = false;
            }
        }
    }

    public as0(bs0 bs0Var) {
        this.this$0 = bs0Var;
    }

    @Override // defpackage.tp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = mu0.EljAMC1QTz;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((mu0) findFragmentByTag).OOA6hdeuvCS = this.this$0.E7jCp8Ls;
        }
    }

    @Override // defpackage.tp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        bs0 bs0Var = this.this$0;
        int i = bs0Var.EljAMC1QTz - 1;
        bs0Var.EljAMC1QTz = i;
        if (i == 0) {
            Handler handler = bs0Var.mOu10nynGul;
            handler.getClass();
            handler.postDelayed(bs0Var.rQPn8YBR, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        a4.JFJ3QoxA(activity, new GWasM1elztuh(this.this$0));
    }

    @Override // defpackage.tp, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        bs0 bs0Var = this.this$0;
        int i = bs0Var.OOA6hdeuvCS - 1;
        bs0Var.OOA6hdeuvCS = i;
        if (i == 0 && bs0Var.AvO7iQsrTN) {
            bs0Var.JFJ3QoxA.xqGvceK5x(l90.ON_STOP);
            bs0Var.encWxUiV2 = true;
        }
    }
}
