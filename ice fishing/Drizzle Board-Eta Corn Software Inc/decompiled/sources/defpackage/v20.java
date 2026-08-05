package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.x20;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class v20 {
    public static void NCTxEWno(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            x20.qoPGr6Ce.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new x20.qoPGr6Ce());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new x20(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void qoPGr6Ce(Activity activity, oo ooVar) {
        xo b2ZJblxo;
        ooVar.getClass();
        if (!(activity instanceof vo) || (b2ZJblxo = ((vo) activity).b2ZJblxo()) == null) {
            return;
        }
        b2ZJblxo.wxUZMvaN(ooVar);
    }
}
