package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class btm extends n4b {
    final /* synthetic */ ctm this$0;

    public static final class a extends n4b {
        final /* synthetic */ ctm this$0;

        public a(ctm ctmVar) {
            this.this$0 = ctmVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ctm ctmVar = this.this$0;
            int i = ctmVar.a + 1;
            ctmVar.a = i;
            if (i == 1 && ctmVar.d) {
                ctmVar.f.g(kyf.ON_START);
                ctmVar.d = false;
            }
        }
    }

    public btm(ctm ctmVar) {
        this.this$0 = ctmVar;
    }

    @Override // defpackage.n4b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = nzn.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((nzn) findFragmentByTag).a = this.this$0.h;
        }
    }

    @Override // defpackage.n4b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ctm ctmVar = this.this$0;
        int i = ctmVar.b - 1;
        ctmVar.b = i;
        if (i == 0) {
            Handler handler = ctmVar.e;
            handler.getClass();
            handler.postDelayed(ctmVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        mi.D(activity, new a(this.this$0));
    }

    @Override // defpackage.n4b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ctm ctmVar = this.this$0;
        int i = ctmVar.a - 1;
        ctmVar.a = i;
        if (i == 0 && ctmVar.c) {
            ctmVar.f.g(kyf.ON_STOP);
            ctmVar.d = true;
        }
    }
}
