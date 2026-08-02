package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.domesticroots.certificatetransparency.datasource.a;

/* loaded from: classes4.dex */
public abstract class xh91 {
    public static final o501 a;
    public static final r501 b;

    static {
        int i = 25;
        a = new o501(i);
        b = new r501(i);
    }

    public static a a(ru.domesticroots.certificatetransparency.cache.a aVar, yvi0 yvi0Var) {
        return new a(aVar, yvi0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RecyclerView b(View view) {
        RecyclerView recyclerView;
        if (view instanceof RecyclerView) {
            WeakHashMap weakHashMap = b.a;
            if (ViewCompat$Api21Impl.j(view)) {
                return (RecyclerView) view;
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList i = scc.i(view);
            while (!i.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) kp50.L(i);
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        recyclerView = null;
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null && (childAt instanceof RecyclerView)) {
                        WeakHashMap weakHashMap2 = b.a;
                        if (ViewCompat$Api21Impl.j(childAt)) {
                            recyclerView = (RecyclerView) childAt;
                            break;
                        }
                    }
                    if (childAt instanceof ViewGroup) {
                        i.add(childAt);
                    }
                    i2++;
                }
                if (recyclerView != null) {
                    return recyclerView;
                }
            }
        }
        return null;
    }

    public static rza0 c() {
        return zya0.a;
    }

    public static rza0 d() {
        return zya0.a;
    }
}
