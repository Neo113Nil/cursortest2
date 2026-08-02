package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.featureflags.q;
import com.yandex.plus.core.featureflags.t;
import com.yandex.plus.core.featureflags.z;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.b0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.v;
import com.yandex.pulse.metrics.o;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ezc;
import defpackage.n8g;
import defpackage.ot0;
import defpackage.q5b;
import defpackage.r7o;
import defpackage.rar;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tah;
import defpackage.v75;
import defpackage.vck;
import defpackage.x97;
import defpackage.xck;
import defpackage.xq0;
import defpackage.yck;
import defpackage.z7o;
import defpackage.zck;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0851 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0820 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x08b5 A[LOOP:11: B:317:0x0888->B:329:0x08b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08c1 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        String str2;
        Object obj;
        String str3;
        PlusPayMailingAdsAgreement.Status status;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        h0 h0Var;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        PlusPayRichText promoLegalInfo;
        PlusPayLegalInfo legalInfo;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar2;
        switch (this.a) {
            case 0:
                Object f = ((com.yandex.plus.experiments.impl.providers.h) ((i) this.receiver).H.getValue()).f();
                r7o r7oVar = z7o.b;
                if (f instanceof t7o) {
                    f = null;
                }
                com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) f;
                List list = aVar2 != null ? aVar2.c : null;
                if (list == null) {
                    break;
                }
                break;
            case 1:
                Object f2 = ((com.yandex.plus.experiments.impl.providers.h) ((i) this.receiver).H.getValue()).f();
                r7o r7oVar2 = z7o.b;
                if (f2 instanceof t7o) {
                    f2 = null;
                }
                com.yandex.plus.experiments.api.a aVar3 = (com.yandex.plus.experiments.api.a) f2;
                if (aVar3 != null) {
                    break;
                } else {
                    break;
                }
            case 2:
                i iVar = (i) this.receiver;
                Object f3 = ((com.yandex.plus.experiments.impl.providers.h) iVar.H.getValue()).f();
                r7o r7oVar3 = z7o.b;
                if (f3 instanceof t7o) {
                    f3 = null;
                }
                com.yandex.plus.experiments.api.a aVar4 = (com.yandex.plus.experiments.api.a) f3;
                Set set = aVar4 != null ? aVar4.d : null;
                if (set == null) {
                    set = q5b.a;
                }
                LinkedHashSet z0 = CollectionsKt.z0(set);
                z a = iVar.q.a.a();
                a.getClass();
                ConcurrentHashMap concurrentHashMap = com.yandex.plus.core.reflect.b.a;
                Set c = com.yandex.plus.core.reflect.b.c(0, a.getClass());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c) {
                    if (com.yandex.plus.core.featureflags.g.class.isAssignableFrom(((Field) obj2).getType())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    field.getClass();
                    if (!com.yandex.plus.core.featureflags.g.class.isAssignableFrom(field.getType()) || (obj = com.yandex.plus.core.reflect.b.d(a, field)) == null) {
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Object obj3 = (com.yandex.plus.core.featureflags.g) next;
                    com.yandex.plus.core.featureflags.k kVar3 = obj3 instanceof com.yandex.plus.core.featureflags.k ? (com.yandex.plus.core.featureflags.k) obj3 : null;
                    if (kVar3 != null) {
                        t c2 = kVar3.c();
                        q qVar = c2 instanceof q ? (q) c2 : null;
                        if (qVar != null) {
                            str2 = qVar.getKey();
                            if (str2 == null) {
                                arrayList3.add(next);
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (next2 instanceof com.yandex.plus.core.featureflags.h) {
                        arrayList4.add(next2);
                    }
                }
                int a2 = tah.a(v75.o(arrayList4, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    com.yandex.plus.core.featureflags.h hVar = (com.yandex.plus.core.featureflags.h) it4.next();
                    com.yandex.plus.core.featureflags.h hVar2 = hVar != null ? hVar : null;
                    if (hVar2 != null) {
                        t c3 = hVar2.c();
                        q qVar2 = c3 instanceof q ? (q) c3 : null;
                        if (qVar2 != null) {
                            str = qVar2.getKey();
                            if (str != null) {
                                xq0.q("Expected experiment key for the flag");
                                break;
                            } else {
                                linkedHashMap.put(str, Boolean.valueOf(r1.l(hVar)));
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        z0.add(str4);
                    } else {
                        z0.remove(str4);
                    }
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ((com.yandex.plus.core.location.a) this.receiver).getClass();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                h0 h0Var2 = (h0) this.receiver;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g a3 = ((v) h0Var2.K.a.getValue()).a();
                rar rarVar = h0Var2.H;
                if ((rarVar == null || !rarVar.b()) && a3 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = h0Var2.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar2 = a4.b;
                    PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) h0Var2.E.getValue();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar5 = h0Var2.w;
                    String str5 = a3.i;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar5;
                    cVar.getClass();
                    str5.getClass();
                    PlusPayCompositeOffers.Offer offer = jVar2.a;
                    zck a5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
                    String str6 = jVar2.c;
                    if (plusPayMailingAdsAgreement != null) {
                        if (plusPayMailingAdsAgreement.isAgreementsChecked()) {
                            str3 = str6;
                            if (plusPayMailingAdsAgreement.getTextLogic() == PlusPayMailingAdsAgreement.TextLogic.DIRECT) {
                                status = PlusPayMailingAdsAgreement.Status.ALLOW;
                            }
                        } else {
                            str3 = str6;
                        }
                        status = (plusPayMailingAdsAgreement.isAgreementsChecked() || plusPayMailingAdsAgreement.getTextLogic() != PlusPayMailingAdsAgreement.TextLogic.INVERTED) ? PlusPayMailingAdsAgreement.Status.REFUSE : PlusPayMailingAdsAgreement.Status.ALLOW;
                    } else {
                        str3 = str6;
                        status = null;
                    }
                    if (a5 != null) {
                        cdk cdkVar = cVar.a;
                        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a4.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                        String id = tariffOffer != null ? tariffOffer.getId() : null;
                        PlusPayMailingAdsAgreement.Status status2 = status;
                        String str7 = id == null ? "no_value" : id;
                        jVar = jVar2;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                        ArrayList arrayList5 = new ArrayList(v75.o(optionOffers, 10));
                        Iterator<T> it5 = optionOffers.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((PlusPayCompositeOffers.Offer.Option) it5.next()).getId());
                        }
                        String str8 = str3 == null ? "no_value" : str3;
                        int i = status2 == null ? -1 : com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.b.a[status2.ordinal()];
                        xck xckVar = i != 1 ? i != 2 ? xck.NotShown : xck.Refuse : xck.Allow;
                        PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getTextLogic() : null;
                        int i2 = textLogic == null ? -1 : com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.b.b[textLogic.ordinal()];
                        xck xckVar2 = xckVar;
                        yck yckVar = i2 != 1 ? i2 != 2 ? yck.Unknown : yck.Inverted : yck.Direct;
                        LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                        t.put("product_id", str7);
                        dfi.u(t, "options_id", arrayList5, true, "is_tarifficator");
                        t.put("payment_option", a5.a);
                        t.put("payment_method_id", str8);
                        t.put("button_text", str5);
                        t.put("mailing_ads_agreement_status", xckVar2.a);
                        t.put("mailing_ads_agreement_text_logic", yckVar.a);
                        t.put("_meta", cdk.c(new HashMap()));
                        cdkVar.f("Checkout.Button.Clicked", t);
                        h0Var2 = h0Var2;
                        aVar = a4;
                    } else {
                        jVar = jVar2;
                        aVar = a4;
                    }
                    h0Var2.K(aVar);
                    h0Var2.H = x97.y(ot0.F(h0Var2), null, null, new b0(jVar, h0Var2, aVar, null), 3);
                }
                break;
            case 24:
                h0 h0Var3 = (h0) this.receiver;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar6 = h0Var3.w;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a6 = h0Var3.l.a.a();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar6;
                cVar2.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar3 = a6.b;
                PlusPayCompositeOffers.Offer offer2 = jVar3.a;
                zck a7 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
                String str9 = jVar3.c;
                if (a7 != null) {
                    cdk cdkVar2 = cVar2.a;
                    String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a6.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    if (id2 == null) {
                        id2 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                    h0Var = h0Var3;
                    ArrayList arrayList6 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it6 = optionOffers2.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((PlusPayCompositeOffers.Offer.Option) it6.next()).getId());
                    }
                    if (str9 == null) {
                        str9 = "no_value";
                    }
                    LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar2, d2, "purchase_session_id", d2);
                    t2.put("product_id", id2);
                    dfi.u(t2, "options_id", arrayList6, true, "is_tarifficator");
                    t2.put("payment_option", a7.a);
                    t2.put("payment_method_id", str9);
                    t2.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("Checkout.Close.Clicked", t2);
                } else {
                    h0Var = h0Var3;
                }
                h0Var.L();
                break;
            case 25:
                h0 h0Var4 = (h0) this.receiver;
                if (!h0Var4.F) {
                    h0Var4.F = true;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar7 = h0Var4.w;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a8 = h0Var4.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar7;
                    cVar3.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar4 = a8.b;
                    PlusPayCompositeOffers.Offer offer3 = jVar4.a;
                    zck a9 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer3);
                    String str10 = jVar4.c;
                    n8g b = t75.b();
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = jVar4.b;
                    if (plusPayCompositeOfferDetails2 == null || (legalInfo = plusPayCompositeOfferDetails2.getLegalInfo()) == null) {
                        plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                    } else {
                        plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                        PlusPayRichText fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo);
                        if (fromLegalInfo != null) {
                            b.add(com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo));
                        }
                    }
                    if (plusPayCompositeOfferDetails != null && (promoLegalInfo = plusPayCompositeOfferDetails.getPromoLegalInfo()) != null) {
                        if (!((Boolean) cVar3.d.invoke()).booleanValue()) {
                            promoLegalInfo = null;
                        }
                        if (promoLegalInfo != null) {
                            b.add(com.yandex.plus.pay.ui.common.api.utils.b.b(promoLegalInfo));
                        }
                    }
                    n8g a10 = t75.a(b);
                    if (a9 != null) {
                        cdk cdkVar3 = cVar3.a;
                        String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a8.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer3.getTariffOffer();
                        String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                        if (id3 == null) {
                            id3 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer3.getOptionOffers();
                        ArrayList arrayList7 = new ArrayList(v75.o(optionOffers3, 10));
                        Iterator<T> it7 = optionOffers3.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(((PlusPayCompositeOffers.Offer.Option) it7.next()).getId());
                        }
                        String str11 = str10 == null ? "no_value" : str10;
                        cdkVar3.getClass();
                        d3.getClass();
                        a10.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("purchase_session_id", d3);
                        linkedHashMap2.put("product_id", id3);
                        dfi.u(linkedHashMap2, "options_id", arrayList7, true, "is_tarifficator");
                        linkedHashMap2.put("payment_option", a9.a);
                        linkedHashMap2.put("payment_method_id", str11);
                        linkedHashMap2.put("legal_text", a10);
                        linkedHashMap2.put("_meta", cdk.c(new HashMap()));
                        cdkVar3.f("Checkout.LegalText.Shown", linkedHashMap2);
                    }
                }
                break;
            case 26:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.receiver;
                PlusPayClosingOffer plusPayClosingOffer = kVar4.q;
                if (plusPayClosingOffer != null) {
                    ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) kVar4.p).a(kVar4.n.a.a(), plusPayClosingOffer);
                }
                kVar4.k.a();
                break;
            case 27:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar5 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.receiver;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar8 = kVar5.n;
                PlusPayClosingOffer plusPayClosingOffer2 = kVar5.q;
                if (plusPayClosingOffer2 != null) {
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.a aVar9 = kVar5.p;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar2 = aVar8.a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a11 = bVar2.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b bVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) aVar9;
                    bVar3.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c4 = a11.c();
                    PlusPayCompositeOffers.Offer offer4 = c4.a;
                    zck a12 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer4);
                    if (a12 != null) {
                        cdk cdkVar4 = bVar3.a;
                        String d4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a11.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = offer4.getTariffOffer();
                        String id4 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                        kVar = kVar5;
                        String str12 = id4 == null ? "no_value" : id4;
                        bVar = bVar2;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = offer4.getOptionOffers();
                        ArrayList arrayList8 = new ArrayList(v75.o(optionOffers4, 10));
                        Iterator<T> it8 = optionOffers4.iterator();
                        while (it8.hasNext()) {
                            arrayList8.add(((PlusPayCompositeOffers.Offer.Option) it8.next()).getId());
                        }
                        String str13 = c4.c;
                        if (str13 == null) {
                            str13 = "no_value";
                        }
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer5 = plusPayClosingOffer2.getOffer().getTariffOffer();
                        String id5 = tariffOffer5 != null ? tariffOffer5.getId() : null;
                        if (id5 == null) {
                            id5 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers5 = plusPayClosingOffer2.getOffer().getOptionOffers();
                        ArrayList arrayList9 = new ArrayList(v75.o(optionOffers5, 10));
                        Iterator<T> it9 = optionOffers5.iterator();
                        while (it9.hasNext()) {
                            arrayList9.add(((PlusPayCompositeOffers.Offer.Option) it9.next()).getId());
                        }
                        String acceptButtonText = plusPayClosingOffer2.getAcceptButtonText();
                        cdkVar4.getClass();
                        d4.getClass();
                        acceptButtonText.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("payment_option", a12.a);
                        linkedHashMap3.put("payment_method_id", str13);
                        linkedHashMap3.put("purchase_session_id", d4);
                        linkedHashMap3.put("product_id", str12);
                        linkedHashMap3.put("options_id", arrayList8);
                        linkedHashMap3.put("closing_offer_product_id", id5);
                        linkedHashMap3.put("closing_offer_options_id", arrayList9);
                        linkedHashMap3.put("button_text", acceptButtonText);
                        linkedHashMap3.put("_meta", cdk.c(new HashMap()));
                        cdkVar4.f("ClosingOffer.Button.Accept.Clicked", linkedHashMap3);
                        com.yandex.plus.pay.api.analytics.tarifficator.e.a(bVar3.b, plusPayClosingOffer2.getOffer(), 0, "closing_offer", "checkout_closing_offer_page", null);
                    } else {
                        kVar = kVar5;
                        bVar = bVar2;
                    }
                    PlusPayCompositeOffers.Offer offer5 = plusPayClosingOffer2.getOffer();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a13 = bVar.a();
                    bVar.a = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(a13, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.a(a13.b, offer5, null, null, null, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d.c, null, 108), null, 29);
                    kVar.k.b();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar6 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.receiver;
                PlusPayClosingOffer plusPayClosingOffer3 = kVar6.q;
                if (plusPayClosingOffer3 != null) {
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.a aVar10 = kVar6.p;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a14 = kVar6.n.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b bVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) aVar10;
                    bVar4.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c5 = a14.c();
                    PlusPayCompositeOffers.Offer offer6 = c5.a;
                    zck a15 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer6);
                    if (a15 != null) {
                        cdk cdkVar5 = bVar4.a;
                        String d5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a14.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer6 = offer6.getTariffOffer();
                        String id6 = tariffOffer6 != null ? tariffOffer6.getId() : null;
                        String str14 = id6 != null ? id6 : "no_value";
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers6 = offer6.getOptionOffers();
                        kVar2 = kVar6;
                        ArrayList arrayList10 = new ArrayList(v75.o(optionOffers6, 10));
                        Iterator<T> it10 = optionOffers6.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((PlusPayCompositeOffers.Offer.Option) it10.next()).getId());
                        }
                        String str15 = c5.c;
                        if (str15 == null) {
                            str15 = "no_value";
                        }
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer7 = plusPayClosingOffer3.getOffer().getTariffOffer();
                        String id7 = tariffOffer7 != null ? tariffOffer7.getId() : null;
                        String str16 = id7 == null ? "no_value" : id7;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers7 = plusPayClosingOffer3.getOffer().getOptionOffers();
                        ArrayList arrayList11 = new ArrayList(v75.o(optionOffers7, 10));
                        Iterator<T> it11 = optionOffers7.iterator();
                        while (it11.hasNext()) {
                            arrayList11.add(((PlusPayCompositeOffers.Offer.Option) it11.next()).getId());
                        }
                        String rejectButtonText = plusPayClosingOffer3.getRejectButtonText();
                        cdkVar5.getClass();
                        d5.getClass();
                        rejectButtonText.getClass();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        linkedHashMap4.put("payment_option", a15.a);
                        linkedHashMap4.put("payment_method_id", str15);
                        linkedHashMap4.put("purchase_session_id", d5);
                        linkedHashMap4.put("product_id", str14);
                        linkedHashMap4.put("options_id", arrayList10);
                        linkedHashMap4.put("closing_offer_product_id", str16);
                        linkedHashMap4.put("closing_offer_options_id", arrayList11);
                        linkedHashMap4.put("button_text", rejectButtonText);
                        linkedHashMap4.put("_meta", cdk.c(new HashMap()));
                        cdkVar5.f("ClosingOffer.Button.Reject.Clicked", linkedHashMap4);
                    } else {
                        kVar2 = kVar6;
                    }
                    kVar6 = kVar2;
                }
                kVar6.k.a();
                break;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.k kVar7 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.k) this.receiver;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar11 = kVar7.o;
                if (aVar11 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a16 = kVar7.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar5 = kVar7.n;
                    String uuid = a16.a.toString();
                    uuid.getClass();
                    String str17 = aVar11.a;
                    String str18 = aVar11.b;
                    bVar5.getClass();
                    str17.getClass();
                    str18.getClass();
                    bVar5.a.a(uuid, str17, str18, vck.CloseButton);
                }
                kVar7.G();
                break;
        }
        return Unit.a;
    }
}
