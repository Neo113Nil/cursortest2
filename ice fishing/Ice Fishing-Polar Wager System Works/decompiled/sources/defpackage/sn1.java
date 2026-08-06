package defpackage;

/* loaded from: classes.dex */
public final class sn1 extends defpackage.vn1 {
    public static final android.view.animation.PathInterpolator adDC3e2L = new android.view.animation.PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final defpackage.av xiZrDbcSW0 = new defpackage.av();
    public static final android.view.animation.DecelerateInterpolator AARZUJiTa = new android.view.animation.DecelerateInterpolator(1.5f);
    public static final android.view.animation.AccelerateInterpolator EXtogiMhuM = new android.view.animation.AccelerateInterpolator(1.5f);

    public static void AARZUJiTa(android.view.View view, defpackage.wn1 wn1Var, defpackage.ro1 ro1Var, boolean z) {
        defpackage.od SH1y5HwkJhh = SH1y5HwkJhh(view);
        if (SH1y5HwkJhh != null) {
            SH1y5HwkJhh.xiZrDbcSW0 = ro1Var;
            if (!z) {
                SH1y5HwkJhh.xiZrDbcSW0(wn1Var);
                z = SH1y5HwkJhh.adDC3e2L == 0;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                AARZUJiTa(viewGroup.getChildAt(i), wn1Var, ro1Var, z);
            }
        }
    }

    public static void EXtogiMhuM(android.view.View view, defpackage.ro1 ro1Var, java.util.List list) {
        defpackage.od SH1y5HwkJhh = SH1y5HwkJhh(view);
        if (SH1y5HwkJhh != null) {
            ro1Var = SH1y5HwkJhh.AARZUJiTa(ro1Var, list);
            if (SH1y5HwkJhh.adDC3e2L == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                EXtogiMhuM(viewGroup.getChildAt(i), ro1Var, list);
            }
        }
    }

    public static defpackage.od SH1y5HwkJhh(android.view.View view) {
        java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.tag_window_insets_animation_callback);
        if (tag instanceof defpackage.rn1) {
            return ((defpackage.rn1) tag).IHQe1A4L2xu;
        }
        return null;
    }

    public static void riuEU0zW4(android.view.View view, defpackage.wn1 wn1Var, defpackage.F7NU4MC0GW f7nu4mc0gw) {
        defpackage.od SH1y5HwkJhh = SH1y5HwkJhh(view);
        if (SH1y5HwkJhh != null) {
            SH1y5HwkJhh.EXtogiMhuM(wn1Var, f7nu4mc0gw);
            if (SH1y5HwkJhh.adDC3e2L == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                riuEU0zW4(viewGroup.getChildAt(i), wn1Var, f7nu4mc0gw);
            }
        }
    }

    public static void xiZrDbcSW0(defpackage.wn1 wn1Var, android.view.View view) {
        defpackage.od SH1y5HwkJhh = SH1y5HwkJhh(view);
        if (SH1y5HwkJhh != null) {
            SH1y5HwkJhh.adDC3e2L(wn1Var);
            if (SH1y5HwkJhh.adDC3e2L == 0) {
                return;
            }
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                xiZrDbcSW0(wn1Var, viewGroup.getChildAt(i));
            }
        }
    }
}
