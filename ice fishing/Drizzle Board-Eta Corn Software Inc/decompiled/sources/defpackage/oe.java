package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oe implements qe {
    @Override // defpackage.qe
    public void qoPGr6Ce(db0 db0Var, db0 db0Var2, Window window, View view, boolean z, boolean z2) {
        db0Var.getClass();
        db0Var2.getClass();
        window.getClass();
        view.getClass();
        n50.Qr9iLBAD(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        f50 aj0Var = i >= 35 ? new aj0(window) : i >= 30 ? new zi0(window) : i >= 26 ? new yi0(window) : new xi0(window);
        aj0Var.lDXGDhIF(!z);
        aj0Var.ygLcUYwZ(!z2);
    }
}
