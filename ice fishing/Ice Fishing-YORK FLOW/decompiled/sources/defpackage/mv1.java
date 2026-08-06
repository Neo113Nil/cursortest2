package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mv1 extends defpackage.pv1 {
    public static final android.view.animation.PathInterpolator WDYagTQQm9ns = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final defpackage.ww oh71FJcDz6S2 = new defpackage.ww();
    public static final android.view.animation.DecelerateInterpolator QiMR8OkAhezm = new android.view.animation.DecelerateInterpolator(1.5f);
    public static final android.view.animation.AccelerateInterpolator P05cfTpS5W5L = new android.view.animation.AccelerateInterpolator(1.5f);

    public static defpackage.hv1 GE9mJIPrb8gP(android.view.View view) {
        java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.tag_window_insets_animation_callback);
        if (tag instanceof defpackage.lv1) {
            return ((defpackage.lv1) tag).ZpBGe2uQfcn8;
        }
        return null;
    }

    public static void P05cfTpS5W5L(android.view.View view, defpackage.mw1 mw1Var, java.util.List list) {
        defpackage.hv1 GE9mJIPrb8gP = GE9mJIPrb8gP(view);
        if (GE9mJIPrb8gP != null) {
            mw1Var = GE9mJIPrb8gP.JhCgjQRTAOCT(mw1Var, list);
            if (GE9mJIPrb8gP.oh71FJcDz6S2 == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                P05cfTpS5W5L(viewGroup.getChildAt(i), mw1Var, list);
            }
        }
    }

    public static void QiMR8OkAhezm(android.view.View view, defpackage.qv1 qv1Var, defpackage.mw1 mw1Var, boolean z) {
        defpackage.hv1 GE9mJIPrb8gP = GE9mJIPrb8gP(view);
        if (GE9mJIPrb8gP != null) {
            GE9mJIPrb8gP.WDYagTQQm9ns = mw1Var;
            if (!z) {
                GE9mJIPrb8gP.fWTAfUmVKrZq(qv1Var);
                z = GE9mJIPrb8gP.oh71FJcDz6S2 == 0;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                QiMR8OkAhezm(viewGroup.getChildAt(i), qv1Var, mw1Var, z);
            }
        }
    }

    public static void e6mdH7fiFuta(android.view.View view, defpackage.qv1 qv1Var, defpackage.pd1 pd1Var) {
        defpackage.hv1 GE9mJIPrb8gP = GE9mJIPrb8gP(view);
        if (GE9mJIPrb8gP != null) {
            GE9mJIPrb8gP.WDYagTQQm9ns(qv1Var, pd1Var);
            if (GE9mJIPrb8gP.oh71FJcDz6S2 == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e6mdH7fiFuta(viewGroup.getChildAt(i), qv1Var, pd1Var);
            }
        }
    }

    public static void oh71FJcDz6S2(defpackage.qv1 qv1Var, android.view.View view) {
        defpackage.hv1 GE9mJIPrb8gP = GE9mJIPrb8gP(view);
        if (GE9mJIPrb8gP != null) {
            GE9mJIPrb8gP.giKS3J6vZuNy(qv1Var);
            if (GE9mJIPrb8gP.oh71FJcDz6S2 == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                oh71FJcDz6S2(qv1Var, viewGroup.getChildAt(i));
            }
        }
    }
}
