package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import defpackage.aur;
import defpackage.b6e;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.eta;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.xq0;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends aur implements Function2 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public int k;
    public final /* synthetic */ m l;
    public final /* synthetic */ PlusPayCompositeUpsale m;
    public final /* synthetic */ i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, PlusPayCompositeUpsale plusPayCompositeUpsale, i iVar, Continuation continuation) {
        super(2, continuation);
        this.l = mVar;
        this.m = plusPayCompositeUpsale;
        this.n = iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.l, this.m, this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0093, code lost:
    
        if (r4 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x030d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0071, code lost:
    
        if (r9 == r1) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a;
        Object a2;
        Object a3;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        PlusPayCompositeUpsale plusPayCompositeUpsale = this.m;
        m mVar = this.l;
        if (i == 0) {
            qgg.h0(obj);
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = mVar.l.a.a();
            a = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(a4, new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j(plusPayCompositeUpsale.getOffer(), null, a4.b().c, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f.a, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d.e, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.a, plusPayCompositeUpsale.getInAppReplacementParams()), null, 29);
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar = mVar.l;
            aVar.getClass();
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar.a;
            bVar.getClass();
            bVar.a = a;
            this.j = a;
            this.k = 1;
            a2 = m.a(mVar, plusPayCompositeUpsale, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = this.j;
                qgg.h0(obj);
                a3 = obj;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h hVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h) a3;
                if (hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.g) {
                    mVar.v = true;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) mVar.s;
                    eVar.getClass();
                    a.getClass();
                    plusPayCompositeUpsale.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
                    PlusPayCompositeOffers.Offer offer = c.a;
                    zck a5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
                    String str = c.c;
                    if (a5 != null) {
                        cdk cdkVar = eVar.a;
                        String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                        String id = tariffOffer != null ? tariffOffer.getId() : null;
                        String str2 = id == null ? "no_value" : id;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                        ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                        Iterator<T> it = optionOffers.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                        }
                        String str3 = str == null ? "no_value" : str;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                        String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                        String str4 = id2 == null ? "no_value" : id2;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                        String str5 = str4;
                        String str6 = str3;
                        ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                        Iterator<T> it2 = optionOffers2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                        }
                        boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                        LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                        t.put("product_id", str2);
                        dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
                        t.put("payment_option", a5.a);
                        eta.u(t, "payment_method_id", str6, false, "card_linked");
                        t.put("upsale_product_id", str5);
                        t.put("upsale_options_id", arrayList2);
                        t.put("silent", String.valueOf(z));
                        t.put("_meta", cdk.c(new HashMap()));
                        cdkVar.f("Upsale.Success", t);
                    }
                    mVar.H();
                } else if (hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.f) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.d dVar = mVar.s;
                    com.yandex.plus.pay.ui.api.feature.payment.g gVar = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.f) hVar).a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e eVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale.e) dVar;
                    eVar2.getClass();
                    a.getClass();
                    plusPayCompositeUpsale.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c2 = a.c();
                    PlusPayCompositeOffers.Offer offer2 = c2.a;
                    zck a6 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
                    String str7 = c2.c;
                    if (a6 != null) {
                        cdk cdkVar2 = eVar2.a;
                        String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer2.getTariffOffer();
                        String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                        String str8 = id3 == null ? "no_value" : id3;
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer2.getOptionOffers();
                        ArrayList arrayList3 = new ArrayList(v75.o(optionOffers3, 10));
                        Iterator<T> it3 = optionOffers3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                        }
                        String str9 = str7 == null ? "no_value" : str7;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = plusPayCompositeUpsale.getOffer().getTariffOffer();
                        String id4 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                        if (id4 == null) {
                            id4 = "no_value";
                        }
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = plusPayCompositeUpsale.getOffer().getOptionOffers();
                        String str10 = id4;
                        String str11 = str9;
                        ArrayList arrayList4 = new ArrayList(v75.o(optionOffers4, 10));
                        Iterator<T> it4 = optionOffers4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                        }
                        String c3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.c(gVar);
                        boolean z2 = c2.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
                        LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar2, d2, "purchase_session_id", d2);
                        t2.put("product_id", str8);
                        dfi.u(t2, "options_id", arrayList3, true, "is_tarifficator");
                        t2.put("payment_option", a6.a);
                        eta.u(t2, "payment_method_id", str11, false, "card_linked");
                        t2.put("upsale_product_id", str10);
                        t2.put("upsale_options_id", arrayList4);
                        t2.put("fail_reason", c3);
                        t2.put("silent", String.valueOf(z2));
                        t2.put("_meta", cdk.c(new HashMap()));
                        cdkVar2.f("Upsale.Fail", t2);
                    }
                    this.j = null;
                    this.k = 3;
                    mVar.x.b();
                    Unit a7 = mVar.r.a();
                    if (a7 != nm6.a) {
                        a7 = Unit.a;
                    }
                    if (a7 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (!(hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.e)) {
                        b6e.s();
                        return null;
                    }
                    mVar.y.l(this.n);
                }
                return Unit.a;
            }
            a = this.j;
            qgg.h0(obj);
            a2 = obj;
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a) a2;
        m.G(mVar, aVar2);
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar2 = mVar.m;
        com.yandex.plus.bdui.templating.render.a aVar3 = new com.yandex.plus.bdui.templating.render.a(16, mVar, plusPayCompositeUpsale);
        com.yandex.plus.pay.internal.d dVar3 = new com.yandex.plus.pay.internal.d(10, mVar, aVar2);
        this.j = a;
        this.k = 2;
        a3 = dVar2.a(a, aVar3, dVar3, this);
    }
}
