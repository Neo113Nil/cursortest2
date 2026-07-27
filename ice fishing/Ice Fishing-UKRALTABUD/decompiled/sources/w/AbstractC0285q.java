package w;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: w.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0285q {
    public static S a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        S a2 = S.a(rootWindowInsets, null);
        P p2 = a2.f3039a;
        p2.o(a2);
        p2.d(view.getRootView());
        return a2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
