package h3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r {
    public static a1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        a1 c3 = a1.c(null, rootWindowInsets);
        x0 x0Var = c3.f2745a;
        x0Var.r(c3);
        x0Var.d(view.getRootView());
        return c3;
    }
}
