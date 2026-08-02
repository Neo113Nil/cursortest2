package com.yandex.plus.core.debug.panel.internal.presentation.view;

import defpackage.v75;
import defpackage.xdr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar = this.b.r;
                xdr xdrVar = cVar.o;
                do {
                    value = xdrVar.getValue();
                    List list = (List) value;
                    arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.yandex.plus.core.debug.panel.internal.model.log.e.a((com.yandex.plus.core.debug.panel.internal.model.log.e) it.next(), true));
                    }
                } while (!xdrVar.k(value, arrayList));
                cVar.a();
                break;
            case 2:
                this.b.r.p.l(null);
                break;
            default:
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar2 = this.b.r;
                xdr xdrVar2 = cVar2.n;
                do {
                    value2 = xdrVar2.getValue();
                    List list2 = (List) value2;
                    arrayList2 = new ArrayList(v75.o(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(com.yandex.plus.core.debug.panel.internal.model.log.e.a((com.yandex.plus.core.debug.panel.internal.model.log.e) it2.next(), true));
                    }
                } while (!xdrVar2.k(value2, arrayList2));
                cVar2.a();
                break;
        }
        return Unit.a;
    }
}
