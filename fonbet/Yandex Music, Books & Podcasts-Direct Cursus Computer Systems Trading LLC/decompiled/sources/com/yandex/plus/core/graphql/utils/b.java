package com.yandex.plus.core.graphql.utils;

import android.graphics.Color;
import android.os.Parcelable;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.data.common.f;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.o;
import com.yandex.plus.core.data.common.r;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.graphql.fragment.f1;
import com.yandex.plus.core.graphql.fragment.g1;
import com.yandex.plus.core.graphql.fragment.h1;
import com.yandex.plus.core.graphql.fragment.i1;
import com.yandex.plus.core.graphql.fragment.o8;
import com.yandex.plus.core.graphql.fragment.q7;
import com.yandex.plus.core.graphql.fragment.s7;
import com.yandex.plus.core.graphql.fragment.t7;
import com.yandex.plus.core.graphql.fragment.u7;
import com.yandex.plus.core.graphql.fragment.v7;
import com.yandex.plus.core.graphql.fragment.w7;
import com.yandex.plus.core.graphql.gradient.c;
import com.yandex.plus.core.graphql.gradient.g;
import com.yandex.plus.core.graphql.gradient.n;
import defpackage.aa5;
import defpackage.eeh;
import defpackage.jyr;
import defpackage.qy0;
import defpackage.r7o;
import defpackage.su4;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.u75;
import defpackage.v75;
import defpackage.x3f;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b {
    public final x3f a;

    public b(x3f x3fVar) {
        x3fVar.getClass();
        this.a = x3fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.yandex.plus.core.data.common.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(i1 i1Var) {
        o oVar;
        g1 g1Var;
        h1 h1Var = (h1) CollectionsKt.firstOrNull(i1Var.a);
        g1 g1Var2 = h1Var != null ? h1Var.c : null;
        ArrayList arrayList = i1Var.a;
        if (g1Var2 != null) {
            h1 h1Var2 = (h1) CollectionsKt.firstOrNull(arrayList);
            if (h1Var2 != null && (g1Var = h1Var2.c) != null) {
                o8 o8Var = g1Var.b;
                return new f(aa5.l(Color.parseColor(o8Var.b), eeh.b(((float) o8Var.a) * KotlinVersion.MAX_COMPONENT_VALUE)));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f1 f1Var = ((h1) it.next()).b;
                if (f1Var != null) {
                    w7 w7Var = f1Var.a.b;
                    ArrayList arrayList3 = w7Var.b;
                    ArrayList arrayList4 = new ArrayList(arrayList3.size());
                    ArrayList arrayList5 = new ArrayList(arrayList3.size());
                    int i = 0;
                    for (Object obj : arrayList3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            u75.n();
                            throw null;
                        }
                        q7 q7Var = (q7) obj;
                        arrayList4.add(i, Double.valueOf(q7Var.b));
                        o8 o8Var2 = q7Var.a.b;
                        arrayList5.add(i, Integer.valueOf(aa5.l(Color.parseColor(o8Var2.b), eeh.b(((float) o8Var2.a) * KotlinVersion.MAX_COMPONENT_VALUE))));
                        i = i2;
                    }
                    s7 s7Var = w7Var.c;
                    if (s7Var != null) {
                        oVar = new o(arrayList5, arrayList4, s7Var.a);
                    } else {
                        t7 t7Var = w7Var.d;
                        if (t7Var != null) {
                            v7 v7Var = t7Var.b;
                            Pair pair = new Pair(Double.valueOf(v7Var.a), Double.valueOf(v7Var.b));
                            u7 u7Var = t7Var.a;
                            oVar = new r(arrayList5, arrayList4, pair, new Pair(Double.valueOf(u7Var.a), Double.valueOf(u7Var.b)));
                        }
                    }
                    if (oVar == null) {
                        arrayList2.add(oVar);
                    }
                }
                oVar = null;
                if (oVar == null) {
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                return new j(arrayList2);
            }
        }
        return null;
    }

    public static ArrayList e(List list) {
        List<c> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (c cVar : list2) {
            Integer A = com.yandex.plus.bdui.flex.ui.a.A(cVar.a);
            if (A == null) {
                xq0.x("Failed parsing color from gradient");
                return null;
            }
            arrayList.add(Integer.valueOf(aa5.l(A.intValue(), (int) (Math.min(1.0d, Math.max(0.0d, cVar.b)) * KotlinVersion.MAX_COMPONENT_VALUE))));
        }
        return arrayList;
    }

    public static ArrayList f(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((c) it.next()).c));
        }
        return arrayList;
    }

    public final v b(i1 i1Var, String str, i1 i1Var2, String str2) {
        k d;
        k d2;
        if (i1Var == null || (d = a(i1Var)) == null) {
            d = d(str);
        }
        if (i1Var2 == null || (d2 = a(i1Var2)) == null) {
            d2 = d(str2);
        }
        return new v(d, d2);
    }

    public final v c(String str, String str2) {
        return new v(d(str), d(str2));
    }

    public final k d(String str) {
        Object t7oVar;
        Parcelable rVar;
        Object obj = null;
        if (str != null) {
            Integer A = com.yandex.plus.bdui.flex.ui.a.A(str);
            f fVar = A != null ? new f(A.intValue()) : null;
            if (fVar != null) {
                return fVar;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            r7o r7oVar = z7o.b;
            x3f x3fVar = this.a;
            t9f serializer = com.yandex.plus.core.graphql.gradient.k.Companion.serializer();
            serializer.getClass();
            List<com.yandex.plus.core.graphql.gradient.k> list = (List) x3fVar.b(new qy0(serializer, 0), str);
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            for (com.yandex.plus.core.graphql.gradient.k kVar : list) {
                if (kVar instanceof g) {
                    rVar = new o(e(((g) kVar).b), f(((g) kVar).b), ((g) kVar).c);
                } else {
                    if (!(kVar instanceof com.yandex.plus.core.graphql.gradient.j)) {
                        throw new x7j();
                    }
                    ArrayList e = e(((com.yandex.plus.core.graphql.gradient.j) kVar).b);
                    ArrayList f = f(((com.yandex.plus.core.graphql.gradient.j) kVar).b);
                    n nVar = ((com.yandex.plus.core.graphql.gradient.j) kVar).c;
                    Pair pair = new Pair(Double.valueOf(nVar.a), Double.valueOf(nVar.b));
                    n nVar2 = ((com.yandex.plus.core.graphql.gradient.j) kVar).d;
                    rVar = new r(e, f, pair, new Pair(Double.valueOf(nVar2.a), Double.valueOf(nVar2.b)));
                }
                arrayList.add(rVar);
            }
            t7oVar = new j(arrayList);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            obj = t7oVar;
        } else {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            String p = su4.p(a, new StringBuilder("mapToColorGradient() error="));
            jyr jyrVar = e.a;
            e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, p, null);
        }
        return (j) obj;
    }
}
