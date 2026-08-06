package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zo extends yo {
    @Override // defpackage.xo, defpackage.vo, defpackage.ap
    public void Yi7zF1RB1(n71 n71Var, n71 n71Var2, Window window, View view, boolean z, boolean z2) {
        n71Var.getClass();
        n71Var2.getClass();
        window.getClass();
        view.getClass();
        l60.arNh8D4Z5gB(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof cc)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(false);
        int i3 = Build.VERSION.SDK_INT;
        b70 ah1Var = i3 >= 35 ? new ah1(window) : i3 >= 30 ? new zg1(window) : i3 >= 26 ? new yg1(window) : new xg1(window);
        ah1Var.DmJncFq5(!z);
        ah1Var.MZhzXH72(true ^ z2);
    }
}
