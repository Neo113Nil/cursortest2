package com.yandex.plus.pay.ui.common.internal.error.content;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6e;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class g {
    public static h a(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.ui.core.api.common.a aVar, Function1 function1) {
        offer.getClass();
        aVar.getClass();
        j jVar = new j(offer, aVar);
        function1.invoke(jVar);
        List w0 = CollectionsKt.w0(jVar.g);
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        PlusPayCompositeOffers.Offer.Vendor vendor = tariffOffer != null ? tariffOffer.getVendor() : null;
        int i = vendor == null ? -1 : i.a[vendor.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : w0) {
                    if (((e) obj) != e.c) {
                        arrayList.add(obj);
                    }
                }
                w0 = arrayList;
            } else if (i != 3) {
                b6e.s();
                return null;
            }
        }
        List list = w0;
        ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(jVar.b((e) it.next()));
        }
        String str = jVar.b;
        String str2 = jVar.c;
        String str3 = jVar.d;
        String str4 = jVar.e;
        k kVar = jVar.f;
        f fVar = (f) CollectionsKt.S(arrayList2, 0);
        if (fVar == null) {
            fVar = jVar.b(e.a);
        }
        return new h(str, str2, str3, str4, kVar, fVar, (f) CollectionsKt.S(arrayList2, 1));
    }
}
