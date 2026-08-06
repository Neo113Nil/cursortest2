package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e21 extends defpackage.vu {
    final /* synthetic */ defpackage.f21 this$0;

    /* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
    public static final class ZpBGe2uQfcn8 extends defpackage.vu {
        final /* synthetic */ defpackage.f21 this$0;

        public ZpBGe2uQfcn8(defpackage.f21 f21Var) {
            this.this$0 = f21Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            activity.getClass();
            this.this$0.ZpBGe2uQfcn8();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            activity.getClass();
            defpackage.f21 f21Var = this.this$0;
            int i = f21Var.WDYagTQQm9ns + 1;
            f21Var.WDYagTQQm9ns = i;
            if (i == 1 && f21Var.P05cfTpS5W5L) {
                f21Var.GE9mJIPrb8gP.JhCgjQRTAOCT(defpackage.og0.ON_START);
                f21Var.P05cfTpS5W5L = false;
            }
        }
    }

    public e21(defpackage.f21 f21Var) {
        this.this$0 = f21Var;
    }

    @Override // defpackage.vu, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i = defpackage.t41.oh71FJcDz6S2;
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((defpackage.t41) findFragmentByTag).WDYagTQQm9ns = this.this$0.fNwYGHIYeJcR;
        }
    }

    @Override // defpackage.vu, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        activity.getClass();
        defpackage.f21 f21Var = this.this$0;
        int i = f21Var.oh71FJcDz6S2 - 1;
        f21Var.oh71FJcDz6S2 = i;
        if (i == 0) {
            android.os.Handler handler = f21Var.e6mdH7fiFuta;
            handler.getClass();
            handler.postDelayed(f21Var.Ns0WNyEWdPsk, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        defpackage.rk.e6mdH7fiFuta(activity, new e21.ZpBGe2uQfcn8(this.this$0));
    }

    @Override // defpackage.vu, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        activity.getClass();
        defpackage.f21 f21Var = this.this$0;
        int i = f21Var.WDYagTQQm9ns - 1;
        f21Var.WDYagTQQm9ns = i;
        if (i == 0 && f21Var.QiMR8OkAhezm) {
            f21Var.GE9mJIPrb8gP.JhCgjQRTAOCT(defpackage.og0.ON_STOP);
            f21Var.P05cfTpS5W5L = true;
        }
    }
}
