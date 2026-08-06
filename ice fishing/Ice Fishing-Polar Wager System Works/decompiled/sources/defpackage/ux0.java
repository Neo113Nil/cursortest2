package defpackage;

/* loaded from: classes.dex */
public final class ux0 extends defpackage.jt {
    final /* synthetic */ defpackage.vx0 this$0;

    public static final class IHQe1A4L2xu extends defpackage.jt {
        final /* synthetic */ defpackage.vx0 this$0;

        public IHQe1A4L2xu(defpackage.vx0 vx0Var) {
            this.this$0 = vx0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity activity) {
            activity.getClass();
            this.this$0.IHQe1A4L2xu();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity activity) {
            activity.getClass();
            defpackage.vx0 vx0Var = this.this$0;
            int i = vx0Var.adDC3e2L + 1;
            vx0Var.adDC3e2L = i;
            if (i == 1 && vx0Var.EXtogiMhuM) {
                vx0Var.SH1y5HwkJhh.F7NU4MC0GW(defpackage.md0.ON_START);
                vx0Var.EXtogiMhuM = false;
            }
        }
    }

    public ux0(defpackage.vx0 vx0Var) {
        this.this$0 = vx0Var;
    }

    @Override // defpackage.jt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i = defpackage.g11.xiZrDbcSW0;
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((defpackage.g11) findFragmentByTag).adDC3e2L = this.this$0.JlrlGoKF;
        }
    }

    @Override // defpackage.jt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        activity.getClass();
        defpackage.vx0 vx0Var = this.this$0;
        int i = vx0Var.xiZrDbcSW0 - 1;
        vx0Var.xiZrDbcSW0 = i;
        if (i == 0) {
            android.os.Handler handler = vx0Var.riuEU0zW4;
            handler.getClass();
            handler.postDelayed(vx0Var.ez2rX8ReCYw, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        defpackage.ri.riuEU0zW4(activity, new ux0.IHQe1A4L2xu(this.this$0));
    }

    @Override // defpackage.jt, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        activity.getClass();
        defpackage.vx0 vx0Var = this.this$0;
        int i = vx0Var.adDC3e2L - 1;
        vx0Var.adDC3e2L = i;
        if (i == 0 && vx0Var.AARZUJiTa) {
            vx0Var.SH1y5HwkJhh.F7NU4MC0GW(defpackage.md0.ON_STOP);
            vx0Var.EXtogiMhuM = true;
        }
    }
}
