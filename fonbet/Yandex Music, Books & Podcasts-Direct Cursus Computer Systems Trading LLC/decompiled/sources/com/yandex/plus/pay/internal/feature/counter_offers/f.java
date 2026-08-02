package com.yandex.plus.pay.internal.feature.counter_offers;

import android.net.Uri;
import com.yandex.plus.bdui.s;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.j;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import defpackage.b6e;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.qec;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v5m;
import defpackage.v75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object t7oVar;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                com.yandex.plus.pay.log.impl.b.f(((g) obj3).d, com.yandex.plus.pay.common.internal.log.a.k, "Failed to get counter offers", (com.yandex.plus.pay.api.exception.a) obj2, 8);
                return Unit.a;
            case 1:
                com.yandex.plus.pay.log.impl.b.f(((com.yandex.plus.pay.internal.feature.presale.f) obj3).d, com.yandex.plus.pay.common.internal.log.a.i, "Failed to get presale", (com.yandex.plus.pay.api.exception.a) obj2, 8);
                return Unit.a;
            case 2:
                String str = (String) obj2;
                ((String) obj).getClass();
                str.getClass();
                ((h0) obj3).x.i(str);
                return Unit.a;
            case 3:
                String str2 = (String) obj2;
                ((String) obj).getClass();
                str2.getClass();
                ((k) obj3).l.i(str2);
                return Unit.a;
            case 4:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) obj3;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                str3.getClass();
                str4.getClass();
                PlusPayCounterOffers plusPayCounterOffers = kVar.v;
                if (plusPayCounterOffers != null) {
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d dVar = kVar.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = kVar.l.a.a();
                    PlusPayCounterOffersReason plusPayCounterOffersReason = kVar.u;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) dVar;
                    eVar.getClass();
                    plusPayCounterOffersReason.getClass();
                    cdk cdkVar = eVar.a;
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
                    String a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e.a(plusPayCounterOffers);
                    String code = plusPayCounterOffersReason.getCode();
                    cdkVar.getClass();
                    d.getClass();
                    a2.getClass();
                    code.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d, "product_id", id);
                    m.put("options_id", arrayList);
                    m.put("target", a2);
                    m.put("reason", code);
                    m.put("counter_offer_action_text", str3);
                    m.put("counter_offer_action_link", str4);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CounterOffers.Action.Clicked", m);
                }
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c cVar = kVar.r;
                com.yandex.plus.log.api.b bVar = cVar.c;
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = Uri.parse(str4);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a3 = z7o.a(t7oVar);
                if (a3 == null) {
                    Uri uri = (Uri) t7oVar;
                    if (Intrinsics.d(uri.getScheme(), "https")) {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "CounterOffersLinkInteractor", "Uri " + uri + " is handled as web action");
                        }
                        cVar.a.i(str4);
                    } else {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "CounterOffersLinkInteractor", "Uri " + uri + " is handled as internal action");
                        }
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a.b.getClass();
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a j = com.yandex.plus.home.plaque.animator.internal.utils.a.j(uri);
                        int i2 = j == null ? -1 : com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.b.a[j.ordinal()];
                        if (i2 == -1) {
                            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar3)) {
                                bVar.c(aVar3, "CounterOffersLinkInteractor", "Unexpected internal action " + uri + " is ignored");
                            }
                        } else {
                            if (i2 != 1 && i2 != 2) {
                                b6e.s();
                                return null;
                            }
                            cVar.b.b();
                        }
                    }
                } else {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar4)) {
                        bVar.a(aVar4, "CounterOffersLinkInteractor", "Could not parse URI in handleLink method", a3);
                    }
                }
                return Unit.a;
            case 5:
                String str5 = (String) obj2;
                ((String) obj).getClass();
                str5.getClass();
                ((j) obj3).p.i(str5);
                return Unit.a;
            case 6:
                String str6 = (String) obj2;
                ((String) obj).getClass();
                str6.getClass();
                ((m) obj3).q.i(str6);
                return Unit.a;
            default:
                com.yandex.plus.bdui.m mVar = (com.yandex.plus.bdui.m) obj2;
                ((s) obj).getClass();
                mVar.getClass();
                return new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.d(mVar.a, new qec(25, ((v5m) obj3).a));
        }
    }
}
