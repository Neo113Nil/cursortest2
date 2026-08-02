package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.pay.s;
import com.yandex.plus.core.data.pay.t;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.p;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.z;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.pnb;
import defpackage.pxm;
import defpackage.qgg;
import defpackage.su4;
import defpackage.v75;
import defpackage.vdr;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class d implements a, b {
    public final com.yandex.plus.pay.ui.common.api.a a;
    public final com.yandex.plus.paymentsdk.internal.method.e b;
    public final com.yandex.plus.log.api.b c;
    public final h d;
    public final vdr e;

    public d(com.yandex.plus.pay.ui.common.api.a aVar, com.yandex.plus.paymentsdk.internal.method.e eVar, com.yandex.plus.log.api.b bVar, h hVar, xdr xdrVar) {
        aVar.getClass();
        eVar.getClass();
        bVar.getClass();
        hVar.getClass();
        xdrVar.getClass();
        this.a = aVar;
        this.b = eVar;
        this.c = bVar;
        this.d = hVar;
        this.e = xdrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m mVar, cg6 cg6Var) {
        c cVar;
        int i;
        String str;
        boolean z;
        String str2;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                h hVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    i iVar = (i) hVar;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = iVar.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = a.b;
                    cdk cdkVar = iVar.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
                    PlusPayCompositeOffers.Offer offer = jVar.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str3 = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    str = null;
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    cdkVar.d(d, str3, arrayList, false, c5b.a);
                    p pVar = (p) iVar.c;
                    pVar.getClass();
                    pnb pnbVar = pVar.a;
                    String sessionId = offer.getMeta().getSessionId();
                    pnbVar.getClass();
                    sessionId.getClass();
                    LinkedHashMap r = su4.r("session_id", sessionId);
                    r.put("_meta", pnb.a(new HashMap()));
                    pnbVar.e("PlusPayment.Step.CardSelecting.Start", r);
                    com.yandex.plus.home.feature.webviews.internal.stories.m mVar2 = new com.yandex.plus.home.feature.webviews.internal.stories.m(9, this);
                    cVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.g(mVar, mVar2, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    str = null;
                }
                t tVar = (t) obj;
                z = tVar instanceof s;
                com.yandex.plus.log.api.b bVar = this.c;
                if (!z) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Success");
                    }
                    s sVar = (s) tVar;
                    com.yandex.plus.core.data.pay.c cVar2 = sVar.b;
                    String str4 = sVar.a;
                    String id2 = cVar2.getId();
                    i iVar2 = (i) hVar;
                    iVar2.getClass();
                    str4.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = iVar2.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar2 = a2.b;
                    cdk cdkVar2 = iVar2.b;
                    String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    PlusPayCompositeOffers.Offer offer2 = jVar2.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                    String id3 = tariffOffer2 != null ? tariffOffer2.getId() : str;
                    String str5 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    str2 = id2 != null ? id2 : "no_value";
                    LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar2, d2, "purchase_session_id", d2);
                    t.put("product_id", str5);
                    dfi.u(t, "options_id", arrayList2, true, "is_tarifficator");
                    t.put("card_linked", String.valueOf(false));
                    t.put("payment_method_id", str2);
                    t.put("button_text", str4);
                    t.put("paying_with_new_card", String.valueOf(false));
                    t.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("PaymentMethods.ContinueButton.Clicked", t);
                    ((p) iVar2.c).a(offer2);
                    return cVar2;
                }
                if (!(tVar instanceof com.yandex.plus.core.data.pay.k)) {
                    if (!(tVar instanceof com.yandex.plus.core.data.pay.h)) {
                        b6e.s();
                        return null;
                    }
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Cancel");
                    }
                    i iVar3 = (i) hVar;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = iVar3.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar3 = a3.b;
                    cdk cdkVar3 = iVar3.b;
                    String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a3.a);
                    PlusPayCompositeOffers.Offer offer3 = jVar3.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer3.getTariffOffer();
                    String id4 = tariffOffer3 != null ? tariffOffer3.getId() : str;
                    str2 = id4 != null ? id4 : "no_value";
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer3.getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(v75.o(optionOffers3, 10));
                    Iterator<T> it3 = optionOffers3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    LinkedHashMap t2 = com.appsflyer.internal.k.t(cdkVar3, d3, "purchase_session_id", d3);
                    t2.put("product_id", str2);
                    dfi.u(t2, "options_id", arrayList3, true, "is_tarifficator");
                    t2.put("card_linked", String.valueOf(false));
                    t2.put("_meta", cdk.c(new HashMap()));
                    cdkVar3.f("PaymentMethods.Cancelled", t2);
                    ((p) iVar3.c).a(offer3);
                    return str;
                }
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "BindPaymentMethodInteractor", "PlusSelectPaymentMethodState.Error - " + ((com.yandex.plus.core.data.pay.k) tVar).d);
                }
                com.yandex.plus.core.data.pay.k kVar = (com.yandex.plus.core.data.pay.k) tVar;
                i iVar4 = (i) hVar;
                iVar4.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = iVar4.a.a();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar4 = a4.b;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d dVar = jVar4.e;
                PlusPayCompositeOffers.Offer offer4 = jVar4.a;
                pxm b = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.b(dVar, a4.d);
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a4.c();
                zck a5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer4);
                if (a5 != null) {
                    cdk cdkVar4 = iVar4.b;
                    String d4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a4.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = offer4.getTariffOffer();
                    String id5 = tariffOffer4 != null ? tariffOffer4.getId() : str;
                    String str6 = id5 == null ? "no_value" : id5;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = offer4.getOptionOffers();
                    ArrayList arrayList4 = new ArrayList(v75.o(optionOffers4, 10));
                    Iterator<T> it4 = optionOffers4.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    String c2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.c(new com.yandex.plus.pay.ui.api.feature.payment.d(kVar));
                    String str7 = b.a;
                    String str8 = str7 == null ? "no_value" : str7;
                    String str9 = b.b;
                    cdkVar4.e(d4, str6, arrayList4, a5, "no_value", c2, str9 == null ? "no_value" : str9, str8, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.e(dVar), c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b);
                }
                ((p) iVar4.c).a(offer4);
                return str;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        h hVar2 = this.d;
        if (i != 0) {
        }
        t tVar2 = (t) obj2;
        z = tVar2 instanceof s;
        com.yandex.plus.log.api.b bVar2 = this.c;
        if (!z) {
        }
    }

    public final Object b(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar, z zVar) {
        Context a = this.a.a();
        com.yandex.plus.core.data.pay.d e = u.e((com.yandex.plus.domain.auth.api.e) this.e.getValue());
        String a2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(jVar.a);
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = jVar.b;
        String posId = plusPayCompositeOfferDetails != null ? plusPayCompositeOfferDetails.getPosId() : null;
        String serviceToken = plusPayCompositeOfferDetails != null ? plusPayCompositeOfferDetails.getServiceToken() : null;
        com.yandex.plus.paymentsdk.internal.method.e eVar = this.b;
        eVar.getClass();
        a.getClass();
        return a(new m(eVar.a, a, e, a2, posId, serviceToken, eVar.b, eVar.c), zVar);
    }
}
