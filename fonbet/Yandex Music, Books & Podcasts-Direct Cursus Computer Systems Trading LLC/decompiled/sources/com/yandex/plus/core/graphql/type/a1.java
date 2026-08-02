package com.yandex.plus.core.graphql.type;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.plus.core.graphql.fragment.b7;
import com.yandex.plus.core.graphql.fragment.eb;
import com.yandex.plus.core.graphql.fragment.gn;
import com.yandex.plus.core.graphql.fragment.hb;
import com.yandex.plus.core.graphql.fragment.in;
import com.yandex.plus.core.graphql.fragment.z6;
import com.yandex.plus.home.datasource.openapi.models.g2;
import com.yandex.plus.home.datasource.openapi.models.j2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import defpackage.b6e;
import defpackage.e5b;
import defpackage.pyc;
import defpackage.t75;
import defpackage.tah;
import defpackage.v75;
import defpackage.z75;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a1 implements kotlin.coroutines.f {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i) {
        this.a = i;
    }

    public static SpannedString a(String str, String str2, pyc pycVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int T = StringsKt.T(spannableStringBuilder, str2, 0, false, 6);
        Integer valueOf = Integer.valueOf(T);
        if (T < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        pycVar.invoke(spannableStringBuilder, Integer.valueOf(intValue), Integer.valueOf(str2.length() + intValue));
        return new SpannedString(spannableStringBuilder);
    }

    public static Map b(String str, List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map j = j((hb) it.next());
            if (Intrinsics.d(j.get("type"), str)) {
                return j;
            }
        }
        return null;
    }

    public static com.yandex.plus.home.repository.api.model.user.a c(com.yandex.plus.core.graphql.z0 z0Var) {
        z0Var.getClass();
        com.yandex.plus.core.graphql.a1 a1Var = z0Var.a;
        return new com.yandex.plus.home.repository.api.model.user.a(a1Var.a, a1Var.b);
    }

    public static Map d(b7 b7Var) {
        List<z6> list;
        if (b7Var == null || (list = b7Var.g) == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (z6 z6Var : list) {
            String str = z6Var.b.d;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(z6Var.b);
        }
        return linkedHashMap;
    }

    public static com.yandex.plus.home.dailyquests.repository.api.dailyquests.g f(com.yandex.plus.home.dailyquests.repository.rest.prefs.l lVar) {
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.f eVar;
        String str = lVar.b;
        String str2 = lVar.c;
        com.yandex.plus.core.data.common.y yVar = new com.yandex.plus.core.data.common.y(lVar.g, lVar.h);
        com.yandex.plus.core.data.common.y yVar2 = new com.yandex.plus.core.data.common.y(lVar.i, lVar.j);
        String str3 = lVar.e;
        com.yandex.plus.home.dailyquests.repository.rest.prefs.k kVar = lVar.f;
        if (kVar instanceof com.yandex.plus.home.dailyquests.repository.rest.prefs.g) {
            eVar = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.d(((com.yandex.plus.home.dailyquests.repository.rest.prefs.g) kVar).a);
        } else {
            if (!(kVar instanceof com.yandex.plus.home.dailyquests.repository.rest.prefs.j)) {
                b6e.s();
                return null;
            }
            com.yandex.plus.home.dailyquests.repository.rest.prefs.j jVar = (com.yandex.plus.home.dailyquests.repository.rest.prefs.j) kVar;
            eVar = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.e(jVar.d, new com.yandex.plus.core.data.common.y(jVar.a, jVar.b), jVar.c, jVar.e, jVar.f);
        }
        String str4 = lVar.d;
        return new com.yandex.plus.home.dailyquests.repository.api.dailyquests.g(str, str2, yVar, yVar2, str3, eVar, str4 != null ? new com.yandex.plus.home.dailyquests.repository.api.dailyquests.a(str4) : com.yandex.plus.home.dailyquests.repository.api.dailyquests.b.a);
    }

    public static com.yandex.plus.home.dailyquests.repository.api.dailyquests.k g(com.yandex.plus.home.dailyquests.repository.rest.prefs.x xVar, boolean z) {
        String str = xVar.b;
        String str2 = xVar.c;
        boolean z2 = xVar.e;
        com.yandex.plus.home.dailyquests.repository.rest.prefs.w wVar = xVar.f;
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.j jVar = null;
        if (wVar != null) {
            com.yandex.plus.home.dailyquests.repository.rest.prefs.t tVar = wVar.b;
            jVar = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.j(wVar.a, tVar != null ? new com.yandex.plus.home.dailyquests.repository.api.dailyquests.i(tVar.d, tVar.c, tVar.e, new com.yandex.plus.core.data.common.y(tVar.a, tVar.b)) : null);
        }
        com.yandex.plus.home.dailyquests.repository.rest.prefs.q qVar = xVar.g;
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.h hVar = new com.yandex.plus.home.dailyquests.repository.api.dailyquests.h(new com.yandex.plus.core.data.common.y(qVar.a, qVar.b), qVar.c, qVar.d, qVar.f, qVar.e, qVar.g, z);
        String str3 = xVar.d;
        return new com.yandex.plus.home.dailyquests.repository.api.dailyquests.k(str, str2, z2, jVar, hVar, str3 != null ? new com.yandex.plus.home.dailyquests.repository.api.dailyquests.a(str3) : com.yandex.plus.home.dailyquests.repository.api.dailyquests.b.a);
    }

    public static Map h(in inVar) {
        List<gn> list = inVar.j;
        if (list == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (gn gnVar : list) {
            String str = gnVar.b.d;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(gnVar.b);
        }
        return linkedHashMap;
    }

    public static com.yandex.plus.home.graphql.configuration.d i(com.yandex.plus.home.repository.api.model.configuration.a aVar, long j) {
        return new com.yandex.plus.home.graphql.configuration.d(aVar != null ? aVar.a : null, aVar != null ? aVar.b : null, aVar != null ? aVar.c : null, aVar != null ? aVar.d : null, aVar != null ? aVar.e : null, aVar != null ? aVar.f : null, aVar != null ? aVar.g : null, aVar != null ? aVar.h : null, aVar != null ? aVar.i : null, j);
    }

    public static Map j(hb hbVar) {
        hbVar.getClass();
        eb ebVar = hbVar.g;
        if (ebVar == null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        ArrayList arrayList = ebVar.b.a;
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.yandex.plus.core.graphql.fragment.q qVar = ((com.yandex.plus.core.graphql.fragment.m) it.next()).b.b;
            String str = null;
            String str2 = qVar != null ? qVar.a : null;
            if (qVar != null) {
                str = qVar.b;
            }
            linkedHashMap.put(str2, str);
        }
        return linkedHashMap;
    }

    public static com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1 k(com.yandex.plus.treasury.api.c cVar, String str) {
        cVar.getClass();
        str.getClass();
        if (!(cVar instanceof com.yandex.plus.treasury.api.c)) {
            com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e1 e1Var = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1.Companion;
            List c = t75.c(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n0("Unknown response: " + cVar));
            e1Var.getClass();
            c.getClass();
            return new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1(str, c);
        }
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e1 e1Var2 = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1.Companion;
        List<com.yandex.plus.treasury.api.b> list = cVar.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (com.yandex.plus.treasury.api.b bVar : list) {
            bVar.getClass();
            arrayList.add(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n0(bVar.a.getMessage()));
        }
        e1Var2.getClass();
        return new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.f1(str, arrayList);
    }

    public static i1 l(com.yandex.plus.treasury.api.c cVar, String str) {
        cVar.getClass();
        str.getClass();
        if (!(cVar instanceof com.yandex.plus.treasury.api.c)) {
            h1 h1Var = i1.Companion;
            List c = t75.c(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n0("Unknown response: " + cVar));
            h1Var.getClass();
            c.getClass();
            return new i1(str, c);
        }
        h1 h1Var2 = i1.Companion;
        List<com.yandex.plus.treasury.api.b> list = cVar.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (com.yandex.plus.treasury.api.b bVar : list) {
            bVar.getClass();
            arrayList.add(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.n0(bVar.a.getMessage()));
        }
        h1Var2.getClass();
        return new i1(str, arrayList);
    }

    public com.yandex.plus.experiments.api.a e(j2 j2Var) {
        j2Var.getClass();
        String str = j2Var.c;
        List list = j2Var.b;
        String str2 = j2Var.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((g2) it.next()).a));
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            z75.t(hashSet, ((g2) it2.next()).c);
        }
        return new com.yandex.plus.experiments.api.a(str, str2, arrayList, hashSet);
    }
}
