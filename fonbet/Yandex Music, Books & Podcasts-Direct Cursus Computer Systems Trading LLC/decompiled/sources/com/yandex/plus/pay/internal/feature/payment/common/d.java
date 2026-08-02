package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class d implements a {
    public final String a;
    public final com.yandex.plus.pay.graphql.invoice.e b;
    public final com.yandex.plus.pay.internal.analytics.h c;
    public final com.yandex.plus.pay.internal.model.mappers.f d;
    public final com.yandex.plus.pay.log.impl.b e;

    public d(String str, com.yandex.plus.pay.graphql.invoice.e eVar, com.yandex.plus.pay.internal.analytics.h hVar, com.yandex.plus.pay.internal.model.mappers.f fVar, com.yandex.plus.pay.log.impl.b bVar) {
        str.getClass();
        eVar.getClass();
        hVar.getClass();
        fVar.getClass();
        bVar.getClass();
        this.a = str;
        this.b = eVar;
        this.c = hVar;
        this.d = fVar;
        this.e = bVar;
    }

    public static com.yandex.plus.pay.repository.api.model.invoice.h c(List list) {
        List<PlusPayAdditionalOffer> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (PlusPayAdditionalOffer plusPayAdditionalOffer : list2) {
            arrayList.add(new com.yandex.plus.pay.repository.api.model.invoice.g(plusPayAdditionalOffer.getOffer().getOfferName(), plusPayAdditionalOffer.getOffer().getOffersBatchId(), plusPayAdditionalOffer.getOffer().getPositionId()));
        }
        return new com.yandex.plus.pay.repository.api.model.invoice.h(arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:26|27))(17:28|29|(1:31)|32|33|34|35|(2:38|36)|39|40|41|42|43|44|45|46|(1:48)(1:49))|12|13|(2:15|16)(2:18|19)))|66|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0037, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0038, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0030, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0031, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.api.analytics.d dVar, String str, Map map, boolean z, List list, cg6 cg6Var) {
        b bVar;
        int i;
        com.yandex.plus.pay.log.impl.b bVar2;
        t7o t7oVar;
        Throwable a;
        ArrayList arrayList;
        String productTarget;
        String a2;
        String str2;
        String offersBatchId;
        String positionId;
        com.yandex.plus.pay.repository.api.model.invoice.h c;
        b bVar3;
        try {
            if (cg6Var instanceof b) {
                bVar = (b) cg6Var;
                int i2 = bVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.j;
                    nm6 nm6Var = nm6.a;
                    i = bVar.l;
                    com.yandex.plus.pay.log.impl.b bVar4 = this.e;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.pay.log.impl.b.d(bVar4, com.yandex.plus.pay.common.internal.log.a.f, "Creating invoice");
                        r7o r7oVar = z7o.b;
                        com.yandex.plus.pay.graphql.invoice.e eVar = this.b;
                        String sessionId = offer.getMeta().getSessionId();
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                        String id = tariffOffer != null ? tariffOffer.getId() : null;
                        String activeTariffId = offer.getActiveTariffId();
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                        String str3 = id;
                        try {
                            arrayList = new ArrayList(v75.o(optionOffers, 10));
                            Iterator<T> it = optionOffers.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                            }
                            productTarget = offer.getMeta().getProductTarget();
                            a2 = ((com.yandex.plus.pay.internal.analytics.i) this.c).a(dVar, offer);
                        } catch (wis e) {
                            e = e;
                            bVar2 = bVar4;
                        } catch (Throwable th) {
                            th = th;
                            bVar2 = bVar4;
                        }
                        try {
                            str2 = this.a;
                            offersBatchId = offer.getMeta().getOffersBatchId();
                            positionId = offer.getPositionId();
                            c = c(list);
                            bVar.l = 1;
                            bVar3 = bVar;
                            bVar2 = bVar4;
                        } catch (wis e2) {
                            e = e2;
                            bVar2 = bVar4;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar2 = bVar4;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                        try {
                            Object a3 = eVar.a(sessionId, str3, activeTariffId, arrayList, str, productTarget, a2, str2, offersBatchId, positionId, map, z, c, bVar3);
                            if (a3 == nm6Var) {
                                return nm6Var;
                            }
                            obj = a3;
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            a = z7o.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        bVar2 = bVar4;
                    }
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        com.yandex.plus.pay.log.impl.b.f(bVar2, com.yandex.plus.pay.common.internal.log.a.f, "Error creating invoice", a, 8);
                        throw r1.U(a);
                    }
                    PlusPayInvoice a4 = this.d.a((com.yandex.plus.pay.repository.api.model.invoice.f) obj);
                    com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.common.internal.log.a.f, "Create invoice result: " + a4);
                    return a4;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        com.yandex.plus.pay.log.impl.b bVar42 = this.e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:21|22))(8:23|24|(1:26)|27|(2:30|28)|31|32|(1:34))|12|13|(2:15|16)(2:18|19)))|42|6|7|8|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.api.analytics.d dVar, Map map, cg6 cg6Var) {
        c cVar;
        int i;
        Throwable a;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.j;
                nm6 nm6Var = nm6.a;
                i = cVar2.l;
                com.yandex.plus.pay.log.impl.b bVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Creating silent invoice");
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.graphql.invoice.e eVar = this.b;
                    String sessionId = offer.getMeta().getSessionId();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String activeTariffId = offer.getActiveTariffId();
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String a2 = ((com.yandex.plus.pay.internal.analytics.i) this.c).a(dVar, offer);
                    String str = this.a;
                    String offersBatchId = offer.getMeta().getOffersBatchId();
                    String positionId = offer.getPositionId();
                    cVar2.l = 1;
                    obj = eVar.b(sessionId, id, activeTariffId, arrayList, productTarget, a2, str, offersBatchId, positionId, map, cVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a == null) {
                    com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Error creating silent invoice", a, 8);
                    throw r1.U(a);
                }
                PlusPayInvoice a3 = this.d.a((com.yandex.plus.pay.repository.api.model.invoice.f) obj);
                com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.f, "Create silent invoice result: " + a3);
                return a3;
            }
        }
        cVar = new c(this, cg6Var);
        c cVar22 = cVar;
        Object obj2 = cVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar22.l;
        com.yandex.plus.pay.log.impl.b bVar2 = this.e;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a == null) {
        }
    }
}
