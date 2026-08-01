package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D extends AbstractC0090g {
    final /* synthetic */ E this$0;

    public static final class a extends AbstractC0090g {
        final /* synthetic */ E this$0;

        public a(E e) {
            this.this$0 = e;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            D1.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            D1.i.e(activity, "activity");
            E e = this.this$0;
            int i = e.f1991a + 1;
            e.f1991a = i;
            if (i == 1 && e.f1994d) {
                e.f1995f.d(EnumC0096m.ON_START);
                e.f1994d = false;
            }
        }
    }

    public D(E e) {
        this.this$0 = e;
    }

    @Override // androidx.lifecycle.AbstractC0090g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        D1.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = H.f1998b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            D1.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f1999a = this.this$0.f1997h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0090g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        D1.i.e(activity, "activity");
        E e = this.this$0;
        int i = e.f1992b - 1;
        e.f1992b = i;
        if (i == 0) {
            Handler handler = e.e;
            D1.i.b(handler);
            handler.postDelayed(e.f1996g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        D1.i.e(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0090g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        D1.i.e(activity, "activity");
        E e = this.this$0;
        int i = e.f1991a - 1;
        e.f1991a = i;
        if (i == 0 && e.f1993c) {
            e.f1995f.d(EnumC0096m.ON_STOP);
            e.f1994d = true;
        }
    }
}
