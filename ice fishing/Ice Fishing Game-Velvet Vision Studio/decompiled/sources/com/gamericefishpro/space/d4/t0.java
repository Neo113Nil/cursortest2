package com.gamericefishpro.space.d4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.gamericefishpro.space.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends w0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final com.gamericefishpro.space.x4.a f = new com.gamericefishpro.space.x4.a();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, x0 x0Var) {
        o0 o0VarK = k(view);
        if (o0VarK != null) {
            o0VarK.d(x0Var);
            if (o0VarK.d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), x0Var);
            }
        }
    }

    public static void g(View view, x0 x0Var, o1 o1Var, boolean z) {
        o0 o0VarK = k(view);
        if (o0VarK != null) {
            o0VarK.e = o1Var;
            if (!z) {
                o0VarK.e();
                z = o0VarK.d == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), x0Var, o1Var, z);
            }
        }
    }

    public static void h(View view, o1 o1Var, List list) {
        o0 o0VarK = k(view);
        if (o0VarK != null) {
            o1Var = o0VarK.f(o1Var, list);
            if (o0VarK.d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), o1Var, list);
            }
        }
    }

    public static void i(View view, x0 x0Var, com.gamericefishpro.space.u6.e eVar) {
        o0 o0VarK = k(view);
        if (o0VarK != null) {
            o0VarK.g(x0Var, eVar);
            if (o0VarK.d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), x0Var, eVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static o0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof s0) {
            return ((s0) tag).a;
        }
        return null;
    }
}
