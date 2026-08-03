package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends i {
    final /* synthetic */ f0 this$0;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends i {
        final /* synthetic */ f0 this$0;

        public a(f0 f0Var) {
            this.this$0 = f0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            pc.j.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            pc.j.e(activity, "activity");
            f0 f0Var = this.this$0;
            int i10 = f0Var.f668g + 1;
            f0Var.f668g = i10;
            if (i10 == 1 && f0Var.f671j) {
                f0Var.f673l.d(o.ON_START);
                f0Var.f671j = false;
            }
        }
    }

    public e0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        pc.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = i0.f680h;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            pc.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((i0) findFragmentByTag).f681g = this.this$0.f675n;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        pc.j.e(activity, "activity");
        f0 f0Var = this.this$0;
        int i10 = f0Var.f669h - 1;
        f0Var.f669h = i10;
        if (i10 == 0) {
            Handler handler = f0Var.f672k;
            pc.j.b(handler);
            handler.postDelayed(f0Var.f674m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        pc.j.e(activity, "activity");
        d0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        pc.j.e(activity, "activity");
        f0 f0Var = this.this$0;
        int i10 = f0Var.f668g - 1;
        f0Var.f668g = i10;
        if (i10 == 0 && f0Var.f670i) {
            f0Var.f673l.d(o.ON_STOP);
            f0Var.f671j = true;
        }
    }
}
