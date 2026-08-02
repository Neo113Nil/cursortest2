package com.yandex.passport.sloth.ui;

import android.net.Uri;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bqi;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.h8e;
import defpackage.ild;
import defpackage.j8s;
import defpackage.lno;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o3o;
import defpackage.onx;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rad;
import defpackage.s7h;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.yandex.plus.bdui.flex.ui.s sVar, com.yandex.plus.bdui.plus.content.r rVar, com.yandex.plus.webview.core.resource.c cVar, com.yandex.passport.internal.entities.j jVar, h8e h8eVar, com.yandex.plus.webview.core.d dVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = sVar;
        this.m = rVar;
        this.n = cVar;
        this.o = jVar;
        this.p = h8eVar;
        this.q = dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                p pVar = new p((xpi) this.m, (d) this.n, (s7h) this.o, (k) this.p, (y1) this.q, continuation, 0);
                pVar.l = obj;
                return pVar;
            case 1:
                return new p((com.yandex.plus.bdui.plus.checkout.content.controller.l) this.m, (com.yandex.plus.bdui.content.d) this.n, (String) this.o, (String) this.p, (com.yandex.plus.bdui.plus.checkout.content.serializer.b2) this.q, continuation, 1);
            case 2:
                p pVar2 = new p((com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.o, (com.yandex.plus.bdui.content.d) this.p, (List) this.q, continuation, 2);
                pVar2.l = obj;
                return pVar2;
            case 3:
                return new p((com.yandex.plus.bdui.flex.ui.s) this.l, (com.yandex.plus.bdui.plus.content.r) this.m, (com.yandex.plus.webview.core.resource.c) this.n, (com.yandex.passport.internal.entities.j) this.o, (h8e) this.p, (com.yandex.plus.webview.core.d) this.q, continuation);
            case 4:
                p pVar3 = new p((com.yandex.plus.home.api.prefetch.l) this.o, (String) this.p, (String) this.q, continuation, 4);
                pVar3.l = obj;
                return pVar3;
            case 5:
                return new p((xqn) this.m, (com.yandex.plus.home.graphql.panel.g) this.n, (String) this.o, (com.yandex.plus.home.repository.api.model.f) this.p, (ArrayList) this.q, continuation, 5);
            default:
                return new p((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) this.q, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0391, code lost:
    
        if (r2 == r12) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037d, code lost:
    
        if (r4 == r12) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05de, code lost:
    
        if (r10.emit(r0, r29) == r12) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05f7, code lost:
    
        if (r10.emit(r0, r29) == r12) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0867, code lost:
    
        if (r10.emit(com.yandex.passport.sloth.ui.m2.a, r29) == r12) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018f A[LOOP:0: B:14:0x0189->B:16:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x056a  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Serializable serializable;
        String str;
        Object i;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar;
        boolean z;
        ou7 p;
        Object s;
        List list;
        Object H;
        t7o t7oVar;
        Object obj2;
        Object w;
        String str2;
        com.yandex.plus.home.api.prefetch.l lVar;
        bqi bqiVar;
        Object obj3;
        PlusPayCounterOffersReason plusPayCounterOffersReason;
        Object a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar;
        PlusPayCounterOffersReason plusPayCounterOffersReason2;
        Object a2;
        PlusPayCounterOffers plusPayCounterOffers;
        String id;
        Iterator<T> it;
        int i2 = this.j;
        int i3 = 10;
        Object obj4 = this.q;
        int i4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i2) {
            case 0:
                d dVar = (d) this.n;
                xpi xpiVar = (xpi) this.m;
                n1 n1Var = (n1) this.l;
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    if (!(n1Var instanceof g1)) {
                        if (!(n1Var instanceof i1)) {
                            if (!(n1Var instanceof j1)) {
                                if (!(n1Var instanceof m1)) {
                                    if (!(n1Var instanceof f1)) {
                                        if (!(n1Var instanceof h1)) {
                                            if (!(n1Var instanceof l1)) {
                                                if (!(n1Var instanceof k1)) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                this.l = null;
                                                this.k = 3;
                                                break;
                                            } else {
                                                new com.yandex.passport.internal.util.i(((com.yandex.passport.internal.ui.sloth.d) dVar.c).a).a(dVar.d);
                                            }
                                        } else {
                                            ((k) this.p).a(e1.b);
                                        }
                                    }
                                } else {
                                    s7h s7hVar = (s7h) this.o;
                                    m mVar = new m((y1) obj4, 3);
                                    g gVar = dVar.a;
                                    s7hVar.getClass();
                                    rad radVar = new rad(0);
                                    try {
                                        int i6 = 8;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Phone Number Hint started", 8);
                                        }
                                        com.yandex.passport.sloth.u0 u0Var = com.yandex.passport.sloth.u0.STARTED;
                                        com.yandex.passport.sloth.r0 r0Var = com.yandex.passport.sloth.r0.PHONE_NUMBER_HINT;
                                        Map e = uah.e(new Pair("state", "started"), new Pair("throwable_message", "null"));
                                        com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                                        oVar.getClass();
                                        if (oVar.a()) {
                                            oVar.a.a("sloth.reportWebAmEvent.".concat(r0Var.a), e);
                                        }
                                        onx e2 = ild.z(dVar.d).e(radVar);
                                        c cVar = new c(0, new com.yandex.passport.internal.ui.bouncer.roundabout.k(12, s7hVar));
                                        e2.getClass();
                                        lno lnoVar = j8s.a;
                                        e2.d(lnoVar, cVar);
                                        e2.c(lnoVar, new com.yandex.passport.internal.ui.l(i6, dVar, mVar));
                                    } catch (Exception e3) {
                                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.d, null, "Phone Number Hint failed", e3);
                                        }
                                        com.yandex.passport.sloth.u0 u0Var2 = com.yandex.passport.sloth.u0.STARTED;
                                        String message = e3.getMessage();
                                        com.yandex.passport.sloth.r0 r0Var2 = com.yandex.passport.sloth.r0.PHONE_NUMBER_HINT;
                                        Map e4 = uah.e(new Pair("state", "failed"), new Pair("throwable_message", String.valueOf(message)));
                                        com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                                        oVar2.getClass();
                                        if (oVar2.a()) {
                                            oVar2.a.a("sloth.reportWebAmEvent.".concat(r0Var2.a), e4);
                                        }
                                        mVar.invoke(null);
                                    }
                                }
                            } else {
                                j1 j1Var = (j1) n1Var;
                                String str3 = j1Var.a;
                                com.yandex.passport.sloth.p pVar = j1Var.b;
                                com.yandex.passport.common.core.f fVar = j1Var.c;
                                g gVar2 = dVar.a;
                                str3.getClass();
                                pVar.getClass();
                                boolean z2 = pVar.c;
                                boolean z3 = pVar.b;
                                String str4 = pVar.a;
                                Uri uri = com.yandex.passport.common.browser.c.a;
                                Serializable e5 = com.yandex.passport.common.browser.c.e(dVar.d, str3);
                                r7o r7oVar = z7o.b;
                                if (e5 instanceof t7o) {
                                    serializable = e5;
                                    str = str4;
                                } else {
                                    String str5 = (String) e5;
                                    serializable = e5;
                                    Long valueOf = fVar != null ? Long.valueOf(fVar.b) : null;
                                    com.yandex.passport.sloth.r0 r0Var3 = com.yandex.passport.sloth.r0.OPEN_EXTERNAL_URL;
                                    str = str4;
                                    Map e6 = uah.e(new Pair("url", Uri.parse(str4).buildUpon().clearQuery().build().toString()), new Pair("uid", String.valueOf(valueOf)), new Pair("success", String.valueOf(true)), new Pair("browser_package_name", String.valueOf(str5)), new Pair("is_auth_url_required", String.valueOf(z3)), new Pair("is_web_view_closed", String.valueOf(z2)));
                                    com.yandex.passport.internal.sloth.o oVar3 = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar2).a;
                                    oVar3.getClass();
                                    if (oVar3.a()) {
                                        oVar3.a.a("sloth.reportWebAmEvent.".concat(r0Var3.a), e6);
                                    }
                                }
                                if (z7o.a(serializable) != null) {
                                    Long valueOf2 = fVar != null ? Long.valueOf(fVar.b) : null;
                                    com.yandex.passport.sloth.r0 r0Var4 = com.yandex.passport.sloth.r0.OPEN_EXTERNAL_URL;
                                    Map e7 = uah.e(new Pair("url", Uri.parse(str).buildUpon().clearQuery().build().toString()), new Pair("uid", String.valueOf(valueOf2)), new Pair("success", String.valueOf(false)), new Pair("browser_package_name", "null"), new Pair("is_auth_url_required", String.valueOf(z3)), new Pair("is_web_view_closed", String.valueOf(z2)));
                                    com.yandex.passport.internal.sloth.o oVar4 = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar2).a;
                                    oVar4.getClass();
                                    if (oVar4.a()) {
                                        oVar4.a.a("sloth.reportWebAmEvent.".concat(r0Var4.a), e7);
                                    }
                                }
                            }
                        } else {
                            l2 l2Var = new l2(((i1) n1Var).a);
                            this.l = null;
                            this.k = 2;
                            break;
                        }
                    } else {
                        k2 k2Var = new k2(((g1) n1Var).a);
                        this.l = null;
                        this.k = 1;
                        break;
                    }
                    return nm6Var;
                }
                if (i5 != 1 && i5 != 2 && i5 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                return Unit.a;
            case 1:
                String str6 = (String) this.o;
                com.yandex.plus.bdui.content.d dVar3 = (com.yandex.plus.bdui.content.d) this.n;
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar2 = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.m;
                nm6 nm6Var2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar2 = lVar2.k;
                    if (jVar2 != null) {
                        com.yandex.plus.bdui.plus.checkout.content.e eVar = (com.yandex.plus.bdui.plus.checkout.content.e) dVar3.b;
                        this.l = jVar2;
                        this.k = 1;
                        i = lVar2.i(eVar, str6, this);
                        if (i == nm6Var2) {
                            return nm6Var2;
                        }
                        jVar = jVar2;
                    }
                    LinkedHashMap f = lVar2.f(str6, (String) this.p);
                    z = ((com.yandex.plus.bdui.plus.checkout.content.serializer.b2) obj4).a;
                    com.yandex.plus.log.api.b bVar = lVar2.i;
                    if (z) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar2)) {
                            bVar.c(aVar2, "PlusPayCheckoutContentController", "onPaymentMethodClick(); dispatch next action = " + ((com.yandex.plus.bdui.plus.checkout.content.serializer.f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar3.b)).l + " with payload = " + f);
                        }
                        lVar2.e(dVar3, ((com.yandex.plus.bdui.plus.checkout.content.serializer.f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar3.b)).l, f);
                    } else {
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "PlusPayCheckoutContentController", "onPaymentMethodClick(); dispatch payment method click action = " + ((com.yandex.plus.bdui.plus.checkout.content.serializer.f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar3.b)).o + " with payload = " + f);
                        }
                        lVar2.e(dVar3, ((com.yandex.plus.bdui.plus.checkout.content.serializer.f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar3.b)).o, f);
                    }
                    return Unit.a;
                }
                if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) this.l;
                qgg.h0(obj);
                i = obj;
                jVar.h((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) i);
                LinkedHashMap f2 = lVar2.f(str6, (String) this.p);
                z = ((com.yandex.plus.bdui.plus.checkout.content.serializer.b2) obj4).a;
                com.yandex.plus.log.api.b bVar2 = lVar2.i;
                if (z) {
                }
                return Unit.a;
            case 2:
                com.yandex.plus.bdui.content.d dVar4 = (com.yandex.plus.bdui.content.d) this.p;
                com.yandex.plus.bdui.plus.checkout.content.controller.b0 b0Var = (com.yandex.plus.bdui.plus.checkout.content.controller.b0) this.o;
                com.yandex.plus.log.api.b bVar3 = b0Var.c;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var3 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    ou7 p2 = x97.p(mm6Var, null, null, new com.yandex.passport.internal.ui.sloth.q((Object) b0Var, obj4, (Continuation) (objArr2 == true ? 1 : 0), 29), 3);
                    p = x97.p(mm6Var, null, null, new com.yandex.passport.internal.ui.social.i(b0Var, objArr == true ? 1 : 0, 6), 3);
                    this.l = null;
                    this.m = p;
                    this.k = 1;
                    s = p2.s(this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = (List) this.n;
                        qgg.h0(obj);
                        list = list2;
                        H = obj;
                        List list3 = (List) H;
                        List<com.yandex.plus.pay.inapp.google.internal.h> list4 = list;
                        ArrayList arrayList = new ArrayList(v75.o(list4, 10));
                        for (com.yandex.plus.pay.inapp.google.internal.h hVar : list4) {
                            List<com.yandex.plus.pay.inapp.api.c> c = hVar.c();
                            ArrayList arrayList2 = new ArrayList(v75.o(c, i3));
                            for (com.yandex.plus.pay.inapp.api.c cVar2 : c) {
                                Pair pair = new Pair("commonPeriodDuration", cVar2.b);
                                com.yandex.plus.pay.inapp.api.d dVar5 = cVar2.a;
                                arrayList2.add(uah.e(pair, new Pair("commonPrice", uah.e(new Pair("amount", dVar5.a.toString()), new Pair("currency", dVar5.b))), new Pair("quantity", Integer.valueOf(cVar2.c))));
                            }
                            arrayList.add(uah.e(new Pair("offerName", hVar.b()), new Pair("purchasePlans", arrayList2)));
                            i3 = 10;
                        }
                        List<com.yandex.plus.pay.inapp.api.f> list5 = list3;
                        ArrayList arrayList3 = new ArrayList(v75.o(list5, 10));
                        for (com.yandex.plus.pay.inapp.api.f fVar2 : list5) {
                            arrayList3.add(uah.e(new Pair("orderId", fVar2.a), new Pair("productId", CollectionsKt.firstOrNull(fVar2.b)), new Pair("purchaseToken", fVar2.e)));
                        }
                        Map b = tah.b(new Pair("storeOffersV2Data", uah.e(new Pair("storeOffers", arrayList), new Pair("inAppPurchases", arrayList3))));
                        com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                        if (bVar3.b(aVar4)) {
                            bVar3.c(aVar4, "PlusPayGetInAppInfoContentController", "onUpdateStateAsync(); get in-app info succeeded");
                        }
                        if (bVar3.b(aVar4)) {
                            bVar3.c(aVar4, "PlusPayGetInAppInfoContentController", com.yandex.plus.bdui.plus.checkout.content.controller.b0.d("next", ((com.yandex.plus.bdui.plus.checkout.content.k) dVar4.b).b, b));
                        }
                        b0Var.a.a.a(((com.yandex.plus.bdui.plus.checkout.content.k) dVar4.b).b, new com.yandex.plus.bdui.action.h(dVar4.c), b);
                        return Unit.a;
                    }
                    p = (ou7) this.m;
                    qgg.h0(obj);
                    s = obj;
                }
                list = (List) s;
                this.l = null;
                this.m = null;
                this.n = list;
                this.k = 2;
                H = p.H(this);
                break;
            case 3:
                com.yandex.plus.webview.core.resource.c cVar3 = (com.yandex.plus.webview.core.resource.c) this.n;
                nm6 nm6Var4 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.l;
                    com.yandex.plus.bdui.plus.content.r rVar = (com.yandex.plus.bdui.plus.content.r) this.m;
                    String uri2 = cVar3.getUri().toString();
                    uri2.getClass();
                    Map d = cVar3.d();
                    com.yandex.passport.internal.entities.j jVar3 = (com.yandex.passport.internal.entities.j) this.o;
                    h8e h8eVar = (h8e) this.p;
                    com.yandex.plus.bdui.plus.checkout.h hVar2 = new com.yandex.plus.bdui.plus.checkout.h(7, (com.yandex.plus.webview.core.d) obj4);
                    this.k = 1;
                    if (sVar.q(rVar, uri2, d, jVar3, h8eVar, hVar2, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    ((z7o) obj).getClass();
                }
                return Unit.a;
            case 4:
                String str7 = (String) this.p;
                com.yandex.plus.home.api.prefetch.l lVar3 = (com.yandex.plus.home.api.prefetch.l) this.o;
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                try {
                    if (i10 == 0) {
                        qgg.h0(obj);
                        String str8 = (String) obj4;
                        r7o r7oVar2 = z7o.b;
                        com.yandex.plus.home.api.prefetch.i iVar = new com.yandex.plus.home.api.prefetch.i(lVar3, str8, objArr3 == true ? 1 : 0, i4);
                        this.l = null;
                        this.m = lVar3;
                        this.n = str7;
                        this.k = 1;
                        w = com.yandex.plus.bdui.plus.analytics.b.w(8, 1000L, Long.MAX_VALUE, 2.0d, null, iVar, this);
                        if (w == nm6Var5) {
                            return nm6Var5;
                        }
                        str2 = str7;
                        lVar = lVar3;
                    } else {
                        if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) this.n;
                        com.yandex.plus.home.api.prefetch.l lVar4 = (com.yandex.plus.home.api.prefetch.l) this.m;
                        qgg.h0(obj);
                        lVar = lVar4;
                        w = obj;
                    }
                    obj2 = com.yandex.plus.home.api.prefetch.l.a(lVar, (o3o) w, str2);
                } catch (wis e8) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(e8);
                    obj2 = t7oVar;
                    if (z7o.a(obj2) != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e9) {
                    throw e9;
                } catch (Throwable th) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    if (z7o.a(obj2) != null) {
                    }
                    return Unit.a;
                }
                if (z7o.a(obj2) != null) {
                    lVar3.f().put(str7, com.yandex.plus.home.api.prefetch.a.a);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    bqi bqiVar2 = (bqi) ((xqn) this.m).a;
                    this.l = bqiVar2;
                    this.k = 1;
                    Object a3 = com.yandex.plus.home.graphql.panel.g.a((com.yandex.plus.home.graphql.panel.g) this.n, (String) this.o, (com.yandex.plus.home.repository.api.model.panel.i) ((com.yandex.plus.home.repository.api.model.e) ((com.yandex.plus.home.repository.api.model.f) this.p)).a, (ArrayList) obj4, this);
                    if (a3 == nm6Var6) {
                        return nm6Var6;
                    }
                    bqiVar = bqiVar2;
                    obj3 = a3;
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bqiVar = (bqi) this.l;
                    qgg.h0(obj);
                    obj3 = ((z7o) obj).a;
                }
                Throwable a4 = z7o.a(obj3);
                Object eVar2 = a4 == null ? new com.yandex.plus.home.repository.api.model.e((com.yandex.plus.home.repository.api.model.panel.i) obj3) : new com.yandex.plus.home.repository.api.model.b(a4);
                xdr xdrVar = (xdr) bqiVar;
                xdrVar.getClass();
                xdrVar.m(null, eVar2);
                return Unit.a;
            default:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) obj4;
                xdr xdrVar2 = kVar.w;
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    xdrVar2.getClass();
                    xdrVar2.m(null, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.g.a);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a5 = kVar.l.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.i iVar2 = kVar.m;
                    iVar2.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.h hVar3 = a5.b().d;
                    if (hVar3 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e) {
                        com.yandex.plus.pay.ui.api.feature.payment.g gVar3 = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.e) hVar3).a;
                        if (gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.a) {
                            switch (((com.yandex.plus.pay.ui.api.feature.payment.a) gVar3).a.ordinal()) {
                                case 0:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.PAYMENT_TIMEOUT;
                                    break;
                                case 1:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.BLACKLISTED;
                                    break;
                                case 2:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.EXPIRED_CARD;
                                    break;
                                case 3:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.USER_CANCELLED;
                                    break;
                                case 4:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.RESTRICTED_CARD;
                                    break;
                                case 5:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.FAIL_3DS;
                                    break;
                                case 6:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.NOT_ENOUGH_FUNDS;
                                    break;
                                case 7:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.INVALID_XRF_TOKEN;
                                    break;
                                case 8:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.OPERATION_CANCELLED;
                                    break;
                                case 9:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.AUTHORIZATION_REJECT;
                                    break;
                                case 10:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.TIMEOUT_NO_SUCCESS;
                                    break;
                                case 11:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.TRANSACTION_NOT_PERMITTED;
                                    break;
                                case 12:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.LIMIT_EXCEEDED;
                                    break;
                                case 13:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.UNKNOWN_PAYMENT_ERROR;
                                    break;
                                case 14:
                                    plusPayCounterOffersReason = PlusPayCounterOffersReason.INTERNAL_ERROR;
                                    break;
                                default:
                                    b6e.s();
                                    return null;
                            }
                        } else if (gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.c) {
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.GOOGLE_PLAY_ERROR;
                        } else if (gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.b) {
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.DATA_LOADING_ERROR;
                        } else if (gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.d) {
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.UNABLE_TO_PAY_BY_SAVED_CARD;
                        } else if (gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.e) {
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.UNAUTHORIZED_USER;
                        } else {
                            if (!(gVar3 instanceof com.yandex.plus.pay.ui.api.feature.payment.f)) {
                                b6e.s();
                                return null;
                            }
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.UNEXPECTED;
                        }
                    } else {
                        if (!(hVar3 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f) && !(hVar3 instanceof com.yandex.plus.pay.ui.core.tarifficator.api.data.common.g)) {
                            b6e.s();
                            return null;
                        }
                        com.yandex.plus.log.api.b bVar4 = iVar2.a;
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                        if (bVar4.b(aVar5)) {
                            bVar4.c(aVar5, "GetCounterOffersReasonInteractorImpl", "There is no reason for counter offers. Fallback to unexpected");
                        }
                        plusPayCounterOffersReason = PlusPayCounterOffersReason.UNEXPECTED;
                    }
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.f fVar3 = kVar.n;
                    this.l = a5;
                    this.m = plusPayCounterOffersReason;
                    this.k = 1;
                    a = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.h) fVar3).a(a5, plusPayCounterOffersReason, this);
                    if (a != nm6Var7) {
                        PlusPayCounterOffersReason plusPayCounterOffersReason3 = plusPayCounterOffersReason;
                        aVar = a5;
                        plusPayCounterOffersReason2 = plusPayCounterOffersReason3;
                    }
                    return nm6Var7;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar2 = (xdr) this.p;
                    plusPayCounterOffers = (PlusPayCounterOffers) this.o;
                    kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) this.n;
                    PlusPayCounterOffersReason plusPayCounterOffersReason4 = (PlusPayCounterOffersReason) this.m;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar6 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.l;
                    qgg.h0(obj);
                    aVar = aVar6;
                    plusPayCounterOffersReason2 = plusPayCounterOffersReason4;
                    a2 = obj;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h hVar4 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d) a2);
                    xdrVar2.getClass();
                    xdrVar2.m(null, hVar4);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar3 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) kVar.s;
                    eVar3.getClass();
                    aVar.getClass();
                    plusPayCounterOffers.getClass();
                    plusPayCounterOffersReason2.getClass();
                    cdk cdkVar = eVar3.a;
                    String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                    PlusPayCompositeOffers.Offer offer = aVar.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    id = tariffOffer != null ? tariffOffer.getId() : null;
                    if (id == null) {
                        id = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList4 = new ArrayList(v75.o(optionOffers, 10));
                    it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String a6 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e.a(plusPayCounterOffers);
                    String code = plusPayCounterOffersReason2.getCode();
                    cdkVar.getClass();
                    d2.getClass();
                    a6.getClass();
                    code.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d2, "product_id", id);
                    m.put("options_id", arrayList4);
                    m.put("target", a6);
                    m.put("reason", code);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CounterOffers.Screen.Shown", m);
                    return Unit.a;
                }
                plusPayCounterOffersReason2 = (PlusPayCounterOffersReason) this.m;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar7 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) this.l;
                qgg.h0(obj);
                aVar = aVar7;
                a = obj;
                PlusPayCounterOffers plusPayCounterOffers2 = (PlusPayCounterOffers) a;
                if (plusPayCounterOffers2 == null) {
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar8 = kVar.k;
                    aVar8.getClass();
                    aVar8.c(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.f(), "Error");
                    return Unit.a;
                }
                kVar.u = plusPayCounterOffersReason2;
                kVar.v = plusPayCounterOffers2;
                this.l = aVar;
                this.m = plusPayCounterOffersReason2;
                this.n = kVar;
                this.o = plusPayCounterOffers2;
                this.p = xdrVar2;
                this.k = 2;
                a2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k.a(kVar, plusPayCounterOffers2, this);
                if (a2 != nm6Var7) {
                    plusPayCounterOffers = plusPayCounterOffers2;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h hVar42 = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.h((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.counter_offers.d) a2);
                    xdrVar2.getClass();
                    xdrVar2.m(null, hVar42);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar32 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) kVar.s;
                    eVar32.getClass();
                    aVar.getClass();
                    plusPayCounterOffers.getClass();
                    plusPayCounterOffersReason2.getClass();
                    cdk cdkVar2 = eVar32.a;
                    String d22 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(aVar.a);
                    PlusPayCompositeOffers.Offer offer2 = aVar.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                    if (tariffOffer2 != null) {
                    }
                    if (id == null) {
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                    ArrayList arrayList42 = new ArrayList(v75.o(optionOffers2, 10));
                    it = optionOffers2.iterator();
                    while (it.hasNext()) {
                    }
                    String a62 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e.a(plusPayCounterOffers);
                    String code2 = plusPayCounterOffersReason2.getCode();
                    cdkVar2.getClass();
                    d22.getClass();
                    a62.getClass();
                    code2.getClass();
                    LinkedHashMap m2 = dfi.m("purchase_session_id", d22, "product_id", id);
                    m2.put("options_id", arrayList42);
                    m2.put("target", a62);
                    m2.put("reason", code2);
                    m2.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("CounterOffers.Screen.Shown", m2);
                    return Unit.a;
                }
                return nm6Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k kVar, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.q = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.p = obj4;
        this.q = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
