package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class t41 extends android.app.Fragment {
    public static final /* synthetic */ int oh71FJcDz6S2 = 0;
    public defpackage.k0 WDYagTQQm9ns;

    /* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
    public static final class ZpBGe2uQfcn8 implements android.app.Application.ActivityLifecycleCallbacks {
        public static final defpackage.s41 Companion = new defpackage.s41();

        public static final void registerIn(android.app.Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new t41.ZpBGe2uQfcn8());
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
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity activity) {
            activity.getClass();
            int i = defpackage.t41.oh71FJcDz6S2;
            defpackage.r41.ZpBGe2uQfcn8(activity, defpackage.og0.ON_STOP);
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

    public final void ZpBGe2uQfcn8(defpackage.og0 og0Var) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            android.app.Activity activity = getActivity();
            activity.getClass();
            defpackage.r41.ZpBGe2uQfcn8(activity, og0Var);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        ZpBGe2uQfcn8(defpackage.og0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ZpBGe2uQfcn8(defpackage.og0.ON_DESTROY);
        this.WDYagTQQm9ns = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        ZpBGe2uQfcn8(defpackage.og0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        defpackage.k0 k0Var = this.WDYagTQQm9ns;
        if (k0Var != null) {
            ((defpackage.f21) k0Var.oh71FJcDz6S2).ZpBGe2uQfcn8();
        }
        ZpBGe2uQfcn8(defpackage.og0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        defpackage.k0 k0Var = this.WDYagTQQm9ns;
        if (k0Var != null) {
            defpackage.f21 f21Var = (defpackage.f21) k0Var.oh71FJcDz6S2;
            int i = f21Var.WDYagTQQm9ns + 1;
            f21Var.WDYagTQQm9ns = i;
            if (i == 1 && f21Var.P05cfTpS5W5L) {
                f21Var.GE9mJIPrb8gP.JhCgjQRTAOCT(defpackage.og0.ON_START);
                f21Var.P05cfTpS5W5L = false;
            }
        }
        ZpBGe2uQfcn8(defpackage.og0.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        ZpBGe2uQfcn8(defpackage.og0.ON_STOP);
    }
}
