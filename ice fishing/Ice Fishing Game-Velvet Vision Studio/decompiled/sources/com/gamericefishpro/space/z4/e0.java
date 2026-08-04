package com.gamericefishpro.space.z4;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i {
    final /* synthetic */ f0 this$0;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i {
        final /* synthetic */ f0 this$0;

        public a(f0 f0Var) {
            this.this$0 = f0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f0 f0Var = this.this$0;
            int i = f0Var.d + 1;
            f0Var.d = i;
            if (i == 1 && f0Var.v) {
                f0Var.y.d(o.ON_START);
                f0Var.v = false;
            }
        }
    }

    public e0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // com.gamericefishpro.space.z4.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = i0.e;
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((i0) fragmentFindFragmentByTag).d = this.this$0.A;
        }
    }

    @Override // com.gamericefishpro.space.z4.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f0 f0Var = this.this$0;
        int i = f0Var.e - 1;
        f0Var.e = i;
        if (i == 0) {
            Handler handler = f0Var.w;
            Intrinsics.b(handler);
            handler.postDelayed(f0Var.z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        d0.a(activity, new a(this.this$0));
    }

    @Override // com.gamericefishpro.space.z4.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f0 f0Var = this.this$0;
        int i = f0Var.d - 1;
        f0Var.d = i;
        if (i == 0 && f0Var.i) {
            f0Var.y.d(o.ON_STOP);
            f0Var.v = true;
        }
    }
}
