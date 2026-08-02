package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.l;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import defpackage.bqi;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.eta;
import defpackage.ezc;
import defpackage.i0i;
import defpackage.ot0;
import defpackage.v75;
import defpackage.wck;
import defpackage.x97;
import defpackage.xdr;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.C1005d2;
import ru.kinopoisk.sdk.easylogin.internal.C1022e5;
import ru.kinopoisk.sdk.easylogin.internal.C1103k2;
import ru.kinopoisk.sdk.easylogin.internal.Cc;
import ru.kinopoisk.sdk.easylogin.internal.Hc;
import ru.kinopoisk.sdk.easylogin.internal.Ic;
import ru.kinopoisk.sdk.easylogin.internal.O3;
import ru.kinopoisk.sdk.easylogin.internal.Z7;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j jVar;
        PlusPayRichText fromLegalInfo;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar;
        m mVar;
        PlusPayRichText fromLegalInfo2;
        xdr xdrVar;
        Object value;
        switch (this.a) {
            case 0:
                ((k) this.receiver).k.a();
                break;
            case 1:
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k) this.receiver).r.a();
                break;
            case 2:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k) this.receiver;
                com.yandex.plus.pay.ui.common.internal.error.content.f fVar = kVar.t.f;
                if (fVar != null) {
                    kVar.G(fVar);
                }
                break;
            case 3:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k kVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.k) this.receiver;
                com.yandex.plus.pay.ui.common.internal.error.content.f fVar2 = kVar2.t.g;
                if (fVar2 != null) {
                    kVar2.G(fVar2);
                }
                break;
            case 4:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j jVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.j) this.receiver;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.family.a aVar = jVar2.p;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = jVar2.k.a.a();
                    com.yandex.plus.pay.ui.webview.family.domain.a aVar2 = jVar2.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    String str = aVar.a;
                    String str2 = aVar.c;
                    aVar2.getClass();
                    str2.getClass();
                    aVar2.b.b(uuid, str, str2, wck.CloseButton);
                }
                jVar2.G();
                break;
            case 5:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j jVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j) this.receiver;
                jVar3.J();
                jVar3.G();
                break;
            case 6:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j jVar4 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j) this.receiver;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar3 = jVar4.k;
                PlusPayPresale plusPayPresale = jVar4.r;
                if (plusPayPresale != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a aVar4 = jVar4.n;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar3.a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) aVar4;
                    bVar2.getClass();
                    cdk cdkVar = bVar2.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    PlusPayCompositeOffers.Offer offer = a2.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str3 = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = plusPayPresale.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis = plusPayPresale.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayPresale.getSuggestedOffer().getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    if (id2 == null) {
                        id2 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale.getSuggestedOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    cdkVar.getClass();
                    d.getClass();
                    productTarget.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", d);
                    linkedHashMap.put("product_id", str3);
                    linkedHashMap.put("options_id", arrayList);
                    linkedHashMap.put("target", productTarget);
                    linkedHashMap.put("loading_duration_millis", String.valueOf(loadingDelayMillis));
                    linkedHashMap.put("presale_product_id", id2);
                    linkedHashMap.put("presale_options_id", arrayList2);
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("Presale.Offer.Clicked", linkedHashMap);
                    com.yandex.plus.pay.api.analytics.tarifficator.e.a(bVar2.c, plusPayPresale.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", bVar2.a.b);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = bVar.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j a4 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.a(a3.b, plusPayPresale.getSuggestedOffer(), null, null, null, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d.b, null, 110);
                    bVar.a = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(a3, a4, null, 29);
                    jVar4.m.a(a4);
                }
                break;
            case 7:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j jVar5 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j) this.receiver;
                PlusPayPresale plusPayPresale2 = jVar5.r;
                if (plusPayPresale2 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a aVar5 = jVar5.n;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a5 = jVar5.k.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) aVar5;
                    bVar3.getClass();
                    cdk cdkVar2 = bVar3.b;
                    String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a5.a);
                    PlusPayCompositeOffers.Offer offer2 = a5.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer2.getTariffOffer();
                    String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    if (id3 == null) {
                        id3 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer2.getOptionOffers();
                    jVar = jVar5;
                    ArrayList arrayList3 = new ArrayList(v75.o(optionOffers3, 10));
                    Iterator<T> it3 = optionOffers3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    String productTarget2 = plusPayPresale2.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis2 = plusPayPresale2.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusPayPresale2.getSuggestedOffer().getTariffOffer();
                    String id4 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                    String str4 = id4 == null ? "no_value" : id4;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusPayPresale2.getSuggestedOffer().getOptionOffers();
                    ArrayList arrayList4 = new ArrayList(v75.o(optionOffers4, 10));
                    Iterator<T> it4 = optionOffers4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    String text = plusPayPresale2.getAssets().getOriginalOfferButtonText().getText();
                    cdkVar2.getClass();
                    d2.getClass();
                    productTarget2.getClass();
                    text.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d2, "product_id", id3);
                    m.put("options_id", arrayList3);
                    m.put("target", productTarget2);
                    m.put("loading_duration_millis", String.valueOf(loadingDelayMillis2));
                    m.put("presale_product_id", str4);
                    m.put("presale_options_id", arrayList4);
                    m.put("button_text", text);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("Presale.Reject.Clicked", m);
                } else {
                    jVar = jVar5;
                }
                jVar.G();
                break;
            case 8:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j jVar6 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j) this.receiver;
                PlusPayPresale plusPayPresale3 = jVar6.r;
                if (plusPayPresale3 != null && !jVar6.q) {
                    jVar6.q = true;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a aVar6 = jVar6.n;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a6 = jVar6.k.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar4 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) aVar6;
                    bVar4.getClass();
                    cdk cdkVar3 = bVar4.b;
                    String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a6.a);
                    PlusPayCompositeOffers.Offer offer3 = a6.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer5 = offer3.getTariffOffer();
                    String id5 = tariffOffer5 != null ? tariffOffer5.getId() : null;
                    if (id5 == null) {
                        id5 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers5 = offer3.getOptionOffers();
                    ArrayList arrayList5 = new ArrayList(v75.o(optionOffers5, 10));
                    Iterator<T> it5 = optionOffers5.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(((PlusPayCompositeOffers.Offer.Option) it5.next()).getId());
                    }
                    String productTarget3 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis3 = plusPayPresale3.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer6 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                    String id6 = tariffOffer6 != null ? tariffOffer6.getId() : null;
                    if (id6 == null) {
                        id6 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers6 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                    ArrayList arrayList6 = new ArrayList(v75.o(optionOffers6, 10));
                    Iterator<T> it6 = optionOffers6.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((PlusPayCompositeOffers.Offer.Option) it6.next()).getId());
                    }
                    PlusPayLegalInfo legalInfo = plusPayPresale3.getSuggestedOffer().getLegalInfo();
                    String b = (legalInfo == null || (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo);
                    if (b == null) {
                        b = "no_value";
                    }
                    cdkVar3.getClass();
                    d3.getClass();
                    productTarget3.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("purchase_session_id", d3);
                    linkedHashMap2.put("product_id", id5);
                    linkedHashMap2.put("options_id", arrayList5);
                    linkedHashMap2.put("target", productTarget3);
                    linkedHashMap2.put("loading_duration_millis", String.valueOf(loadingDelayMillis3));
                    linkedHashMap2.put("presale_product_id", id6);
                    linkedHashMap2.put("presale_options_id", arrayList6);
                    linkedHashMap2.put("presale_legal_text", b);
                    linkedHashMap2.put("_meta", cdk.c(new HashMap()));
                    cdkVar3.f("Presale.LegalText.Shown", linkedHashMap2);
                }
                break;
            case 9:
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k) this.receiver).G();
                break;
            case 10:
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k) this.receiver).G();
                break;
            case 11:
                m mVar2 = (m) this.receiver;
                PlusPayCompositeUpsale plusPayCompositeUpsale = mVar2.w;
                if (plusPayCompositeUpsale != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar = mVar2.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a7 = mVar2.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar;
                    eVar2.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a7.c();
                    PlusPayCompositeOffers.Offer offer4 = c.a;
                    zck a8 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer4);
                    String str5 = c.c;
                    if (a8 != null) {
                        cdk cdkVar4 = eVar2.a;
                        String d4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a7.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer7 = offer4.getTariffOffer();
                        String id7 = tariffOffer7 != null ? tariffOffer7.getId() : null;
                        String str6 = id7 == null ? "no_value" : id7;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers7 = offer4.getOptionOffers();
                        ArrayList arrayList7 = new ArrayList(v75.o(optionOffers7, 10));
                        Iterator<T> it7 = optionOffers7.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(((PlusPayCompositeOffers.Offer.Option) it7.next()).getId());
                        }
                        String str7 = str5 == null ? "no_value" : str5;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer8 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                        String id8 = tariffOffer8 != null ? tariffOffer8.getId() : null;
                        if (id8 == null) {
                            id8 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers8 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                        String str8 = id8;
                        ArrayList arrayList8 = new ArrayList(v75.o(optionOffers8, 10));
                        Iterator<T> it8 = optionOffers8.iterator();
                        while (it8.hasNext()) {
                            arrayList8.add(((PlusPayCompositeOffers.Offer.Option) it8.next()).getId());
                        }
                        String acceptButtonText = plusPayCompositeUpsale.getTemplate().getAcceptButtonText();
                        boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                        cdkVar4.getClass();
                        d4.getClass();
                        acceptButtonText.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("purchase_session_id", d4);
                        linkedHashMap3.put("product_id", str6);
                        dfi.u(linkedHashMap3, "options_id", arrayList7, true, "is_tarifficator");
                        linkedHashMap3.put("payment_option", a8.a);
                        eta.u(linkedHashMap3, "payment_method_id", str7, false, "card_linked");
                        linkedHashMap3.put("upsale_product_id", str8);
                        linkedHashMap3.put("upsale_options_id", arrayList8);
                        linkedHashMap3.put("button_text", acceptButtonText);
                        linkedHashMap3.put("silent", String.valueOf(z));
                        linkedHashMap3.put("_meta", cdk.c(new HashMap()));
                        cdkVar4.f("Upsale.Button.Clicked", linkedHashMap3);
                        eVar = eVar2;
                    } else {
                        eVar = eVar2;
                    }
                    com.yandex.plus.pay.api.analytics.tarifficator.e.a(eVar.c, plusPayCompositeUpsale.getOffer(), 0, "upsale_offer", "checkout_upsale_page", null);
                    x97.y(ot0.F(mVar2), null, null, new l(mVar2, plusPayCompositeUpsale, (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.i) mVar2.z.getValue(), null), 3);
                }
                break;
            case 12:
                m mVar3 = (m) this.receiver;
                PlusPayCompositeUpsale plusPayCompositeUpsale2 = mVar3.w;
                if (plusPayCompositeUpsale2 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar2 = mVar3.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a9 = mVar3.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar2;
                    eVar3.getClass();
                    mVar = mVar3;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c2 = a9.c();
                    PlusPayCompositeOffers.Offer offer5 = c2.a;
                    zck a10 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer5);
                    String str9 = c2.c;
                    if (a10 != null) {
                        cdk cdkVar5 = eVar3.a;
                        String d5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a9.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer9 = offer5.getTariffOffer();
                        String id9 = tariffOffer9 != null ? tariffOffer9.getId() : null;
                        String str10 = id9 == null ? "no_value" : id9;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers9 = offer5.getOptionOffers();
                        ArrayList arrayList9 = new ArrayList(v75.o(optionOffers9, 10));
                        Iterator<T> it9 = optionOffers9.iterator();
                        while (it9.hasNext()) {
                            arrayList9.add(((PlusPayCompositeOffers.Offer.Option) it9.next()).getId());
                        }
                        String str11 = str9 == null ? "no_value" : str9;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer10 = plusPayCompositeUpsale2.getOffer().getTariffOffer();
                        String id10 = tariffOffer10 != null ? tariffOffer10.getId() : null;
                        if (id10 == null) {
                            id10 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers10 = plusPayCompositeUpsale2.getOffer().getOptionOffers();
                        String str12 = id10;
                        String str13 = str11;
                        ArrayList arrayList10 = new ArrayList(v75.o(optionOffers10, 10));
                        Iterator<T> it10 = optionOffers10.iterator();
                        while (it10.hasNext()) {
                            arrayList10.add(((PlusPayCompositeOffers.Offer.Option) it10.next()).getId());
                        }
                        boolean z2 = c2.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                        LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar5, d5, "purchase_session_id", d5);
                        t.put("product_id", str10);
                        dfi.u(t, "options_id", arrayList9, true, "is_tarifficator");
                        t.put("payment_option", a10.a);
                        eta.u(t, "payment_method_id", str13, false, "card_linked");
                        t.put("upsale_product_id", str12);
                        t.put("upsale_options_id", arrayList10);
                        t.put("silent", String.valueOf(z2));
                        t.put("_meta", cdk.c(new HashMap()));
                        cdkVar5.f("Upsale.Skip.Clicked", t);
                    }
                } else {
                    mVar = mVar3;
                }
                mVar.H();
                break;
            case 13:
                m mVar4 = (m) this.receiver;
                PlusPayCompositeUpsale plusPayCompositeUpsale3 = mVar4.w;
                if (plusPayCompositeUpsale3 != null && !mVar4.u) {
                    mVar4.u = true;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar3 = mVar4.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a11 = mVar4.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar4 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar3;
                    eVar4.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c3 = a11.c();
                    PlusPayCompositeOffers.Offer offer6 = c3.a;
                    zck a12 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer6);
                    String str14 = c3.c;
                    if (a12 != null) {
                        cdk cdkVar6 = eVar4.a;
                        String d6 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a11.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer11 = offer6.getTariffOffer();
                        String id11 = tariffOffer11 != null ? tariffOffer11.getId() : null;
                        String str15 = id11 == null ? "no_value" : id11;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers11 = offer6.getOptionOffers();
                        ArrayList arrayList11 = new ArrayList(v75.o(optionOffers11, 10));
                        Iterator<T> it11 = optionOffers11.iterator();
                        while (it11.hasNext()) {
                            arrayList11.add(((PlusPayCompositeOffers.Offer.Option) it11.next()).getId());
                        }
                        String str16 = str14 == null ? "no_value" : str14;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer12 = plusPayCompositeUpsale3.getOffer().getTariffOffer();
                        String id12 = tariffOffer12 != null ? tariffOffer12.getId() : null;
                        if (id12 == null) {
                            id12 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers12 = plusPayCompositeUpsale3.getOffer().getOptionOffers();
                        String str17 = id12;
                        ArrayList arrayList12 = new ArrayList(v75.o(optionOffers12, 10));
                        Iterator<T> it12 = optionOffers12.iterator();
                        while (it12.hasNext()) {
                            arrayList12.add(((PlusPayCompositeOffers.Offer.Option) it12.next()).getId());
                        }
                        PlusPayLegalInfo legalInfo2 = plusPayCompositeUpsale3.getOffer().getLegalInfo();
                        String b2 = (legalInfo2 == null || (fromLegalInfo2 = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo2)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo2);
                        String str18 = b2 == null ? "no_value" : b2;
                        LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar6, d6, "purchase_session_id", d6);
                        t2.put("product_id", str15);
                        dfi.u(t2, "options_id", arrayList11, true, "is_tarifficator");
                        t2.put("payment_option", a12.a);
                        eta.u(t2, "payment_method_id", str16, false, "card_linked");
                        t2.put("upsale_product_id", str17);
                        t2.put("upsale_options_id", arrayList12);
                        t2.put("upsale_legal_text", str18);
                        t2.put("_meta", cdk.c(new HashMap()));
                        cdkVar6.f("Upsale.LegalText.Shown", t2);
                    }
                }
                break;
            case 14:
                ((com.yandex.plus.webview.core.d) this.receiver).f();
                break;
            case 15:
                C1005d2 c1005d2 = (C1005d2) this.receiver;
                c1005d2.b.trackTryAgainClick();
                Z7.a(c1005d2.a.c);
                c1005d2.a.a();
                break;
            case 16:
                C1103k2 c1103k2 = (C1103k2) this.receiver;
                c1103k2.b.trackCloseClick();
                Z7.a(c1103k2.a.c);
                break;
            case 17:
                O3 o3 = (O3) this.receiver;
                o3.c.trackHelpClick();
                Z7.a(o3.a.b, new i0i());
                break;
            case 18:
                Z7.a(((C1022e5) this.receiver).a.c);
                break;
            case 19:
                Hc hc = (Hc) this.receiver;
                if (!((Cc) ((xdr) hc.f).getValue()).a) {
                    bqi bqiVar = hc.f;
                    do {
                        xdrVar = (xdr) bqiVar;
                        value = xdrVar.getValue();
                        ((Cc) value).getClass();
                    } while (!xdrVar.k(value, new Cc(true)));
                    x97.y(ot0.F(hc), null, null, new Ic(hc, null), 3);
                }
                break;
            case 20:
                C1005d2 c1005d22 = (C1005d2) this.receiver;
                c1005d22.b.trackLaterClick();
                Z7.a(c1005d22.a.c);
                break;
            default:
                O3 o32 = (O3) this.receiver;
                o32.c.trackCloseClick();
                Z7.a(o32.a.c);
                break;
        }
        return Unit.a;
    }
}
