package defpackage;

/* loaded from: classes.dex */
public final class os extends defpackage.ns {
    @Override // defpackage.ms, defpackage.ks, defpackage.ps
    public void oh6vYeIP(defpackage.me1 me1Var, defpackage.me1 me1Var2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        me1Var.getClass();
        me1Var2.getClass();
        window.getClass();
        view.getClass();
        defpackage.s70.hyxIchWRW(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                java.lang.Object tag = childAt.getTag();
                if (tag instanceof java.util.List) {
                    java.util.List list = (java.util.List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof defpackage.ee)) {
                        java.util.Iterator it = ((java.lang.Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = android.os.Build.VERSION.SDK_INT;
        defpackage.l80 vo1Var = i3 >= 35 ? new defpackage.vo1(window) : i3 >= 30 ? new defpackage.uo1(window) : i3 >= 26 ? new defpackage.to1(window) : new defpackage.so1(window);
        vo1Var.QQUzIjv3iOC5(!z);
        vo1Var.NHJTzaLwkd(true ^ z2);
    }
}
