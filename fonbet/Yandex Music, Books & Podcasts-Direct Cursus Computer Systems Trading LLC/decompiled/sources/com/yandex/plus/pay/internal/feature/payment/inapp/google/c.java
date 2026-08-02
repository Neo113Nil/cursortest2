package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.aur;
import defpackage.cdk;
import defpackage.inr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ox6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.zck;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Collection collection, Continuation continuation, rjc rjcVar, d dVar, xqn xqnVar) {
        super(2, continuation);
        this.m = collection;
        this.n = rjcVar;
        this.o = dVar;
        this.p = xqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                c cVar = new c((Collection) this.m, continuation, (rjc) this.n, (d) this.o, (xqn) this.p);
                cVar.l = obj;
                return cVar;
            default:
                return new c((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.p, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        xdr xdrVar;
        PlusPayClosingOffer plusPayClosingOffer;
        zck a;
        switch (this.j) {
            case 0:
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Collection collection = (Collection) this.m;
                ArrayList arrayList = new ArrayList(v75.o(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(x97.p(mm6Var, null, null, new inr(it.next(), (Continuation) null, (rjc) this.n, (d) this.o, (xqn) this.p), 3));
                }
                this.l = null;
                this.k = 1;
                Object v = ox6.v(arrayList, this);
                return v == nm6Var ? nm6Var : v;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.p;
                xdr xdrVar2 = kVar.r;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    xdrVar2.getClass();
                    xdrVar2.m(null, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.h.a);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = kVar.n.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.c cVar = kVar.o;
                    this.l = a2;
                    this.k = 1;
                    Object a3 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.e) cVar).a(a2, this);
                    if (a3 == nm6Var2) {
                        return nm6Var2;
                    }
                    aVar = a2;
                    obj = a3;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xdr xdrVar3 = (xdr) this.o;
                        PlusPayClosingOffer plusPayClosingOffer2 = (PlusPayClosingOffer) this.n;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k) this.m;
                        aVar = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.l;
                        qgg.h0(obj);
                        plusPayClosingOffer = plusPayClosingOffer2;
                        kVar = kVar2;
                        xdrVar = xdrVar3;
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.g gVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.g((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a) obj);
                        xdrVar.getClass();
                        xdrVar.m(null, gVar);
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b bVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) kVar.p;
                        bVar.getClass();
                        aVar.getClass();
                        plusPayClosingOffer.getClass();
                        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = aVar.c();
                        PlusPayCompositeOffers.Offer offer = c.a;
                        a = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
                        if (a != null) {
                            cdk cdkVar = bVar.a;
                            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                            String id = tariffOffer != null ? tariffOffer.getId() : null;
                            if (id == null) {
                                id = "no_value";
                            }
                            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                            ArrayList arrayList2 = new ArrayList(v75.o(optionOffers, 10));
                            Iterator<T> it2 = optionOffers.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                            }
                            String str = c.c;
                            if (str == null) {
                                str = "no_value";
                            }
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusPayClosingOffer.getOffer().getTariffOffer();
                            String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                            String str2 = id2 != null ? id2 : "no_value";
                            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusPayClosingOffer.getOffer().getOptionOffers();
                            ArrayList arrayList3 = new ArrayList(v75.o(optionOffers2, 10));
                            Iterator<T> it3 = optionOffers2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                            }
                            cdkVar.getClass();
                            d.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("payment_option", a.a);
                            linkedHashMap.put("payment_method_id", str);
                            linkedHashMap.put("purchase_session_id", d);
                            linkedHashMap.put("product_id", id);
                            linkedHashMap.put("options_id", arrayList2);
                            linkedHashMap.put("closing_offer_product_id", str2);
                            linkedHashMap.put("closing_offer_options_id", arrayList3);
                            linkedHashMap.put("_meta", cdk.c(new HashMap()));
                            cdkVar.f("ClosingOffer.Shown", linkedHashMap);
                            com.yandex.plus.pay.api.analytics.tarifficator.e.d(bVar.b, plusPayClosingOffer.getOffer(), 0, "closing_offer", "checkout_closing_offer_page", null);
                        }
                        return Unit.a;
                    }
                    aVar = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.l;
                    qgg.h0(obj);
                }
                PlusPayClosingOffer plusPayClosingOffer3 = (PlusPayClosingOffer) obj;
                if (plusPayClosingOffer3 == null) {
                    kVar.k.a();
                    return Unit.a;
                }
                kVar.q = plusPayClosingOffer3;
                this.l = aVar;
                this.m = kVar;
                this.n = plusPayClosingOffer3;
                this.o = xdrVar2;
                this.k = 2;
                Object a4 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k.a(kVar, plusPayClosingOffer3, this);
                if (a4 == nm6Var2) {
                    return nm6Var2;
                }
                xdrVar = xdrVar2;
                plusPayClosingOffer = plusPayClosingOffer3;
                obj = a4;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.g gVar2 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.g((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.closing.content.a) obj);
                xdrVar.getClass();
                xdrVar.m(null, gVar2);
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b bVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.closing.b) kVar.p;
                bVar2.getClass();
                aVar.getClass();
                plusPayClosingOffer.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c2 = aVar.c();
                PlusPayCompositeOffers.Offer offer2 = c2.a;
                a = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
                if (a != null) {
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k kVar, Continuation continuation) {
        super(2, continuation);
        this.p = kVar;
    }
}
