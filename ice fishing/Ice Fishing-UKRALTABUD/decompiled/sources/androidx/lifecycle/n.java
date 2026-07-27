package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class n extends a {
    final /* synthetic */ o this$0;

    public n(o oVar) {
        this.this$0 = oVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        E0.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = s.f1529g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            E0.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((s) findFragmentByTag).f1530f = this.this$0.f1528m;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        E0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1522g - 1;
        oVar.f1522g = i2;
        if (i2 == 0) {
            Handler handler = oVar.f1525j;
            E0.i.b(handler);
            handler.postDelayed(oVar.f1527l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        E0.i.e(activity, "activity");
        l.a(activity, new m(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        E0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1521f - 1;
        oVar.f1521f = i2;
        if (i2 == 0 && oVar.f1523h) {
            oVar.f1526k.a(d.ON_STOP);
            oVar.f1524i = true;
        }
    }
}
