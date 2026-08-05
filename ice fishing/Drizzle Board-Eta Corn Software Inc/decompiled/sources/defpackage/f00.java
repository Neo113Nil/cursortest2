package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f00 extends tf {
    final /* synthetic */ g00 this$0;

    /* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
    public static final class qoPGr6Ce extends tf {
        final /* synthetic */ g00 this$0;

        public qoPGr6Ce(g00 g00Var) {
            this.this$0 = g00Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.NCTxEWno();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            g00 g00Var = this.this$0;
            int i = g00Var.NCTxEWno + 1;
            g00Var.NCTxEWno = i;
            if (i == 1 && g00Var.VgvYg0wo) {
                g00Var.b2ZJblxo.wxUZMvaN(oo.ON_START);
                g00Var.VgvYg0wo = false;
            }
        }
    }

    public f00(g00 g00Var) {
        this.this$0 = g00Var;
    }

    @Override // defpackage.tf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = x20.MdtA4re8;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((x20) findFragmentByTag).NCTxEWno = this.this$0.jb9XjC4I;
        }
    }

    @Override // defpackage.tf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        g00 g00Var = this.this$0;
        int i = g00Var.MdtA4re8 - 1;
        g00Var.MdtA4re8 = i;
        if (i == 0) {
            Handler handler = g00Var.P7K7Inc8;
            handler.getClass();
            handler.postDelayed(g00Var.Qr9iLBAD, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        i0.wxUZMvaN(activity, new qoPGr6Ce(this.this$0));
    }

    @Override // defpackage.tf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        g00 g00Var = this.this$0;
        int i = g00Var.NCTxEWno - 1;
        g00Var.NCTxEWno = i;
        if (i == 0 && g00Var.wxUZMvaN) {
            g00Var.b2ZJblxo.wxUZMvaN(oo.ON_STOP);
            g00Var.VgvYg0wo = true;
        }
    }
}
