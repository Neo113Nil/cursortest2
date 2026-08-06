package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class r41 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void ZpBGe2uQfcn8(android.app.Activity activity, defpackage.og0 og0Var) {
        og0Var.getClass();
        if (activity instanceof defpackage.wg0) {
            defpackage.zg0 QiMR8OkAhezm = ((defpackage.wg0) activity).QiMR8OkAhezm();
            if (QiMR8OkAhezm instanceof defpackage.zg0) {
                QiMR8OkAhezm.JhCgjQRTAOCT(og0Var);
            }
        }
    }

    public static void giKS3J6vZuNy(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            t41.ZpBGe2uQfcn8.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new t41.ZpBGe2uQfcn8());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new defpackage.t41(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
