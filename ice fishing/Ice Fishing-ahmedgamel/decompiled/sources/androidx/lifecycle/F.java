package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F extends AbstractC0494h {
    final /* synthetic */ G this$0;

    public static final class a extends AbstractC0494h {
        final /* synthetic */ G this$0;

        public a(G g9) {
            this.this$0 = g9;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.h.e(activity, "activity");
            G g9 = this.this$0;
            int i = g9.f5072n + 1;
            g9.f5072n = i;
            if (i == 1 && g9.f5075w) {
                g9.f5077y.e(EnumC0500n.ON_START);
                g9.f5075w = false;
            }
        }
    }

    public F(G g9) {
        this.this$0 = g9;
    }

    @Override // androidx.lifecycle.AbstractC0494h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = J.f5079u;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) findFragmentByTag).f5080n = this.this$0.f5071A;
        }
    }

    @Override // androidx.lifecycle.AbstractC0494h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g9 = this.this$0;
        int i = g9.f5073u - 1;
        g9.f5073u = i;
        if (i == 0) {
            Handler handler = g9.f5076x;
            kotlin.jvm.internal.h.b(handler);
            handler.postDelayed(g9.f5078z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        E.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0494h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g9 = this.this$0;
        int i = g9.f5072n - 1;
        g9.f5072n = i;
        if (i == 0 && g9.f5074v) {
            g9.f5077y.e(EnumC0500n.ON_STOP);
            g9.f5075w = true;
        }
    }
}
