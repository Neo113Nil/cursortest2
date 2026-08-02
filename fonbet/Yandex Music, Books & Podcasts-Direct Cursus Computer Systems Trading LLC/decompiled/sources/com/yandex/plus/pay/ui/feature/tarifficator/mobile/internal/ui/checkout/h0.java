package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.content.Context;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.fkn;
import defpackage.hdr;
import defpackage.lk6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.rar;
import defpackage.su4;
import defpackage.u75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.zsd;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class h0 extends bfu {
    public final xdr A;
    public final xdr B;
    public final xdr C;
    public final xdr D;
    public final xdr E;
    public boolean F;
    public rar G;
    public rar H;
    public final LinkedHashSet I;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c J;
    public final fkn K;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d k;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a l;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a n;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.b o;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.d p;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d q;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a r;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k s;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c t;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a u;
    public final h v;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a w;
    public final com.yandex.plus.home.internal.di.y x;
    public final com.yandex.plus.pay.ui.core.api.common.a y;
    public final com.yandex.plus.pay.log.impl.b z;

    public h0(com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d dVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d dVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d dVar3, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d dVar4, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.d dVar5, com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar6, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a aVar3, h hVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar4, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.pay.ui.core.api.common.a aVar5, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.api.analytics.tarifficator.a aVar6, com.yandex.plus.pay.ui.core.mobile.domain.a aVar7) {
        aVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        dVar4.getClass();
        dVar5.getClass();
        dVar6.getClass();
        aVar2.getClass();
        kVar.getClass();
        cVar.getClass();
        aVar3.getClass();
        hVar.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar.getClass();
        aVar6.getClass();
        aVar7.getClass();
        this.k = dVar;
        this.l = aVar;
        this.m = dVar2;
        this.n = dVar3;
        this.o = dVar4;
        this.p = dVar5;
        this.q = dVar6;
        this.r = aVar2;
        this.s = kVar;
        this.t = cVar;
        this.u = aVar3;
        this.v = hVar;
        this.w = aVar4;
        this.x = yVar;
        this.y = aVar5;
        this.z = bVar;
        xdr a = ydr.a(Boolean.FALSE);
        this.A = a;
        xdr a2 = ydr.a(null);
        this.B = a2;
        xdr a3 = ydr.a(null);
        this.C = a3;
        xdr a4 = ydr.a(null);
        this.D = a4;
        xdr a5 = ydr.a(null);
        this.E = a5;
        this.I = new LinkedHashSet();
        this.J = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c(ot0.F(this), aVar6, aVar7, bVar);
        this.K = zsd.F0(zsd.R(a, a2, a3, a4, a5, new lk6(6, this, h0.class, "createState", "createState(ZLcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/CheckoutViewModel$PaymentProcessInfo;Ljava/lang/String;Lcom/yandex/plus/pay/internal/model/PlusPayCompositeOfferDetails;Lcom/yandex/plus/pay/internal/model/PlusPayMailingAdsAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1)), ot0.F(this), new hdr(0L, Long.MAX_VALUE), new t(null));
        J(aVar.a.a(), null, null);
        x97.y(ot0.F(this), null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, null, 18), 3);
        x97.y(ot0.F(this), null, null, new f0(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0140, code lost:
    
        if (r4 == r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0162, code lost:
    
        if (r4 == r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0178, code lost:
    
        if (r4 == r8) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(h0 h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, cg6 cg6Var) {
        z zVar;
        int i;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod;
        PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup;
        List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods;
        int i2;
        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2;
        String str2;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.a aVar = h0Var.n;
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.d dVar = h0Var.p;
        if (cg6Var instanceof z) {
            zVar = (z) cg6Var;
            int i3 = zVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zVar.m = i3 - Integer.MIN_VALUE;
                Object obj = zVar.k;
                nm6 nm6Var = nm6.a;
                i = zVar.m;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        com.yandex.plus.core.data.pay.c cVar = (com.yandex.plus.core.data.pay.c) obj;
                        if (cVar != null) {
                            return cVar.getId();
                        }
                        return null;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        com.yandex.plus.core.data.pay.c cVar2 = (com.yandex.plus.core.data.pay.c) obj;
                        if (cVar2 != null) {
                            return cVar2.getId();
                        }
                        return null;
                    }
                    if (i == 4) {
                        paymentMethod2 = zVar.j;
                        qgg.h0(obj);
                        str2 = (String) obj;
                        if (str2 == null) {
                            return str2;
                        }
                        paymentMethod = paymentMethod2;
                        return paymentMethod.getId();
                    }
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    com.yandex.plus.core.data.pay.c cVar3 = (com.yandex.plus.core.data.pay.c) obj;
                    if (cVar3 != null) {
                        return cVar3.getId();
                    }
                    return null;
                }
                qgg.h0(obj);
                if (str != null) {
                    PlusPayCompositeOfferDetails.PaymentMethod a = plusPayCompositeOfferDetails != null ? com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.a.a(plusPayCompositeOfferDetails, str) : null;
                    if (a != null) {
                        paymentMethod = a;
                        PlusPayCompositeOfferDetails.PaymentMethod.Type type = paymentMethod == null ? paymentMethod.getType() : null;
                        i2 = type != null ? -1 : x.a[type.ordinal()];
                        if (i2 != -1) {
                            zVar.j = null;
                            zVar.m = 5;
                            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) aVar).b(jVar, zVar);
                        } else if (i2 == 1) {
                            zVar.j = null;
                            zVar.m = 1;
                            obj = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) aVar).b(jVar, zVar);
                        } else if (i2 == 2) {
                            zVar.j = null;
                            zVar.m = 2;
                            Object a2 = dVar.a(null, zVar);
                            if (a2 != nm6Var) {
                                return a2;
                            }
                        } else {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        return paymentMethod.getId();
                                    }
                                    b6e.s();
                                    return null;
                                }
                                com.yandex.plus.core.data.common.b0 widgetUrls = paymentMethod.getWidgetUrls();
                                if (widgetUrls != null) {
                                    if ((widgetUrls.a == null && widgetUrls.b == null ? null : widgetUrls) != null) {
                                        zVar.j = paymentMethod;
                                        zVar.m = 4;
                                        obj = dVar.a(str, zVar);
                                        if (obj != nm6Var) {
                                            paymentMethod2 = paymentMethod;
                                            str2 = (String) obj;
                                            if (str2 == null) {
                                            }
                                        }
                                    }
                                }
                                return paymentMethod.getId();
                            }
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.b bVar = h0Var.o;
                            zVar.j = null;
                            zVar.m = 3;
                            com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d dVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.d) bVar;
                            com.yandex.plus.paymentsdk.internal.method.e eVar = dVar2.b;
                            Context a3 = dVar2.a.a();
                            com.yandex.plus.core.data.pay.d e = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.e((com.yandex.plus.domain.auth.api.e) dVar2.e.getValue());
                            String a4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(jVar.a);
                            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = jVar.b;
                            String posId = plusPayCompositeOfferDetails2 != null ? plusPayCompositeOfferDetails2.getPosId() : null;
                            String serviceToken = plusPayCompositeOfferDetails2 != null ? plusPayCompositeOfferDetails2.getServiceToken() : null;
                            eVar.getClass();
                            a3.getClass();
                            obj = dVar2.a(new com.yandex.passport.sloth.ui.dependencies.m(eVar.a, new com.yandex.plus.core.debug.panel.internal.utils.resource.a(a3, 1), a3, e, a4, posId, serviceToken, eVar.c), zVar);
                        }
                        return nm6Var;
                    }
                }
                paymentMethod = (plusPayCompositeOfferDetails == null || (paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) CollectionsKt.firstOrNull(plusPayCompositeOfferDetails.getPaymentMethodsGroups())) == null || (paymentMethods = paymentMethodsGroup.getPaymentMethods()) == null) ? null : (PlusPayCompositeOfferDetails.PaymentMethod) CollectionsKt.firstOrNull(paymentMethods);
                if (paymentMethod == null) {
                }
                if (type != null) {
                }
                if (i2 != -1) {
                }
                return nm6Var;
            }
        }
        zVar = new z(h0Var, cg6Var);
        Object obj2 = zVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zVar.m;
        if (i == 0) {
        }
    }

    public static final void H(h0 h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        h0Var.getClass();
        x97.y(ot0.F(h0Var), null, null, new g0(h0Var, aVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h0 h0Var, boolean z, w wVar, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, PlusPayMailingAdsAgreement plusPayMailingAdsAgreement, Continuation continuation) {
        y yVar;
        int i;
        com.yandex.plus.pay.ui.core.api.common.a aVar = h0Var.y;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.n = i2 - Integer.MIN_VALUE;
                y yVar2 = yVar;
                Object obj = yVar2.l;
                nm6 nm6Var = nm6.a;
                i = yVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = h0Var.l.a.a();
                    if (plusPayCompositeOfferDetails == null) {
                        return new t(null);
                    }
                    h hVar = h0Var.v;
                    PlusPayCompositeOffers.Offer offer = a.b.a;
                    offer.getClass();
                    boolean z2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.NATIVE && Intrinsics.d(com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.a(offer), "RUB");
                    com.yandex.plus.pay.internal.feature.counter_offers.f fVar = new com.yandex.plus.pay.internal.feature.counter_offers.f(2, h0Var);
                    yVar2.k = wVar;
                    yVar2.j = z;
                    yVar2.n = 1;
                    obj = hVar.a(plusPayCompositeOfferDetails, z2, plusPayMailingAdsAgreement, str, fVar, yVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = yVar2.j;
                    wVar = yVar2.k;
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) obj;
                return !z ? new t(gVar) : wVar != null ? wVar.a != null ? new r(gVar, aVar.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Title), aVar.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Subtitle), wVar.a, wVar.b) : new u(gVar, aVar.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Title), aVar.get(R.string.PlusPay_Payment_Loader_ProcessingOrder_Subtitle)) : new s(gVar);
            }
        }
        yVar = new y(h0Var, continuation);
        y yVar22 = yVar;
        Object obj2 = yVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = yVar22.n;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) obj2;
        if (!z) {
        }
    }

    public final void J(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, com.yandex.plus.pay.internal.feature.offers.r rVar) {
        rar rarVar = this.G;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.G = x97.y(ot0.F(this), null, null, new d0(this, aVar, rVar, plusPayCompositeOfferDetails, null), 3);
    }

    public final void K(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        PlusPayAdditionalOffers additionalOffers;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) this.D.getValue();
        if (plusPayCompositeOfferDetails == null || (additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers()) == null) {
            return;
        }
        int i = 0;
        for (Object obj : additionalOffers.getOffers()) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            PlusPayAdditionalOffer plusPayAdditionalOffer = (PlusPayAdditionalOffer) obj;
            if (plusPayAdditionalOffer.isSelected()) {
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) this.w;
                cVar.getClass();
                com.yandex.plus.pay.api.analytics.tarifficator.e eVar = cVar.c;
                String sessionId = aVar.b.a.getMeta().getSessionId();
                String offersBatchId = plusPayAdditionalOffer.getOffer().getOffersBatchId();
                String positionId = plusPayAdditionalOffer.getOffer().getPositionId();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                ((com.yandex.plus.pay.internal.analytics.tarifficator.s) eVar).e(sessionId, offersBatchId, positionId, i, "onsale_offer", "checkout_onsale_page", null, e5bVar);
            }
            i = i2;
        }
    }

    public final void L() {
        v vVar = (v) this.K.a.getValue();
        if ((vVar instanceof t) || (vVar instanceof s) || (vVar instanceof r)) {
            this.s.a();
        } else {
            if (vVar instanceof u) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = this.l.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) this.w;
        cVar.getClass();
        com.yandex.plus.pay.api.analytics.tarifficator.c cVar2 = cVar.b;
        PlusPayCompositeOffers.Offer offer = a.b.a;
        com.yandex.plus.pay.internal.analytics.tarifficator.q qVar = (com.yandex.plus.pay.internal.analytics.tarifficator.q) cVar2;
        qVar.getClass();
        offer.getClass();
        pnb pnbVar = qVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Checkout.Stop", r);
        this.J.b();
        super.onCleared();
    }
}
