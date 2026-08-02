package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class j extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a k;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.a l;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g m;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a n;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d o;
    public final y p;
    public boolean q;
    public PlusPayPresale r;
    public final xdr s;
    public final xdr t;

    public j(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g gVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.a aVar3, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, y yVar) {
        aVar.getClass();
        aVar2.getClass();
        gVar.getClass();
        aVar3.getClass();
        dVar.getClass();
        this.k = aVar;
        this.l = aVar2;
        this.m = gVar;
        this.n = aVar3;
        this.o = dVar;
        this.p = yVar;
        xdr a = ydr.a(d.a);
        this.s = a;
        this.t = a;
        x97.y(ot0.F(this), null, null, new i(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (r14 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, PlusPayPresale.Assets assets, cg6 cg6Var) {
        h hVar;
        PlusPayPresale.Assets assets2;
        CharSequence charSequence;
        Object H;
        PlusPayPresale.Assets assets3;
        Object H2;
        CharSequence charSequence2;
        PlusPayPresale.Assets assets4;
        CharSequence charSequence3;
        Object H3;
        PlusPayPresale.Assets assets5;
        CharSequence charSequence4;
        Object H4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        CharSequence charSequence7;
        PlusPayRichText suggestedOfferButtonAdditionalText;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14;
        CharSequence charSequence15;
        jVar.getClass();
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i = hVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.r = i - Integer.MIN_VALUE;
                Object obj = hVar.p;
                Object obj2 = nm6.a;
                CharSequence charSequence16 = null;
                switch (hVar.r) {
                    case 0:
                        qgg.h0(obj);
                        PlusPayRichText benefitText = assets.getBenefitText();
                        if (benefitText == null) {
                            assets2 = assets;
                            charSequence = null;
                            PlusPayRichText periodText = assets2.getPeriodText();
                            hVar.j = assets2;
                            hVar.k = charSequence;
                            hVar.r = 2;
                            H = jVar.H(periodText, hVar);
                            if (H != obj2) {
                                assets3 = assets2;
                                obj = H;
                                CharSequence charSequence17 = (CharSequence) obj;
                                PlusPayRichText priceText = assets3.getPriceText();
                                hVar.j = assets3;
                                hVar.k = charSequence;
                                hVar.l = charSequence17;
                                hVar.r = 3;
                                H2 = jVar.H(priceText, hVar);
                                if (H2 != obj2) {
                                    PlusPayPresale.Assets assets6 = assets3;
                                    charSequence2 = charSequence;
                                    assets4 = assets6;
                                    charSequence3 = charSequence17;
                                    obj = H2;
                                    CharSequence charSequence18 = (CharSequence) obj;
                                    PlusPayRichText priceDescriptionText = assets4.getPriceDescriptionText();
                                    hVar.j = assets4;
                                    hVar.k = charSequence2;
                                    hVar.l = charSequence3;
                                    hVar.m = charSequence18;
                                    hVar.r = 4;
                                    H3 = jVar.H(priceDescriptionText, hVar);
                                    if (H3 != obj2) {
                                        assets5 = assets4;
                                        charSequence4 = charSequence18;
                                        obj = H3;
                                        CharSequence charSequence19 = (CharSequence) obj;
                                        PlusPayRichText suggestedOfferButtonText = assets5.getSuggestedOfferButtonText();
                                        hVar.j = assets5;
                                        hVar.k = charSequence2;
                                        hVar.l = charSequence3;
                                        hVar.m = charSequence4;
                                        hVar.n = charSequence19;
                                        hVar.r = 5;
                                        H4 = jVar.H(suggestedOfferButtonText, hVar);
                                        if (H4 != obj2) {
                                            CharSequence charSequence20 = charSequence3;
                                            charSequence5 = charSequence4;
                                            charSequence6 = charSequence19;
                                            obj = H4;
                                            charSequence7 = charSequence20;
                                            CharSequence charSequence21 = (CharSequence) obj;
                                            suggestedOfferButtonAdditionalText = assets5.getSuggestedOfferButtonAdditionalText();
                                            if (suggestedOfferButtonAdditionalText != null) {
                                                charSequence8 = charSequence21;
                                                charSequence9 = charSequence5;
                                                charSequence10 = charSequence7;
                                                charSequence11 = charSequence2;
                                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                                            }
                                            hVar.j = null;
                                            hVar.k = charSequence2;
                                            hVar.l = charSequence7;
                                            hVar.m = charSequence5;
                                            hVar.n = charSequence6;
                                            hVar.o = charSequence21;
                                            hVar.r = 6;
                                            Object H5 = jVar.H(suggestedOfferButtonAdditionalText, hVar);
                                            if (H5 != obj2) {
                                                obj = H5;
                                                charSequence12 = charSequence21;
                                                charSequence13 = charSequence5;
                                                charSequence14 = charSequence2;
                                                charSequence15 = charSequence7;
                                                charSequence16 = (CharSequence) obj;
                                                charSequence8 = charSequence12;
                                                charSequence11 = charSequence14;
                                                charSequence9 = charSequence13;
                                                charSequence10 = charSequence15;
                                                return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                                            }
                                        }
                                    }
                                }
                            }
                            return obj2;
                        }
                        hVar.j = assets;
                        hVar.r = 1;
                        obj = jVar.H(benefitText, hVar);
                        break;
                    case 1:
                        assets = hVar.j;
                        qgg.h0(obj);
                        CharSequence charSequence22 = (CharSequence) obj;
                        assets2 = assets;
                        charSequence = charSequence22;
                        PlusPayRichText periodText2 = assets2.getPeriodText();
                        hVar.j = assets2;
                        hVar.k = charSequence;
                        hVar.r = 2;
                        H = jVar.H(periodText2, hVar);
                        if (H != obj2) {
                        }
                        return obj2;
                    case 2:
                        charSequence = hVar.k;
                        PlusPayPresale.Assets assets7 = hVar.j;
                        qgg.h0(obj);
                        assets3 = assets7;
                        CharSequence charSequence172 = (CharSequence) obj;
                        PlusPayRichText priceText2 = assets3.getPriceText();
                        hVar.j = assets3;
                        hVar.k = charSequence;
                        hVar.l = charSequence172;
                        hVar.r = 3;
                        H2 = jVar.H(priceText2, hVar);
                        if (H2 != obj2) {
                        }
                        return obj2;
                    case 3:
                        CharSequence charSequence23 = hVar.l;
                        CharSequence charSequence24 = hVar.k;
                        PlusPayPresale.Assets assets8 = hVar.j;
                        qgg.h0(obj);
                        charSequence3 = charSequence23;
                        assets4 = assets8;
                        charSequence2 = charSequence24;
                        CharSequence charSequence182 = (CharSequence) obj;
                        PlusPayRichText priceDescriptionText2 = assets4.getPriceDescriptionText();
                        hVar.j = assets4;
                        hVar.k = charSequence2;
                        hVar.l = charSequence3;
                        hVar.m = charSequence182;
                        hVar.r = 4;
                        H3 = jVar.H(priceDescriptionText2, hVar);
                        if (H3 != obj2) {
                        }
                        return obj2;
                    case 4:
                        charSequence4 = hVar.m;
                        charSequence3 = hVar.l;
                        charSequence2 = hVar.k;
                        PlusPayPresale.Assets assets9 = hVar.j;
                        qgg.h0(obj);
                        assets5 = assets9;
                        CharSequence charSequence192 = (CharSequence) obj;
                        PlusPayRichText suggestedOfferButtonText2 = assets5.getSuggestedOfferButtonText();
                        hVar.j = assets5;
                        hVar.k = charSequence2;
                        hVar.l = charSequence3;
                        hVar.m = charSequence4;
                        hVar.n = charSequence192;
                        hVar.r = 5;
                        H4 = jVar.H(suggestedOfferButtonText2, hVar);
                        if (H4 != obj2) {
                        }
                        return obj2;
                    case 5:
                        charSequence6 = hVar.n;
                        charSequence5 = hVar.m;
                        CharSequence charSequence25 = hVar.l;
                        CharSequence charSequence26 = hVar.k;
                        assets5 = hVar.j;
                        qgg.h0(obj);
                        charSequence7 = charSequence25;
                        charSequence2 = charSequence26;
                        CharSequence charSequence212 = (CharSequence) obj;
                        suggestedOfferButtonAdditionalText = assets5.getSuggestedOfferButtonAdditionalText();
                        if (suggestedOfferButtonAdditionalText != null) {
                        }
                        break;
                    case 6:
                        charSequence12 = hVar.o;
                        charSequence6 = hVar.n;
                        charSequence13 = hVar.m;
                        charSequence15 = hVar.l;
                        charSequence14 = hVar.k;
                        qgg.h0(obj);
                        charSequence16 = (CharSequence) obj;
                        charSequence8 = charSequence12;
                        charSequence11 = charSequence14;
                        charSequence9 = charSequence13;
                        charSequence10 = charSequence15;
                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b(charSequence11, charSequence10, charSequence9, charSequence6, charSequence8, charSequence16);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        hVar = new h(jVar, cg6Var);
        Object obj3 = hVar.p;
        Object obj22 = nm6.a;
        CharSequence charSequence162 = null;
        switch (hVar.r) {
        }
    }

    public final void G() {
        this.m.a(this.k.a.a().b);
    }

    public final Object H(PlusPayRichText plusPayRichText, cg6 cg6Var) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.o).a(plusPayRichText, new com.yandex.plus.pay.internal.feature.counter_offers.f(5, this), cg6Var);
    }

    public final void J() {
        PlusPayPresale plusPayPresale = this.r;
        if (plusPayPresale != null) {
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.k.a.a();
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) this.n;
            bVar.getClass();
            cdk cdkVar = bVar.b;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
            PlusPayCompositeOffers.Offer offer = a.b.a;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            if (id == null) {
                id = "no_value";
            }
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
            String str = id2 != null ? id2 : "no_value";
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
            linkedHashMap.put("product_id", id);
            linkedHashMap.put("options_id", arrayList);
            linkedHashMap.put("target", productTarget);
            linkedHashMap.put("loading_duration_millis", String.valueOf(loadingDelayMillis));
            linkedHashMap.put("presale_product_id", str);
            linkedHashMap.put("presale_options_id", arrayList2);
            linkedHashMap.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("Presale.Screen.Closed", linkedHashMap);
            this.r = null;
        }
    }
}
