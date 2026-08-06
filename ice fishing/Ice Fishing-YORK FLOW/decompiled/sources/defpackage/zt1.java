package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class zt1 {
    public static final /* synthetic */ int ZpBGe2uQfcn8 = 0;

    static {
        new java.util.WeakHashMap();
    }

    public static void ZpBGe2uQfcn8(android.view.View view, defpackage.hv1 hv1Var) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(hv1Var != null ? new defpackage.nv1(hv1Var) : null);
            return;
        }
        android.view.animation.PathInterpolator pathInterpolator = defpackage.mv1.WDYagTQQm9ns;
        android.view.View.OnApplyWindowInsetsListener lv1Var = hv1Var != null ? new defpackage.lv1(view, hv1Var) : null;
        view.setTag(com.ice.fishing.wolberta.R.id.tag_window_insets_animation_callback, lv1Var);
        if (view.getTag(com.ice.fishing.wolberta.R.id.tag_compat_insets_dispatch) == null && view.getTag(com.ice.fishing.wolberta.R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(lv1Var);
        }
    }
}
