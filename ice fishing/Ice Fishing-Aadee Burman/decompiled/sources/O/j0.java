package O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.ads.C2545Eo;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishing.icefishinglive2.C5275R;
import g0.C4519a;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2091e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C4519a f2092f = new C4519a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2093g = new DecelerateInterpolator();

    public static void e(View view) {
        C2545Eo j6 = j(view);
        if (j6 != null) {
            ((View) j6.f24652w).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z3) {
        C2545Eo j6 = j(view);
        if (j6 != null) {
            j6.f24651v = windowInsets;
            if (!z3) {
                View view2 = (View) j6.f24652w;
                int[] iArr = (int[]) j6.f24653x;
                view2.getLocationOnScreen(iArr);
                z3 = true;
                j6.f24649n = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z3);
            }
        }
    }

    public static void g(View view, A0 a02, List list) {
        C2545Eo j6 = j(view);
        if (j6 != null) {
            j6.e(a02, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), a02, list);
            }
        }
    }

    public static void h(View view, C2991bm c2991bm) {
        C2545Eo j6 = j(view);
        if (j6 != null) {
            View view2 = (View) j6.f24652w;
            int[] iArr = (int[]) j6.f24653x;
            view2.getLocationOnScreen(iArr);
            int i = j6.f24649n - iArr[1];
            j6.f24650u = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                h(viewGroup.getChildAt(i6), c2991bm);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(C5275R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C2545Eo j(View view) {
        Object tag = view.getTag(C5275R.id.tag_window_insets_animation_callback);
        if (tag instanceof i0) {
            return ((i0) tag).f2089a;
        }
        return null;
    }
}
