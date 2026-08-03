package h3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class o {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i10 = x.f2832a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void b(View view) {
        view.requestApplyInsets();
    }
}
