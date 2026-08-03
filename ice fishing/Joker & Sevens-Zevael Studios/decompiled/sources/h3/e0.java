package h3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2770e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final u3.a f2771f = new u3.a(u3.a.f6685c);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2772g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f2773h = new AccelerateInterpolator(1.5f);

    public static void f(View view, i0 i0Var) {
        z k3 = k(view);
        if (k3 != null) {
            k3.b(i0Var);
            if (k3.f2837h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), i0Var);
            }
        }
    }

    public static void g(View view, i0 i0Var, a1 a1Var, boolean z10) {
        z k3 = k(view);
        if (k3 != null) {
            k3.f2836g = a1Var;
            if (!z10) {
                k3.c();
                z10 = k3.f2837h == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), i0Var, a1Var, z10);
            }
        }
    }

    public static void h(View view, a1 a1Var, List list) {
        z k3 = k(view);
        if (k3 != null) {
            a1Var = k3.d(a1Var, list);
            if (k3.f2837h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), a1Var, list);
            }
        }
    }

    public static void i(View view, i0 i0Var, x4.l lVar) {
        z k3 = k(view);
        if (k3 != null) {
            k3.e(i0Var, lVar);
            if (k3.f2837h == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                i(viewGroup.getChildAt(i10), i0Var, lVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static z k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof d0) {
            return ((d0) tag).f2768a;
        }
        return null;
    }
}
