package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class q extends a {
    final /* synthetic */ r this$0;

    public q(r rVar) {
        this.this$0 = rVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = u.f2497b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u) findFragmentByTag).f2498a = this.this$0.f2496h;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f2490b - 1;
        rVar.f2490b = i2;
        if (i2 == 0) {
            Handler handler = rVar.f2493e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(rVar.f2495g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        o.a(activity, new p(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f2489a - 1;
        rVar.f2489a = i2;
        if (i2 == 0 && rVar.f2491c) {
            rVar.f2494f.d(d.ON_STOP);
            rVar.f2492d = true;
        }
    }
}
