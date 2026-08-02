package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.Window;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class hoe {
    public static final int a = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static final void a(np2 np2Var, boolean z, Function1 function1) {
        function1.getClass();
        int i = a;
        int i2 = b;
        b1b.a(np2Var, new zyr(i, i2, 0, function1), new zyr(i, i2, 0, function1));
        if (Build.VERSION.SDK_INT >= 29) {
            np2Var.getWindow().setNavigationBarContrastEnforced(z);
        }
    }

    public static final void b(Window window) {
        window.getClass();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
    }

    public static final void c(np2 np2Var) {
        if (!asq.H(np2Var)) {
            q5g.I(np2Var.getWindow(), false);
            return;
        }
        Window window = np2Var.getWindow();
        window.getClass();
        b(window);
    }
}
