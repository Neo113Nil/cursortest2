package O;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public abstract class B {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static j0 b(View view, j0 j0Var, Rect rect) {
        WindowInsets f2 = j0Var.f();
        if (f2 != null) {
            return j0.g(view, view.computeSystemWindowInsets(f2, rect));
        }
        rect.setEmpty();
        return j0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static boolean h(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void k(View view, float f2) {
        view.setElevation(f2);
    }

    public static void l(View view, InterfaceC0039o interfaceC0039o) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0039o);
        }
        if (interfaceC0039o == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new A(view, interfaceC0039o));
        }
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }
}
