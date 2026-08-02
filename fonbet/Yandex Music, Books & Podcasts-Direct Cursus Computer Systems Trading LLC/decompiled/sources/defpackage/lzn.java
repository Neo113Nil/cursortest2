package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.nzn;

/* loaded from: classes.dex */
public abstract class lzn {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, kyf kyfVar) {
        activity.getClass();
        kyfVar.getClass();
        if (activity instanceof dzf) {
            nyf lifecycle = ((dzf) activity).getLifecycle();
            if (lifecycle instanceof gzf) {
                ((gzf) lifecycle).g(kyfVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            nzn.a.Companion.getClass();
            mzn.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new nzn(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
