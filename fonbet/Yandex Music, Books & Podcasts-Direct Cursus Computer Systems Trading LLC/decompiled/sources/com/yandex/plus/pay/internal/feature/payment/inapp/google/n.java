package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.a4g;
import defpackage.akc;
import defpackage.alc;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.clc;
import defpackage.dfi;
import defpackage.eno;
import defpackage.gld;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.wis;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.ybk;
import defpackage.ydr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class n implements com.yandex.plus.pay.api.feature.tarifficator.payment.h {
    public final PlusPayCompositeOffers.Offer a;
    public final PlusPayInAppReplacementParams b;
    public final com.yandex.plus.pay.api.analytics.d c;
    public final Map d;
    public final com.yandex.plus.pay.inapp.api.b e;
    public final com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c f;
    public final com.yandex.plus.pay.internal.feature.subscription.g g;
    public final com.yandex.plus.pay.internal.feature.cache.b h;
    public final com.yandex.plus.pay.internal.analytics.h i;
    public final com.yandex.plus.pay.internal.analytics.j j;
    public final com.yandex.plus.experiments.impl.providers.h k;
    public final com.yandex.plus.pay.log.impl.b l;
    public final x m;
    public final Set n;
    public final com.yandex.plus.core.benchmark.l o;
    public final String p;
    public final tf6 q;
    public final xdr r;
    public final String s;
    public final alc t;

    public n(PlusPayCompositeOffers.Offer offer, PlusPayInAppReplacementParams plusPayInAppReplacementParams, com.yandex.plus.pay.api.analytics.d dVar, UUID uuid, Map map, com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar, com.yandex.plus.pay.internal.feature.subscription.g gVar, com.yandex.plus.pay.internal.feature.cache.b bVar2, com.yandex.plus.pay.internal.analytics.h hVar, com.yandex.plus.pay.internal.analytics.j jVar, com.yandex.plus.experiments.impl.providers.h hVar2, com.yandex.plus.pay.log.impl.b bVar3, x xVar, Set set, kotlinx.coroutines.a aVar) {
        offer.getClass();
        dVar.getClass();
        uuid.getClass();
        map.getClass();
        bVar.getClass();
        cVar.getClass();
        gVar.getClass();
        bVar2.getClass();
        hVar.getClass();
        jVar.getClass();
        hVar2.getClass();
        bVar3.getClass();
        aVar.getClass();
        this.a = offer;
        this.b = plusPayInAppReplacementParams;
        this.c = dVar;
        this.d = map;
        this.e = bVar;
        this.f = cVar;
        this.g = gVar;
        this.h = bVar2;
        this.i = hVar;
        this.j = jVar;
        this.k = hVar2;
        this.l = bVar3;
        this.m = xVar;
        this.n = set;
        this.o = ((com.yandex.plus.core.benchmark.c) xVar).b("Payment.InApp.Success");
        String uuid2 = uuid.toString();
        uuid2.getClass();
        String upperCase = uuid2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.p = upperCase;
        this.q = gld.e(aVar.plus(a4g.n()));
        xdr a = ydr.a(com.yandex.plus.pay.api.feature.tarifficator.payment.n.a);
        this.r = a;
        String a2 = com.yandex.plus.pay.internal.utils.b.a(offer);
        if (a2 == null) {
            xq0.x("product id for in-app purchase is not found");
            throw null;
        }
        this.s = a2;
        this.t = new alc(new clc(new ub7(12, new clc(new eno(new akc(a, new g(3, null), (Continuation) null, 3)), new h(this, aVar, null)), new i(this, null)), new j(3, null)), new k(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|8|(1:(1:(1:(1:(1:(8:15|16|17|18|19|(3:21|(1:23)(2:25|(1:27)(2:28|(1:51)(2:32|(1:34)(2:35|(1:37)(2:38|(1:40)(2:41|(1:43)(5:44|(1:46)|47|(1:49)|50)))))))|24)|52|53)(2:56|57))(5:58|59|60|61|(3:63|(7:66|17|18|19|(0)|52|53)|65)(7:67|68|18|19|(0)|52|53)))(6:69|70|71|72|(3:74|61|(0)(0))|65))(8:75|76|77|78|79|80|(3:82|72|(0))|65))(2:91|92))(5:113|114|115|(1:117)|65)|93|(2:94|(2:96|(1:109)(2:100|101))(2:111|112))|102|(3:104|(6:106|77|78|79|80|(0))|65)(5:107|79|80|(0)|65)))|135|6|7|8|(0)(0)|93|(3:94|(0)(0)|109)|102|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0073, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0074, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x006f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0070, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0090, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0091, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x008c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x008d, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x004e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x004b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x008d: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:142), block:B:132:0x008d */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0091: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:146), block:B:130:0x0091 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0070: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:113), block:B:128:0x0070 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0074: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:117), block:B:126:0x0074 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010e A[Catch: all -> 0x006f, wis -> 0x0073, CancellationException -> 0x0279, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0279, blocks: (B:16:0x0046, B:17:0x01ef, B:18:0x025d, B:59:0x0067, B:61:0x01bf, B:63:0x01c9, B:67:0x0208, B:70:0x0085, B:72:0x0187, B:76:0x009c, B:77:0x0123, B:80:0x012f, B:92:0x00a9, B:93:0x00e5, B:94:0x00eb, B:96:0x00f1, B:98:0x00fc, B:102:0x010a, B:104:0x010e, B:115:0x00c8), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9 A[Catch: all -> 0x006f, wis -> 0x0073, CancellationException -> 0x0279, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0279, blocks: (B:16:0x0046, B:17:0x01ef, B:18:0x025d, B:59:0x0067, B:61:0x01bf, B:63:0x01c9, B:67:0x0208, B:70:0x0085, B:72:0x0187, B:76:0x009c, B:77:0x0123, B:80:0x012f, B:92:0x00a9, B:93:0x00e5, B:94:0x00eb, B:96:0x00f1, B:98:0x00fc, B:102:0x010a, B:104:0x010e, B:115:0x00c8), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208 A[Catch: all -> 0x006f, wis -> 0x0073, CancellationException -> 0x0279, TRY_ENTER, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0279, blocks: (B:16:0x0046, B:17:0x01ef, B:18:0x025d, B:59:0x0067, B:61:0x01bf, B:63:0x01c9, B:67:0x0208, B:70:0x0085, B:72:0x0187, B:76:0x009c, B:77:0x0123, B:80:0x012f, B:92:0x00a9, B:93:0x00e5, B:94:0x00eb, B:96:0x00f1, B:98:0x00fc, B:102:0x010a, B:104:0x010e, B:115:0x00c8), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f1 A[Catch: all -> 0x006f, wis -> 0x0073, CancellationException -> 0x0279, TryCatch #6 {CancellationException -> 0x0279, blocks: (B:16:0x0046, B:17:0x01ef, B:18:0x025d, B:59:0x0067, B:61:0x01bf, B:63:0x01c9, B:67:0x0208, B:70:0x0085, B:72:0x0187, B:76:0x009c, B:77:0x0123, B:80:0x012f, B:92:0x00a9, B:93:0x00e5, B:94:0x00eb, B:96:0x00f1, B:98:0x00fc, B:102:0x010a, B:104:0x010e, B:115:0x00c8), top: B:8:0x002c }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, cg6 cg6Var) {
        m mVar;
        int i;
        t7o t7oVar;
        xqn xqnVar;
        Object obj;
        xqn xqnVar2;
        Throwable a;
        Object kVar;
        n nVar2;
        int i2;
        xqn xqnVar3;
        int i3;
        Iterator it;
        Object obj2;
        com.yandex.plus.pay.inapp.api.f fVar;
        int i4;
        int i5;
        n nVar3;
        xqn xqnVar4;
        int i6;
        n nVar4;
        xqn xqnVar5;
        int i7;
        Object a2;
        int i8;
        com.yandex.plus.pay.inapp.api.f fVar2;
        xqn xqnVar6;
        n nVar5;
        Object a3;
        xqn xqnVar7;
        int i9;
        n nVar6;
        PlusPaySubmitResult plusPaySubmitResult;
        PlusPaySubscriptionInfo plusPaySubscriptionInfo;
        PlusPaySubmitResult plusPaySubmitResult2;
        xqn xqnVar8;
        xdr xdrVar = nVar.r;
        try {
            if (cg6Var instanceof m) {
                mVar = (m) cg6Var;
                int i10 = mVar.s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    mVar.s = i10 - Integer.MIN_VALUE;
                    m mVar2 = mVar;
                    Object obj3 = mVar2.q;
                    nm6 nm6Var = nm6.a;
                    i = mVar2.s;
                    ?? r5 = 3;
                    r5 = 3;
                    if (i != 0) {
                        qgg.h0(obj3);
                        xdrVar.getClass();
                        xdrVar.m(null, com.yandex.plus.pay.api.feature.tarifficator.payment.n.a);
                        ((com.yandex.plus.pay.internal.analytics.evgen.b) nVar.j).g(nVar.a, nVar.p);
                        xqn xqnVar9 = new xqn();
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = nVar.e;
                            com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                            mVar2.j = xqnVar9;
                            mVar2.k = nVar;
                            mVar2.o = 0;
                            mVar2.p = 0;
                            mVar2.s = 1;
                            obj3 = bVar.b(eVar, mVar2);
                            if (obj3 != nm6Var) {
                                nVar2 = nVar;
                                i2 = 0;
                                xqnVar3 = xqnVar9;
                                i3 = 0;
                            }
                            return nm6Var;
                        } catch (wis e) {
                            e = e;
                            r5 = xqnVar9;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            xqnVar = r5;
                            obj = t7oVar;
                            xqnVar2 = xqnVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            r5 = xqnVar9;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            xqnVar = r5;
                            obj = t7oVar;
                            xqnVar2 = xqnVar;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    }
                    if (i != 1) {
                        if (i == 2) {
                            i3 = mVar2.p;
                            i6 = mVar2.o;
                            nVar4 = mVar2.k;
                            xqnVar5 = mVar2.j;
                            qgg.h0(obj3);
                            fVar = (com.yandex.plus.pay.inapp.api.f) obj3;
                            i4 = i3;
                            i5 = i6;
                            nVar3 = nVar4;
                            xqnVar4 = xqnVar5;
                            try {
                                xdr xdrVar2 = nVar3.r;
                                PlusPayCompositeOffers.Offer offer = nVar3.a;
                                com.yandex.plus.pay.api.feature.tarifficator.payment.m mVar3 = com.yandex.plus.pay.api.feature.tarifficator.payment.m.a;
                                xdrVar2.getClass();
                                xdrVar2.m(null, mVar3);
                                String a4 = ((com.yandex.plus.pay.internal.analytics.i) nVar3.i).a(nVar3.c, offer);
                                com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar = nVar3.f;
                                String sessionId = offer.getMeta().getSessionId();
                                String offersBatchId = offer.getMeta().getOffersBatchId();
                                String positionId = offer.getPositionId();
                                Map map = nVar3.d;
                                mVar2.j = xqnVar4;
                                mVar2.k = nVar3;
                                mVar2.l = null;
                                mVar2.m = fVar;
                                mVar2.o = i5;
                                mVar2.p = i4;
                                mVar2.s = 3;
                                i7 = i5;
                                com.yandex.plus.pay.inapp.api.f fVar3 = fVar;
                                a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) cVar.a).a(fVar3, a4, sessionId, offersBatchId, positionId, map, mVar2);
                                if (a2 != nm6Var) {
                                    i8 = i4;
                                    obj3 = a2;
                                    fVar2 = fVar3;
                                    xqnVar6 = xqnVar4;
                                    nVar5 = nVar3;
                                    PlusPaySubmitResult plusPaySubmitResult3 = (PlusPaySubmitResult) obj3;
                                    xqnVar6.a = plusPaySubmitResult3.getInvoiceId();
                                    nVar5.f(plusPaySubmitResult3.getInvoiceId());
                                    com.yandex.plus.pay.internal.feature.subscription.g gVar = nVar5.g;
                                    String invoiceId = plusPaySubmitResult3.getInvoiceId();
                                    Set set = nVar5.n;
                                    mVar2.j = xqnVar6;
                                    mVar2.k = nVar5;
                                    mVar2.l = plusPaySubmitResult3;
                                    mVar2.m = null;
                                    mVar2.n = fVar2;
                                    mVar2.o = i7;
                                    mVar2.p = i8;
                                    mVar2.s = 4;
                                    a3 = ((com.yandex.plus.pay.internal.feature.subscription.e) gVar).a(invoiceId, set, com.yandex.plus.pay.internal.feature.subscription.f.a, mVar2);
                                    if (a3 != nm6Var) {
                                    }
                                }
                                return nm6Var;
                            } catch (wis e2) {
                                e = e2;
                                r5 = xqnVar4;
                                r7o r7oVar22 = z7o.b;
                                t7oVar = new t7o(e);
                                xqnVar = r5;
                                obj = t7oVar;
                                xqnVar2 = xqnVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = xqnVar4;
                                r7o r7oVar32 = z7o.b;
                                t7oVar = new t7o(th);
                                xqnVar = r5;
                                obj = t7oVar;
                                xqnVar2 = xqnVar;
                                a = z7o.a(obj);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                        }
                        if (i == 3) {
                            i8 = mVar2.p;
                            int i11 = mVar2.o;
                            fVar2 = mVar2.m;
                            nVar5 = mVar2.k;
                            xqn xqnVar10 = mVar2.j;
                            qgg.h0(obj3);
                            i7 = i11;
                            xqnVar6 = xqnVar10;
                            PlusPaySubmitResult plusPaySubmitResult32 = (PlusPaySubmitResult) obj3;
                            xqnVar6.a = plusPaySubmitResult32.getInvoiceId();
                            nVar5.f(plusPaySubmitResult32.getInvoiceId());
                            com.yandex.plus.pay.internal.feature.subscription.g gVar2 = nVar5.g;
                            String invoiceId2 = plusPaySubmitResult32.getInvoiceId();
                            Set set2 = nVar5.n;
                            mVar2.j = xqnVar6;
                            mVar2.k = nVar5;
                            mVar2.l = plusPaySubmitResult32;
                            mVar2.m = null;
                            mVar2.n = fVar2;
                            mVar2.o = i7;
                            mVar2.p = i8;
                            mVar2.s = 4;
                            a3 = ((com.yandex.plus.pay.internal.feature.subscription.e) gVar2).a(invoiceId2, set2, com.yandex.plus.pay.internal.feature.subscription.f.a, mVar2);
                            if (a3 != nm6Var) {
                                xqnVar7 = xqnVar6;
                                i9 = i8;
                                nVar6 = nVar5;
                                plusPaySubmitResult = plusPaySubmitResult32;
                                obj3 = a3;
                                plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) obj3;
                                if (plusPaySubscriptionInfo.getStatus() == PlusPaySubscriptionInfo.SubscriptionStatus.HOLD) {
                                }
                            }
                            return nm6Var;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            plusPaySubmitResult2 = mVar2.l;
                            nVar6 = mVar2.k;
                            xqn xqnVar11 = mVar2.j;
                            qgg.h0(obj3);
                            xqnVar8 = xqnVar11;
                            nVar6.e(plusPaySubmitResult2.getInvoiceId());
                            xdr xdrVar3 = nVar6.r;
                            com.yandex.plus.pay.api.feature.tarifficator.payment.l lVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.l(plusPaySubmitResult2.getInvoiceId(), null);
                            xdrVar3.getClass();
                            xdrVar3.m(null, lVar);
                            r5 = xqnVar8;
                            obj = Unit.a;
                            r7o r7oVar4 = z7o.b;
                            xqnVar2 = r5;
                            a = z7o.a(obj);
                            if (a != null) {
                                String str = (String) xqnVar2.a;
                                if (a instanceof com.yandex.plus.pay.inapp.internal.error.a) {
                                    nVar.d("BILLING_UNAVAILABLE", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.b));
                                } else if (a instanceof com.yandex.plus.pay.inapp.internal.error.f) {
                                    nVar.d("PRODUCT_UNAVAILABLE", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.c));
                                } else if ((a instanceof com.yandex.plus.pay.inapp.internal.error.d) || (a instanceof com.yandex.plus.pay.inapp.internal.error.e)) {
                                    nVar.d("BILLING_INTERNAL_ERROR", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.f));
                                } else if (a instanceof com.yandex.plus.pay.inapp.internal.error.h) {
                                    nVar.d("PURCHASE_UNSPECIFIED_STATE", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.d));
                                } else if (a instanceof com.yandex.plus.pay.inapp.internal.error.g) {
                                    nVar.d("NOT_ENOUGH_FUNDS", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.e));
                                } else if (a instanceof com.yandex.plus.pay.inapp.internal.error.c) {
                                    nVar.d("CONNECTION_ERROR", str);
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.b(com.yandex.plus.pay.api.exception.b.a));
                                } else if (a instanceof com.yandex.plus.pay.inapp.internal.error.b) {
                                    kVar = com.yandex.plus.pay.api.feature.tarifficator.payment.i.a;
                                } else {
                                    String message = a.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    nVar.d(message, str);
                                    String message2 = a.getMessage();
                                    kVar = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(str, new com.yandex.plus.pay.api.feature.tarifficator.payment.e(message2 != null ? message2 : ""));
                                }
                                xdrVar.getClass();
                                xdrVar.m(null, kVar);
                            }
                            return Unit.a;
                        }
                        int i12 = mVar2.p;
                        int i13 = mVar2.o;
                        fVar2 = mVar2.n;
                        plusPaySubmitResult = mVar2.l;
                        n nVar7 = mVar2.k;
                        xqnVar7 = mVar2.j;
                        qgg.h0(obj3);
                        i7 = i13;
                        i9 = i12;
                        nVar6 = nVar7;
                        plusPaySubscriptionInfo = (PlusPaySubscriptionInfo) obj3;
                        if (plusPaySubscriptionInfo.getStatus() == PlusPaySubscriptionInfo.SubscriptionStatus.HOLD) {
                            nVar6.d("subscriptionStatus=" + plusPaySubscriptionInfo.getStatus().name(), plusPaySubmitResult.getInvoiceId());
                            xdr xdrVar4 = nVar6.r;
                            com.yandex.plus.pay.api.feature.tarifficator.payment.k kVar2 = new com.yandex.plus.pay.api.feature.tarifficator.payment.k(plusPaySubmitResult.getInvoiceId(), new com.yandex.plus.pay.api.feature.tarifficator.payment.e("Invalid subscription status: " + plusPaySubscriptionInfo.getStatus().name() + ')'));
                            xdrVar4.getClass();
                            xdrVar4.m(null, kVar2);
                            r5 = xqnVar7;
                            obj = Unit.a;
                            r7o r7oVar42 = z7o.b;
                            xqnVar2 = r5;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                        xdr xdrVar5 = nVar6.r;
                        com.yandex.plus.pay.api.feature.tarifficator.payment.j jVar = com.yandex.plus.pay.api.feature.tarifficator.payment.j.a;
                        xdrVar5.getClass();
                        xdrVar5.m(null, jVar);
                        com.yandex.plus.pay.inapp.api.b bVar2 = nVar6.e;
                        mVar2.j = xqnVar7;
                        mVar2.k = nVar6;
                        mVar2.l = plusPaySubmitResult;
                        mVar2.m = null;
                        mVar2.n = null;
                        mVar2.o = i7;
                        mVar2.p = i9;
                        mVar2.s = 5;
                        if (bVar2.e(fVar2, mVar2) != nm6Var) {
                            plusPaySubmitResult2 = plusPaySubmitResult;
                            xqnVar8 = xqnVar7;
                            nVar6.e(plusPaySubmitResult2.getInvoiceId());
                            xdr xdrVar32 = nVar6.r;
                            com.yandex.plus.pay.api.feature.tarifficator.payment.l lVar2 = new com.yandex.plus.pay.api.feature.tarifficator.payment.l(plusPaySubmitResult2.getInvoiceId(), null);
                            xdrVar32.getClass();
                            xdrVar32.m(null, lVar2);
                            r5 = xqnVar8;
                            obj = Unit.a;
                            r7o r7oVar422 = z7o.b;
                            xqnVar2 = r5;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    i3 = mVar2.p;
                    i2 = mVar2.o;
                    nVar2 = mVar2.k;
                    xqnVar3 = mVar2.j;
                    qgg.h0(obj3);
                    it = ((Iterable) obj3).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = it.next();
                            com.yandex.plus.pay.inapp.api.f fVar4 = (com.yandex.plus.pay.inapp.api.f) obj2;
                            if (!fVar4.f && fVar4.b.contains(nVar2.s)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    fVar = (com.yandex.plus.pay.inapp.api.f) obj2;
                    if (fVar == null) {
                        i4 = i3;
                        i5 = i2;
                        nVar3 = nVar2;
                        xqnVar4 = xqnVar3;
                        xdr xdrVar22 = nVar3.r;
                        PlusPayCompositeOffers.Offer offer2 = nVar3.a;
                        com.yandex.plus.pay.api.feature.tarifficator.payment.m mVar32 = com.yandex.plus.pay.api.feature.tarifficator.payment.m.a;
                        xdrVar22.getClass();
                        xdrVar22.m(null, mVar32);
                        String a42 = ((com.yandex.plus.pay.internal.analytics.i) nVar3.i).a(nVar3.c, offer2);
                        com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar2 = nVar3.f;
                        String sessionId2 = offer2.getMeta().getSessionId();
                        String offersBatchId2 = offer2.getMeta().getOffersBatchId();
                        String positionId2 = offer2.getPositionId();
                        Map map2 = nVar3.d;
                        mVar2.j = xqnVar4;
                        mVar2.k = nVar3;
                        mVar2.l = null;
                        mVar2.m = fVar;
                        mVar2.o = i5;
                        mVar2.p = i4;
                        mVar2.s = 3;
                        i7 = i5;
                        com.yandex.plus.pay.inapp.api.f fVar32 = fVar;
                        a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) cVar2.a).a(fVar32, a42, sessionId2, offersBatchId2, positionId2, map2, mVar2);
                        if (a2 != nm6Var) {
                        }
                        return nm6Var;
                    }
                    mVar2.j = xqnVar3;
                    mVar2.k = nVar2;
                    mVar2.o = i2;
                    mVar2.p = i3;
                    mVar2.s = 2;
                    obj3 = nVar2.c(mVar2);
                    if (obj3 != nm6Var) {
                        i6 = i2;
                        nVar4 = nVar2;
                        xqnVar5 = xqnVar3;
                        fVar = (com.yandex.plus.pay.inapp.api.f) obj3;
                        i4 = i3;
                        i5 = i6;
                        nVar3 = nVar4;
                        xqnVar4 = xqnVar5;
                        xdr xdrVar222 = nVar3.r;
                        PlusPayCompositeOffers.Offer offer22 = nVar3.a;
                        com.yandex.plus.pay.api.feature.tarifficator.payment.m mVar322 = com.yandex.plus.pay.api.feature.tarifficator.payment.m.a;
                        xdrVar222.getClass();
                        xdrVar222.m(null, mVar322);
                        String a422 = ((com.yandex.plus.pay.internal.analytics.i) nVar3.i).a(nVar3.c, offer22);
                        com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar22 = nVar3.f;
                        String sessionId22 = offer22.getMeta().getSessionId();
                        String offersBatchId22 = offer22.getMeta().getOffersBatchId();
                        String positionId22 = offer22.getPositionId();
                        Map map22 = nVar3.d;
                        mVar2.j = xqnVar4;
                        mVar2.k = nVar3;
                        mVar2.l = null;
                        mVar2.m = fVar;
                        mVar2.o = i5;
                        mVar2.p = i4;
                        mVar2.s = 3;
                        i7 = i5;
                        com.yandex.plus.pay.inapp.api.f fVar322 = fVar;
                        a2 = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) cVar22.a).a(fVar322, a422, sessionId22, offersBatchId22, positionId22, map22, mVar2);
                        if (a2 != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
            }
            if (i != 0) {
            }
            it = ((Iterable) obj3).iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            fVar = (com.yandex.plus.pay.inapp.api.f) obj2;
            if (fVar == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        mVar = new m(nVar, cg6Var);
        m mVar22 = mVar;
        Object obj32 = mVar22.q;
        nm6 nm6Var2 = nm6.a;
        i = mVar22.s;
        ?? r52 = 3;
        r52 = 3;
    }

    @Override // com.yandex.plus.pay.api.feature.tarifficator.payment.h
    public final pjc a() {
        return this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0048, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        l lVar;
        int i;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams;
        com.yandex.plus.pay.inapp.api.h hVar;
        com.yandex.plus.pay.inapp.api.g gVar;
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                com.yandex.plus.pay.inapp.api.b bVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    List c = t75.c(this.s);
                    com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                    lVar.l = 1;
                    obj = bVar.c(c, eVar, lVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.inapp.google.internal.h hVar2 = (com.yandex.plus.pay.inapp.google.internal.h) CollectionsKt.Q((List) obj);
                plusPayInAppReplacementParams = this.b;
                if (plusPayInAppReplacementParams == null) {
                    int i3 = f.a[plusPayInAppReplacementParams.getStrategy().ordinal()];
                    if (i3 == 1) {
                        gVar = com.yandex.plus.pay.inapp.api.g.a;
                    } else {
                        if (i3 != 2) {
                            b6e.s();
                            return null;
                        }
                        gVar = com.yandex.plus.pay.inapp.api.g.b;
                    }
                    hVar = new com.yandex.plus.pay.inapp.api.h(plusPayInAppReplacementParams.getPurchaseToken(), gVar);
                } else {
                    hVar = null;
                }
                lVar.l = 2;
                Object d = bVar.d(hVar2, hVar, lVar);
                return d != nm6Var ? nm6Var : d;
            }
        }
        lVar = new l(this, cg6Var);
        Object obj2 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        com.yandex.plus.pay.inapp.api.b bVar2 = this.e;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.internal.h hVar22 = (com.yandex.plus.pay.inapp.google.internal.h) CollectionsKt.Q((List) obj2);
        plusPayInAppReplacementParams = this.b;
        if (plusPayInAppReplacementParams == null) {
        }
        lVar.l = 2;
        Object d2 = bVar2.d(hVar22, hVar, lVar);
        if (d2 != nm6Var2) {
        }
    }

    public final void d(String str, String str2) {
        ((com.yandex.plus.pay.internal.analytics.evgen.b) this.j).e(this.a, str2, this.p, str);
    }

    public final void e(String str) {
        String str2 = this.p;
        com.yandex.plus.pay.internal.analytics.j jVar = this.j;
        PlusPayCompositeOffers.Offer offer = this.a;
        ((com.yandex.plus.pay.internal.analytics.evgen.b) jVar).f(offer, str, str2);
        ((com.yandex.plus.pay.internal.analytics.evgen.b) jVar).c(this.c, offer);
    }

    public final void f(String str) {
        com.yandex.plus.pay.internal.analytics.evgen.b bVar = (com.yandex.plus.pay.internal.analytics.evgen.b) this.j;
        bVar.getClass();
        PlusPayCompositeOffers.Offer offer = this.a;
        offer.getClass();
        str.getClass();
        String str2 = this.p;
        str2.getClass();
        String b = com.yandex.plus.pay.internal.analytics.evgen.b.b(offer);
        if (b != null) {
            ybk ybkVar = bVar.b;
            ArrayList a = com.yandex.plus.pay.internal.analytics.evgen.b.a(offer);
            ybkVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str2);
            linkedHashMap.put("product_id", b);
            dfi.u(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("_meta", ybk.a(new HashMap()));
            ybkVar.b("Pay.SendReceipt", linkedHashMap);
        }
    }
}
