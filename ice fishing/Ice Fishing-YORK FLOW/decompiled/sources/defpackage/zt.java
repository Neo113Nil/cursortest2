package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zt extends defpackage.yt {
    @Override // defpackage.xt, defpackage.vt, defpackage.au
    public void giKS3J6vZuNy(defpackage.vi1 vi1Var, defpackage.vi1 vi1Var2, android.view.Window window, android.view.View view, boolean z, boolean z2) {
        vi1Var.getClass();
        vi1Var2.getClass();
        window.getClass();
        view.getClass();
        defpackage.n70.qjMheFZ0l9kA(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof defpackage.tf)) {
                        java.util.Iterator it = ((java.lang.Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(false);
        int i3 = android.os.Build.VERSION.SDK_INT;
        defpackage.v70 qw1Var = i3 >= 35 ? new defpackage.qw1(window) : i3 >= 30 ? new defpackage.pw1(window) : i3 >= 26 ? new defpackage.ow1(window) : new defpackage.nw1(window);
        qw1Var.KrtOTfE6jiS2(!z);
        qw1Var.frSwwKIlbUhK(true ^ z2);
    }
}
