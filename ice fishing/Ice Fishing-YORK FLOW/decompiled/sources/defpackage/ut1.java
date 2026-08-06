package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ut1 {
    public static void ZpBGe2uQfcn8(android.view.WindowInsets windowInsets, android.view.View view) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (android.view.View.OnApplyWindowInsetsListener) view.getTag(com.ice.fishing.wolberta.R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void giKS3J6vZuNy(android.view.View view, defpackage.ct0 ct0Var) {
        defpackage.tt1 tt1Var = ct0Var != null ? new defpackage.tt1(view, ct0Var) : null;
        if (android.os.Build.VERSION.SDK_INT < 30) {
            view.setTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener, tt1Var);
        }
        if (view.getTag(com.ice.fishing.wolberta.R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (tt1Var != null) {
            view.setOnApplyWindowInsetsListener(tt1Var);
        } else {
            view.setOnApplyWindowInsetsListener((android.view.View.OnApplyWindowInsetsListener) view.getTag(com.ice.fishing.wolberta.R.id.tag_window_insets_animation_callback));
        }
    }
}
