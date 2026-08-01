package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.H;

/* loaded from: classes.dex */
public abstract class F {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0096m enumC0096m) {
        C0103u d2;
        D1.i.e(activity, "activity");
        D1.i.e(enumC0096m, "event");
        if (!(activity instanceof InterfaceC0101s) || (d2 = ((InterfaceC0101s) activity).d()) == null) {
            return;
        }
        d2.d(enumC0096m);
    }

    public static void b(Activity activity) {
        D1.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new H(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
