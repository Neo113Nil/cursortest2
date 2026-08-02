package com.yandex.plus.bdui.plus.action.serializer;

import defpackage.b6e;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.q5f;
import defpackage.uah;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends com.yandex.plus.bdui.plus.utils.a {
    public static final com.yandex.plus.bdui.f e = com.yandex.plus.bdui.f.a;

    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object b(l6b l6bVar, Object obj) {
        String str;
        com.yandex.plus.bdui.plus.action.f fVar = (com.yandex.plus.bdui.plus.action.f) obj;
        fVar.getClass();
        l6bVar.getClass();
        com.yandex.plus.bdui.l lVar = fVar.a;
        com.yandex.plus.bdui.k kVar = lVar.a;
        if (Intrinsics.d(kVar, com.yandex.plus.bdui.i.a)) {
            str = "SUCCESS";
        } else if (Intrinsics.d(kVar, com.yandex.plus.bdui.e.a)) {
            str = "CANCEL";
        } else if (kVar instanceof com.yandex.plus.bdui.g) {
            str = "FALLBACK";
        } else if (Intrinsics.d(kVar, com.yandex.plus.bdui.d.a)) {
            str = "ERROR";
        } else if (Intrinsics.d(kVar, com.yandex.plus.bdui.j.a)) {
            str = "FAILURE";
        } else {
            if (!(kVar instanceof com.yandex.plus.bdui.h)) {
                b6e.s();
                return null;
            }
            str = ((com.yandex.plus.bdui.h) kVar).a;
        }
        String name = kVar instanceof com.yandex.plus.bdui.g ? ((com.yandex.plus.bdui.g) kVar).a.name() : null;
        Map map = lVar.b;
        return new g(str, name, map != null ? com.yandex.plus.bdui.plus.analytics.b.L(map) : null, fVar.b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object c(Object obj, eg7 eg7Var) {
        com.yandex.plus.bdui.k hVar;
        com.yandex.plus.bdui.k kVar;
        Pair pair;
        g gVar = (g) obj;
        gVar.getClass();
        eg7Var.getClass();
        String str = gVar.a;
        switch (str.hashCode()) {
            case -1149187101:
                if (str.equals("SUCCESS")) {
                    kVar = com.yandex.plus.bdui.i.a;
                    break;
                }
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
                break;
            case -368591510:
                if (str.equals("FAILURE")) {
                    kVar = com.yandex.plus.bdui.j.a;
                    break;
                }
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
                break;
            case 66247144:
                if (str.equals("ERROR")) {
                    kVar = com.yandex.plus.bdui.d.a;
                    break;
                }
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
                break;
            case 1543870178:
                if (str.equals("FALLBACK")) {
                    String str2 = gVar.b;
                    com.yandex.plus.bdui.f fVar = Intrinsics.d(str2, "FROM_BACKEND") ? com.yandex.plus.bdui.f.a : Intrinsics.d(str2, "START_FAILED") ? com.yandex.plus.bdui.f.b : e;
                    fVar.getClass();
                    hVar = new com.yandex.plus.bdui.g(fVar);
                    kVar = hVar;
                    break;
                }
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
            case 1980572282:
                if (str.equals("CANCEL")) {
                    kVar = com.yandex.plus.bdui.e.a;
                    break;
                }
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
                break;
            default:
                hVar = new com.yandex.plus.bdui.h(str);
                kVar = hVar;
                break;
        }
        q5f q5fVar = gVar.c;
        Map map = null;
        if (q5fVar != null) {
            LinkedHashMap O = com.yandex.plus.bdui.plus.analytics.b.O(q5fVar);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : O.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    key.getClass();
                    pair = new Pair(key, value);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            map = uah.n(arrayList);
        }
        return new com.yandex.plus.bdui.plus.action.f(new com.yandex.plus.bdui.l(kVar, map), gVar.d);
    }
}
