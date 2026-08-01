package O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0117a;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.List;

/* loaded from: classes.dex */
public final class T extends W {
    public static final PathInterpolator e = new PathInterpolator(RecyclerView.f2111C0, 1.1f, RecyclerView.f2111C0, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0117a f766f = new C0117a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f767g = new DecelerateInterpolator();

    public static void e(View view) {
        C0028d j = j(view);
        if (j != null) {
            ((View) j.e).setTranslationY(RecyclerView.f2111C0);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z2) {
        C0028d j = j(view);
        if (j != null) {
            j.f797b = windowInsets;
            if (!z2) {
                View view2 = (View) j.e;
                int[] iArr = (int[]) j.f800f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j.f798c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, j0 j0Var, List list) {
        C0028d j = j(view);
        if (j != null) {
            j.b(j0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), j0Var, list);
            }
        }
    }

    public static void h(View view, F.i iVar) {
        C0028d j = j(view);
        if (j != null) {
            View view2 = (View) j.e;
            int[] iArr = (int[]) j.f800f;
            view2.getLocationOnScreen(iArr);
            int i = j.f798c - iArr[1];
            j.f799d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), iVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0028d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof S) {
            return ((S) tag).f764a;
        }
        return null;
    }
}
