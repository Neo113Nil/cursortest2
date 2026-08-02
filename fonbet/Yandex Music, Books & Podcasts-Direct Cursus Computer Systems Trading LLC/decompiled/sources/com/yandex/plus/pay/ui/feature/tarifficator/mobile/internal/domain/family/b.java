package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family;

import com.yandex.plus.metrica.utils.i;
import defpackage.fkn;
import defpackage.u75;
import defpackage.vop;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class b {
    public final String a;
    public final String b;
    public final com.yandex.plus.pay.ui.common.api.a c;
    public final fkn d;
    public final com.yandex.plus.core.locale.a e;
    public final i f;

    public b(String str, String str2, com.yandex.plus.pay.ui.common.api.a aVar, fkn fknVar, com.yandex.plus.core.locale.a aVar2, com.yandex.plus.core.location.a aVar3, i iVar) {
        str2.getClass();
        aVar.getClass();
        aVar2.getClass();
        iVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = fknVar;
        this.e = aVar2;
        this.f = iVar;
    }

    public static void a(String str, LinkedHashMap linkedHashMap) {
        Collection collection = (Collection) linkedHashMap.get("available_features");
        if (collection == null) {
            collection = vop.d(str);
        } else if (!collection.contains(str)) {
            collection.add(str);
        }
        linkedHashMap.put("available_features", collection);
    }

    public static void b(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(str, u75.j(str2));
    }
}
