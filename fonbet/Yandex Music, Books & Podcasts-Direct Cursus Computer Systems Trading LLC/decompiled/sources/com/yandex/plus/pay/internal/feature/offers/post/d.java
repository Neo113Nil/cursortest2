package com.yandex.plus.pay.internal.feature.offers.post;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.diagnostic.impl.f;
import com.yandex.plus.pay.inapp.google.internal.h;
import defpackage.bck;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tah;
import defpackage.v3w;
import defpackage.v75;
import defpackage.wis;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements a {
    public final com.yandex.plus.pay.inapp.api.b a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final f c;

    public d(com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.log.impl.b bVar2, f fVar) {
        bVar.getClass();
        bVar2.getClass();
        fVar.getClass();
        this.a = bVar;
        this.b = bVar2;
        this.c = fVar;
    }

    public static List c(h hVar) {
        PlusPayCompositeOffers.Offer.Plan.Intro intro;
        Object obj;
        Object obj2;
        PlusPayCompositeOffers.Offer.Plan.Trial trial;
        com.yandex.plus.pay.inapp.api.c cVar = (com.yandex.plus.pay.inapp.api.c) CollectionsKt.Z(hVar.c());
        Iterator it = hVar.c().iterator();
        while (true) {
            intro = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BigDecimal bigDecimal = ((com.yandex.plus.pay.inapp.api.c) obj).a.a;
            BigDecimal valueOf = BigDecimal.valueOf(0L);
            valueOf.getClass();
            if (bigDecimal.compareTo(valueOf) == 0) {
                break;
            }
        }
        com.yandex.plus.pay.inapp.api.c cVar2 = (com.yandex.plus.pay.inapp.api.c) obj;
        Iterator it2 = hVar.c().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            com.yandex.plus.pay.inapp.api.c cVar3 = (com.yandex.plus.pay.inapp.api.c) obj2;
            if (!Intrinsics.d(cVar3, cVar2) && !Intrinsics.d(cVar3, cVar)) {
                break;
            }
        }
        com.yandex.plus.pay.inapp.api.c cVar4 = (com.yandex.plus.pay.inapp.api.c) obj2;
        if (cVar2 != null) {
            String str = cVar2.b;
            if (str == null) {
                xq0.x("Period must be set for subscription");
                return null;
            }
            trial = new PlusPayCompositeOffers.Offer.Plan.Trial(str);
        } else {
            trial = null;
        }
        if (cVar4 != null) {
            String str2 = cVar4.b;
            if (str2 == null) {
                xq0.x("Period must be set for subscription");
                return null;
            }
            com.yandex.plus.pay.inapp.api.d dVar = cVar4.a;
            intro = new PlusPayCompositeOffers.Offer.Plan.Intro(str2, new PlusPayPrice(dVar.a, dVar.b), cVar4.c);
        }
        return xz0.w(new PlusPayCompositeOffers.Offer.Plan[]{trial, intro});
    }

    public static boolean d(PlusPayCompositeOffers.Offer offer) {
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if ((tariffOffer != null ? tariffOffer.getVendor() : null) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            return true;
        }
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        if ((optionOffers instanceof Collection) && optionOffers.isEmpty()) {
            return false;
        }
        Iterator<T> it = optionOffers.iterator();
        while (it.hasNext()) {
            if (((PlusPayCompositeOffers.Offer.Option) it.next()).getVendor() == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.pay.internal.feature.offers.post.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers plusPayCompositeOffers, cg6 cg6Var) {
        b bVar;
        int i;
        String str;
        PlusPayCompositeOffers plusPayCompositeOffers2;
        String str2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.o = i2 - Integer.MIN_VALUE;
                Object obj = bVar.m;
                Object obj2 = nm6.a;
                i = bVar.o;
                com.yandex.plus.pay.log.impl.b bVar2 = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    bVar2.getClass();
                    bVar2.c(aVar, "CorrectInAppOffersPostProcessor", "Preparing in-app offers...");
                    String sessionId = plusPayCompositeOffers.getSessionId();
                    String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
                    List offers = plusPayCompositeOffers.getOffers();
                    bVar.j = plusPayCompositeOffers;
                    bVar.k = sessionId;
                    bVar.l = offersBatchId;
                    bVar.o = 1;
                    Object b = b(offers, bVar);
                    if (b == obj2) {
                        return obj2;
                    }
                    str = sessionId;
                    obj = b;
                    plusPayCompositeOffers2 = plusPayCompositeOffers;
                    str2 = offersBatchId;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = bVar.l;
                    str = bVar.k;
                    plusPayCompositeOffers2 = bVar.j;
                    qgg.h0(obj);
                }
                PlusPayCompositeOffers plusPayCompositeOffers3 = new PlusPayCompositeOffers(str, str2, (List) obj, plusPayCompositeOffers2.getTarget());
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                bVar2.getClass();
                bVar2.c(aVar2, "CorrectInAppOffersPostProcessor", "Preparing is done. Offers: " + plusPayCompositeOffers3);
                return plusPayCompositeOffers3;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.m;
        Object obj22 = nm6.a;
        i = bVar.o;
        com.yandex.plus.pay.log.impl.b bVar22 = this.b;
        if (i != 0) {
        }
        PlusPayCompositeOffers plusPayCompositeOffers32 = new PlusPayCompositeOffers(str, str2, (List) obj3, plusPayCompositeOffers2.getTarget());
        com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.b;
        bVar22.getClass();
        bVar22.c(aVar22, "CorrectInAppOffersPostProcessor", "Preparing is done. Offers: " + plusPayCompositeOffers32);
        return plusPayCompositeOffers32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, cg6 cg6Var) {
        c cVar;
        int i;
        List<PlusPayCompositeOffers.Offer> list2;
        ArrayList arrayList;
        List list3;
        List<PlusPayCompositeOffers.Offer> list4;
        t7o t7oVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable a;
        String str;
        PlusPayCompositeOffers.Offer offer;
        PlusPayPrice commonPrice;
        String commonPeriod;
        PlusPayPrice commonPrice2;
        String commonPeriod2;
        List c;
        com.yandex.plus.pay.inapp.api.c cVar2;
        String str2;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i2 = cVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.p = i2 - Integer.MIN_VALUE;
                    Object obj = cVar.n;
                    nm6 nm6Var = nm6.a;
                    i = cVar.p;
                    com.yandex.plus.pay.log.impl.b bVar = this.b;
                    PlusPayCompositeOffers.Offer.Vendor vendor = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : list) {
                            if (d((PlusPayCompositeOffers.Offer) obj2)) {
                                arrayList4.add(obj2);
                            } else {
                                arrayList5.add(obj2);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList<PlusPayCompositeOffers.Offer> arrayList7 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            PlusPayCompositeOffers.Offer offer2 = (PlusPayCompositeOffers.Offer) obj3;
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer2.getTariffOffer();
                            PlusPayCompositeOffers.Offer.Vendor vendor2 = tariffOffer != null ? tariffOffer.getVendor() : vendor;
                            PlusPayCompositeOffers.Offer.Vendor vendor3 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
                            boolean z = false;
                            boolean z2 = vendor2 == vendor3 && offer2.getOptionOffers().isEmpty();
                            if (offer2.getTariffOffer() == null && offer2.getOptionOffers().size() == 1 && offer2.getOptionOffers().get(0).getVendor() == vendor3) {
                                z = true;
                            }
                            if (z2 || z) {
                                arrayList6.add(obj3);
                            } else {
                                arrayList7.add(obj3);
                            }
                            vendor = null;
                        }
                        for (PlusPayCompositeOffers.Offer offer3 : arrayList7) {
                            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
                            bVar.getClass();
                            bVar.c(aVar, "CorrectInAppOffersPostProcessor", "Offer " + com.yandex.plus.pay.internal.utils.b.b(offer3) + " is not currently supported for in-app purchase, so, it is filtered out");
                        }
                        if (arrayList6.isEmpty()) {
                            return arrayList5;
                        }
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            String a2 = com.yandex.plus.pay.internal.utils.b.a((PlusPayCompositeOffers.Offer) it.next());
                            if (a2 != null) {
                                arrayList8.add(a2);
                            }
                        }
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar2 = this.a;
                            com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                            cVar.j = list;
                            cVar.k = arrayList5;
                            cVar.l = arrayList6;
                            cVar.m = arrayList8;
                            cVar.p = 1;
                            obj = bVar2.c(arrayList8, eVar, cVar);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            list2 = list;
                            arrayList = arrayList8;
                            list3 = arrayList5;
                            list4 = arrayList6;
                        } catch (wis e) {
                            e = e;
                            list2 = list;
                            arrayList = arrayList8;
                            list3 = arrayList5;
                            list4 = arrayList6;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            arrayList2 = list3;
                            obj = t7oVar;
                            arrayList3 = arrayList2;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return arrayList3;
                        } catch (Throwable th) {
                            th = th;
                            list2 = list;
                            arrayList = arrayList8;
                            list3 = arrayList5;
                            list4 = arrayList6;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            arrayList2 = list3;
                            obj = t7oVar;
                            arrayList3 = arrayList2;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return arrayList3;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList = cVar.m;
                        list4 = cVar.l;
                        list3 = cVar.k;
                        list2 = cVar.j;
                        try {
                            qgg.h0(obj);
                            list3 = list3;
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            arrayList2 = list3;
                            obj = t7oVar;
                            arrayList3 = arrayList2;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return arrayList3;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            arrayList2 = list3;
                            obj = t7oVar;
                            arrayList3 = arrayList2;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return arrayList3;
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    arrayList3 = list3;
                    a = z7o.a(obj);
                    if (a != null) {
                        List list5 = (List) obj;
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                        bVar.getClass();
                        StringBuilder sb = new StringBuilder("Found in-app products: ");
                        List list6 = list5;
                        ArrayList arrayList9 = new ArrayList(v75.o(list6, 10));
                        Iterator it2 = list6.iterator();
                        while (it2.hasNext()) {
                            arrayList9.add(((h) it2.next()).b());
                        }
                        sb.append(arrayList9);
                        bVar.c(aVar2, "CorrectInAppOffersPostProcessor", sb.toString());
                        ArrayList arrayList10 = new ArrayList(v75.o(list6, 10));
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            arrayList10.add(((h) it3.next()).b());
                        }
                        Set A0 = CollectionsKt.A0(arrayList10);
                        h hVar = (h) CollectionsKt.firstOrNull(list5);
                        if (hVar == null || (c = hVar.c()) == null || (cVar2 = (com.yandex.plus.pay.inapp.api.c) CollectionsKt.firstOrNull(c)) == null || (str2 = cVar2.a.b) == null) {
                            str = null;
                        } else {
                            str = str2.toLowerCase(Locale.ROOT);
                            str.getClass();
                        }
                        List e0 = CollectionsKt.e0(arrayList, A0);
                        if (!e0.isEmpty()) {
                            bVar.c(com.yandex.plus.log.api.a.d, "CorrectInAppOffersPostProcessor", v3w.f("Products ", " are requested but missed in response from store", e0));
                            List list7 = e0;
                            f fVar = this.c;
                            int i3 = fVar.a;
                            list7.getClass();
                            switch (i3) {
                                case 0:
                                    bck bckVar = fVar.b;
                                    if (str == null) {
                                        str = "no_value";
                                    }
                                    List w0 = CollectionsKt.w0(list7);
                                    w0.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("code", "no_value");
                                    linkedHashMap.put(Constants.KEY_MESSAGE, "no_value");
                                    linkedHashMap.put("currency", str);
                                    linkedHashMap.put("additionalData", "no_value");
                                    linkedHashMap.put("invalidProductIds", w0);
                                    linkedHashMap.put("_meta", bck.c(new HashMap()));
                                    bckVar.d("Error.Subscription.GooglePlay.Products.Fetch.InvalidProductIds", linkedHashMap);
                                    break;
                                default:
                                    bck bckVar2 = fVar.b;
                                    if (str == null) {
                                        str = "no_value";
                                    }
                                    List w02 = CollectionsKt.w0(list7);
                                    w02.getClass();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("code", "no_value");
                                    linkedHashMap2.put(Constants.KEY_MESSAGE, "no_value");
                                    linkedHashMap2.put("currency", str);
                                    linkedHashMap2.put("additionalData", "no_value");
                                    linkedHashMap2.put("invalidProductIds", w02);
                                    linkedHashMap2.put("_meta", bck.c(new HashMap()));
                                    bckVar2.d("Error.Transaction.GooglePlay.Products.Fetch.InvalidProductIds", linkedHashMap2);
                                    break;
                            }
                        }
                        int a3 = tah.a(v75.o(list6, 10));
                        if (a3 < 16) {
                            a3 = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a3);
                        for (Object obj4 : list6) {
                            linkedHashMap3.put(((h) obj4).b(), obj4);
                        }
                        ArrayList arrayList11 = new ArrayList();
                        for (PlusPayCompositeOffers.Offer offer4 : list4) {
                            h hVar2 = (h) linkedHashMap3.get(com.yandex.plus.pay.internal.utils.b.a(offer4));
                            if (hVar2 == null) {
                                offer = null;
                            } else if (offer4.getTariffOffer() != null) {
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer4.getTariffOffer();
                                com.yandex.plus.pay.inapp.api.c cVar3 = (com.yandex.plus.pay.inapp.api.c) CollectionsKt.Z(hVar2.c());
                                if (cVar3 != null) {
                                    com.yandex.plus.pay.inapp.api.d dVar = cVar3.a;
                                    commonPrice2 = new PlusPayPrice(dVar.a, dVar.b);
                                } else {
                                    commonPrice2 = tariffOffer2.getCommonPrice();
                                }
                                PlusPayPrice plusPayPrice = commonPrice2;
                                if (cVar3 == null || (commonPeriod2 = cVar3.b) == null) {
                                    commonPeriod2 = tariffOffer2.getCommonPeriod();
                                }
                                offer = PlusPayCompositeOffers.Offer.copy$default(offer4, null, null, null, PlusPayCompositeOffers.Offer.Tariff.copy$default(tariffOffer2, null, null, null, null, null, null, plusPayPrice, commonPeriod2, c(hVar2), null, null, 1599, null), null, null, null, false, null, false, null, 2039, null);
                            } else {
                                PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) CollectionsKt.Q(offer4.getOptionOffers());
                                com.yandex.plus.pay.inapp.api.c cVar4 = (com.yandex.plus.pay.inapp.api.c) CollectionsKt.Z(hVar2.c());
                                if (cVar4 != null) {
                                    com.yandex.plus.pay.inapp.api.d dVar2 = cVar4.a;
                                    commonPrice = new PlusPayPrice(dVar2.a, dVar2.b);
                                } else {
                                    commonPrice = option.getCommonPrice();
                                }
                                PlusPayPrice plusPayPrice2 = commonPrice;
                                if (cVar4 == null || (commonPeriod = cVar4.b) == null) {
                                    commonPeriod = option.getCommonPeriod();
                                }
                                offer = PlusPayCompositeOffers.Offer.copy$default(offer4, null, null, null, null, t75.c(PlusPayCompositeOffers.Offer.Option.copy$default(option, null, null, null, null, null, null, plusPayPrice2, commonPeriod, c(hVar2), null, null, 1599, null)), null, null, false, null, false, null, 2031, null);
                            }
                            if (offer != null) {
                                arrayList11.add(offer);
                            }
                        }
                        int a4 = tah.a(v75.o(arrayList11, 10));
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(a4 >= 16 ? a4 : 16);
                        Iterator it4 = arrayList11.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            linkedHashMap4.put(com.yandex.plus.pay.internal.utils.b.b((PlusPayCompositeOffers.Offer) next), next);
                        }
                        arrayList3 = new ArrayList();
                        for (PlusPayCompositeOffers.Offer offer5 : list2) {
                            if (d(offer5)) {
                                offer5 = (PlusPayCompositeOffers.Offer) linkedHashMap4.get(com.yandex.plus.pay.internal.utils.b.b(offer5));
                            }
                            if (offer5 != null) {
                                arrayList3.add(offer5);
                            }
                        }
                    } else {
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                        bVar.getClass();
                        bVar.a(aVar3, "CorrectInAppOffersPostProcessor", "Error getting in-app products", a);
                    }
                    return arrayList3;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            arrayList3 = list3;
            a = z7o.a(obj);
            if (a != null) {
            }
            return arrayList3;
        } catch (CancellationException e3) {
            throw e3;
        }
        cVar = new c(this, cg6Var);
        Object obj5 = cVar.n;
        nm6 nm6Var2 = nm6.a;
        i = cVar.p;
        com.yandex.plus.pay.log.impl.b bVar3 = this.b;
        PlusPayCompositeOffers.Offer.Vendor vendor4 = null;
    }
}
