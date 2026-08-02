package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.r;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.cdk;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.t75;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.zck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class k extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a k;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.c l;
    public final com.yandex.plus.pay.ui.core.api.domain.a m;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d n;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.a o;
    public final y p;
    public final com.yandex.plus.pay.ui.core.api.common.a q;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a r;
    public final com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a s;
    public final com.yandex.plus.pay.ui.common.internal.error.content.h t;
    public final xdr u;
    public final xdr v;

    public k(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.a aVar2, com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.c cVar, com.yandex.plus.pay.ui.core.api.domain.a aVar3, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.a aVar4, y yVar, com.yandex.plus.pay.ui.core.api.common.a aVar5, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar6, com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar7) {
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        aVar3.getClass();
        dVar.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        this.k = aVar;
        this.l = cVar;
        this.m = aVar3;
        this.n = dVar;
        this.o = aVar4;
        this.p = yVar;
        this.q = aVar5;
        this.r = aVar6;
        this.s = aVar7;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar.a;
        this.t = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.b) aVar2).a(bVar.a());
        xdr a = ydr.a(h.a);
        this.u = a;
        this.v = a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b bVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b) aVar4;
        PlusPayCompositeOffers.Offer offer = a2.b.a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a2.c();
        zck a3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(c.a);
        String str = c.c;
        Continuation continuation = null;
        if (a3 != null) {
            cdk cdkVar = bVar2.a;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            id = id == null ? "no_value" : id;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it = optionOffers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
            }
            str = str == null ? "no_value" : str;
            boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
            t.put("product_id", id);
            dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a3.a);
            t.put("payment_method_id", str);
            t.put("silent", String.valueOf(z));
            t.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.ErrorScreen.Shown", t);
        }
        r rVar = (r) bVar2.b;
        rVar.getClass();
        offer.getClass();
        pnb pnbVar = rVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Error.Start", r);
        x97.y(ot0.F(this), null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(this, a2, continuation, 11), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(k kVar, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar2;
        String str;
        com.yandex.plus.pay.ui.core.api.common.a aVar3 = kVar.q;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!((Boolean) kVar.s.invoke()).booleanValue()) {
                        return null;
                    }
                    kVar.l.getClass();
                    aVar.getClass();
                    com.yandex.plus.pay.ui.core.api.domain.a aVar4 = kVar.m;
                    aVar2 = aVar;
                    jVar.j = aVar2;
                    str = "https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c";
                    jVar.k = "https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c";
                    jVar.n = 1;
                    obj = aVar4.a("https://yandex.ru/chat/#/user/80027008-e39a-986b-5f64-822d65ab117c", jVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = jVar.k;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar5 = jVar.j;
                    qgg.h0(obj);
                    str = str2;
                    aVar2 = aVar5;
                }
                PlusPayRichText plusPayRichText = new PlusPayRichText(aVar3.a(R.string.PlusPay_Error_Support, "{{LINK}}"), t75.c(new PlusPayRichText.Item.Link((String) null, "LINK", aVar3.get(R.string.PlusPay_Error_Support_LinkText), (String) obj, 1, (DefaultConstructorMarker) null)));
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar = kVar.n;
                com.yandex.plus.bdui.plus.c cVar = new com.yandex.plus.bdui.plus.c(3, kVar, aVar2, str);
                jVar.j = null;
                jVar.k = null;
                jVar.n = 2;
                Object a = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar).a(plusPayRichText, cVar, jVar);
                return a != nm6Var ? nm6Var : a;
            }
        }
        jVar = new j(kVar, cg6Var);
        Object obj2 = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        if (i != 0) {
        }
        PlusPayRichText plusPayRichText2 = new PlusPayRichText(aVar3.a(R.string.PlusPay_Error_Support, "{{LINK}}"), t75.c(new PlusPayRichText.Item.Link((String) null, "LINK", aVar3.get(R.string.PlusPay_Error_Support_LinkText), (String) obj2, 1, (DefaultConstructorMarker) null)));
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar2 = kVar.n;
        com.yandex.plus.bdui.plus.c cVar2 = new com.yandex.plus.bdui.plus.c(3, kVar, aVar2, str);
        jVar.j = null;
        jVar.k = null;
        jVar.n = 2;
        Object a2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) dVar2).a(plusPayRichText2, cVar2, jVar);
        if (a2 != nm6Var2) {
        }
    }

    public final void G(com.yandex.plus.pay.ui.common.internal.error.content.f fVar) {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.k.a.a();
        String str = fVar.a;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b) this.o;
        bVar.getClass();
        str.getClass();
        PlusPayCompositeOffers.Offer offer = a.b.a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j c = a.c();
        zck a2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(c.a);
        String str2 = c.c;
        if (a2 != null) {
            cdk cdkVar = bVar.a;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
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
            if (str2 == null) {
                str2 = "no_value";
            }
            boolean z = c.f == com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.b;
            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
            t.put("product_id", id);
            dfi.u(t, "options_id", arrayList, true, "is_tarifficator");
            t.put("payment_option", a2.a);
            t.put("payment_method_id", str2);
            t.put("button_text", str);
            t.put("silent", String.valueOf(z));
            t.put("_meta", cdk.c(new HashMap()));
            cdkVar.f("PaymentProcess.ErrorScreen.ContinueButton.Clicked", t);
        }
        int ordinal = fVar.b.ordinal();
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar = this.r;
        if (ordinal == 0) {
            aVar.a();
        } else if (ordinal == 1 || ordinal == 2) {
            aVar.b();
        } else {
            b6e.s();
        }
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.k.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b bVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.error.b) this.o;
        bVar.getClass();
        com.yandex.plus.pay.api.analytics.tarifficator.d dVar = bVar.b;
        PlusPayCompositeOffers.Offer offer = a.b.a;
        r rVar = (r) dVar;
        rVar.getClass();
        offer.getClass();
        pnb pnbVar = rVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Error.Stop", r);
        super.onCleared();
    }
}
