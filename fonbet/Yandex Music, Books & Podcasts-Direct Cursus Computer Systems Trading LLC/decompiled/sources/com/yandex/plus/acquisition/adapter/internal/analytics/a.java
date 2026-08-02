package com.yandex.plus.acquisition.adapter.internal.analytics;

import com.yandex.plus.acquisition.adapter.api.c;
import com.yandex.plus.acquisition.adapter.api.d;
import com.yandex.plus.acquisition.sdk.api.b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class a {
    public static com.yandex.plus.acquisition.sdk.pay.common.api.a a(d dVar) {
        b bVar;
        dVar.getClass();
        c cVar = dVar.a;
        if (cVar != null) {
            Set<com.yandex.plus.acquisition.adapter.api.b> set = cVar.a;
            ArrayList arrayList = new ArrayList(v75.o(set, 10));
            for (com.yandex.plus.acquisition.adapter.api.b bVar2 : set) {
                arrayList.add(new com.yandex.plus.acquisition.sdk.api.a(bVar2.a, bVar2.b));
            }
            bVar = new b(CollectionsKt.A0(arrayList), cVar.b);
        } else {
            bVar = null;
        }
        return new com.yandex.plus.acquisition.sdk.pay.common.api.a(bVar, dVar.b, dVar.c);
    }
}
