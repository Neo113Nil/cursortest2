package defpackage;

/* loaded from: classes.dex */
public abstract class mm1 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;

    static {
        new java.util.WeakHashMap();
    }

    public static void IHQe1A4L2xu(android.view.View view, defpackage.od odVar) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(odVar != null ? new defpackage.tn1(odVar) : null);
            return;
        }
        android.view.animation.PathInterpolator pathInterpolator = defpackage.sn1.adDC3e2L;
        android.view.View.OnApplyWindowInsetsListener rn1Var = odVar != null ? new defpackage.rn1(view, odVar) : null;
        view.setTag(com.combinations.spin.balbi.R.id.tag_window_insets_animation_callback, rn1Var);
        if (view.getTag(com.combinations.spin.balbi.R.id.tag_compat_insets_dispatch) == null && view.getTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(rn1Var);
        }
    }
}
