package O;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class C {
    public static j0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        j0 g2 = j0.g(null, rootWindowInsets);
        h0 h0Var = g2.f819a;
        h0Var.p(g2);
        h0Var.d(view.getRootView());
        return g2;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
