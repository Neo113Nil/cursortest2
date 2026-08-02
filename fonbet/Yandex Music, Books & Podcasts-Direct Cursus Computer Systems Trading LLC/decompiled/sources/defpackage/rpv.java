package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class rpv extends upv {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final k5c f = new k5c(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, vpv vpvVar) {
        rr4 j = j(view);
        if (j != null) {
            j.f(vpvVar);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), vpvVar);
            }
        }
    }

    public static void g(View view, vpv vpvVar, kqv kqvVar, boolean z) {
        rr4 j = j(view);
        if (j != null) {
            j.b = kqvVar;
            if (!z) {
                j.g(vpvVar);
                z = j.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), vpvVar, kqvVar, z);
            }
        }
    }

    public static void h(View view, kqv kqvVar, List list) {
        rr4 j = j(view);
        if (j != null) {
            kqvVar = j.h(kqvVar, list);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), kqvVar, list);
            }
        }
    }

    public static void i(View view, vpv vpvVar, nur nurVar) {
        rr4 j = j(view);
        if (j != null) {
            j.i(vpvVar, nurVar);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), vpvVar, nurVar);
            }
        }
    }

    public static rr4 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof qpv) {
            return ((qpv) tag).a;
        }
        return null;
    }
}
