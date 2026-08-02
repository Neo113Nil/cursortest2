package com.yandex.plus.acquisition.sdk.pay.impl.providers;

import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements a {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final PlusPayCompositeOffers.Offer a(k kVar) {
        Object obj;
        kVar.getClass();
        List list = (List) this.a.get(kVar.j.a);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.yandex.plus.acquisition.sdk.api.offers.c cVar = kVar.k;
                PlusPayCompositeOffers.Offer compositeOffer = ((PlusPaySmartOffer) obj).getCompositeOffer();
                ArrayList arrayList = cVar.d;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((com.yandex.plus.acquisition.sdk.api.offers.e) it2.next()).a);
                }
                Set A0 = CollectionsKt.A0(arrayList2);
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = compositeOffer.getOptionOffers();
                ArrayList arrayList3 = new ArrayList(v75.o(optionOffers, 10));
                Iterator<T> it3 = optionOffers.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                }
                Set A02 = CollectionsKt.A0(arrayList3);
                com.yandex.plus.acquisition.sdk.api.offers.e eVar = cVar.c;
                String str = eVar != null ? eVar.a : null;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = compositeOffer.getTariffOffer();
                boolean d = Intrinsics.d(str, tariffOffer != null ? tariffOffer.getId() : null);
                boolean z = A0.size() == A02.size() && A0.equals(A02);
                if (d && z) {
                    break;
                }
            }
            PlusPaySmartOffer plusPaySmartOffer = (PlusPaySmartOffer) obj;
            if (plusPaySmartOffer != null) {
                return plusPaySmartOffer.getCompositeOffer();
            }
        }
        return null;
    }
}
