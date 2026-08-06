package defpackage;

/* loaded from: classes.dex */
public abstract class hm1 {
    public static void IHQe1A4L2xu(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(com.combinations.spin.balbi.R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void oh6vYeIP(android.view.View view, defpackage.jq0 jq0Var) {
        defpackage.gm1 gm1Var = jq0Var != null ? new defpackage.gm1(view, jq0Var) : null;
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(com.combinations.spin.balbi.R.id.tag_on_apply_window_listener, gm1Var);
        }
        if (view.getTag(com.combinations.spin.balbi.R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (gm1Var != null) {
            view.setOnApplyWindowInsetsListener(gm1Var);
        } else {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(com.combinations.spin.balbi.R.id.tag_window_insets_animation_callback));
        }
    }
}
