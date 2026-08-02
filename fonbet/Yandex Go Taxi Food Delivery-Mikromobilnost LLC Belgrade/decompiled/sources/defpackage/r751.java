package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class r751 {
    public final bvf0 a;

    public r751(Window window, View view) {
        va90 va90Var = new va90(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new q751(window, va90Var);
        } else if (i >= 30) {
            this.a = new p751(window, va90Var);
        } else {
            this.a = new o751(window, va90Var);
        }
    }

    public final void a(boolean z) {
        this.a.T(z);
    }

    public final void b(boolean z) {
        this.a.U(z);
    }

    public r751(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new q751(windowInsetsController, new va90(windowInsetsController));
        } else {
            this.a = new p751(windowInsetsController, new va90(windowInsetsController));
        }
    }
}
