package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.mu0;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ku0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void GWasM1elztuh(Activity activity, l90 l90Var) {
        l90Var.getClass();
        if (activity instanceof t90) {
            w90 AvO7iQsrTN = ((t90) activity).AvO7iQsrTN();
            if (AvO7iQsrTN instanceof w90) {
                AvO7iQsrTN.xqGvceK5x(l90Var);
            }
        }
    }

    public static void Yi7zF1RB1(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            mu0.GWasM1elztuh.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new mu0.GWasM1elztuh());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new mu0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
