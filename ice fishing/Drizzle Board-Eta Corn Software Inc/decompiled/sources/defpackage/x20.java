package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class x20 extends Fragment {
    public static final /* synthetic */ int MdtA4re8 = 0;
    public tg0 NCTxEWno;

    /* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
    public static final class qoPGr6Ce implements Application.ActivityLifecycleCallbacks {
        public static final w20 Companion = new w20();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new qoPGr6Ce());
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
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = x20.MdtA4re8;
            v20.qoPGr6Ce(activity, oo.ON_STOP);
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

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        qoPGr6Ce(oo.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        qoPGr6Ce(oo.ON_DESTROY);
        this.NCTxEWno = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        qoPGr6Ce(oo.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        tg0 tg0Var = this.NCTxEWno;
        if (tg0Var != null) {
            ((g00) tg0Var.MdtA4re8).NCTxEWno();
        }
        qoPGr6Ce(oo.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        tg0 tg0Var = this.NCTxEWno;
        if (tg0Var != null) {
            g00 g00Var = (g00) tg0Var.MdtA4re8;
            int i = g00Var.NCTxEWno + 1;
            g00Var.NCTxEWno = i;
            if (i == 1 && g00Var.VgvYg0wo) {
                g00Var.b2ZJblxo.wxUZMvaN(oo.ON_START);
                g00Var.VgvYg0wo = false;
            }
        }
        qoPGr6Ce(oo.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        qoPGr6Ce(oo.ON_STOP);
    }

    public final void qoPGr6Ce(oo ooVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            v20.qoPGr6Ce(activity, ooVar);
        }
    }
}
