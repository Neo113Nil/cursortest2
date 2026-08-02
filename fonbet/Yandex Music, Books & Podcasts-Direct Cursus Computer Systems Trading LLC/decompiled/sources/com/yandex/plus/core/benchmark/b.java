package com.yandex.plus.core.benchmark;

import defpackage.c5b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ c c;

    public /* synthetic */ b(c cVar, List list) {
        this.c = cVar;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                if (!((Boolean) this.c.c.getValue()).booleanValue()) {
                    return c5b.a;
                }
                List list = this.b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((n) ((Pair) it.next()).a);
                }
                return arrayList;
            default:
                List list2 = this.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    v c = ((w) ((Pair) it2.next()).b).c();
                    com.yandex.plus.core.utils.a aVar = c instanceof com.yandex.plus.core.utils.a ? (com.yandex.plus.core.utils.a) c : null;
                    if (aVar != null) {
                        aVar.a(new com.yandex.plus.bdui.plus.checkout.h(10, this.c));
                    }
                    if (c != null) {
                        arrayList2.add(c);
                    }
                }
                return arrayList2;
        }
    }

    public /* synthetic */ b(List list, c cVar) {
        this.b = list;
        this.c = cVar;
    }
}
