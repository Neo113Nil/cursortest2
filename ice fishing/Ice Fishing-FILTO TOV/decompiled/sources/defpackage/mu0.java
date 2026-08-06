package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class mu0 extends Fragment {
    public static final /* synthetic */ int EljAMC1QTz = 0;
    public j6IIN2O8eOU OOA6hdeuvCS;

    /* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
    public static final class GWasM1elztuh implements Application.ActivityLifecycleCallbacks {
        public static final lu0 Companion = new lu0();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new GWasM1elztuh());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = mu0.EljAMC1QTz;
            ku0.GWasM1elztuh(activity, l90.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void GWasM1elztuh(l90 l90Var) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            ku0.GWasM1elztuh(activity, l90Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        GWasM1elztuh(l90.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        GWasM1elztuh(l90.ON_DESTROY);
        this.OOA6hdeuvCS = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        GWasM1elztuh(l90.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        j6IIN2O8eOU j6iin2o8eou = this.OOA6hdeuvCS;
        if (j6iin2o8eou != null) {
            ((bs0) j6iin2o8eou.EljAMC1QTz).GWasM1elztuh();
        }
        GWasM1elztuh(l90.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        j6IIN2O8eOU j6iin2o8eou = this.OOA6hdeuvCS;
        if (j6iin2o8eou != null) {
            bs0 bs0Var = (bs0) j6iin2o8eou.EljAMC1QTz;
            int i = bs0Var.OOA6hdeuvCS + 1;
            bs0Var.OOA6hdeuvCS = i;
            if (i == 1 && bs0Var.encWxUiV2) {
                bs0Var.JFJ3QoxA.xqGvceK5x(l90.ON_START);
                bs0Var.encWxUiV2 = false;
            }
        }
        GWasM1elztuh(l90.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        GWasM1elztuh(l90.ON_STOP);
    }
}
