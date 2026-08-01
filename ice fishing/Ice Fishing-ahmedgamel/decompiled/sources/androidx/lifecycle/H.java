package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.J;

/* loaded from: classes.dex */
public abstract class H {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0496n event) {
        kotlin.jvm.internal.h.e(event, "event");
        if (activity instanceof InterfaceC0503v) {
            AbstractC0498p lifecycle = ((InterfaceC0503v) activity).getLifecycle();
            if (lifecycle instanceof C0505x) {
                ((C0505x) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            J.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new J.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new J(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
