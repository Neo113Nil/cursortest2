package com.yandex.plus.home.graphql.subscription;

import androidx.core.app.n0;
import com.yandex.plus.core.graphql.fragment.c4;
import com.yandex.plus.core.graphql.fragment.h3;
import com.yandex.plus.core.graphql.fragment.nl;
import com.yandex.plus.core.graphql.fragment.ol;
import com.yandex.plus.core.graphql.fragment.x2;
import com.yandex.plus.core.graphql.fragment.z3;
import com.yandex.plus.core.graphql.x0;
import defpackage.d0p;
import defpackage.ghp;
import defpackage.o7t;
import defpackage.v75;
import defpackage.wz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends n0 {
    public static boolean u(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.d(((z3) obj).b.b, "widgetType")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((z3) it.next()).b.a, "bank")) {
                return true;
            }
        }
        return false;
    }

    public static h3 v(c4 c4Var, String str) {
        Object obj;
        List list = c4Var.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((z3) obj).b.b, str)) {
                    break;
                }
            }
            z3 z3Var = (z3) obj;
            if (z3Var != null) {
                return z3Var.b;
            }
        }
        return null;
    }

    public static h3 w(ol olVar, String str) {
        Object obj;
        List list = olVar.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((nl) obj).b.b, str)) {
                    break;
                }
            }
            nl nlVar = (nl) obj;
            if (nlVar != null) {
                return nlVar.b;
            }
        }
        return null;
    }

    public static o7t x(x0 x0Var) {
        ArrayList arrayList = x0Var.a.b.a;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x2) it.next()).a);
        }
        return new o7t(ghp.c(new wz0(1, arrayList2), new d0p(24)), new com.yandex.plus.home.feature.webviews.internal.webview.e(3));
    }
}
