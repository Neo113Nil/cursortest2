package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.aur;
import defpackage.bqi;
import defpackage.cdk;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y2x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends aur implements Function2 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public j k;
    public PlusPayPresale l;
    public bqi m;
    public CharSequence n;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b o;
    public CharSequence p;
    public int q;
    public int r;
    public final /* synthetic */ j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.s = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0101, code lost:
    
        if (r12 == r1) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0385 A[LOOP:0: B:14:0x037f->B:16:0x0385, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03d6 A[LOOP:1: B:24:0x03d0->B:26:0x03d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a A[LOOP:2: B:62:0x0194->B:64:0x019a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1 A[LOOP:3: B:72:0x01eb->B:74:0x01f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016c  */
    /* JADX WARN: Type inference failed for: r12v22, types: [bqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a;
        Object a2;
        xdr xdrVar;
        Object H;
        j jVar;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        PlusPayPresale plusPayPresale;
        int i;
        String str;
        Iterator it;
        String id;
        Iterator it2;
        String b;
        Object obj2;
        long loadingDelayMillis;
        PlusPayPresale plusPayPresale2;
        nm6 nm6Var;
        int i2;
        j jVar2;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar2;
        PlusPayRichText fromLegalInfo;
        Object H2;
        j jVar3;
        bqi bqiVar;
        int i3;
        Object obj3;
        Object a3;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar3;
        PlusPayPresale plusPayPresale3;
        CharSequence charSequence;
        Object obj4;
        Object H3;
        bqi bqiVar2;
        CharSequence charSequence2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar;
        CharSequence charSequence3;
        Object obj5;
        PlusPayLegalInfo legalInfo;
        Object obj6;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar4;
        CharSequence charSequence4;
        Object H4;
        String id2;
        Iterator it3;
        String id3;
        Iterator it4;
        i iVar = this;
        nm6 nm6Var2 = nm6.a;
        int i4 = iVar.r;
        j jVar4 = iVar.s;
        switch (i4) {
            case 0:
                qgg.h0(obj);
                a = jVar4.k.a.a();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.a aVar5 = jVar4.l;
                iVar.j = a;
                iVar.r = 1;
                a2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale.c) aVar5).a(a, iVar);
                break;
            case 1:
                a = iVar.j;
                qgg.h0(obj);
                a2 = obj;
                PlusPayPresale plusPayPresale4 = (PlusPayPresale) a2;
                if (plusPayPresale4 == null) {
                    jVar4.G();
                    return Unit.a;
                }
                jVar4.r = plusPayPresale4;
                xdrVar = jVar4.s;
                PlusPayRichText loadingText = plusPayPresale4.getAssets().getLoadingText();
                iVar.j = a;
                iVar.k = jVar4;
                iVar.l = plusPayPresale4;
                iVar.m = xdrVar;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar6 = a;
                iVar.q = 0;
                iVar.r = 2;
                H = jVar4.H(loadingText, iVar);
                if (H != nm6Var2) {
                    jVar = jVar4;
                    aVar = aVar6;
                    plusPayPresale = plusPayPresale4;
                    i = 0;
                    str = "no_value";
                    f fVar = new f((CharSequence) H);
                    xdr xdrVar2 = xdrVar;
                    xdrVar2.getClass();
                    xdrVar2.m(null, fVar);
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) jVar.n;
                    bVar2.getClass();
                    aVar.getClass();
                    plusPayPresale.getClass();
                    cdk cdkVar = bVar2.b;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar7 = aVar;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar7.a);
                    PlusPayCompositeOffers.Offer offer = aVar7.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id4 = tariffOffer == null ? tariffOffer.getId() : null;
                    String str2 = id4 != null ? str : id4;
                    int i5 = i;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    PlusPayPresale plusPayPresale5 = plusPayPresale;
                    j jVar5 = jVar;
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = plusPayPresale5.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis2 = plusPayPresale5.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayPresale5.getSuggestedOffer().getTariffOffer();
                    id = tariffOffer2 == null ? tariffOffer2.getId() : null;
                    if (id == null) {
                        id = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayPresale5.getSuggestedOffer().getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                    it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    PlusPayLegalInfo legalInfo2 = plusPayPresale5.getSuggestedOffer().getLegalInfo();
                    b = (legalInfo2 != null || (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo2)) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo);
                    if (b == null) {
                        b = str;
                    }
                    cdkVar.getClass();
                    d.getClass();
                    productTarget.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", d);
                    linkedHashMap.put("product_id", str2);
                    linkedHashMap.put("options_id", arrayList);
                    linkedHashMap.put("target", productTarget);
                    linkedHashMap.put("loading_duration_millis", String.valueOf(loadingDelayMillis2));
                    linkedHashMap.put("presale_product_id", id);
                    linkedHashMap.put("presale_options_id", arrayList2);
                    linkedHashMap.put("presale_legal_text", b);
                    obj2 = "_meta";
                    linkedHashMap.put(obj2, cdk.c(new HashMap()));
                    cdkVar.f("Presale.Screen.Shown", linkedHashMap);
                    loadingDelayMillis = plusPayPresale5.getLoadingDelayMillis();
                    iVar = this;
                    iVar.j = aVar7;
                    iVar.k = jVar5;
                    plusPayPresale2 = plusPayPresale5;
                    iVar.l = plusPayPresale2;
                    iVar.m = null;
                    iVar.q = i5;
                    iVar.r = 3;
                    nm6Var = nm6Var2;
                    if (y2x.o(loadingDelayMillis, iVar) != nm6Var) {
                        return nm6Var;
                    }
                    i2 = i5;
                    jVar2 = jVar5;
                    aVar2 = aVar7;
                    xdr xdrVar3 = jVar2.s;
                    PlusPayRichText loadingText2 = plusPayPresale2.getAssets().getLoadingText();
                    iVar.j = aVar2;
                    iVar.k = jVar2;
                    iVar.l = plusPayPresale2;
                    iVar.m = xdrVar3;
                    iVar.q = i2;
                    int i6 = i2;
                    iVar.r = 4;
                    H2 = jVar2.H(loadingText2, iVar);
                    if (H2 != nm6Var) {
                        return nm6Var;
                    }
                    jVar3 = jVar2;
                    bqiVar = xdrVar3;
                    i3 = i6;
                    CharSequence charSequence5 = (CharSequence) H2;
                    obj3 = obj2;
                    PlusPayPresale.Assets assets = plusPayPresale2.getAssets();
                    iVar.j = aVar2;
                    iVar.k = jVar3;
                    iVar.l = plusPayPresale2;
                    iVar.m = bqiVar;
                    iVar.n = charSequence5;
                    iVar.q = i3;
                    iVar.r = 5;
                    a3 = j.a(jVar3, assets, iVar);
                    if (a3 != nm6Var) {
                        return nm6Var;
                    }
                    aVar3 = aVar2;
                    plusPayPresale3 = plusPayPresale2;
                    charSequence = charSequence5;
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar3 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) a3;
                    obj4 = "presale_options_id";
                    PlusPayRichText originalOfferButtonText = plusPayPresale3.getAssets().getOriginalOfferButtonText();
                    iVar.j = aVar3;
                    iVar.k = jVar3;
                    iVar.l = plusPayPresale3;
                    iVar.m = bqiVar;
                    iVar.n = charSequence;
                    iVar.o = bVar3;
                    iVar.q = i3;
                    iVar.r = 6;
                    H3 = jVar3.H(originalOfferButtonText, iVar);
                    if (H3 != nm6Var) {
                        return nm6Var;
                    }
                    bqiVar2 = bqiVar;
                    charSequence2 = charSequence;
                    bVar = bVar3;
                    charSequence3 = (CharSequence) H3;
                    obj5 = "presale_product_id";
                    legalInfo = plusPayPresale3.getSuggestedOffer().getLegalInfo();
                    obj6 = "loading_duration_millis";
                    if (legalInfo != null) {
                        aVar4 = aVar3;
                        charSequence4 = null;
                        e eVar = new e(charSequence2, bVar, charSequence3, charSequence4);
                        xdr xdrVar4 = (xdr) bqiVar2;
                        xdrVar4.getClass();
                        xdrVar4.m(null, eVar);
                        com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar4 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) jVar3.n;
                        bVar4.getClass();
                        aVar4.getClass();
                        plusPayPresale3.getClass();
                        cdk cdkVar2 = bVar4.b;
                        String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar4.a);
                        PlusPayCompositeOffers.Offer offer2 = aVar4.b.a;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer2.getTariffOffer();
                        if (tariffOffer3 != null) {
                        }
                        if (id2 == null) {
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer2.getOptionOffers();
                        ArrayList arrayList3 = new ArrayList(v75.o(optionOffers3, 10));
                        it3 = optionOffers3.iterator();
                        while (it3.hasNext()) {
                        }
                        String productTarget2 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                        long loadingDelayMillis3 = plusPayPresale3.getLoadingDelayMillis();
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                        if (tariffOffer4 != null) {
                        }
                        if (id3 == null) {
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                        ArrayList arrayList4 = new ArrayList(v75.o(optionOffers4, 10));
                        it4 = optionOffers4.iterator();
                        while (it4.hasNext()) {
                        }
                        cdkVar2.getClass();
                        d2.getClass();
                        productTarget2.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("purchase_session_id", d2);
                        linkedHashMap2.put("product_id", id2);
                        linkedHashMap2.put("options_id", arrayList3);
                        linkedHashMap2.put("target", productTarget2);
                        linkedHashMap2.put(obj6, String.valueOf(loadingDelayMillis3));
                        linkedHashMap2.put(obj5, id3);
                        linkedHashMap2.put(obj4, arrayList4);
                        linkedHashMap2.put(obj3, cdk.c(new HashMap()));
                        cdkVar2.f("Presale.Offer.Shown", linkedHashMap2);
                        com.yandex.plus.pay.api.analytics.tarifficator.e.d(bVar4.c, plusPayPresale3.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", bVar4.a.b);
                        return Unit.a;
                    }
                    PlusPayRichText fromLegalInfo2 = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo);
                    iVar.j = aVar3;
                    iVar.k = jVar3;
                    iVar.l = plusPayPresale3;
                    iVar.m = bqiVar2;
                    iVar.n = charSequence2;
                    iVar.o = bVar;
                    iVar.p = charSequence3;
                    iVar.q = i3;
                    iVar.r = 7;
                    H4 = jVar3.H(fromLegalInfo2, iVar);
                    if (H4 == nm6Var) {
                        return nm6Var;
                    }
                    aVar4 = aVar3;
                    charSequence4 = (CharSequence) H4;
                    e eVar2 = new e(charSequence2, bVar, charSequence3, charSequence4);
                    xdr xdrVar42 = (xdr) bqiVar2;
                    xdrVar42.getClass();
                    xdrVar42.m(null, eVar2);
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar42 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) jVar3.n;
                    bVar42.getClass();
                    aVar4.getClass();
                    plusPayPresale3.getClass();
                    cdk cdkVar22 = bVar42.b;
                    String d22 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar4.a);
                    PlusPayCompositeOffers.Offer offer22 = aVar4.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer32 = offer22.getTariffOffer();
                    id2 = tariffOffer32 != null ? tariffOffer32.getId() : null;
                    if (id2 == null) {
                        id2 = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers32 = offer22.getOptionOffers();
                    ArrayList arrayList32 = new ArrayList(v75.o(optionOffers32, 10));
                    it3 = optionOffers32.iterator();
                    while (it3.hasNext()) {
                        arrayList32.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    String productTarget22 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                    long loadingDelayMillis32 = plusPayPresale3.getLoadingDelayMillis();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer42 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                    id3 = tariffOffer42 != null ? tariffOffer42.getId() : null;
                    if (id3 == null) {
                        id3 = str;
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers42 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                    ArrayList arrayList42 = new ArrayList(v75.o(optionOffers42, 10));
                    it4 = optionOffers42.iterator();
                    while (it4.hasNext()) {
                        arrayList42.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    cdkVar22.getClass();
                    d22.getClass();
                    productTarget22.getClass();
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                    linkedHashMap22.put("purchase_session_id", d22);
                    linkedHashMap22.put("product_id", id2);
                    linkedHashMap22.put("options_id", arrayList32);
                    linkedHashMap22.put("target", productTarget22);
                    linkedHashMap22.put(obj6, String.valueOf(loadingDelayMillis32));
                    linkedHashMap22.put(obj5, id3);
                    linkedHashMap22.put(obj4, arrayList42);
                    linkedHashMap22.put(obj3, cdk.c(new HashMap()));
                    cdkVar22.f("Presale.Offer.Shown", linkedHashMap22);
                    com.yandex.plus.pay.api.analytics.tarifficator.e.d(bVar42.c, plusPayPresale3.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", bVar42.a.b);
                    return Unit.a;
                }
                return nm6Var2;
            case 2:
                int i7 = iVar.q;
                ?? r12 = iVar.m;
                plusPayPresale = iVar.l;
                j jVar6 = iVar.k;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar8 = iVar.j;
                qgg.h0(obj);
                H = obj;
                aVar = aVar8;
                jVar = jVar6;
                xdrVar = r12;
                i = i7;
                str = "no_value";
                f fVar2 = new f((CharSequence) H);
                xdr xdrVar22 = xdrVar;
                xdrVar22.getClass();
                xdrVar22.m(null, fVar2);
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar22 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) jVar.n;
                bVar22.getClass();
                aVar.getClass();
                plusPayPresale.getClass();
                cdk cdkVar3 = bVar22.b;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar72 = aVar;
                String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar72.a);
                PlusPayCompositeOffers.Offer offer3 = aVar72.b.a;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer5 = offer3.getTariffOffer();
                if (tariffOffer5 == null) {
                }
                if (id4 != null) {
                }
                int i52 = i;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers5 = offer3.getOptionOffers();
                PlusPayPresale plusPayPresale52 = plusPayPresale;
                j jVar52 = jVar;
                ArrayList arrayList5 = new ArrayList(v75.o(optionOffers5, 10));
                it = optionOffers5.iterator();
                while (it.hasNext()) {
                }
                String productTarget3 = plusPayPresale52.getSuggestedOffer().getMeta().getProductTarget();
                long loadingDelayMillis22 = plusPayPresale52.getLoadingDelayMillis();
                PlusPayCompositeOffers.Offer.Tariff tariffOffer22 = plusPayPresale52.getSuggestedOffer().getTariffOffer();
                if (tariffOffer22 == null) {
                }
                if (id == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers22 = plusPayPresale52.getSuggestedOffer().getOptionOffers();
                ArrayList arrayList22 = new ArrayList(v75.o(optionOffers22, 10));
                it2 = optionOffers22.iterator();
                while (it2.hasNext()) {
                }
                PlusPayLegalInfo legalInfo22 = plusPayPresale52.getSuggestedOffer().getLegalInfo();
                if (legalInfo22 != null) {
                    break;
                }
                if (b == null) {
                }
                cdkVar3.getClass();
                d3.getClass();
                productTarget3.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("purchase_session_id", d3);
                linkedHashMap3.put("product_id", str2);
                linkedHashMap3.put("options_id", arrayList5);
                linkedHashMap3.put("target", productTarget3);
                linkedHashMap3.put("loading_duration_millis", String.valueOf(loadingDelayMillis22));
                linkedHashMap3.put("presale_product_id", id);
                linkedHashMap3.put("presale_options_id", arrayList22);
                linkedHashMap3.put("presale_legal_text", b);
                obj2 = "_meta";
                linkedHashMap3.put(obj2, cdk.c(new HashMap()));
                cdkVar3.f("Presale.Screen.Shown", linkedHashMap3);
                loadingDelayMillis = plusPayPresale52.getLoadingDelayMillis();
                iVar = this;
                iVar.j = aVar72;
                iVar.k = jVar52;
                plusPayPresale2 = plusPayPresale52;
                iVar.l = plusPayPresale2;
                iVar.m = null;
                iVar.q = i52;
                iVar.r = 3;
                nm6Var = nm6Var2;
                if (y2x.o(loadingDelayMillis, iVar) != nm6Var) {
                }
                break;
            case 3:
                i2 = iVar.q;
                plusPayPresale2 = iVar.l;
                jVar2 = iVar.k;
                aVar2 = iVar.j;
                qgg.h0(obj);
                nm6Var = nm6Var2;
                obj2 = "_meta";
                str = "no_value";
                xdr xdrVar32 = jVar2.s;
                PlusPayRichText loadingText22 = plusPayPresale2.getAssets().getLoadingText();
                iVar.j = aVar2;
                iVar.k = jVar2;
                iVar.l = plusPayPresale2;
                iVar.m = xdrVar32;
                iVar.q = i2;
                int i62 = i2;
                iVar.r = 4;
                H2 = jVar2.H(loadingText22, iVar);
                if (H2 != nm6Var) {
                }
                break;
            case 4:
                int i8 = iVar.q;
                bqi bqiVar3 = iVar.m;
                PlusPayPresale plusPayPresale6 = iVar.l;
                j jVar7 = iVar.k;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar9 = iVar.j;
                qgg.h0(obj);
                nm6Var = nm6Var2;
                obj2 = "_meta";
                bqiVar = bqiVar3;
                plusPayPresale2 = plusPayPresale6;
                jVar3 = jVar7;
                aVar2 = aVar9;
                str = "no_value";
                i3 = i8;
                H2 = obj;
                CharSequence charSequence52 = (CharSequence) H2;
                obj3 = obj2;
                PlusPayPresale.Assets assets2 = plusPayPresale2.getAssets();
                iVar.j = aVar2;
                iVar.k = jVar3;
                iVar.l = plusPayPresale2;
                iVar.m = bqiVar;
                iVar.n = charSequence52;
                iVar.q = i3;
                iVar.r = 5;
                a3 = j.a(jVar3, assets2, iVar);
                if (a3 != nm6Var) {
                }
                break;
            case 5:
                int i9 = iVar.q;
                charSequence = iVar.n;
                bqiVar = iVar.m;
                plusPayPresale3 = iVar.l;
                jVar3 = iVar.k;
                aVar3 = iVar.j;
                qgg.h0(obj);
                str = "no_value";
                i3 = i9;
                obj3 = "_meta";
                nm6Var = nm6Var2;
                a3 = obj;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar32 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b) a3;
                obj4 = "presale_options_id";
                PlusPayRichText originalOfferButtonText2 = plusPayPresale3.getAssets().getOriginalOfferButtonText();
                iVar.j = aVar3;
                iVar.k = jVar3;
                iVar.l = plusPayPresale3;
                iVar.m = bqiVar;
                iVar.n = charSequence;
                iVar.o = bVar32;
                iVar.q = i3;
                iVar.r = 6;
                H3 = jVar3.H(originalOfferButtonText2, iVar);
                if (H3 != nm6Var) {
                }
                break;
            case 6:
                int i10 = iVar.q;
                bVar = iVar.o;
                charSequence2 = iVar.n;
                bqi bqiVar4 = iVar.m;
                PlusPayPresale plusPayPresale7 = iVar.l;
                j jVar8 = iVar.k;
                aVar3 = iVar.j;
                qgg.h0(obj);
                str = "no_value";
                i3 = i10;
                obj3 = "_meta";
                obj4 = "presale_options_id";
                bqiVar2 = bqiVar4;
                plusPayPresale3 = plusPayPresale7;
                jVar3 = jVar8;
                nm6Var = nm6Var2;
                H3 = obj;
                charSequence3 = (CharSequence) H3;
                obj5 = "presale_product_id";
                legalInfo = plusPayPresale3.getSuggestedOffer().getLegalInfo();
                obj6 = "loading_duration_millis";
                if (legalInfo != null) {
                }
                break;
            case 7:
                CharSequence charSequence6 = iVar.p;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.b bVar5 = iVar.o;
                charSequence2 = iVar.n;
                bqi bqiVar5 = iVar.m;
                PlusPayPresale plusPayPresale8 = iVar.l;
                j jVar9 = iVar.k;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar10 = iVar.j;
                qgg.h0(obj);
                obj3 = "_meta";
                obj4 = "presale_options_id";
                obj5 = "presale_product_id";
                obj6 = "loading_duration_millis";
                bqiVar2 = bqiVar5;
                H4 = obj;
                jVar3 = jVar9;
                plusPayPresale3 = plusPayPresale8;
                bVar = bVar5;
                aVar3 = aVar10;
                charSequence3 = charSequence6;
                str = "no_value";
                aVar4 = aVar3;
                charSequence4 = (CharSequence) H4;
                e eVar22 = new e(charSequence2, bVar, charSequence3, charSequence4);
                xdr xdrVar422 = (xdr) bqiVar2;
                xdrVar422.getClass();
                xdrVar422.m(null, eVar22);
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b bVar422 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.presale.b) jVar3.n;
                bVar422.getClass();
                aVar4.getClass();
                plusPayPresale3.getClass();
                cdk cdkVar222 = bVar422.b;
                String d222 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar4.a);
                PlusPayCompositeOffers.Offer offer222 = aVar4.b.a;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer322 = offer222.getTariffOffer();
                if (tariffOffer322 != null) {
                }
                if (id2 == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers322 = offer222.getOptionOffers();
                ArrayList arrayList322 = new ArrayList(v75.o(optionOffers322, 10));
                it3 = optionOffers322.iterator();
                while (it3.hasNext()) {
                }
                String productTarget222 = plusPayPresale3.getSuggestedOffer().getMeta().getProductTarget();
                long loadingDelayMillis322 = plusPayPresale3.getLoadingDelayMillis();
                PlusPayCompositeOffers.Offer.Tariff tariffOffer422 = plusPayPresale3.getSuggestedOffer().getTariffOffer();
                if (tariffOffer422 != null) {
                }
                if (id3 == null) {
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers422 = plusPayPresale3.getSuggestedOffer().getOptionOffers();
                ArrayList arrayList422 = new ArrayList(v75.o(optionOffers422, 10));
                it4 = optionOffers422.iterator();
                while (it4.hasNext()) {
                }
                cdkVar222.getClass();
                d222.getClass();
                productTarget222.getClass();
                LinkedHashMap linkedHashMap222 = new LinkedHashMap();
                linkedHashMap222.put("purchase_session_id", d222);
                linkedHashMap222.put("product_id", id2);
                linkedHashMap222.put("options_id", arrayList322);
                linkedHashMap222.put("target", productTarget222);
                linkedHashMap222.put(obj6, String.valueOf(loadingDelayMillis322));
                linkedHashMap222.put(obj5, id3);
                linkedHashMap222.put(obj4, arrayList422);
                linkedHashMap222.put(obj3, cdk.c(new HashMap()));
                cdkVar222.f("Presale.Offer.Shown", linkedHashMap222);
                com.yandex.plus.pay.api.analytics.tarifficator.e.d(bVar422.c, plusPayPresale3.getSuggestedOffer(), 0, "presale_offer", "checkout_presale_page", bVar422.a.b);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
