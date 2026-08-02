package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class en8 {
    public final gc8 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public en8(gc8 gc8Var) {
        this.a = gc8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bn8 a(View view, String str) {
        bn8 bn8Var;
        if (view instanceof f29) {
            jc8 div = ((f29) view).getDiv();
            List B = div != null ? div.d().B() : null;
            if (B != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : B) {
                    if (Intrinsics.d(((bn8) obj).c().getId(), str)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty() && arrayList.size() <= 1) {
                    bn8Var = (bn8) CollectionsKt.Q(arrayList);
                    if (bn8Var == null) {
                        return bn8Var;
                    }
                    Object parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        return a(view2, str);
                    }
                }
            }
            bn8Var = null;
            if (bn8Var == null) {
            }
        } else {
            if (view instanceof gc8) {
                wdp.n0(this.a, new RuntimeException(ouj.k('\'', "Unable to find animator with id '", str)));
                return null;
            }
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return a(view3, str);
            }
        }
        return null;
    }
}
