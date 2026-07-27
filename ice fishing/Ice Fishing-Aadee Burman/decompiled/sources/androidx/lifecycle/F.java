package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F extends AbstractC0490h {
    final /* synthetic */ G this$0;

    public static final class a extends AbstractC0490h {
        final /* synthetic */ G this$0;

        public a(G g4) {
            this.this$0 = g4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            G g4 = this.this$0;
            int i = g4.f5105n + 1;
            g4.f5105n = i;
            if (i == 1 && g4.f5108w) {
                g4.f5110y.e(EnumC0496n.ON_START);
                g4.f5108w = false;
            }
        }
    }

    public F(G g4) {
        this.this$0 = g4;
    }

    @Override // androidx.lifecycle.AbstractC0490h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = J.f5112u;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) findFragmentByTag).f5113n = this.this$0.f5104A;
        }
    }

    @Override // androidx.lifecycle.AbstractC0490h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g4 = this.this$0;
        int i = g4.f5106u - 1;
        g4.f5106u = i;
        if (i == 0) {
            Handler handler = g4.f5109x;
            kotlin.jvm.internal.h.b(handler);
            handler.postDelayed(g4.f5111z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        E.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0490h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g4 = this.this$0;
        int i = g4.f5105n - 1;
        g4.f5105n = i;
        if (i == 0 && g4.f5107v) {
            g4.f5110y.e(EnumC0496n.ON_STOP);
            g4.f5108w = true;
        }
    }
}
