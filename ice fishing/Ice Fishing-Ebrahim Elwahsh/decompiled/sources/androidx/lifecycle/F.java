package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F extends AbstractC0500h {
    final /* synthetic */ G this$0;

    public static final class a extends AbstractC0500h {
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
            int i = g9.f5217n + 1;
            g9.f5217n = i;
            if (i == 1 && g9.f5220w) {
                g9.f5222y.e(EnumC0506n.ON_START);
                g9.f5220w = false;
            }
        }
    }

    public F(G g9) {
        this.this$0 = g9;
    }

    @Override // androidx.lifecycle.AbstractC0500h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = J.f5224u;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) findFragmentByTag).f5225n = this.this$0.f5216A;
        }
    }

    @Override // androidx.lifecycle.AbstractC0500h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g9 = this.this$0;
        int i = g9.f5218u - 1;
        g9.f5218u = i;
        if (i == 0) {
            Handler handler = g9.f5221x;
            kotlin.jvm.internal.h.b(handler);
            handler.postDelayed(g9.f5223z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.h.e(activity, "activity");
        E.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0500h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        G g9 = this.this$0;
        int i = g9.f5217n - 1;
        g9.f5217n = i;
        if (i == 0 && g9.f5219v) {
            g9.f5222y.e(EnumC0506n.ON_STOP);
            g9.f5220w = true;
        }
    }
}
