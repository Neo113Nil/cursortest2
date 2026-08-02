package O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.C2582Fo;
import g0.C4529a;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2179e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C4529a f2180f = new C4529a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2181g = new DecelerateInterpolator();

    public static void e(View view) {
        C2582Fo j6 = j(view);
        if (j6 != null) {
            ((View) j6.f25637w).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z6) {
        C2582Fo j6 = j(view);
        if (j6 != null) {
            j6.f25636v = windowInsets;
            if (!z6) {
                View view2 = (View) j6.f25637w;
                int[] iArr = (int[]) j6.f25638x;
                view2.getLocationOnScreen(iArr);
                z6 = true;
                j6.f25634n = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z6);
            }
        }
    }

    public static void g(View view, A0 a02, List list) {
        C2582Fo j6 = j(view);
        if (j6 != null) {
            j6.f(a02, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), a02, list);
            }
        }
    }

    public static void h(View view, S0.c cVar) {
        C2582Fo j6 = j(view);
        if (j6 != null) {
            View view2 = (View) j6.f25637w;
            int[] iArr = (int[]) j6.f25638x;
            view2.getLocationOnScreen(iArr);
            int i = j6.f25634n - iArr[1];
            j6.f25635u = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), cVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(C5248R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C2582Fo j(View view) {
        Object tag = view.getTag(C5248R.id.tag_window_insets_animation_callback);
        if (tag instanceof i0) {
            return ((i0) tag).f2177a;
        }
        return null;
    }
}
