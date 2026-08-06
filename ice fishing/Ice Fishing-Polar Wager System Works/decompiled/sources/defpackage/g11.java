package defpackage;

/* loaded from: classes.dex */
public class g11 extends android.app.Fragment {
    public static final /* synthetic */ int xiZrDbcSW0 = 0;
    public defpackage.c1NqjJifC7 adDC3e2L;

    public static final class IHQe1A4L2xu implements android.app.Application.ActivityLifecycleCallbacks {
        public static final defpackage.f11 Companion = new defpackage.f11();

        public static final void registerIn(android.app.Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new g11.IHQe1A4L2xu());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.g11.xiZrDbcSW0;
            defpackage.e11.IHQe1A4L2xu(activity, defpackage.md0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            activity.getClass();
        }
    }

    public final void IHQe1A4L2xu(defpackage.md0 md0Var) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            activity.getClass();
            defpackage.e11.IHQe1A4L2xu(activity, md0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        IHQe1A4L2xu(defpackage.md0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IHQe1A4L2xu(defpackage.md0.ON_DESTROY);
        this.adDC3e2L = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        IHQe1A4L2xu(defpackage.md0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        defpackage.c1NqjJifC7 c1nqjjifc7 = this.adDC3e2L;
        if (c1nqjjifc7 != null) {
            ((defpackage.vx0) c1nqjjifc7.xiZrDbcSW0).IHQe1A4L2xu();
        }
        IHQe1A4L2xu(defpackage.md0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        defpackage.c1NqjJifC7 c1nqjjifc7 = this.adDC3e2L;
        if (c1nqjjifc7 != null) {
            defpackage.vx0 vx0Var = (defpackage.vx0) c1nqjjifc7.xiZrDbcSW0;
            int i = vx0Var.adDC3e2L + 1;
            vx0Var.adDC3e2L = i;
            if (i == 1 && vx0Var.EXtogiMhuM) {
                vx0Var.SH1y5HwkJhh.F7NU4MC0GW(defpackage.md0.ON_START);
                vx0Var.EXtogiMhuM = false;
            }
        }
        IHQe1A4L2xu(defpackage.md0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        IHQe1A4L2xu(defpackage.md0.ON_STOP);
    }
}
