package defpackage;

/* loaded from: classes.dex */
public class ms extends defpackage.ls {
    @Override // defpackage.ks, defpackage.ps
    public void oh6vYeIP(defpackage.me1 me1Var, defpackage.me1 me1Var2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        me1Var.getClass();
        me1Var2.getClass();
        window.getClass();
        view.getClass();
        defpackage.s70.hyxIchWRW(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.l80 vo1Var = i >= 35 ? new defpackage.vo1(window) : i >= 30 ? new defpackage.uo1(window) : i >= 26 ? new defpackage.to1(window) : new defpackage.so1(window);
        vo1Var.QQUzIjv3iOC5(!z);
        vo1Var.NHJTzaLwkd(!z2);
    }
}
