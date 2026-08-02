package com.yandex.plus.pay.graphql.offers;

import android.graphics.Color;
import com.yandex.plus.core.data.common.r;
import com.yandex.plus.core.graphql.fragment.w;
import com.yandex.plus.core.graphql.fragment.x;
import com.yandex.plus.core.graphql.fragment.y;
import com.yandex.plus.core.graphql.fragment.z;
import defpackage.aa5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.plus.core.data.common.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.plus.core.data.common.k a(String str, List list) {
        r rVar;
        List b;
        if (str != null) {
            Integer A = com.yandex.plus.bdui.flex.ui.a.A(str);
            com.yandex.plus.core.data.common.f fVar = A != null ? new com.yandex.plus.core.data.common.f(A.intValue()) : null;
            if (fVar != null) {
                return fVar;
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar != null) {
                    com.yandex.plus.core.graphql.type.c cVar = wVar.e;
                    y yVar = wVar.c;
                    z zVar = wVar.d;
                    ArrayList<x> arrayList2 = wVar.b;
                    int ordinal = cVar.ordinal();
                    if (ordinal == 0) {
                        List b2 = b(arrayList2);
                        if (b2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (x xVar : arrayList2) {
                                Double valueOf = xVar != null ? Double.valueOf(xVar.c) : null;
                                if (valueOf != null) {
                                    arrayList3.add(valueOf);
                                }
                            }
                            rVar = new com.yandex.plus.core.data.common.o(b2, arrayList3, wVar.a);
                        }
                    } else if (ordinal == 1 && zVar != null && yVar != null && (b = b(arrayList2)) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (x xVar2 : arrayList2) {
                            Double valueOf2 = xVar2 != null ? Double.valueOf(xVar2.c) : null;
                            if (valueOf2 != null) {
                                arrayList4.add(valueOf2);
                            }
                        }
                        rVar = new r(b, arrayList4, new Pair(Double.valueOf(zVar.a), Double.valueOf(zVar.b)), new Pair(Double.valueOf(yVar.a), Double.valueOf(yVar.b)));
                    }
                    if (rVar == null) {
                        arrayList.add(rVar);
                    }
                }
                rVar = null;
                if (rVar == null) {
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new com.yandex.plus.core.data.common.j(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [t7o] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public static List b(ArrayList arrayList) {
        ?? t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x xVar = (x) it.next();
                Integer valueOf = xVar != null ? Integer.valueOf(aa5.l(Color.parseColor(xVar.b), ((int) (xVar.a * KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE)) : null;
                if (valueOf != null) {
                    t7oVar.add(valueOf);
                }
            }
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        r7o r7oVar3 = z7o.b;
        return t7oVar instanceof t7o ? null : t7oVar;
    }
}
