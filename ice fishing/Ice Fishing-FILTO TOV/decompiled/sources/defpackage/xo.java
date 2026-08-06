package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class xo extends wo {
    @Override // defpackage.vo, defpackage.ap
    public void Yi7zF1RB1(n71 n71Var, n71 n71Var2, Window window, View view, boolean z, boolean z2) {
        n71Var.getClass();
        n71Var2.getClass();
        window.getClass();
        view.getClass();
        l60.arNh8D4Z5gB(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(false);
        int i = Build.VERSION.SDK_INT;
        b70 ah1Var = i >= 35 ? new ah1(window) : i >= 30 ? new zg1(window) : i >= 26 ? new yg1(window) : new xg1(window);
        ah1Var.DmJncFq5(!z);
        ah1Var.MZhzXH72(!z2);
    }
}
