package defpackage;

/* loaded from: classes.dex */
public abstract class e11 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void IHQe1A4L2xu(android.app.Activity activity, defpackage.md0 md0Var) {
        md0Var.getClass();
        if (activity instanceof defpackage.ud0) {
            defpackage.xd0 EXtogiMhuM = ((defpackage.ud0) activity).EXtogiMhuM();
            if (EXtogiMhuM instanceof defpackage.xd0) {
                EXtogiMhuM.F7NU4MC0GW(md0Var);
            }
        }
    }

    public static void oh6vYeIP(android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            g11.IHQe1A4L2xu.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new g11.IHQe1A4L2xu());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new defpackage.g11(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
