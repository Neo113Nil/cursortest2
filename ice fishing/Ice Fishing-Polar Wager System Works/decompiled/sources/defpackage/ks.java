package defpackage;

/* loaded from: classes.dex */
public class ks extends defpackage.ps {
    @Override // defpackage.ps
    public void oh6vYeIP(defpackage.me1 me1Var, defpackage.me1 me1Var2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        me1Var.getClass();
        me1Var2.getClass();
        window.getClass();
        view.getClass();
        defpackage.s70.hyxIchWRW(window, false);
        window.setStatusBarColor(z ? me1Var.oh6vYeIP : me1Var.IHQe1A4L2xu);
        window.setNavigationBarColor(z2 ? me1Var2.oh6vYeIP : me1Var2.IHQe1A4L2xu);
        int i = android.os.Build.VERSION.SDK_INT;
        defpackage.l80 vo1Var = i >= 35 ? new defpackage.vo1(window) : i >= 30 ? new defpackage.uo1(window) : i >= 26 ? new defpackage.to1(window) : new defpackage.so1(window);
        vo1Var.QQUzIjv3iOC5(!z);
        vo1Var.NHJTzaLwkd(!z2);
    }
}
