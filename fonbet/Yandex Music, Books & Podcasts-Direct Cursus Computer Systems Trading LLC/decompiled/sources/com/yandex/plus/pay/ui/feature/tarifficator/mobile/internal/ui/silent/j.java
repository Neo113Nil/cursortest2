package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.adk;
import defpackage.aur;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pxm;
import defpackage.qgg;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.zck;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends aur implements Function2 {
    public com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a j;
    public int k;
    public final /* synthetic */ l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.l = lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        l lVar = this.l;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar2 = lVar.q;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            xdr xdrVar = lVar.u;
            xdrVar.getClass();
            xdrVar.m(null, g.a);
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = lVar.k.a.a();
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d dVar = lVar.l;
            PlusPayCompositeOffers.Offer offer = a2.b.a;
            this.j = a2;
            this.k = 1;
            a = dVar.a(offer, null, this);
            if (a == nm6Var) {
                return nm6Var;
            }
            aVar = a2;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = this.j;
            qgg.h0(obj);
            a = obj;
        }
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) a;
        if (plusPayCompositeOfferDetails != null) {
            Boolean isSilentInvoiceAvailable = plusPayCompositeOfferDetails.isSilentInvoiceAvailable();
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.a aVar3 = lVar.s;
            boolean d = Intrinsics.d(isSilentInvoiceAvailable, Boolean.TRUE);
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.b) aVar3;
            bVar.getClass();
            aVar.getClass();
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = aVar.b;
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d dVar2 = jVar.e;
            pxm b = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.b(dVar2, aVar.d);
            PlusPayCompositeOffers.Offer offer2 = jVar.a;
            zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
            String str = jVar.c;
            if (a3 != null) {
                cdk cdkVar = bVar.a;
                String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer2.getTariffOffer();
                String id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer2.getOptionOffers();
                ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                Iterator<T> it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                if (str == null) {
                    str = "no_value";
                }
                String str2 = b.a;
                if (str2 == null) {
                    str2 = "no_value";
                }
                String str3 = b.b;
                String str4 = str3 != null ? str3 : "no_value";
                adk e = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.e(dVar2);
                cdkVar.getClass();
                d2.getClass();
                LinkedHashMap m = dfi.m("purchase_session_id", d2, "product_id", id);
                dfi.u(m, "options_id", arrayList, true, "is_tarifficator");
                m.put("payment_option", a3.a);
                m.put("payment_method_id", str);
                m.put(Constants.KEY_PAGE, str4);
                m.put("place", str2);
                m.put("source_type", e.a);
                m.put("isSilentAvailable", String.valueOf(d));
                m.put("_meta", cdk.c(new HashMap()));
                cdkVar.f("PaymentProcess.SilentRequested", m);
            }
            if (isSilentInvoiceAvailable == null) {
                lVar.G(true);
                aVar2.b();
            } else if (isSilentInvoiceAvailable.booleanValue()) {
                x97.y(ot0.F(lVar), null, null, new k(lVar, null, 1), 3);
            } else {
                lVar.G(true);
                aVar2.b();
            }
        } else {
            lVar.G(true);
            aVar2.b();
        }
        return Unit.a;
    }
}
