package com.yandex.plus.bdui.plus.scaffold.utils;

import com.yandex.plus.bdui.content.c;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.s;
import com.yandex.plus.log.api.b;
import defpackage.btf;
import defpackage.tah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a {
    public final b a;
    public final LinkedHashMap b;

    public a(s sVar, Function0 function0, List list, b bVar) {
        sVar.getClass();
        function0.getClass();
        list.getClass();
        bVar.getClass();
        this.a = bVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            String str = cVar.a;
            Function2 function2 = cVar.b;
            Pair pair = (str == null || function2 == null) ? null : new Pair(str, function2);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        int a = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            linkedHashMap.put((String) pair2.a, btf.b(new p(6, (Function2) pair2.b, sVar, function0)));
        }
        this.b = linkedHashMap;
    }
}
