package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.EmptySet;

/* loaded from: classes10.dex */
public final class xg {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static /* synthetic */ void b(xg xgVar, ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
        if ((i & 2) != 0) {
            viewGroup2 = null;
        }
        xgVar.a(viewGroup, viewGroup2, EmptySet.a);
    }

    public final void a(ViewGroup viewGroup, ViewGroup viewGroup2, Set set) {
        viewGroup.setImportantForAccessibility(1);
        ViewGroup viewGroup3 = viewGroup;
        while (viewGroup3.getParent() != null && (viewGroup3.getParent() instanceof View) && !viewGroup3.equals(viewGroup2)) {
            ViewGroup viewGroup4 = (ViewGroup) viewGroup3.getParent();
            int childCount = viewGroup4.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup4.getChildAt(i);
                if (childAt != viewGroup3 && !set.contains(Integer.valueOf(childAt.getId()))) {
                    WeakHashMap weakHashMap = b.a;
                    if (ViewCompat$Api21Impl.i(childAt) <= ViewCompat$Api21Impl.i(viewGroup3)) {
                        Object tag = childAt.getTag(ndh0.accessibility_importance_info);
                        wg wgVar = null;
                        if (tag != null && !(tag instanceof wg)) {
                            xby.d.w(new IllegalStateException("never use id.accessibility_importance_info out of FullScreenBlocker"));
                        } else if (tag instanceof wg) {
                            wgVar = (wg) tag;
                        }
                        if (wgVar == null) {
                            wgVar = new wg(childAt);
                            childAt.setTag(ndh0.accessibility_importance_info, wgVar);
                        }
                        View view = wgVar.a;
                        wgVar.b.add(viewGroup);
                        if (wgVar.c == -1) {
                            wgVar.c = view.getImportantForAccessibility();
                            view.setImportantForAccessibility(4);
                        }
                        this.a.add(childAt);
                    }
                }
            }
            viewGroup3 = viewGroup4;
        }
    }

    public final void c(ViewGroup viewGroup) {
        ycc.v(this.a, new d8(1, viewGroup), true);
    }
}
